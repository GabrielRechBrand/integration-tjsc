
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for comarcaMunicipio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="comarcaMunicipio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdcomarca" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cdmunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comarcaMunicipio", propOrder = {
    "cdcomarca",
    "cdmunicipio"
})
public class ComarcaMunicipio {

    protected Integer cdcomarca;
    protected Integer cdmunicipio;

    /**
     * Gets the value of the cdcomarca property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCdcomarca() {
        return cdcomarca;
    }

    /**
     * Sets the value of the cdcomarca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCdcomarca(Integer value) {
        this.cdcomarca = value;
    }

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

}
