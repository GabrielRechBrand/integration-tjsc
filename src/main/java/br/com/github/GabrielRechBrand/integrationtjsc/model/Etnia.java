
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for etnia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etnia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdetnia" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="deetnia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etnia", propOrder = {
    "cdetnia",
    "deetnia"
})
public class Etnia {

    protected Short cdetnia;
    protected String deetnia;

    /**
     * Gets the value of the cdetnia property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdetnia() {
        return cdetnia;
    }

    /**
     * Sets the value of the cdetnia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdetnia(Short value) {
        this.cdetnia = value;
    }

    /**
     * Gets the value of the deetnia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeetnia() {
        return deetnia;
    }

    /**
     * Sets the value of the deetnia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeetnia(String value) {
        this.deetnia = value;
    }

}
