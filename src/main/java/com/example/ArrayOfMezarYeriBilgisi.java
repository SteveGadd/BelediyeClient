
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfMezarYeriBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfMezarYeriBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mezarYeriBilgisi" type="{http://belediye.turkiye.gov.tr/v3}mezarYeriBilgisiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfMezarYeriBilgisi", propOrder = {
    "mezarYeriBilgisi"
})
public class ArrayOfMezarYeriBilgisi {

    protected List<MezarYeriBilgisiType> mezarYeriBilgisi;

    /**
     * Gets the value of the mezarYeriBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mezarYeriBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMezarYeriBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MezarYeriBilgisiType }
     * 
     * 
     */
    public List<MezarYeriBilgisiType> getMezarYeriBilgisi() {
        if (mezarYeriBilgisi == null) {
            mezarYeriBilgisi = new ArrayList<MezarYeriBilgisiType>();
        }
        return this.mezarYeriBilgisi;
    }

}
