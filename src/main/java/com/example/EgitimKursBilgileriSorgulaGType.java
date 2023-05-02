
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursBilgileriSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursBilgileriSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursKategoriKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursYeriKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursBilgileriSorgulaGType", propOrder = {
    "egitimKursKategoriKodu",
    "egitimKursYeriKodu"
})
public class EgitimKursBilgileriSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String egitimKursKategoriKodu;
    @XmlElement(required = true)
    protected String egitimKursYeriKodu;

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

    /**
     * Gets the value of the egitimKursYeriKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursYeriKodu() {
        return egitimKursYeriKodu;
    }

    /**
     * Sets the value of the egitimKursYeriKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursYeriKodu(String value) {
        this.egitimKursYeriKodu = value;
    }

}
