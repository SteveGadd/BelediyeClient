
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vefatBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vefatBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vefatTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adSoyad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="babaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dogumTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="olumNedeni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilgiliKisiBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="namazveDefinYeriBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mezarlikBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "vefatBilgisiType", propOrder = {
    "vefatTarihi",
    "adSoyad",
    "babaAdi",
    "dogumTarihi",
    "yas",
    "olumNedeni",
    "ilgiliKisiBilgisi",
    "namazveDefinYeriBilgisi",
    "mezarlikBilgisi",
    "detayListesi"
})
public class VefatBilgisiType {

    @XmlElement(required = true)
    protected String vefatTarihi;
    @XmlElement(required = true)
    protected String adSoyad;
    @XmlElement(required = true)
    protected String babaAdi;
    @XmlElement(required = true)
    protected String dogumTarihi;
    @XmlElement(required = true)
    protected String yas;
    @XmlElement(required = true)
    protected String olumNedeni;
    @XmlElement(required = true)
    protected String ilgiliKisiBilgisi;
    @XmlElement(required = true)
    protected String namazveDefinYeriBilgisi;
    @XmlElement(required = true)
    protected String mezarlikBilgisi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the vefatTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVefatTarihi() {
        return vefatTarihi;
    }

    /**
     * Sets the value of the vefatTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVefatTarihi(String value) {
        this.vefatTarihi = value;
    }

    /**
     * Gets the value of the adSoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdSoyad() {
        return adSoyad;
    }

    /**
     * Sets the value of the adSoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdSoyad(String value) {
        this.adSoyad = value;
    }

    /**
     * Gets the value of the babaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBabaAdi() {
        return babaAdi;
    }

    /**
     * Sets the value of the babaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBabaAdi(String value) {
        this.babaAdi = value;
    }

    /**
     * Gets the value of the dogumTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogumTarihi() {
        return dogumTarihi;
    }

    /**
     * Sets the value of the dogumTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogumTarihi(String value) {
        this.dogumTarihi = value;
    }

    /**
     * Gets the value of the yas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYas() {
        return yas;
    }

    /**
     * Sets the value of the yas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYas(String value) {
        this.yas = value;
    }

    /**
     * Gets the value of the olumNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlumNedeni() {
        return olumNedeni;
    }

    /**
     * Sets the value of the olumNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlumNedeni(String value) {
        this.olumNedeni = value;
    }

    /**
     * Gets the value of the ilgiliKisiBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlgiliKisiBilgisi() {
        return ilgiliKisiBilgisi;
    }

    /**
     * Sets the value of the ilgiliKisiBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlgiliKisiBilgisi(String value) {
        this.ilgiliKisiBilgisi = value;
    }

    /**
     * Gets the value of the namazveDefinYeriBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamazveDefinYeriBilgisi() {
        return namazveDefinYeriBilgisi;
    }

    /**
     * Sets the value of the namazveDefinYeriBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamazveDefinYeriBilgisi(String value) {
        this.namazveDefinYeriBilgisi = value;
    }

    /**
     * Gets the value of the mezarlikBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezarlikBilgisi() {
        return mezarlikBilgisi;
    }

    /**
     * Sets the value of the mezarlikBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezarlikBilgisi(String value) {
        this.mezarlikBilgisi = value;
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
