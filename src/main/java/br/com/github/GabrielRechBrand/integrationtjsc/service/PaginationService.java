package br.com.github.GabrielRechBrand.integrationtjsc.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class PaginationService {

    public static <T> List<T> getFilteredPage(List<T> list, Pageable pageable, HashMap<String, Object> filters) {
        return paginateList(filterList(list, filters), pageable).getContent();
    }

    public static <T> Page<T> paginateList(List<T> list, Pageable pageable) {
        int first = Math.min(((Long) pageable.getOffset()).intValue(), list.size());;
        int last = Math.min(first + pageable.getPageSize(), list.size());
        return new PageImpl<>(list.subList(first, last), pageable, list.size());
    }

    public static <T> List<T> filterList(List<T> list, HashMap<String, Object> filters) {
        if(filters != null) {
            return list.stream()
                    .filter(el -> filters.entrySet().stream()
                            .allMatch(filter -> {
                                try {
                                    Field field = el.getClass().getDeclaredField(filter.getKey());
                                    field.setAccessible(true);
                                    if(field.get(el) != null) {
                                        return Objects.equals(filter.getValue(), field.get(el));
                                    } else {
                                        return false;
                                    }
                                } catch (NoSuchFieldException | IllegalAccessException e) {
                                    return false;
                                }
                            })).collect(Collectors.toList());
        } else {
            return list;
        }
    }

}
