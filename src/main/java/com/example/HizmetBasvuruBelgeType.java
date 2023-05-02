
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hizmetBasvuruBelgeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hizmetBasvuruBelgeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belgeKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="belgeAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="belgeAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="belgeIndirmeURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hizmetBasvuruBelgeType", propOrder = {
    "belgeKodu",
    "belgeAdi",
    "belgeAciklama",
    "belgeIndirmeURL"
})
public class HizmetBasvuruBelgeType {

    @XmlElement(required = true)
    protected String belgeKodu;
    @XmlElement(required = true)
    protected String belgeAdi;
    @XmlElement(required = true)
    protected String belgeAciklama;
    @XmlElement(required = true)
    protected String belgeIndirmeURL;

    /**
     * Gets the value of the belgeKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeKodu() {
        return belgeKodu;
    }

    /**
     * Sets the value of the belgeKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeKodu(String value) {
        this.belgeKodu = value;
    }

    /**
     * Gets the value of the belgeAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeAdi() {
        return belgeAdi;
    }

    /**
     * Sets the value of the belgeAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeAdi(String value) {
        this.belgeAdi = value;
    }

    /**
     * Gets the value of the belgeAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeAciklama() {
        return belgeAciklama;
    }

    /**
     * Sets the value of the belgeAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeAciklama(String value) {
        this.belgeAciklama = value;
    }

    /**
     * Gets the value of the belgeIndirmeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeIndirmeURL() {
        return belgeIndirmeURL;
    }

    /**
     * Sets the value of the belgeIndirmeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeIndirmeURL(String value) {
        this.belgeIndirmeURL = value;
    }

}
