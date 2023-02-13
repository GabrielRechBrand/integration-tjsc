
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for estado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="estado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deestado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "estado", propOrder = {
    "cdestado",
    "deestado"
})
public class Estado {

    protected String cdestado;
    protected String deestado;

    /**
     * Gets the value of the cdestado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdestado() {
        return cdestado;
    }

    /**
     * Sets the value of the cdestado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdestado(String value) {
        this.cdestado = value;
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

}
