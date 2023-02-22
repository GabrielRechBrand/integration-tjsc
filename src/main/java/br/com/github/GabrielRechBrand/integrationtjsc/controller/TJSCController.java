package br.com.github.GabrielRechBrand.integrationtjsc.controller;

import br.com.github.GabrielRechBrand.integrationtjsc.service.TJSCService;

import lombok.SneakyThrows;

import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<?> getEntesDeclaradosUtilidadePublicaEstadual() {
        return ResponseEntity.ok(tjscService.getEntesDeclaradosUtilidadePublicaEstadual());
    }

}
