
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoRegistroAverbacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRegistroAverbacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtiporegaverbacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmtiporegaverbacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRegistroAverbacao", propOrder = {
    "cdtiporegaverbacao",
    "nmtiporegaverbacao"
})
public class TipoRegistroAverbacao {

    protected String cdtiporegaverbacao;
    protected String nmtiporegaverbacao;

    /**
     * Gets the value of the cdtiporegaverbacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtiporegaverbacao() {
        return cdtiporegaverbacao;
    }

    /**
     * Sets the value of the cdtiporegaverbacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtiporegaverbacao(String value) {
        this.cdtiporegaverbacao = value;
    }

    /**
     * Gets the value of the nmtiporegaverbacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtiporegaverbacao() {
        return nmtiporegaverbacao;
    }

    /**
     * Sets the value of the nmtiporegaverbacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtiporegaverbacao(String value) {
        this.nmtiporegaverbacao = value;
    }

}
