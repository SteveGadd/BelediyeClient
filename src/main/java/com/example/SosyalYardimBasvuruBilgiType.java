
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sosyalYardimBasvuruBilgiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sosyalYardimBasvuruBilgiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yardimTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yardimDetaySorgulamaKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "sosyalYardimBasvuruBilgiType", propOrder = {
    "yardimTuru",
    "basvuruNumarasi",
    "basvuruTarihi",
    "basvuruDurumu",
    "aciklama",
    "yardimDetaySorgulamaKodu",
    "detayListesi"
})
@XmlSeeAlso({
    YapilanSosyalYardimBilgileriType.class
})
public class SosyalYardimBasvuruBilgiType {

    @XmlElement(required = true)
    protected String yardimTuru;
    @XmlElement(required = true)
    protected String basvuruNumarasi;
    @XmlElement(required = true)
    protected String basvuruTarihi;
    @XmlElement(required = true)
    protected String basvuruDurumu;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElement(required = true)
    protected String yardimDetaySorgulamaKodu;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the yardimTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimTuru() {
        return yardimTuru;
    }

    /**
     * Sets the value of the yardimTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimTuru(String value) {
        this.yardimTuru = value;
    }

    /**
     * Gets the value of the basvuruNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruNumarasi() {
        return basvuruNumarasi;
    }

    /**
     * Sets the value of the basvuruNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruNumarasi(String value) {
        this.basvuruNumarasi = value;
    }

    /**
     * Gets the value of the basvuruTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruTarihi() {
        return basvuruTarihi;
    }

    /**
     * Sets the value of the basvuruTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruTarihi(String value) {
        this.basvuruTarihi = value;
    }

    /**
     * Gets the value of the basvuruDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruDurumu() {
        return basvuruDurumu;
    }

    /**
     * Sets the value of the basvuruDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruDurumu(String value) {
        this.basvuruDurumu = value;
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
     * Gets the value of the yardimDetaySorgulamaKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimDetaySorgulamaKodu() {
        return yardimDetaySorgulamaKodu;
    }

    /**
     * Sets the value of the yardimDetaySorgulamaKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimDetaySorgulamaKodu(String value) {
        this.yardimDetaySorgulamaKodu = value;
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
