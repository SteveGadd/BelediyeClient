
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneUyelikBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kutuphaneAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kutuphaneKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uyelikNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uyelikTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gecerlilikTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uyelikDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detaySorgulanabilirMi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "kutuphaneUyelikBilgileriType", propOrder = {
    "kutuphaneAdi",
    "kutuphaneKodu",
    "uyelikNumarasi",
    "uyelikTarihi",
    "gecerlilikTarihi",
    "uyelikDurumu",
    "aciklama",
    "detaySorgulanabilirMi",
    "detayListesi"
})
public class KutuphaneUyelikBilgileriType {

    @XmlElement(required = true)
    protected String kutuphaneAdi;
    @XmlElement(required = true)
    protected String kutuphaneKodu;
    @XmlElement(required = true)
    protected String uyelikNumarasi;
    @XmlElement(required = true)
    protected String uyelikTarihi;
    @XmlElement(required = true)
    protected String gecerlilikTarihi;
    @XmlElement(required = true)
    protected String uyelikDurumu;
    @XmlElement(required = true)
    protected String aciklama;
    protected boolean detaySorgulanabilirMi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

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
     * Gets the value of the uyelikNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUyelikNumarasi() {
        return uyelikNumarasi;
    }

    /**
     * Sets the value of the uyelikNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUyelikNumarasi(String value) {
        this.uyelikNumarasi = value;
    }

    /**
     * Gets the value of the uyelikTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUyelikTarihi() {
        return uyelikTarihi;
    }

    /**
     * Sets the value of the uyelikTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUyelikTarihi(String value) {
        this.uyelikTarihi = value;
    }

    /**
     * Gets the value of the gecerlilikTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGecerlilikTarihi() {
        return gecerlilikTarihi;
    }

    /**
     * Sets the value of the gecerlilikTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGecerlilikTarihi(String value) {
        this.gecerlilikTarihi = value;
    }

    /**
     * Gets the value of the uyelikDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUyelikDurumu() {
        return uyelikDurumu;
    }

    /**
     * Sets the value of the uyelikDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUyelikDurumu(String value) {
        this.uyelikDurumu = value;
    }

    /**
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAciklama(String value) {
        this.aciklama = value;
    }

    /**
     * Gets the value of the detaySorgulanabilirMi property.
     * 
     */
    public boolean isDetaySorgulanabilirMi() {
        return detaySorgulanabilirMi;
    }

    /**
     * Sets the value of the detaySorgulanabilirMi property.
     * 
     */
    public void setDetaySorgulanabilirMi(boolean value) {
        this.detaySorgulanabilirMi = value;
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
