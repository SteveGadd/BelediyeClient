
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfTaksitSecenek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfTaksitSecenek"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taksitSecenek" type="{http://belediye.turkiye.gov.tr/v3}taksitSecenekType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfTaksitSecenek", propOrder = {
    "taksitSecenek"
})
public class ArrayOfTaksitSecenek {

    @XmlElement(required = true)
    protected List<TaksitSecenekType> taksitSecenek;

    /**
     * Gets the value of the taksitSecenek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taksitSecenek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaksitSecenek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaksitSecenekType }
     * 
     * 
     */
    public List<TaksitSecenekType> getTaksitSecenek() {
        if (taksitSecenek == null) {
            taksitSecenek = new ArrayList<TaksitSecenekType>();
        }
        return this.taksitSecenek;
    }

}
