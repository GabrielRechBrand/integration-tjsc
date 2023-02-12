
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCobranca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCobranca"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdtipocobranca" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dispositivolegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmtipocobranca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCobranca", propOrder = {
    "cdtipocobranca",
    "dispositivolegal",
    "nmtipocobranca"
})
public class TipoCobranca {

    protected Long cdtipocobranca;
    protected String dispositivolegal;
    protected String nmtipocobranca;

    /**
     * Gets the value of the cdtipocobranca property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdtipocobranca() {
        return cdtipocobranca;
    }

    /**
     * Sets the value of the cdtipocobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdtipocobranca(Long value) {
        this.cdtipocobranca = value;
    }

    /**
     * Gets the value of the dispositivolegal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispositivolegal() {
        return dispositivolegal;
    }

    /**
     * Sets the value of the dispositivolegal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispositivolegal(String value) {
        this.dispositivolegal = value;
    }

    /**
     * Gets the value of the nmtipocobranca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmtipocobranca() {
        return nmtipocobranca;
    }

    /**
     * Sets the value of the nmtipocobranca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmtipocobranca(String value) {
        this.nmtipocobranca = value;
    }

}
