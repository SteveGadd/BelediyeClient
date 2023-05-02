
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfBelediyeBilgilendirmeTur complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfBelediyeBilgilendirmeTur"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bilgilendirmeTuru" type="{http://belediye.turkiye.gov.tr/v3}belediyeBilgilendirmeTurType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfBelediyeBilgilendirmeTur", propOrder = {
    "bilgilendirmeTuru"
})
public class ArrayOfBelediyeBilgilendirmeTur {

    protected List<BelediyeBilgilendirmeTurType> bilgilendirmeTuru;

    /**
     * Gets the value of the bilgilendirmeTuru property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilgilendirmeTuru property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilgilendirmeTuru().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BelediyeBilgilendirmeTurType }
     * 
     * 
     */
    public List<BelediyeBilgilendirmeTurType> getBilgilendirmeTuru() {
        if (bilgilendirmeTuru == null) {
            bilgilendirmeTuru = new ArrayList<BelediyeBilgilendirmeTurType>();
        }
        return this.bilgilendirmeTuru;
    }

}
