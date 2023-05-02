
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfNobetciEczane complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfNobetciEczane"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nobetciEczane" type="{http://belediye.turkiye.gov.tr/v3}nobetciEczaneType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfNobetciEczane", propOrder = {
    "nobetciEczane"
})
public class ArrayOfNobetciEczane {

    protected List<NobetciEczaneType> nobetciEczane;

    /**
     * Gets the value of the nobetciEczane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nobetciEczane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNobetciEczane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NobetciEczaneType }
     * 
     * 
     */
    public List<NobetciEczaneType> getNobetciEczane() {
        if (nobetciEczane == null) {
            nobetciEczane = new ArrayList<NobetciEczaneType>();
        }
        return this.nobetciEczane;
    }

}
