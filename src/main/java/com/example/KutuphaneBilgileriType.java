
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kutuphaneKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kutuphaneAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kutuphanePOIId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uyelikBasvurusundaBulunulabilirMi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kutuphaneBilgileriType", propOrder = {
    "kutuphaneKodu",
    "kutuphaneAdi",
    "kutuphanePOIId",
    "uyelikBasvurusundaBulunulabilirMi",
    "detayListesi"
})
public class KutuphaneBilgileriType {

    @XmlElement(required = true)
    protected String kutuphaneKodu;
    @XmlElement(required = true)
    protected String kutuphaneAdi;
    @XmlElement(required = true)
    protected String kutuphanePOIId;
    protected boolean uyelikBasvurusundaBulunulabilirMi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the kutuphaneKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKutuphaneKodu() {
        return kutuphaneKodu;
    }

    /**
     * Sets the value of the kutuphaneKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKutuphaneKodu(String value) {
        this.kutuphaneKodu = value;
    }

    /**
     * Gets the value of the kutuphaneAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKutuphaneAdi() {
        return kutuphaneAdi;
    }

    /**
     * Sets the value of the kutuphaneAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKutuphaneAdi(String value) {
        this.kutuphaneAdi = value;
    }

    /**
     * Gets the value of the kutuphanePOIId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKutuphanePOIId() {
        return kutuphanePOIId;
    }

    /**
     * Sets the value of the kutuphanePOIId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKutuphanePOIId(String value) {
        this.kutuphanePOIId = value;
    }

    /**
     * Gets the value of the uyelikBasvurusundaBulunulabilirMi property.
     * 
     */
    public boolean isUyelikBasvurusundaBulunulabilirMi() {
        return uyelikBasvurusundaBulunulabilirMi;
    }

    /**
     * Sets the value of the uyelikBasvurusundaBulunulabilirMi property.
     * 
     */
    public void setUyelikBasvurusundaBulunulabilirMi(boolean value) {
        this.uyelikBasvurusundaBulunulabilirMi = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public ArrayOfDetailType getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public void setDetayListesi(ArrayOfDetailType value) {
        this.detayListesi = value;
    }

}
