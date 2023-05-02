
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfEvrakSurecBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfEvrakSurecBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="surecBilgisi" type="{http://belediye.turkiye.gov.tr/v3}evrakSurecBilgisi" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfEvrakSurecBilgisi", propOrder = {
    "surecBilgisi"
})
public class ArrayOfEvrakSurecBilgisi {

    protected List<EvrakSurecBilgisi> surecBilgisi;

    /**
     * Gets the value of the surecBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surecBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurecBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvrakSurecBilgisi }
     * 
     * 
     */
    public List<EvrakSurecBilgisi> getSurecBilgisi() {
        if (surecBilgisi == null) {
            surecBilgisi = new ArrayList<EvrakSurecBilgisi>();
        }
        return this.surecBilgisi;
    }

}
