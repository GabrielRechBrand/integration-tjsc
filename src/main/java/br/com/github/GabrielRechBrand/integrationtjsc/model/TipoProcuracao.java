
package br.com.github.GabrielRechBrand.integrationtjsc.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoProcuracao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoProcuracao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipoprocuracao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmtipoprocuracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoProcuracao", propOrder = {
    "cdtipoprocuracao",
    "nmtipoprocuracao"
})
public class TipoProcuracao {

    protected Long cdtipoprocuracao;
    protected String nmtipoprocuracao;

    /**
     * Gets the value of the cdtipoprocuracao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipoprocuracao() {
        return cdtipoprocuracao;
    }

    /**
     * Sets the value of the cdtipoprocuracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipoprocuracao(Long value) {
        this.cdtipoprocuracao = value;
    }

    /**
     * Gets the value of the nmtipoprocuracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipoprocuracao() {
        return nmtipoprocuracao;
    }

    /**
     * Sets the value of the nmtipoprocuracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipoprocuracao(String value) {
        this.nmtipoprocuracao = value;
    }

}
