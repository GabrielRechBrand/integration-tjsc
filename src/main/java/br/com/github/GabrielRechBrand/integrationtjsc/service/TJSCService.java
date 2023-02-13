package br.com.github.GabrielRechBrand.integrationtjsc.service;

import br.com.github.GabrielRechBrand.integrationtjsc.model.SeloService;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "SeloService", targetNamespace = "http://www.tjsc.jus.br/selo", wsdlLocation = "http://selo.tjsc.jus.br/SeloService31Teste?wsdl")
public class TJSCService extends Service {

    private final static QName TJSC_QNAME = new QName("http://www.tjsc.jus.br/selo", "SeloService");
    private static URL TJSC_URL = null;

    static {
        try {
            TJSC_URL = new URL("http://selo.tjsc.jus.br/SeloService31Teste?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public TJSCService() {
        super(TJSC_URL, TJSC_QNAME);
    }

    @WebEndpoint(name = "SeloServicePort")
    public SeloService getSeloServicePort() {
        return super.getPort(new QName("http://www.tjsc.jus.br/selo", "SeloServicePort"), SeloService.class);
    }

}
