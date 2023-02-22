
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for motivoProtesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="motivoProtesto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdmotivoprotesto" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="nmmotivoprotesto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "motivoProtesto", propOrder = {
    "cdmotivoprotesto",
    "nmmotivoprotesto"
})
public class MotivoProtesto {

    protected Long cdmotivoprotesto;
    protected String nmmotivoprotesto;

    /**
     * Gets the value of the cdmotivoprotesto property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdmotivoprotesto() {
        return cdmotivoprotesto;
    }

    /**
     * Sets the value of the cdmotivoprotesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdmotivoprotesto(Long value) {
        this.cdmotivoprotesto = value;
    }

    /**
     * Gets the value of the nmmotivoprotesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmotivoprotesto() {
        return nmmotivoprotesto;
    }

    /**
     * Sets the value of the nmmotivoprotesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmotivoprotesto(String value) {
        this.nmmotivoprotesto = value;
    }

}
