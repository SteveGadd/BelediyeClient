
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nikahBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nikahBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarih" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="saat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="salonBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="damatAdSoyad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gelinAdSoyad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="damatEbeveynBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gelinEbeveynBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "nikahBilgisiType", propOrder = {
    "tarih",
    "saat",
    "salonBilgisi",
    "damatAdSoyad",
    "gelinAdSoyad",
    "damatEbeveynBilgisi",
    "gelinEbeveynBilgisi",
    "detayListesi"
})
public class NikahBilgisiType {

    @XmlElement(required = true)
    protected String tarih;
    @XmlElement(required = true)
    protected String saat;
    @XmlElement(required = true)
    protected String salonBilgisi;
    @XmlElement(required = true)
    protected String damatAdSoyad;
    @XmlElement(required = true)
    protected String gelinAdSoyad;
    @XmlElement(required = true)
    protected String damatEbeveynBilgisi;
    @XmlElement(required = true)
    protected String gelinEbeveynBilgisi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the tarih property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarih() {
        return tarih;
    }

    /**
     * Sets the value of the tarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarih(String value) {
        this.tarih = value;
    }

    /**
     * Gets the value of the saat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaat() {
        return saat;
    }

    /**
     * Sets the value of the saat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaat(String value) {
        this.saat = value;
    }

    /**
     * Gets the value of the salonBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalonBilgisi() {
        return salonBilgisi;
    }

    /**
     * Sets the value of the salonBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalonBilgisi(String value) {
        this.salonBilgisi = value;
    }

    /**
     * Gets the value of the damatAdSoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamatAdSoyad() {
        return damatAdSoyad;
    }

    /**
     * Sets the value of the damatAdSoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamatAdSoyad(String value) {
        this.damatAdSoyad = value;
    }

    /**
     * Gets the value of the gelinAdSoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGelinAdSoyad() {
        return gelinAdSoyad;
    }

    /**
     * Sets the value of the gelinAdSoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGelinAdSoyad(String value) {
        this.gelinAdSoyad = value;
    }

    /**
     * Gets the value of the damatEbeveynBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamatEbeveynBilgisi() {
        return damatEbeveynBilgisi;
    }

    /**
     * Sets the value of the damatEbeveynBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamatEbeveynBilgisi(String value) {
        this.damatEbeveynBilgisi = value;
    }

    /**
     * Gets the value of the gelinEbeveynBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGelinEbeveynBilgisi() {
        return gelinEbeveynBilgisi;
    }

    /**
     * Sets the value of the gelinEbeveynBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGelinEbeveynBilgisi(String value) {
        this.gelinEbeveynBilgisi = value;
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
