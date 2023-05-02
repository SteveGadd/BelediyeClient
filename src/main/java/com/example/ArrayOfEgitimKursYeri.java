
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfEgitimKursYeri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfEgitimKursYeri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursYeriBilgisi" type="{http://belediye.turkiye.gov.tr/v3}egitimKursYeriType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfEgitimKursYeri", propOrder = {
    "egitimKursYeriBilgisi"
})
public class ArrayOfEgitimKursYeri {

    protected List<EgitimKursYeriType> egitimKursYeriBilgisi;

    /**
     * Gets the value of the egitimKursYeriBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egitimKursYeriBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEgitimKursYeriBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EgitimKursYeriType }
     * 
     * 
     */
    public List<EgitimKursYeriType> getEgitimKursYeriBilgisi() {
        if (egitimKursYeriBilgisi == null) {
            egitimKursYeriBilgisi = new ArrayList<EgitimKursYeriType>();
        }
        return this.egitimKursYeriBilgisi;
    }

}
