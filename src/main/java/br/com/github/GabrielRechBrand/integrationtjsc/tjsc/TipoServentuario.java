
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoServentuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoServentuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="nmtiposerventuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoServentuario", propOrder = {
    "cdtiposerventuario",
    "nmtiposerventuario"
})
public class TipoServentuario {

    protected Short cdtiposerventuario;
    protected String nmtiposerventuario;

    /**
     * Gets the value of the cdtiposerventuario property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdtiposerventuario() {
        return cdtiposerventuario;
    }

    /**
     * Sets the value of the cdtiposerventuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdtiposerventuario(Short value) {
        this.cdtiposerventuario = value;
    }

    /**
     * Gets the value of the nmtiposerventuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiposerventuario() {
        return nmtiposerventuario;
    }

    /**
     * Sets the value of the nmtiposerventuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiposerventuario(String value) {
        this.nmtiposerventuario = value;
    }

}
