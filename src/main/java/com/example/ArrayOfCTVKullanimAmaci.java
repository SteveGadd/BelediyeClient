
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfCTVKullanimAmaci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfCTVKullanimAmaci"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CTVKullanimAmaci" type="{http://belediye.turkiye.gov.tr/v3}CTVKullanimAmaciType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfCTVKullanimAmaci", propOrder = {
    "ctvKullanimAmaci"
})
public class ArrayOfCTVKullanimAmaci {

    @XmlElement(name = "CTVKullanimAmaci")
    protected List<CTVKullanimAmaciType> ctvKullanimAmaci;

    /**
     * Gets the value of the ctvKullanimAmaci property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctvKullanimAmaci property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCTVKullanimAmaci().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTVKullanimAmaciType }
     * 
     * 
     */
    public List<CTVKullanimAmaciType> getCTVKullanimAmaci() {
        if (ctvKullanimAmaci == null) {
            ctvKullanimAmaci = new ArrayList<CTVKullanimAmaciType>();
        }
        return this.ctvKullanimAmaci;
    }

}
