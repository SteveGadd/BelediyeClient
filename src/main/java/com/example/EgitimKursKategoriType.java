
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursKategoriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursKategoriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursKategoriKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eigitimKursKategoriAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursKategoriType", propOrder = {
    "egitimKursKategoriKodu",
    "eigitimKursKategoriAdi"
})
public class EgitimKursKategoriType {

    @XmlElement(required = true)
    protected String egitimKursKategoriKodu;
    @XmlElement(required = true)
    protected String eigitimKursKategoriAdi;

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
     * Gets the value of the eigitimKursKategoriAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEigitimKursKategoriAdi() {
        return eigitimKursKategoriAdi;
    }

    /**
     * Sets the value of the eigitimKursKategoriAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEigitimKursKategoriAdi(String value) {
        this.eigitimKursKategoriAdi = value;
    }

}
