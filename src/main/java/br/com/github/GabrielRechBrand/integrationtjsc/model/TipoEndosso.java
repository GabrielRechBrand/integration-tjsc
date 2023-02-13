
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEndosso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEndosso"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipoendosso" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmtipoendosso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEndosso", propOrder = {
    "cdtipoendosso",
    "nmtipoendosso"
})
public class TipoEndosso {

    protected Long cdtipoendosso;
    protected String nmtipoendosso;

    /**
     * Gets the value of the cdtipoendosso property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoendosso() {
        return cdtipoendosso;
    }

    /**
     * Sets the value of the cdtipoendosso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoendosso(Long value) {
        this.cdtipoendosso = value;
    }

    /**
     * Gets the value of the nmtipoendosso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoendosso() {
        return nmtipoendosso;
    }

    /**
     * Sets the value of the nmtipoendosso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoendosso(String value) {
        this.nmtipoendosso = value;
    }

}
