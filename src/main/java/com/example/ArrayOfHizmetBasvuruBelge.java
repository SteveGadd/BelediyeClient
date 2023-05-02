
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfHizmetBasvuruBelge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfHizmetBasvuruBelge"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruBelgesi" type="{http://belediye.turkiye.gov.tr/v3}hizmetBasvuruBelgeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfHizmetBasvuruBelge", propOrder = {
    "basvuruBelgesi"
})
public class ArrayOfHizmetBasvuruBelge {

    protected List<HizmetBasvuruBelgeType> basvuruBelgesi;

    /**
     * Gets the value of the basvuruBelgesi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basvuruBelgesi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasvuruBelgesi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HizmetBasvuruBelgeType }
     * 
     * 
     */
    public List<HizmetBasvuruBelgeType> getBasvuruBelgesi() {
        if (basvuruBelgesi == null) {
            basvuruBelgesi = new ArrayList<HizmetBasvuruBelgeType>();
        }
        return this.basvuruBelgesi;
    }

}
