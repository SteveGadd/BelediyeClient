
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfKayitliEmlakRayicBelgesi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfKayitliEmlakRayicBelgesi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kayitliEmlakRayicBelgesi" type="{http://belediye.turkiye.gov.tr/v3}kayitliEmlakRayicBelgesiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfKayitliEmlakRayicBelgesi", propOrder = {
    "kayitliEmlakRayicBelgesi"
})
public class ArrayOfKayitliEmlakRayicBelgesi {

    protected List<KayitliEmlakRayicBelgesiType> kayitliEmlakRayicBelgesi;

    /**
     * Gets the value of the kayitliEmlakRayicBelgesi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kayitliEmlakRayicBelgesi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKayitliEmlakRayicBelgesi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KayitliEmlakRayicBelgesiType }
     * 
     * 
     */
    public List<KayitliEmlakRayicBelgesiType> getKayitliEmlakRayicBelgesi() {
        if (kayitliEmlakRayicBelgesi == null) {
            kayitliEmlakRayicBelgesi = new ArrayList<KayitliEmlakRayicBelgesiType>();
        }
        return this.kayitliEmlakRayicBelgesi;
    }

}
