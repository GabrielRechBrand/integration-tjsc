package br.com.github.GabrielRechBrand.integrationtjsc.utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class PaginationUtils {

    public static <T> Page<T> paginateList(final Pageable pageable, List<T> list) {
        int first = Math.min(((Long) pageable.getOffset()).intValue(), list.size());;
        int last = Math.min(first + pageable.getPageSize(), list.size());
        return new PageImpl<>(list.subList(first, last), pageable, list.size());
    }

}
