
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estadoCivil complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="estadoCivil"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdestadocivil" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="deestadocivilfem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deestadocivilmasc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estadoCivil", propOrder = {
    "cdestadocivil",
    "deestadocivilfem",
    "deestadocivilmasc"
})
public class EstadoCivil {

    protected Short cdestadocivil;
    protected String deestadocivilfem;
    protected String deestadocivilmasc;

    /**
     * Gets the value of the cdestadocivil property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdestadocivil() {
        return cdestadocivil;
    }

    /**
     * Sets the value of the cdestadocivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdestadocivil(Short value) {
        this.cdestadocivil = value;
    }

    /**
     * Gets the value of the deestadocivilfem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeestadocivilfem() {
        return deestadocivilfem;
    }

    /**
     * Sets the value of the deestadocivilfem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeestadocivilfem(String value) {
        this.deestadocivilfem = value;
    }

    /**
     * Gets the value of the deestadocivilmasc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeestadocivilmasc() {
        return deestadocivilmasc;
    }

    /**
     * Sets the value of the deestadocivilmasc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeestadocivilmasc(String value) {
        this.deestadocivilmasc = value;
    }

}
