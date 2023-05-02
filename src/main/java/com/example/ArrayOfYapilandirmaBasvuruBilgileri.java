
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfYapilandirmaBasvuruBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfYapilandirmaBasvuruBilgileri"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruBilgisi" type="{http://belediye.turkiye.gov.tr/v3}yapilandirmaBasvuruBilgileriType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfYapilandirmaBasvuruBilgileri", propOrder = {
    "basvuruBilgisi"
})
public class ArrayOfYapilandirmaBasvuruBilgileri {

    protected List<YapilandirmaBasvuruBilgileriType> basvuruBilgisi;

    /**
     * Gets the value of the basvuruBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basvuruBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasvuruBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YapilandirmaBasvuruBilgileriType }
     * 
     * 
     */
    public List<YapilandirmaBasvuruBilgileriType> getBasvuruBilgisi() {
        if (basvuruBilgisi == null) {
            basvuruBilgisi = new ArrayList<YapilandirmaBasvuruBilgileriType>();
        }
        return this.basvuruBilgisi;
    }

}
