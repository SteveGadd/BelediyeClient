
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ucretTarifesiBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ucretTarifesiBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hizmetKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="birim" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="birimFiyat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="paraBirimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ucretTarifesiBilgisiType", propOrder = {
    "hizmetKodu",
    "hizmetAdi",
    "hizmetAciklama",
    "birim",
    "birimFiyat",
    "paraBirimi",
    "detayListesi"
})
public class UcretTarifesiBilgisiType {

    @XmlElement(required = true)
    protected String hizmetKodu;
    @XmlElement(required = true)
    protected String hizmetAdi;
    @XmlElement(required = true, nillable = true)
    protected String hizmetAciklama;
    @XmlElement(required = true)
    protected String birim;
    @XmlElement(required = true)
    protected String birimFiyat;
    @XmlElement(required = true)
    protected String paraBirimi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the hizmetKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetKodu() {
        return hizmetKodu;
    }

    /**
     * Sets the value of the hizmetKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetKodu(String value) {
        this.hizmetKodu = value;
    }

    /**
     * Gets the value of the hizmetAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetAdi() {
        return hizmetAdi;
    }

    /**
     * Sets the value of the hizmetAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetAdi(String value) {
        this.hizmetAdi = value;
    }

    /**
     * Gets the value of the hizmetAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetAciklama() {
        return hizmetAciklama;
    }

    /**
     * Sets the value of the hizmetAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetAciklama(String value) {
        this.hizmetAciklama = value;
    }

    /**
     * Gets the value of the birim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirim() {
        return birim;
    }

    /**
     * Sets the value of the birim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirim(String value) {
        this.birim = value;
    }

    /**
     * Gets the value of the birimFiyat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirimFiyat() {
        return birimFiyat;
    }

    /**
     * Sets the value of the birimFiyat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirimFiyat(String value) {
        this.birimFiyat = value;
    }

    /**
     * Gets the value of the paraBirimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParaBirimi() {
        return paraBirimi;
    }

    /**
     * Sets the value of the paraBirimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParaBirimi(String value) {
        this.paraBirimi = value;
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
