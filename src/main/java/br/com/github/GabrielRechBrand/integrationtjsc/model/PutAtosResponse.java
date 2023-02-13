
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for putAtosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="putAtosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reciboTSR" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putAtosResponse", propOrder = {
    "reciboTSR"
})
public class PutAtosResponse {

    protected byte[] reciboTSR;

    /**
     * Gets the value of the reciboTSR property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getReciboTSR() {
        return reciboTSR;
    }

    /**
     * Sets the value of the reciboTSR property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setReciboTSR(byte[] value) {
        this.reciboTSR = value;
    }

}
