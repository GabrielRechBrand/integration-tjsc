
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motivoCancelProtesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motivoCancelProtesto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdmotivocancelprotesto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmmotivocancelprotesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivoCancelProtesto", propOrder = {
    "cdmotivocancelprotesto",
    "nmmotivocancelprotesto"
})
public class MotivoCancelProtesto {

    protected Long cdmotivocancelprotesto;
    protected String nmmotivocancelprotesto;

    /**
     * Gets the value of the cdmotivocancelprotesto property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdmotivocancelprotesto() {
        return cdmotivocancelprotesto;
    }

    /**
     * Sets the value of the cdmotivocancelprotesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdmotivocancelprotesto(Long value) {
        this.cdmotivocancelprotesto = value;
    }

    /**
     * Gets the value of the nmmotivocancelprotesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmotivocancelprotesto() {
        return nmmotivocancelprotesto;
    }

    /**
     * Sets the value of the nmmotivocancelprotesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmotivocancelprotesto(String value) {
        this.nmmotivocancelprotesto = value;
    }

}
