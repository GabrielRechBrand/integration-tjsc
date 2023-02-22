
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEtniasResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEtniasResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="etnias" type="{http://www.tjsc.jus.br/selo}etnia" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEtniasResponse", propOrder = {
    "etnias"
})
public class GetEtniasResponse {

    protected List<Etnia> etnias;

    /**
     * Gets the value of the etnias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the etnias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtnias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Etnia }
     * 
     * 
     */
    public List<Etnia> getEtnias() {
        if (etnias == null) {
            etnias = new ArrayList<Etnia>();
        }
        return this.etnias;
    }

}
