
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfHizmetBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfHizmetBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hizmetBilgisi" type="{http://belediye.turkiye.gov.tr/v3}hizmetBilgisiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfHizmetBilgisi", propOrder = {
    "hizmetBilgisi"
})
public class ArrayOfHizmetBilgisi {

    protected List<HizmetBilgisiType> hizmetBilgisi;

    /**
     * Gets the value of the hizmetBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hizmetBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHizmetBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HizmetBilgisiType }
     * 
     * 
     */
    public List<HizmetBilgisiType> getHizmetBilgisi() {
        if (hizmetBilgisi == null) {
            hizmetBilgisi = new ArrayList<HizmetBilgisiType>();
        }
        return this.hizmetBilgisi;
    }

}
