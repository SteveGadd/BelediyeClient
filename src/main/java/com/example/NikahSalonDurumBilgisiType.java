
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nikahSalonDurumBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nikahSalonDurumBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baslangicSaati" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bitisSaati" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="durumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rezervasyonTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rezervasyonYapan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gecerlilikTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "nikahSalonDurumBilgisiType", propOrder = {
    "baslangicSaati",
    "bitisSaati",
    "durumu",
    "rezervasyonTarihi",
    "rezervasyonYapan",
    "gecerlilikTarihi",
    "aciklama",
    "detayListesi"
})
public class NikahSalonDurumBilgisiType {

    @XmlElement(required = true)
    protected String baslangicSaati;
    @XmlElement(required = true)
    protected String bitisSaati;
    @XmlElement(required = true)
    protected String durumu;
    @XmlElement(required = true)
    protected String rezervasyonTarihi;
    @XmlElement(required = true)
    protected String rezervasyonYapan;
    @XmlElement(required = true)
    protected String gecerlilikTarihi;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the baslangicSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicSaati() {
        return baslangicSaati;
    }

    /**
     * Sets the value of the baslangicSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicSaati(String value) {
        this.baslangicSaati = value;
    }

    /**
     * Gets the value of the bitisSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisSaati() {
        return bitisSaati;
    }

    /**
     * Sets the value of the bitisSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisSaati(String value) {
        this.bitisSaati = value;
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
     * Gets the value of the rezervasyonTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRezervasyonTarihi() {
        return rezervasyonTarihi;
    }

    /**
     * Sets the value of the rezervasyonTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRezervasyonTarihi(String value) {
        this.rezervasyonTarihi = value;
    }

    /**
     * Gets the value of the rezervasyonYapan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRezervasyonYapan() {
        return rezervasyonYapan;
    }

    /**
     * Sets the value of the rezervasyonYapan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRezervasyonYapan(String value) {
        this.rezervasyonYapan = value;
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
