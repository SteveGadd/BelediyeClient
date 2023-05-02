
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfCopToplamaBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfCopToplamaBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="copToplamaBilgisi" type="{http://belediye.turkiye.gov.tr/v3}copToplamaBilgisiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfCopToplamaBilgisi", propOrder = {
    "copToplamaBilgisi"
})
public class ArrayOfCopToplamaBilgisi {

    protected List<CopToplamaBilgisiType> copToplamaBilgisi;

    /**
     * Gets the value of the copToplamaBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copToplamaBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopToplamaBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopToplamaBilgisiType }
     * 
     * 
     */
    public List<CopToplamaBilgisiType> getCopToplamaBilgisi() {
        if (copToplamaBilgisi == null) {
            copToplamaBilgisi = new ArrayList<CopToplamaBilgisiType>();
        }
        return this.copToplamaBilgisi;
    }

}
