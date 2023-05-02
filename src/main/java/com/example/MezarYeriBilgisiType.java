
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mezarYeriBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mezarYeriBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="anaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="babaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dogumYeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dogumTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="memleketi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="olumTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="definTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mezarNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parsel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "mezarYeriBilgisiType", propOrder = {
    "adi",
    "soyadi",
    "anaAdi",
    "babaAdi",
    "dogumYeri",
    "dogumTarihi",
    "memleketi",
    "olumTarihi",
    "definTarihi",
    "mezarNo",
    "ada",
    "parsel",
    "detayListesi"
})
public class MezarYeriBilgisiType {

    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    @XmlElement(required = true)
    protected String anaAdi;
    @XmlElement(required = true)
    protected String babaAdi;
    @XmlElement(required = true)
    protected String dogumYeri;
    @XmlElement(required = true)
    protected String dogumTarihi;
    @XmlElement(required = true)
    protected String memleketi;
    @XmlElement(required = true)
    protected String olumTarihi;
    @XmlElement(required = true)
    protected String definTarihi;
    @XmlElement(required = true)
    protected String mezarNo;
    @XmlElement(required = true)
    protected String ada;
    @XmlElement(required = true)
    protected String parsel;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the adi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdi() {
        return adi;
    }

    /**
     * Sets the value of the adi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdi(String value) {
        this.adi = value;
    }

    /**
     * Gets the value of the soyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyadi() {
        return soyadi;
    }

    /**
     * Sets the value of the soyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyadi(String value) {
        this.soyadi = value;
    }

    /**
     * Gets the value of the anaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnaAdi() {
        return anaAdi;
    }

    /**
     * Sets the value of the anaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnaAdi(String value) {
        this.anaAdi = value;
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
     * Gets the value of the dogumYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogumYeri() {
        return dogumYeri;
    }

    /**
     * Sets the value of the dogumYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogumYeri(String value) {
        this.dogumYeri = value;
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
     * Gets the value of the memleketi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemleketi() {
        return memleketi;
    }

    /**
     * Sets the value of the memleketi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemleketi(String value) {
        this.memleketi = value;
    }

    /**
     * Gets the value of the olumTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOlumTarihi() {
        return olumTarihi;
    }

    /**
     * Sets the value of the olumTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOlumTarihi(String value) {
        this.olumTarihi = value;
    }

    /**
     * Gets the value of the definTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinTarihi() {
        return definTarihi;
    }

    /**
     * Sets the value of the definTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinTarihi(String value) {
        this.definTarihi = value;
    }

    /**
     * Gets the value of the mezarNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezarNo() {
        return mezarNo;
    }

    /**
     * Sets the value of the mezarNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezarNo(String value) {
        this.mezarNo = value;
    }

    /**
     * Gets the value of the ada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAda() {
        return ada;
    }

    /**
     * Sets the value of the ada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAda(String value) {
        this.ada = value;
    }

    /**
     * Gets the value of the parsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParsel() {
        return parsel;
    }

    /**
     * Sets the value of the parsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParsel(String value) {
        this.parsel = value;
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
