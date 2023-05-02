
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for katalogTaramaSonucType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="katalogTaramaSonucType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eserAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yazarAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yayinBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isbniisn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bulunduguKutuphane" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bulunduguKutuphaneKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yerNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="durumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sonIadeTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "katalogTaramaSonucType", propOrder = {
    "eserAdi",
    "yazarAdi",
    "yayinBilgisi",
    "isbniisn",
    "bulunduguKutuphane",
    "bulunduguKutuphaneKodu",
    "yerNumarasi",
    "durumu",
    "sonIadeTarihi",
    "detayListesi"
})
public class KatalogTaramaSonucType {

    @XmlElement(required = true)
    protected String eserAdi;
    @XmlElement(required = true)
    protected String yazarAdi;
    @XmlElement(required = true)
    protected String yayinBilgisi;
    @XmlElement(required = true)
    protected String isbniisn;
    @XmlElement(required = true)
    protected String bulunduguKutuphane;
    @XmlElement(required = true)
    protected String bulunduguKutuphaneKodu;
    @XmlElement(required = true)
    protected String yerNumarasi;
    @XmlElement(required = true)
    protected String durumu;
    @XmlElement(required = true)
    protected String sonIadeTarihi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the eserAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEserAdi() {
        return eserAdi;
    }

    /**
     * Sets the value of the eserAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEserAdi(String value) {
        this.eserAdi = value;
    }

    /**
     * Gets the value of the yazarAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYazarAdi() {
        return yazarAdi;
    }

    /**
     * Sets the value of the yazarAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYazarAdi(String value) {
        this.yazarAdi = value;
    }

    /**
     * Gets the value of the yayinBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYayinBilgisi() {
        return yayinBilgisi;
    }

    /**
     * Sets the value of the yayinBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYayinBilgisi(String value) {
        this.yayinBilgisi = value;
    }

    /**
     * Gets the value of the isbniisn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsbniisn() {
        return isbniisn;
    }

    /**
     * Sets the value of the isbniisn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsbniisn(String value) {
        this.isbniisn = value;
    }

    /**
     * Gets the value of the bulunduguKutuphane property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulunduguKutuphane() {
        return bulunduguKutuphane;
    }

    /**
     * Sets the value of the bulunduguKutuphane property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulunduguKutuphane(String value) {
        this.bulunduguKutuphane = value;
    }

    /**
     * Gets the value of the bulunduguKutuphaneKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulunduguKutuphaneKodu() {
        return bulunduguKutuphaneKodu;
    }

    /**
     * Sets the value of the bulunduguKutuphaneKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulunduguKutuphaneKodu(String value) {
        this.bulunduguKutuphaneKodu = value;
    }

    /**
     * Gets the value of the yerNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYerNumarasi() {
        return yerNumarasi;
    }

    /**
     * Sets the value of the yerNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYerNumarasi(String value) {
        this.yerNumarasi = value;
    }

    /**
     * Gets the value of the durumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurumu() {
        return durumu;
    }

    /**
     * Sets the value of the durumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurumu(String value) {
        this.durumu = value;
    }

    /**
     * Gets the value of the sonIadeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonIadeTarihi() {
        return sonIadeTarihi;
    }

    /**
     * Sets the value of the sonIadeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonIadeTarihi(String value) {
        this.sonIadeTarihi = value;
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
