package br.com.github.GabrielRechBrand.integrationtjsc.controller;

import br.com.github.GabrielRechBrand.integrationtjsc.dto.EnteDeclaradoDTO;
import br.com.github.GabrielRechBrand.integrationtjsc.service.TJSCService;

import br.com.github.GabrielRechBrand.integrationtjsc.service.PaginationService;
import lombok.SneakyThrows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/tjsc")
@RestController
public class TJSCController {

    @Autowired
    TJSCService tjscService;

    @SneakyThrows
    @PostMapping("/entes-declarados")
    public ResponseEntity<List<EnteDeclaradoDTO>> getEntesDeclaradosUtilidadePublicaEstadual(@RequestBody(required = false) HashMap<String, Object> filters, Pageable pageable) {
        List<EnteDeclaradoDTO> dtoList = tjscService.getEntesDeclaradosUtilidadePublicaEstadual().stream().map(EnteDeclaradoDTO::new).toList();
        return ResponseEntity.ok(PaginationService.getFilteredPage(dtoList, pageable, filters));
    }

}
