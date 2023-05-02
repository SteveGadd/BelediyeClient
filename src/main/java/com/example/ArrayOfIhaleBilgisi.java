
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfIhaleBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfIhaleBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ihaleBilgisi" type="{http://belediye.turkiye.gov.tr/v3}ihaleBilgisi" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfIhaleBilgisi", propOrder = {
    "ihaleBilgisi"
})
public class ArrayOfIhaleBilgisi {

    protected List<IhaleBilgisi> ihaleBilgisi;

    /**
     * Gets the value of the ihaleBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ihaleBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIhaleBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IhaleBilgisi }
     * 
     * 
     */
    public List<IhaleBilgisi> getIhaleBilgisi() {
        if (ihaleBilgisi == null) {
            ihaleBilgisi = new ArrayList<IhaleBilgisi>();
        }
        return this.ihaleBilgisi;
    }

}
