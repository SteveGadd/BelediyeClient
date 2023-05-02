
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTVKullanimAmaciType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTVKullanimAmaciType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kullanimAmaciKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kullanimAmaciAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kullanimAmaciEkAlanKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTVKullanimAmaciType", propOrder = {
    "kullanimAmaciKodu",
    "kullanimAmaciAdi",
    "kullanimAmaciEkAlanKodu"
})
public class CTVKullanimAmaciType {

    @XmlElement(required = true)
    protected String kullanimAmaciKodu;
    @XmlElement(required = true)
    protected String kullanimAmaciAdi;
    @XmlElement(required = true)
    protected String kullanimAmaciEkAlanKodu;

    /**
     * Gets the value of the kullanimAmaciKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullanimAmaciKodu() {
        return kullanimAmaciKodu;
    }

    /**
     * Sets the value of the kullanimAmaciKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullanimAmaciKodu(String value) {
        this.kullanimAmaciKodu = value;
    }

    /**
     * Gets the value of the kullanimAmaciAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullanimAmaciAdi() {
        return kullanimAmaciAdi;
    }

    /**
     * Sets the value of the kullanimAmaciAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullanimAmaciAdi(String value) {
        this.kullanimAmaciAdi = value;
    }

    /**
     * Gets the value of the kullanimAmaciEkAlanKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullanimAmaciEkAlanKodu() {
        return kullanimAmaciEkAlanKodu;
    }

    /**
     * Sets the value of the kullanimAmaciEkAlanKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullanimAmaciEkAlanKodu(String value) {
        this.kullanimAmaciEkAlanKodu = value;
    }

}
