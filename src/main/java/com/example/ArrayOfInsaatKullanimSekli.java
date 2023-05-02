
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfInsaatKullanimSekli complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfInsaatKullanimSekli"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insaatKullanimSekli" type="{http://belediye.turkiye.gov.tr/v3}insaatKullanimSekliType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfInsaatKullanimSekli", propOrder = {
    "insaatKullanimSekli"
})
public class ArrayOfInsaatKullanimSekli {

    protected List<InsaatKullanimSekliType> insaatKullanimSekli;

    /**
     * Gets the value of the insaatKullanimSekli property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insaatKullanimSekli property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsaatKullanimSekli().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsaatKullanimSekliType }
     * 
     * 
     */
    public List<InsaatKullanimSekliType> getInsaatKullanimSekli() {
        if (insaatKullanimSekli == null) {
            insaatKullanimSekli = new ArrayList<InsaatKullanimSekliType>();
        }
        return this.insaatKullanimSekli;
    }

}
