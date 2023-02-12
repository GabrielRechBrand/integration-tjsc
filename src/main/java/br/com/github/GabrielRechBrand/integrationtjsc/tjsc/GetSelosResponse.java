
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selosAssinados" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelosResponse", propOrder = {
    "selosAssinados"
})
public class GetSelosResponse {

    protected byte[] selosAssinados;

    /**
     * Gets the value of the selosAssinados property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSelosAssinados() {
        return selosAssinados;
    }

    /**
     * Sets the value of the selosAssinados property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSelosAssinados(byte[] value) {
        this.selosAssinados = value;
    }

}
