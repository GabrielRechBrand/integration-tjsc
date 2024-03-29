
package br.com.github.GabrielRechBrand.integrationtjsc.tjsc;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getComarcasMunicipiosResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getComarcasMunicipiosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comarcasmunicipios" type="{http://www.tjsc.jus.br/selo}comarcaMunicipio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getComarcasMunicipiosResponse", propOrder = {
    "comarcasmunicipios"
})
public class GetComarcasMunicipiosResponse {

    protected List<ComarcaMunicipio> comarcasmunicipios;

    /**
     * Gets the value of the comarcasmunicipios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the comarcasmunicipios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComarcasmunicipios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComarcaMunicipio }
     * 
     * 
     */
    public List<ComarcaMunicipio> getComarcasmunicipios() {
        if (comarcasmunicipios == null) {
            comarcasmunicipios = new ArrayList<ComarcaMunicipio>();
        }
        return this.comarcasmunicipios;
    }

}
