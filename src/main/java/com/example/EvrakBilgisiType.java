
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evrakBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evrakBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evrakNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="evrakTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruYapan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="konu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilgiBirim" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="durum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sonuclanmaTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="durumAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="surecListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfEvrakSurecBilgisi"/&gt;
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
@XmlType(name = "evrakBilgisiType", propOrder = {
    "evrakNo",
    "evrakTarihi",
    "basvuruYapan",
    "konu",
    "ilgiBirim",
    "durum",
    "sonuclanmaTarihi",
    "durumAciklamasi",
    "surecListesi",
    "detayListesi"
})
public class EvrakBilgisiType {

    @XmlElement(required = true)
    protected String evrakNo;
    @XmlElement(required = true)
    protected String evrakTarihi;
    @XmlElement(required = true)
    protected String basvuruYapan;
    @XmlElement(required = true)
    protected String konu;
    @XmlElement(required = true)
    protected String ilgiBirim;
    @XmlElement(required = true)
    protected String durum;
    @XmlElement(required = true)
    protected String sonuclanmaTarihi;
    @XmlElement(required = true)
    protected String durumAciklamasi;
    @XmlElement(required = true)
    protected ArrayOfEvrakSurecBilgisi surecListesi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the evrakNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvrakNo() {
        return evrakNo;
    }

    /**
     * Sets the value of the evrakNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvrakNo(String value) {
        this.evrakNo = value;
    }

    /**
     * Gets the value of the evrakTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvrakTarihi() {
        return evrakTarihi;
    }

    /**
     * Sets the value of the evrakTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvrakTarihi(String value) {
        this.evrakTarihi = value;
    }

    /**
     * Gets the value of the basvuruYapan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruYapan() {
        return basvuruYapan;
    }

    /**
     * Sets the value of the basvuruYapan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruYapan(String value) {
        this.basvuruYapan = value;
    }

    /**
     * Gets the value of the konu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKonu() {
        return konu;
    }

    /**
     * Sets the value of the konu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKonu(String value) {
        this.konu = value;
    }

    /**
     * Gets the value of the ilgiBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlgiBirim() {
        return ilgiBirim;
    }

    /**
     * Sets the value of the ilgiBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlgiBirim(String value) {
        this.ilgiBirim = value;
    }

    /**
     * Gets the value of the durum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurum() {
        return durum;
    }

    /**
     * Sets the value of the durum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurum(String value) {
        this.durum = value;
    }

    /**
     * Gets the value of the sonuclanmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonuclanmaTarihi() {
        return sonuclanmaTarihi;
    }

    /**
     * Sets the value of the sonuclanmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonuclanmaTarihi(String value) {
        this.sonuclanmaTarihi = value;
    }

    /**
     * Gets the value of the durumAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurumAciklamasi() {
        return durumAciklamasi;
    }

    /**
     * Sets the value of the durumAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurumAciklamasi(String value) {
        this.durumAciklamasi = value;
    }

    /**
     * Gets the value of the surecListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvrakSurecBilgisi }
     *     
     */
    public ArrayOfEvrakSurecBilgisi getSurecListesi() {
        return surecListesi;
    }

    /**
     * Sets the value of the surecListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvrakSurecBilgisi }
     *     
     */
    public void setSurecListesi(ArrayOfEvrakSurecBilgisi value) {
        this.surecListesi = value;
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
