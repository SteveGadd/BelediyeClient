
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfHalUrunKategori complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfHalUrunKategori"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="urunKategoriBilgisi" type="{http://belediye.turkiye.gov.tr/v3}halUrunKategoriType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfHalUrunKategori", propOrder = {
    "urunKategoriBilgisi"
})
public class ArrayOfHalUrunKategori {

    protected List<HalUrunKategoriType> urunKategoriBilgisi;

    /**
     * Gets the value of the urunKategoriBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urunKategoriBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrunKategoriBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HalUrunKategoriType }
     * 
     * 
     */
    public List<HalUrunKategoriType> getUrunKategoriBilgisi() {
        if (urunKategoriBilgisi == null) {
            urunKategoriBilgisi = new ArrayList<HalUrunKategoriType>();
        }
        return this.urunKategoriBilgisi;
    }

}
