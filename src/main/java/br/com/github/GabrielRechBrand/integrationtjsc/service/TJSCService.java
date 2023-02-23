package br.com.github.GabrielRechBrand.integrationtjsc.service;

import br.com.github.GabrielRechBrand.integrationtjsc.tjsc.EnteDeclaradoUtilidadePublicaEstadual;
import br.com.github.GabrielRechBrand.integrationtjsc.tjsc.SeloService_Service;
import lombok.SneakyThrows;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;

@Service
public class TJSCService {

    @Value("${integration.tjsc.url}")
    String url;

    @SneakyThrows
    protected SeloService_Service getSeloService() {
        return new SeloService_Service(new URL(url));
    }

    @SneakyThrows
    public List<EnteDeclaradoUtilidadePublicaEstadual> getEntesDeclaradosUtilidadePublicaEstadual() {
        return getSeloService().getSeloServicePort().getEntesDeclaradosUtilidadePublicaEstadual();
    }

}
