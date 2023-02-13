
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEndereco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEndereco"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipoendereco" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="detipoendereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEndereco", propOrder = {
    "cdtipoendereco",
    "detipoendereco"
})
public class TipoEndereco {

    protected Short cdtipoendereco;
    protected String detipoendereco;

    /**
     * Gets the value of the cdtipoendereco property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtipoendereco() {
        return cdtipoendereco;
    }

    /**
     * Sets the value of the cdtipoendereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtipoendereco(Short value) {
        this.cdtipoendereco = value;
    }

    /**
     * Gets the value of the detipoendereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetipoendereco() {
        return detipoendereco;
    }

    /**
     * Sets the value of the detipoendereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetipoendereco(String value) {
        this.detipoendereco = value;
    }

}
