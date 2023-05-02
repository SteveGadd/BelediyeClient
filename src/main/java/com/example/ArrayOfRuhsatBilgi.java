
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfRuhsatBilgi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfRuhsatBilgi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruhsatBilgisi" type="{http://belediye.turkiye.gov.tr/v3}ruhsatBilgiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfRuhsatBilgi", propOrder = {
    "ruhsatBilgisi"
})
public class ArrayOfRuhsatBilgi {

    protected List<RuhsatBilgiType> ruhsatBilgisi;

    /**
     * Gets the value of the ruhsatBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruhsatBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuhsatBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuhsatBilgiType }
     * 
     * 
     */
    public List<RuhsatBilgiType> getRuhsatBilgisi() {
        if (ruhsatBilgisi == null) {
            ruhsatBilgisi = new ArrayList<RuhsatBilgiType>();
        }
        return this.ruhsatBilgisi;
    }

}
