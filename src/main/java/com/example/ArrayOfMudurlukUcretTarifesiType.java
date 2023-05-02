
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfMudurlukUcretTarifesiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfMudurlukUcretTarifesiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mudurlukUcretTarifesi" type="{http://belediye.turkiye.gov.tr/v3}mudurlukUcretTarifesiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfMudurlukUcretTarifesiType", propOrder = {
    "mudurlukUcretTarifesi"
})
public class ArrayOfMudurlukUcretTarifesiType {

    protected List<MudurlukUcretTarifesiType> mudurlukUcretTarifesi;

    /**
     * Gets the value of the mudurlukUcretTarifesi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mudurlukUcretTarifesi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMudurlukUcretTarifesi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MudurlukUcretTarifesiType }
     * 
     * 
     */
    public List<MudurlukUcretTarifesiType> getMudurlukUcretTarifesi() {
        if (mudurlukUcretTarifesi == null) {
            mudurlukUcretTarifesi = new ArrayList<MudurlukUcretTarifesiType>();
        }
        return this.mudurlukUcretTarifesi;
    }

}
