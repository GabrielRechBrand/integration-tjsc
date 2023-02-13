
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for municipio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="municipio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdmunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="deestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmmunicipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "municipio", propOrder = {
    "cdmunicipio",
    "deestado",
    "nmmunicipio"
})
public class Municipio {

    protected Integer cdmunicipio;
    protected String deestado;
    protected String nmmunicipio;

    /**
     * Gets the value of the cdmunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdmunicipio() {
        return cdmunicipio;
    }

    /**
     * Sets the value of the cdmunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdmunicipio(Integer value) {
        this.cdmunicipio = value;
    }

    /**
     * Gets the value of the deestado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeestado() {
        return deestado;
    }

    /**
     * Sets the value of the deestado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeestado(String value) {
        this.deestado = value;
    }

    /**
     * Gets the value of the nmmunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmunicipio() {
        return nmmunicipio;
    }

    /**
     * Sets the value of the nmmunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmunicipio(String value) {
        this.nmmunicipio = value;
    }

}
