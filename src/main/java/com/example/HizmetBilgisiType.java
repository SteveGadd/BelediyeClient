
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hizmetBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hizmetBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hizmetKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetTanimi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetiSaglayanBirim" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetNasilBasliyor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmeteKimlerBasvurabilir" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvurularinAlinmaSikligi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvurularNasilKabulediliyor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetinSonucundanKimlerFaydalaniyor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetinTamamlanabildigiEnKisaSure" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetinTamamlanabildigiEnUzunSure" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="hizmetBasvuruBelgeListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfHizmetBasvuruBelge"/&gt;
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
@XmlType(name = "hizmetBilgisiType", propOrder = {
    "hizmetKodu",
    "hizmetAdi",
    "hizmetTanimi",
    "hizmetiSaglayanBirim",
    "hizmetNasilBasliyor",
    "hizmeteKimlerBasvurabilir",
    "basvurularinAlinmaSikligi",
    "basvurularNasilKabulediliyor",
    "hizmetinSonucundanKimlerFaydalaniyor",
    "hizmetinTamamlanabildigiEnKisaSure",
    "hizmetinTamamlanabildigiEnUzunSure",
    "hizmetBasvuruBelgeListesi",
    "detayListesi"
})
public class HizmetBilgisiType {

    @XmlElement(required = true)
    protected String hizmetKodu;
    @XmlElement(required = true)
    protected String hizmetAdi;
    @XmlElement(required = true)
    protected String hizmetTanimi;
    @XmlElement(required = true)
    protected String hizmetiSaglayanBirim;
    @XmlElement(required = true)
    protected String hizmetNasilBasliyor;
    @XmlElement(required = true)
    protected String hizmeteKimlerBasvurabilir;
    @XmlElement(required = true)
    protected String basvurularinAlinmaSikligi;
    @XmlElement(required = true)
    protected String basvurularNasilKabulediliyor;
    @XmlElement(required = true)
    protected String hizmetinSonucundanKimlerFaydalaniyor;
    @XmlElement(required = true)
    protected String hizmetinTamamlanabildigiEnKisaSure;
    @XmlElement(required = true)
    protected String hizmetinTamamlanabildigiEnUzunSure;
    @XmlElement(required = true)
    protected ArrayOfHizmetBasvuruBelge hizmetBasvuruBelgeListesi;
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
     * Gets the value of the hizmetTanimi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetTanimi() {
        return hizmetTanimi;
    }

    /**
     * Sets the value of the hizmetTanimi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetTanimi(String value) {
        this.hizmetTanimi = value;
    }

    /**
     * Gets the value of the hizmetiSaglayanBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetiSaglayanBirim() {
        return hizmetiSaglayanBirim;
    }

    /**
     * Sets the value of the hizmetiSaglayanBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetiSaglayanBirim(String value) {
        this.hizmetiSaglayanBirim = value;
    }

    /**
     * Gets the value of the hizmetNasilBasliyor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetNasilBasliyor() {
        return hizmetNasilBasliyor;
    }

    /**
     * Sets the value of the hizmetNasilBasliyor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetNasilBasliyor(String value) {
        this.hizmetNasilBasliyor = value;
    }

    /**
     * Gets the value of the hizmeteKimlerBasvurabilir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmeteKimlerBasvurabilir() {
        return hizmeteKimlerBasvurabilir;
    }

    /**
     * Sets the value of the hizmeteKimlerBasvurabilir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmeteKimlerBasvurabilir(String value) {
        this.hizmeteKimlerBasvurabilir = value;
    }

    /**
     * Gets the value of the basvurularinAlinmaSikligi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvurularinAlinmaSikligi() {
        return basvurularinAlinmaSikligi;
    }

    /**
     * Sets the value of the basvurularinAlinmaSikligi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvurularinAlinmaSikligi(String value) {
        this.basvurularinAlinmaSikligi = value;
    }

    /**
     * Gets the value of the basvurularNasilKabulediliyor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvurularNasilKabulediliyor() {
        return basvurularNasilKabulediliyor;
    }

    /**
     * Sets the value of the basvurularNasilKabulediliyor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvurularNasilKabulediliyor(String value) {
        this.basvurularNasilKabulediliyor = value;
    }

    /**
     * Gets the value of the hizmetinSonucundanKimlerFaydalaniyor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetinSonucundanKimlerFaydalaniyor() {
        return hizmetinSonucundanKimlerFaydalaniyor;
    }

    /**
     * Sets the value of the hizmetinSonucundanKimlerFaydalaniyor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetinSonucundanKimlerFaydalaniyor(String value) {
        this.hizmetinSonucundanKimlerFaydalaniyor = value;
    }

    /**
     * Gets the value of the hizmetinTamamlanabildigiEnKisaSure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetinTamamlanabildigiEnKisaSure() {
        return hizmetinTamamlanabildigiEnKisaSure;
    }

    /**
     * Sets the value of the hizmetinTamamlanabildigiEnKisaSure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetinTamamlanabildigiEnKisaSure(String value) {
        this.hizmetinTamamlanabildigiEnKisaSure = value;
    }

    /**
     * Gets the value of the hizmetinTamamlanabildigiEnUzunSure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHizmetinTamamlanabildigiEnUzunSure() {
        return hizmetinTamamlanabildigiEnUzunSure;
    }

    /**
     * Sets the value of the hizmetinTamamlanabildigiEnUzunSure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHizmetinTamamlanabildigiEnUzunSure(String value) {
        this.hizmetinTamamlanabildigiEnUzunSure = value;
    }

    /**
     * Gets the value of the hizmetBasvuruBelgeListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHizmetBasvuruBelge }
     *     
     */
    public ArrayOfHizmetBasvuruBelge getHizmetBasvuruBelgeListesi() {
        return hizmetBasvuruBelgeListesi;
    }

    /**
     * Sets the value of the hizmetBasvuruBelgeListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHizmetBasvuruBelge }
     *     
     */
    public void setHizmetBasvuruBelgeListesi(ArrayOfHizmetBasvuruBelge value) {
        this.hizmetBasvuruBelgeListesi = value;
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
