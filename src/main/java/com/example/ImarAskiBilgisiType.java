
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for imarAskiBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imarAskiBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilce" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mahalle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="askiCikisTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="askiInisTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dosyaNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tasdikTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="paftaNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parsel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planOlcegi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imarPlanDosyaURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "imarAskiBilgisiType", propOrder = {
    "ilce",
    "mahalle",
    "askiCikisTarihi",
    "askiInisTarihi",
    "dosyaNo",
    "tasdikTarihi",
    "paftaNo",
    "ada",
    "parsel",
    "planTuru",
    "planOlcegi",
    "aciklama",
    "imarPlanDosyaURL",
    "detayListesi"
})
public class ImarAskiBilgisiType {

    @XmlElement(required = true)
    protected String ilce;
    @XmlElement(required = true)
    protected String mahalle;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar askiCikisTarihi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar askiInisTarihi;
    @XmlElement(required = true)
    protected String dosyaNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tasdikTarihi;
    @XmlElement(required = true)
    protected String paftaNo;
    @XmlElement(required = true)
    protected String ada;
    @XmlElement(required = true)
    protected String parsel;
    @XmlElement(required = true)
    protected String planTuru;
    @XmlElement(required = true)
    protected String planOlcegi;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElement(required = true)
    protected String imarPlanDosyaURL;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlce(String value) {
        this.ilce = value;
    }

    /**
     * Gets the value of the mahalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMahalle() {
        return mahalle;
    }

    /**
     * Sets the value of the mahalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalle(String value) {
        this.mahalle = value;
    }

    /**
     * Gets the value of the askiCikisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAskiCikisTarihi() {
        return askiCikisTarihi;
    }

    /**
     * Sets the value of the askiCikisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAskiCikisTarihi(XMLGregorianCalendar value) {
        this.askiCikisTarihi = value;
    }

    /**
     * Gets the value of the askiInisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAskiInisTarihi() {
        return askiInisTarihi;
    }

    /**
     * Sets the value of the askiInisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAskiInisTarihi(XMLGregorianCalendar value) {
        this.askiInisTarihi = value;
    }

    /**
     * Gets the value of the dosyaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosyaNo() {
        return dosyaNo;
    }

    /**
     * Sets the value of the dosyaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosyaNo(String value) {
        this.dosyaNo = value;
    }

    /**
     * Gets the value of the tasdikTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTasdikTarihi() {
        return tasdikTarihi;
    }

    /**
     * Sets the value of the tasdikTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTasdikTarihi(XMLGregorianCalendar value) {
        this.tasdikTarihi = value;
    }

    /**
     * Gets the value of the paftaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaftaNo() {
        return paftaNo;
    }

    /**
     * Sets the value of the paftaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaftaNo(String value) {
        this.paftaNo = value;
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
     * Gets the value of the planTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanTuru() {
        return planTuru;
    }

    /**
     * Sets the value of the planTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanTuru(String value) {
        this.planTuru = value;
    }

    /**
     * Gets the value of the planOlcegi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanOlcegi() {
        return planOlcegi;
    }

    /**
     * Sets the value of the planOlcegi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanOlcegi(String value) {
        this.planOlcegi = value;
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
     * Gets the value of the imarPlanDosyaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImarPlanDosyaURL() {
        return imarPlanDosyaURL;
    }

    /**
     * Sets the value of the imarPlanDosyaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImarPlanDosyaURL(String value) {
        this.imarPlanDosyaURL = value;
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
