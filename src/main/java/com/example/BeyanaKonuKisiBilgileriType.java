
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beyanaKonuKisiBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beyanaKonuKisiBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kisiTuru"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="GERCEK"/&gt;
 *               &lt;enumeration value="TUZEL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="beyanaKonuGercekKisiTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanaKonuGercekKisiAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanaKonuGercekKisiSoyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanaKonuTuzelKisiVergiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanaKonuTuzelKisiVergiDairesi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanaKonuTuzelKisiUnvan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
 *         &lt;element name="iletisimAdresBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iletisimNVIAdresNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isYeriAdresBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="isYeriNVIAdresNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ePosta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beyanaKonuKisiBilgileriType", propOrder = {
    "kisiTuru",
    "beyanaKonuGercekKisiTCKimlikNo",
    "beyanaKonuGercekKisiAdi",
    "beyanaKonuGercekKisiSoyadi",
    "beyanaKonuTuzelKisiVergiNo",
    "beyanaKonuTuzelKisiVergiDairesi",
    "beyanaKonuTuzelKisiUnvan",
    "telefonListesi",
    "iletisimAdresBilgisi",
    "iletisimNVIAdresNo",
    "isYeriAdresBilgisi",
    "isYeriNVIAdresNo",
    "ePosta"
})
public class BeyanaKonuKisiBilgileriType {

    @XmlElement(required = true)
    protected String kisiTuru;
    @XmlElement(required = true)
    protected String beyanaKonuGercekKisiTCKimlikNo;
    @XmlElement(required = true)
    protected String beyanaKonuGercekKisiAdi;
    @XmlElement(required = true)
    protected String beyanaKonuGercekKisiSoyadi;
    @XmlElement(required = true)
    protected String beyanaKonuTuzelKisiVergiNo;
    @XmlElement(required = true)
    protected String beyanaKonuTuzelKisiVergiDairesi;
    @XmlElement(required = true)
    protected String beyanaKonuTuzelKisiUnvan;
    @XmlElement(required = true)
    protected ArrayOfTelefonBilgisi telefonListesi;
    @XmlElement(required = true)
    protected String iletisimAdresBilgisi;
    @XmlElement(required = true)
    protected String iletisimNVIAdresNo;
    @XmlElement(required = true)
    protected String isYeriAdresBilgisi;
    @XmlElement(required = true)
    protected String isYeriNVIAdresNo;
    @XmlElement(required = true)
    protected String ePosta;

    /**
     * Gets the value of the kisiTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKisiTuru() {
        return kisiTuru;
    }

    /**
     * Sets the value of the kisiTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKisiTuru(String value) {
        this.kisiTuru = value;
    }

    /**
     * Gets the value of the beyanaKonuGercekKisiTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanaKonuGercekKisiTCKimlikNo() {
        return beyanaKonuGercekKisiTCKimlikNo;
    }

    /**
     * Sets the value of the beyanaKonuGercekKisiTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanaKonuGercekKisiTCKimlikNo(String value) {
        this.beyanaKonuGercekKisiTCKimlikNo = value;
    }

    /**
     * Gets the value of the beyanaKonuGercekKisiAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanaKonuGercekKisiAdi() {
        return beyanaKonuGercekKisiAdi;
    }

    /**
     * Sets the value of the beyanaKonuGercekKisiAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanaKonuGercekKisiAdi(String value) {
        this.beyanaKonuGercekKisiAdi = value;
    }

    /**
     * Gets the value of the beyanaKonuGercekKisiSoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanaKonuGercekKisiSoyadi() {
        return beyanaKonuGercekKisiSoyadi;
    }

    /**
     * Sets the value of the beyanaKonuGercekKisiSoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanaKonuGercekKisiSoyadi(String value) {
        this.beyanaKonuGercekKisiSoyadi = value;
    }

    /**
     * Gets the value of the beyanaKonuTuzelKisiVergiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanaKonuTuzelKisiVergiNo() {
        return beyanaKonuTuzelKisiVergiNo;
    }

    /**
     * Sets the value of the beyanaKonuTuzelKisiVergiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanaKonuTuzelKisiVergiNo(String value) {
        this.beyanaKonuTuzelKisiVergiNo = value;
    }

    /**
     * Gets the value of the beyanaKonuTuzelKisiVergiDairesi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanaKonuTuzelKisiVergiDairesi() {
        return beyanaKonuTuzelKisiVergiDairesi;
    }

    /**
     * Sets the value of the beyanaKonuTuzelKisiVergiDairesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanaKonuTuzelKisiVergiDairesi(String value) {
        this.beyanaKonuTuzelKisiVergiDairesi = value;
    }

    /**
     * Gets the value of the beyanaKonuTuzelKisiUnvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanaKonuTuzelKisiUnvan() {
        return beyanaKonuTuzelKisiUnvan;
    }

    /**
     * Sets the value of the beyanaKonuTuzelKisiUnvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanaKonuTuzelKisiUnvan(String value) {
        this.beyanaKonuTuzelKisiUnvan = value;
    }

    /**
     * Gets the value of the telefonListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTelefonBilgisi }
     *     
     */
    public ArrayOfTelefonBilgisi getTelefonListesi() {
        return telefonListesi;
    }

    /**
     * Sets the value of the telefonListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTelefonBilgisi }
     *     
     */
    public void setTelefonListesi(ArrayOfTelefonBilgisi value) {
        this.telefonListesi = value;
    }

    /**
     * Gets the value of the iletisimAdresBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIletisimAdresBilgisi() {
        return iletisimAdresBilgisi;
    }

    /**
     * Sets the value of the iletisimAdresBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIletisimAdresBilgisi(String value) {
        this.iletisimAdresBilgisi = value;
    }

    /**
     * Gets the value of the iletisimNVIAdresNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIletisimNVIAdresNo() {
        return iletisimNVIAdresNo;
    }

    /**
     * Sets the value of the iletisimNVIAdresNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIletisimNVIAdresNo(String value) {
        this.iletisimNVIAdresNo = value;
    }

    /**
     * Gets the value of the isYeriAdresBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsYeriAdresBilgisi() {
        return isYeriAdresBilgisi;
    }

    /**
     * Sets the value of the isYeriAdresBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsYeriAdresBilgisi(String value) {
        this.isYeriAdresBilgisi = value;
    }

    /**
     * Gets the value of the isYeriNVIAdresNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsYeriNVIAdresNo() {
        return isYeriNVIAdresNo;
    }

    /**
     * Sets the value of the isYeriNVIAdresNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsYeriNVIAdresNo(String value) {
        this.isYeriNVIAdresNo = value;
    }

    /**
     * Gets the value of the ePosta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPosta() {
        return ePosta;
    }

    /**
     * Sets the value of the ePosta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPosta(String value) {
        this.ePosta = value;
    }

}
