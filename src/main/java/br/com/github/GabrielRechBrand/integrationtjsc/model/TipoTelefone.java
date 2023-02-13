
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTelefone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTelefone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipotelefone" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="detipotelefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTelefone", propOrder = {
    "cdtipotelefone",
    "detipotelefone"
})
public class TipoTelefone {

    protected Short cdtipotelefone;
    protected String detipotelefone;

    /**
     * Gets the value of the cdtipotelefone property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtipotelefone() {
        return cdtipotelefone;
    }

    /**
     * Sets the value of the cdtipotelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtipotelefone(Short value) {
        this.cdtipotelefone = value;
    }

    /**
     * Gets the value of the detipotelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetipotelefone() {
        return detipotelefone;
    }

    /**
     * Sets the value of the detipotelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetipotelefone(String value) {
        this.detipotelefone = value;
    }

}
