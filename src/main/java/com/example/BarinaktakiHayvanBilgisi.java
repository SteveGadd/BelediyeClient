
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for barinaktakiHayvanBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="barinaktakiHayvanBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilanNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hayvnTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cins_irk" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="renk" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cinsiyet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="barinakBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="barinakAdresi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="barinakTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resimId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "barinaktakiHayvanBilgisi", propOrder = {
    "ilanNo",
    "hayvnTuru",
    "cinsIrk",
    "renk",
    "yas",
    "cinsiyet",
    "barinakBilgisi",
    "barinakAdresi",
    "barinakTelefon",
    "resimId",
    "aciklama"
})
public class BarinaktakiHayvanBilgisi {

    @XmlElement(required = true)
    protected String ilanNo;
    @XmlElement(required = true)
    protected String hayvnTuru;
    @XmlElement(name = "cins_irk", required = true)
    protected String cinsIrk;
    @XmlElement(required = true)
    protected String renk;
    @XmlElement(required = true)
    protected String yas;
    @XmlElement(required = true)
    protected String cinsiyet;
    @XmlElement(required = true)
    protected String barinakBilgisi;
    @XmlElement(required = true)
    protected String barinakAdresi;
    @XmlElement(required = true)
    protected String barinakTelefon;
    @XmlElement(required = true)
    protected String resimId;
    @XmlElement(required = true)
    protected String aciklama;

    /**
     * Gets the value of the ilanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanNo() {
        return ilanNo;
    }

    /**
     * Sets the value of the ilanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanNo(String value) {
        this.ilanNo = value;
    }

    /**
     * Gets the value of the hayvnTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHayvnTuru() {
        return hayvnTuru;
    }

    /**
     * Sets the value of the hayvnTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHayvnTuru(String value) {
        this.hayvnTuru = value;
    }

    /**
     * Gets the value of the cinsIrk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCinsIrk() {
        return cinsIrk;
    }

    /**
     * Sets the value of the cinsIrk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCinsIrk(String value) {
        this.cinsIrk = value;
    }

    /**
     * Gets the value of the renk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenk() {
        return renk;
    }

    /**
     * Sets the value of the renk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenk(String value) {
        this.renk = value;
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
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCinsiyet() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCinsiyet(String value) {
        this.cinsiyet = value;
    }

    /**
     * Gets the value of the barinakBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarinakBilgisi() {
        return barinakBilgisi;
    }

    /**
     * Sets the value of the barinakBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarinakBilgisi(String value) {
        this.barinakBilgisi = value;
    }

    /**
     * Gets the value of the barinakAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarinakAdresi() {
        return barinakAdresi;
    }

    /**
     * Sets the value of the barinakAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarinakAdresi(String value) {
        this.barinakAdresi = value;
    }

    /**
     * Gets the value of the barinakTelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarinakTelefon() {
        return barinakTelefon;
    }

    /**
     * Sets the value of the barinakTelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarinakTelefon(String value) {
        this.barinakTelefon = value;
    }

    /**
     * Gets the value of the resimId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResimId() {
        return resimId;
    }

    /**
     * Sets the value of the resimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResimId(String value) {
        this.resimId = value;
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
