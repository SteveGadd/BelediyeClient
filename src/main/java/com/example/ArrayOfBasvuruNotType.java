
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfBasvuruNotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfBasvuruNotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="basvuruNot" type="{http://belediye.turkiye.gov.tr/v3}basvuruNotType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfBasvuruNotType", propOrder = {
    "basvuruNot"
})
public class ArrayOfBasvuruNotType {

    @XmlElement(required = true)
    protected List<BasvuruNotType> basvuruNot;

    /**
     * Gets the value of the basvuruNot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basvuruNot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasvuruNot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BasvuruNotType }
     * 
     * 
     */
    public List<BasvuruNotType> getBasvuruNot() {
        if (basvuruNot == null) {
            basvuruNot = new ArrayList<BasvuruNotType>();
        }
        return this.basvuruNot;
    }

}
