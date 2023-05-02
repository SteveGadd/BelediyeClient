
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfKararTarihBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfKararTarihBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kararTarihBilgisi" type="{http://belediye.turkiye.gov.tr/v3}kararTarihBilgisiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfKararTarihBilgisi", propOrder = {
    "kararTarihBilgisi"
})
public class ArrayOfKararTarihBilgisi {

    protected List<KararTarihBilgisiType> kararTarihBilgisi;

    /**
     * Gets the value of the kararTarihBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kararTarihBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKararTarihBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KararTarihBilgisiType }
     * 
     * 
     */
    public List<KararTarihBilgisiType> getKararTarihBilgisi() {
        if (kararTarihBilgisi == null) {
            kararTarihBilgisi = new ArrayList<KararTarihBilgisiType>();
        }
        return this.kararTarihBilgisi;
    }

}
