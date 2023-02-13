
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for redisponibilizaUltimaTransmissaoSelosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="redisponibilizaUltimaTransmissaoSelosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroSelosLiberados" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redisponibilizaUltimaTransmissaoSelosResponse", propOrder = {
    "numeroSelosLiberados"
})
public class RedisponibilizaUltimaTransmissaoSelosResponse {

    protected int numeroSelosLiberados;

    /**
     * Gets the value of the numeroSelosLiberados property.
     * 
     */
    public int getNumeroSelosLiberados() {
        return numeroSelosLiberados;
    }

    /**
     * Sets the value of the numeroSelosLiberados property.
     * 
     */
    public void setNumeroSelosLiberados(int value) {
        this.numeroSelosLiberados = value;
    }

}
