
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoSelo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoSelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtpselo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="detpselo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSelo", propOrder = {
    "cdtpselo",
    "detpselo"
})
public class TipoSelo {

    protected Short cdtpselo;
    protected String detpselo;

    /**
     * Gets the value of the cdtpselo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtpselo() {
        return cdtpselo;
    }

    /**
     * Sets the value of the cdtpselo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtpselo(Short value) {
        this.cdtpselo = value;
    }

    /**
     * Gets the value of the detpselo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetpselo() {
        return detpselo;
    }

    /**
     * Sets the value of the detpselo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetpselo(String value) {
        this.detpselo = value;
    }

}
