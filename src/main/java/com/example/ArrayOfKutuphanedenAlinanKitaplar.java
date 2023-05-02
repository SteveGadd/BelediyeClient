
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfKutuphanedenAlinanKitaplar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfKutuphanedenAlinanKitaplar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alinanKitap" type="{http://belediye.turkiye.gov.tr/v3}kutuphanedenAlinanKitapType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfKutuphanedenAlinanKitaplar", propOrder = {
    "alinanKitap"
})
public class ArrayOfKutuphanedenAlinanKitaplar {

    protected List<KutuphanedenAlinanKitapType> alinanKitap;

    /**
     * Gets the value of the alinanKitap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alinanKitap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlinanKitap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KutuphanedenAlinanKitapType }
     * 
     * 
     */
    public List<KutuphanedenAlinanKitapType> getAlinanKitap() {
        if (alinanKitap == null) {
            alinanKitap = new ArrayList<KutuphanedenAlinanKitapType>();
        }
        return this.alinanKitap;
    }

}
