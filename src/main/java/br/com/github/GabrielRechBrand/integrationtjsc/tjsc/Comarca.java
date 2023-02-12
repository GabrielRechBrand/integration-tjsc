
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comarca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comarca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdcomarca" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nmcomarca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comarca", propOrder = {
    "cdcomarca",
    "nmcomarca"
})
public class Comarca {

    protected Short cdcomarca;
    protected String nmcomarca;

    /**
     * Gets the value of the cdcomarca property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdcomarca() {
        return cdcomarca;
    }

    /**
     * Sets the value of the cdcomarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdcomarca(Short value) {
        this.cdcomarca = value;
    }

    /**
     * Gets the value of the nmcomarca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmcomarca() {
        return nmcomarca;
    }

    /**
     * Sets the value of the nmcomarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmcomarca(String value) {
        this.nmcomarca = value;
    }

}
