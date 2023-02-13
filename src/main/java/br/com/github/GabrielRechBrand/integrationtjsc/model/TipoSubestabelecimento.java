
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoSubestabelecimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoSubestabelecimento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtiposubestabelecimento" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmtiposubestabelecimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoSubestabelecimento", propOrder = {
    "cdtiposubestabelecimento",
    "nmtiposubestabelecimento"
})
public class TipoSubestabelecimento {

    protected Long cdtiposubestabelecimento;
    protected String nmtiposubestabelecimento;

    /**
     * Gets the value of the cdtiposubestabelecimento property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtiposubestabelecimento() {
        return cdtiposubestabelecimento;
    }

    /**
     * Sets the value of the cdtiposubestabelecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtiposubestabelecimento(Long value) {
        this.cdtiposubestabelecimento = value;
    }

    /**
     * Gets the value of the nmtiposubestabelecimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiposubestabelecimento() {
        return nmtiposubestabelecimento;
    }

    /**
     * Sets the value of the nmtiposubestabelecimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiposubestabelecimento(String value) {
        this.nmtiposubestabelecimento = value;
    }

}
