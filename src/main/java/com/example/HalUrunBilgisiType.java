
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for halUrunBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="halUrunBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarih" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="urunAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="birim" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="enDusukFiyat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="enYuksekFiyat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="haldekiToplamUrunMiktari" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "halUrunBilgisiType", propOrder = {
    "tarih",
    "urunAdi",
    "birim",
    "enDusukFiyat",
    "enYuksekFiyat",
    "haldekiToplamUrunMiktari",
    "aciklama"
})
public class HalUrunBilgisiType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tarih;
    @XmlElement(required = true)
    protected String urunAdi;
    @XmlElement(required = true)
    protected String birim;
    @XmlElement(required = true)
    protected BigDecimal enDusukFiyat;
    @XmlElement(required = true)
    protected BigDecimal enYuksekFiyat;
    @XmlElement(required = true)
    protected String haldekiToplamUrunMiktari;
    @XmlElement(required = true)
    protected String aciklama;

    /**
     * Gets the value of the tarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTarih() {
        return tarih;
    }

    /**
     * Sets the value of the tarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTarih(XMLGregorianCalendar value) {
        this.tarih = value;
    }

    /**
     * Gets the value of the urunAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrunAdi() {
        return urunAdi;
    }

    /**
     * Sets the value of the urunAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrunAdi(String value) {
        this.urunAdi = value;
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
     * Gets the value of the enDusukFiyat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnDusukFiyat() {
        return enDusukFiyat;
    }

    /**
     * Sets the value of the enDusukFiyat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnDusukFiyat(BigDecimal value) {
        this.enDusukFiyat = value;
    }

    /**
     * Gets the value of the enYuksekFiyat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnYuksekFiyat() {
        return enYuksekFiyat;
    }

    /**
     * Sets the value of the enYuksekFiyat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnYuksekFiyat(BigDecimal value) {
        this.enYuksekFiyat = value;
    }

    /**
     * Gets the value of the haldekiToplamUrunMiktari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHaldekiToplamUrunMiktari() {
        return haldekiToplamUrunMiktari;
    }

    /**
     * Sets the value of the haldekiToplamUrunMiktari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHaldekiToplamUrunMiktari(String value) {
        this.haldekiToplamUrunMiktari = value;
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

}
