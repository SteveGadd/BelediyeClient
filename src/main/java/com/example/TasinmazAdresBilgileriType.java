
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tasinmazAdresBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tasinmazAdresBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mahalleKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mahalleAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sokakKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sokakAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="disKapiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="icKapiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="siteAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="blok" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kat" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NVIAdresNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acikAdres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tasinmazAdresBilgileriType", propOrder = {
    "mahalleKodu",
    "mahalleAdi",
    "sokakKodu",
    "sokakAdi",
    "disKapiNo",
    "icKapiNo",
    "siteAdi",
    "blok",
    "kat",
    "nviAdresNo",
    "acikAdres"
})
public class TasinmazAdresBilgileriType {

    @XmlElement(required = true)
    protected String mahalleKodu;
    @XmlElement(required = true)
    protected String mahalleAdi;
    @XmlElement(required = true)
    protected String sokakKodu;
    @XmlElement(required = true)
    protected String sokakAdi;
    @XmlElement(required = true)
    protected String disKapiNo;
    @XmlElement(required = true)
    protected String icKapiNo;
    @XmlElement(required = true)
    protected String siteAdi;
    @XmlElement(required = true)
    protected String blok;
    @XmlElement(required = true)
    protected String kat;
    @XmlElement(name = "NVIAdresNo", required = true)
    protected String nviAdresNo;
    @XmlElement(required = true)
    protected String acikAdres;

    /**
     * Gets the value of the mahalleKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMahalleKodu() {
        return mahalleKodu;
    }

    /**
     * Sets the value of the mahalleKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalleKodu(String value) {
        this.mahalleKodu = value;
    }

    /**
     * Gets the value of the mahalleAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMahalleAdi() {
        return mahalleAdi;
    }

    /**
     * Sets the value of the mahalleAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalleAdi(String value) {
        this.mahalleAdi = value;
    }

    /**
     * Gets the value of the sokakKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSokakKodu() {
        return sokakKodu;
    }

    /**
     * Sets the value of the sokakKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSokakKodu(String value) {
        this.sokakKodu = value;
    }

    /**
     * Gets the value of the sokakAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSokakAdi() {
        return sokakAdi;
    }

    /**
     * Sets the value of the sokakAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSokakAdi(String value) {
        this.sokakAdi = value;
    }

    /**
     * Gets the value of the disKapiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisKapiNo() {
        return disKapiNo;
    }

    /**
     * Sets the value of the disKapiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisKapiNo(String value) {
        this.disKapiNo = value;
    }

    /**
     * Gets the value of the icKapiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcKapiNo() {
        return icKapiNo;
    }

    /**
     * Sets the value of the icKapiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcKapiNo(String value) {
        this.icKapiNo = value;
    }

    /**
     * Gets the value of the siteAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteAdi() {
        return siteAdi;
    }

    /**
     * Sets the value of the siteAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteAdi(String value) {
        this.siteAdi = value;
    }

    /**
     * Gets the value of the blok property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlok() {
        return blok;
    }

    /**
     * Sets the value of the blok property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlok(String value) {
        this.blok = value;
    }

    /**
     * Gets the value of the kat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKat() {
        return kat;
    }

    /**
     * Sets the value of the kat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKat(String value) {
        this.kat = value;
    }

    /**
     * Gets the value of the nviAdresNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVIAdresNo() {
        return nviAdresNo;
    }

    /**
     * Sets the value of the nviAdresNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVIAdresNo(String value) {
        this.nviAdresNo = value;
    }

    /**
     * Gets the value of the acikAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcikAdres() {
        return acikAdres;
    }

    /**
     * Sets the value of the acikAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcikAdres(String value) {
        this.acikAdres = value;
    }

}
