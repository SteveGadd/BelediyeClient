
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for kayitliEgitimKursBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kayitliEgitimKursBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursKategorisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="baslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="bitisTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="durumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sertifikaKatilimBelgesiBarkodNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "kayitliEgitimKursBilgileriType", propOrder = {
    "egitimKursKategorisi",
    "egitimKursAdi",
    "baslangicTarihi",
    "bitisTarihi",
    "durumu",
    "aciklama",
    "sertifikaKatilimBelgesiBarkodNo",
    "detayListesi"
})
public class KayitliEgitimKursBilgileriType {

    @XmlElement(required = true)
    protected String egitimKursKategorisi;
    @XmlElement(required = true)
    protected String egitimKursAdi;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar baslangicTarihi;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bitisTarihi;
    @XmlElement(required = true)
    protected String durumu;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElement(required = true)
    protected String sertifikaKatilimBelgesiBarkodNo;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the egitimKursKategorisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursKategorisi() {
        return egitimKursKategorisi;
    }

    /**
     * Sets the value of the egitimKursKategorisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursKategorisi(String value) {
        this.egitimKursKategorisi = value;
    }

    /**
     * Gets the value of the egitimKursAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursAdi() {
        return egitimKursAdi;
    }

    /**
     * Sets the value of the egitimKursAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursAdi(String value) {
        this.egitimKursAdi = value;
    }

    /**
     * Gets the value of the baslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBaslangicTarihi() {
        return baslangicTarihi;
    }

    /**
     * Sets the value of the baslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBaslangicTarihi(XMLGregorianCalendar value) {
        this.baslangicTarihi = value;
    }

    /**
     * Gets the value of the bitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBitisTarihi() {
        return bitisTarihi;
    }

    /**
     * Sets the value of the bitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBitisTarihi(XMLGregorianCalendar value) {
        this.bitisTarihi = value;
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
     * Gets the value of the sertifikaKatilimBelgesiBarkodNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSertifikaKatilimBelgesiBarkodNo() {
        return sertifikaKatilimBelgesiBarkodNo;
    }

    /**
     * Sets the value of the sertifikaKatilimBelgesiBarkodNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSertifikaKatilimBelgesiBarkodNo(String value) {
        this.sertifikaKatilimBelgesiBarkodNo = value;
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
