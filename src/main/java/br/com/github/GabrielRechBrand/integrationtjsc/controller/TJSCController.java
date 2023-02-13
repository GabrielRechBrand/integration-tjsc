package br.com.github.GabrielRechBrand.integrationtjsc.controller;

import br.com.github.GabrielRechBrand.integrationtjsc.model.SeloService;
import br.com.github.GabrielRechBrand.integrationtjsc.service.TJSCService;

import lombok.SneakyThrows;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tjsc")
public class TJSCController {

    private SeloService seloService = new TJSCService().getSeloServicePort();

    @SneakyThrows
    @GetMapping("/entes-declarados-utilidade-publica-estadual")
    public ResponseEntity<?> getEntesDeclaradosUtilidadePublicaEstadual() {
        return ResponseEntity.ok(seloService.getEntesDeclaradosUtilidadePublicaEstadual());
    }

}
