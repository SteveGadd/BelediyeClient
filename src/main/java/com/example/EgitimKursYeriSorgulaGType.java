
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursYeriSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursYeriSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursKategoriKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursYeriSorgulaGType", propOrder = {
    "egitimKursKategoriKodu"
})
public class EgitimKursYeriSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String egitimKursKategoriKodu;

    /**
     * Gets the value of the egitimKursKategoriKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursKategoriKodu() {
        return egitimKursKategoriKodu;
    }

    /**
     * Sets the value of the egitimKursKategoriKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursKategoriKodu(String value) {
        this.egitimKursKategoriKodu = value;
    }

}
