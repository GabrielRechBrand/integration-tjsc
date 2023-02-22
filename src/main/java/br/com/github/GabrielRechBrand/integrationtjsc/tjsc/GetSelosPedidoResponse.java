
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelosPedidoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelosPedidoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selosPedido" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosPedidoResponse", propOrder = {
    "selosPedido"
})
public class GetSelosPedidoResponse {

    protected byte[] selosPedido;

    /**
     * Gets the value of the selosPedido property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosPedido() {
        return selosPedido;
    }

    /**
     * Sets the value of the selosPedido property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosPedido(byte[] value) {
        this.selosPedido = value;
    }

}
