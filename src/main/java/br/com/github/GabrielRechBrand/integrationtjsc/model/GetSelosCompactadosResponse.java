
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelosCompactadosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelosCompactadosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selosCompactados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosCompactadosResponse", propOrder = {
    "selosCompactados"
})
public class GetSelosCompactadosResponse {

    protected byte[] selosCompactados;

    /**
     * Gets the value of the selosCompactados property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosCompactados() {
        return selosCompactados;
    }

    /**
     * Sets the value of the selosCompactados property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosCompactados(byte[] value) {
        this.selosCompactados = value;
    }

}
