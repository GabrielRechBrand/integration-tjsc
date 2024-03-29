
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moeda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="moeda"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdmoeda" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="desimbolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtvigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="flmoedabr" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="flvigente" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="nmmoeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nmmoedaplural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moeda", propOrder = {
    "cdmoeda",
    "desimbolo",
    "dtvigencia",
    "flmoedabr",
    "flvigente",
    "nmmoeda",
    "nmmoedaplural"
})
public class Moeda {

    protected Short cdmoeda;
    protected String desimbolo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtvigencia;
    protected short flmoedabr;
    protected short flvigente;
    protected String nmmoeda;
    protected String nmmoedaplural;

    /**
     * Gets the value of the cdmoeda property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCdmoeda() {
        return cdmoeda;
    }

    /**
     * Sets the value of the cdmoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCdmoeda(Short value) {
        this.cdmoeda = value;
    }

    /**
     * Gets the value of the desimbolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesimbolo() {
        return desimbolo;
    }

    /**
     * Sets the value of the desimbolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesimbolo(String value) {
        this.desimbolo = value;
    }

    /**
     * Gets the value of the dtvigencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtvigencia() {
        return dtvigencia;
    }

    /**
     * Sets the value of the dtvigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtvigencia(XMLGregorianCalendar value) {
        this.dtvigencia = value;
    }

    /**
     * Gets the value of the flmoedabr property.
     * 
     */
    public short getFlmoedabr() {
        return flmoedabr;
    }

    /**
     * Sets the value of the flmoedabr property.
     * 
     */
    public void setFlmoedabr(short value) {
        this.flmoedabr = value;
    }

    /**
     * Gets the value of the flvigente property.
     * 
     */
    public short getFlvigente() {
        return flvigente;
    }

    /**
     * Sets the value of the flvigente property.
     * 
     */
    public void setFlvigente(short value) {
        this.flvigente = value;
    }

    /**
     * Gets the value of the nmmoeda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmoeda() {
        return nmmoeda;
    }

    /**
     * Sets the value of the nmmoeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmoeda(String value) {
        this.nmmoeda = value;
    }

    /**
     * Gets the value of the nmmoedaplural property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmmoedaplural() {
        return nmmoedaplural;
    }

    /**
     * Sets the value of the nmmoedaplural property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmmoedaplural(String value) {
        this.nmmoedaplural = value;
    }

}
