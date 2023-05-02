
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfBarinaktakiHayvanBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfBarinaktakiHayvanBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hayvanBilgisi" type="{http://belediye.turkiye.gov.tr/v3}barinaktakiHayvanBilgisi" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfBarinaktakiHayvanBilgisi", propOrder = {
    "hayvanBilgisi"
})
public class ArrayOfBarinaktakiHayvanBilgisi {

    protected List<BarinaktakiHayvanBilgisi> hayvanBilgisi;

    /**
     * Gets the value of the hayvanBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hayvanBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHayvanBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BarinaktakiHayvanBilgisi }
     * 
     * 
     */
    public List<BarinaktakiHayvanBilgisi> getHayvanBilgisi() {
        if (hayvanBilgisi == null) {
            hayvanBilgisi = new ArrayList<BarinaktakiHayvanBilgisi>();
        }
        return this.hayvanBilgisi;
    }

}
