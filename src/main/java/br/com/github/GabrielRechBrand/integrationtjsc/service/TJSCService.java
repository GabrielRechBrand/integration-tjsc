package br.com.github.GabrielRechBrand.integrationtjsc.service;

import br.com.github.GabrielRechBrand.integrationtjsc.model.EnteDeclaradoUtilidadePublicaEstadual;
import br.com.github.GabrielRechBrand.integrationtjsc.model.Exception_Exception;
import br.com.github.GabrielRechBrand.integrationtjsc.model.SeloService_Service;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.List;

@Service
public class TJSCService {

    @Value("${integration.tjsc.url}")
    String url;

    @SneakyThrows
    protected SeloService_Service getWsdlSelo() {
        return new SeloService_Service(new URL(url));
    }

    public List<EnteDeclaradoUtilidadePublicaEstadual> getEntesDeclaradosUtilidadePublicaEstadual() throws Exception_Exception {
        return getWsdlSelo().getSeloServicePort().getEntesDeclaradosUtilidadePublicaEstadual();
    }

}
