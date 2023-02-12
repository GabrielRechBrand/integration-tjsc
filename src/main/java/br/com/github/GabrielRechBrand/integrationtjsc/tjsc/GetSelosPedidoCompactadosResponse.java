
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelosPedidoCompactadosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelosPedidoCompactadosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selosPedidoCompactados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosPedidoCompactadosResponse", propOrder = {
    "selosPedidoCompactados"
})
public class GetSelosPedidoCompactadosResponse {

    protected byte[] selosPedidoCompactados;

    /**
     * Gets the value of the selosPedidoCompactados property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosPedidoCompactados() {
        return selosPedidoCompactados;
    }

    /**
     * Sets the value of the selosPedidoCompactados property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosPedidoCompactados(byte[] value) {
        this.selosPedidoCompactados = value;
    }

}
