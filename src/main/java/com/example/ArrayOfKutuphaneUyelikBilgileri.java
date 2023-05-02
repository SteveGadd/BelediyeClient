
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfKutuphaneUyelikBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfKutuphaneUyelikBilgileri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kutuphaneUyelikBilgisi" type="{http://belediye.turkiye.gov.tr/v3}kutuphaneUyelikBilgileriType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfKutuphaneUyelikBilgileri", propOrder = {
    "kutuphaneUyelikBilgisi"
})
public class ArrayOfKutuphaneUyelikBilgileri {

    protected List<KutuphaneUyelikBilgileriType> kutuphaneUyelikBilgisi;

    /**
     * Gets the value of the kutuphaneUyelikBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kutuphaneUyelikBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKutuphaneUyelikBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KutuphaneUyelikBilgileriType }
     * 
     * 
     */
    public List<KutuphaneUyelikBilgileriType> getKutuphaneUyelikBilgisi() {
        if (kutuphaneUyelikBilgisi == null) {
            kutuphaneUyelikBilgisi = new ArrayList<KutuphaneUyelikBilgileriType>();
        }
        return this.kutuphaneUyelikBilgisi;
    }

}
