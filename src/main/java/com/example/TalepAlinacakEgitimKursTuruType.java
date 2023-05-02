
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for talepAlinacakEgitimKursTuruType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="talepAlinacakEgitimKursTuruType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "talepAlinacakEgitimKursTuruType", propOrder = {
    "egitimKursKodu",
    "egitimKursAdi"
})
public class TalepAlinacakEgitimKursTuruType {

    @XmlElement(required = true)
    protected String egitimKursKodu;
    @XmlElement(required = true)
    protected String egitimKursAdi;

    /**
     * Gets the value of the egitimKursKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursKodu() {
        return egitimKursKodu;
    }

    /**
     * Sets the value of the egitimKursKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursKodu(String value) {
        this.egitimKursKodu = value;
    }

    /**
     * Gets the value of the egitimKursAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursAdi() {
        return egitimKursAdi;
    }

    /**
     * Sets the value of the egitimKursAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursAdi(String value) {
        this.egitimKursAdi = value;
    }

}
