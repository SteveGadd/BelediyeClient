
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphanedenAlinanKitapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphanedenAlinanKitapType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kitapAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yazarAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="demirbasNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alinmaTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sonIadeTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="durumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "kutuphanedenAlinanKitapType", propOrder = {
    "kitapAdi",
    "yazarAdi",
    "demirbasNumarasi",
    "alinmaTarihi",
    "sonIadeTarihi",
    "durumu",
    "aciklama",
    "detayListesi"
})
public class KutuphanedenAlinanKitapType {

    @XmlElement(required = true)
    protected String kitapAdi;
    @XmlElement(required = true)
    protected String yazarAdi;
    @XmlElement(required = true)
    protected String demirbasNumarasi;
    @XmlElement(required = true)
    protected String alinmaTarihi;
    @XmlElement(required = true)
    protected String sonIadeTarihi;
    @XmlElement(required = true)
    protected String durumu;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the kitapAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitapAdi() {
        return kitapAdi;
    }

    /**
     * Sets the value of the kitapAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitapAdi(String value) {
        this.kitapAdi = value;
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
     * Gets the value of the demirbasNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemirbasNumarasi() {
        return demirbasNumarasi;
    }

    /**
     * Sets the value of the demirbasNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemirbasNumarasi(String value) {
        this.demirbasNumarasi = value;
    }

    /**
     * Gets the value of the alinmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlinmaTarihi() {
        return alinmaTarihi;
    }

    /**
     * Sets the value of the alinmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlinmaTarihi(String value) {
        this.alinmaTarihi = value;
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
