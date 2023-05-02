
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfInsaatTuru complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfInsaatTuru"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insaatTuru" type="{http://belediye.turkiye.gov.tr/v3}insaatTuruType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfInsaatTuru", propOrder = {
    "insaatTuru"
})
public class ArrayOfInsaatTuru {

    protected List<InsaatTuruType> insaatTuru;

    /**
     * Gets the value of the insaatTuru property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insaatTuru property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsaatTuru().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsaatTuruType }
     * 
     * 
     */
    public List<InsaatTuruType> getInsaatTuru() {
        if (insaatTuru == null) {
            insaatTuru = new ArrayList<InsaatTuruType>();
        }
        return this.insaatTuru;
    }

}
