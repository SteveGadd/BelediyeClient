
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for halUrunKategoriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="halUrunKategoriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kategoriKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kategoriAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "halUrunKategoriType", propOrder = {
    "kategoriKodu",
    "kategoriAdi"
})
public class HalUrunKategoriType {

    @XmlElement(required = true)
    protected String kategoriKodu;
    @XmlElement(required = true)
    protected String kategoriAdi;

    /**
     * Gets the value of the kategoriKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategoriKodu() {
        return kategoriKodu;
    }

    /**
     * Sets the value of the kategoriKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategoriKodu(String value) {
        this.kategoriKodu = value;
    }

    /**
     * Gets the value of the kategoriAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategoriAdi() {
        return kategoriAdi;
    }

    /**
     * Sets the value of the kategoriAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategoriAdi(String value) {
        this.kategoriAdi = value;
    }

}
