
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verificaTransmissaoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verificaTransmissaoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reciboTSRarmazenado" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaTransmissaoResponse", propOrder = {
    "reciboTSRarmazenado"
})
public class VerificaTransmissaoResponse {

    protected byte[] reciboTSRarmazenado;

    /**
     * Gets the value of the reciboTSRarmazenado property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReciboTSRarmazenado() {
        return reciboTSRarmazenado;
    }

    /**
     * Sets the value of the reciboTSRarmazenado property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReciboTSRarmazenado(byte[] value) {
        this.reciboTSRarmazenado = value;
    }

}
