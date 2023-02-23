package br.com.github.GabrielRechBrand.integrationtjsc.controller;

import br.com.github.GabrielRechBrand.integrationtjsc.service.TJSCService;

import br.com.github.GabrielRechBrand.integrationtjsc.tjsc.EnteDeclaradoUtilidadePublicaEstadual;
import br.com.github.GabrielRechBrand.integrationtjsc.utils.PaginationUtils;
import lombok.SneakyThrows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/tjsc")
@RestController
public class TJSCController {

    @Autowired
    TJSCService tjscService;

    @SneakyThrows
    @GetMapping("/entes-declarados")
    public ResponseEntity<Page<EnteDeclaradoUtilidadePublicaEstadual>> getEntesDeclaradosUtilidadePublicaEstadual(Pageable pageable) {
        return ResponseEntity.ok(PaginationUtils.paginateList(pageable, tjscService.getEntesDeclaradosUtilidadePublicaEstadual()));
    }

}
