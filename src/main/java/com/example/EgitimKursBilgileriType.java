
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursYeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursYeriKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kayitBaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kayitBitisTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="durum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursYeriPOIId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvurudaBulunulabilirMi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="suresi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gunlerisaatleri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="devamZorunlulugu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimSonundaVerilenBelgeler" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kota" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gerceklesenOnKayitSayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gerceklesenKesinKayitSayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="katilimOnSartlari" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursIcerigi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="digerAciklamalar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gosterilecekBilgilendirmeVeOnayMetni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "egitimKursBilgileriType", propOrder = {
    "egitimKursKodu",
    "egitimKursAdi",
    "egitimKursYeri",
    "egitimKursYeriKodu",
    "egitimKursTarihi",
    "kayitBaslangicTarihi",
    "kayitBitisTarihi",
    "durum",
    "egitimKursYeriPOIId",
    "basvurudaBulunulabilirMi",
    "suresi",
    "gunlerisaatleri",
    "devamZorunlulugu",
    "egitimSonundaVerilenBelgeler",
    "kota",
    "gerceklesenOnKayitSayisi",
    "gerceklesenKesinKayitSayisi",
    "katilimOnSartlari",
    "egitimKursIcerigi",
    "digerAciklamalar",
    "gosterilecekBilgilendirmeVeOnayMetni",
    "detayListesi"
})
public class EgitimKursBilgileriType {

    @XmlElement(required = true)
    protected String egitimKursKodu;
    @XmlElement(required = true)
    protected String egitimKursAdi;
    @XmlElement(required = true)
    protected String egitimKursYeri;
    @XmlElement(required = true)
    protected String egitimKursYeriKodu;
    @XmlElement(required = true)
    protected String egitimKursTarihi;
    @XmlElement(required = true)
    protected String kayitBaslangicTarihi;
    @XmlElement(required = true)
    protected String kayitBitisTarihi;
    @XmlElement(required = true)
    protected String durum;
    @XmlElement(required = true)
    protected String egitimKursYeriPOIId;
    protected boolean basvurudaBulunulabilirMi;
    @XmlElement(required = true)
    protected String suresi;
    @XmlElement(required = true)
    protected String gunlerisaatleri;
    @XmlElement(required = true)
    protected String devamZorunlulugu;
    @XmlElement(required = true)
    protected String egitimSonundaVerilenBelgeler;
    @XmlElement(required = true)
    protected String kota;
    @XmlElement(required = true)
    protected String gerceklesenOnKayitSayisi;
    @XmlElement(required = true)
    protected String gerceklesenKesinKayitSayisi;
    @XmlElement(required = true)
    protected String katilimOnSartlari;
    @XmlElement(required = true)
    protected String egitimKursIcerigi;
    @XmlElement(required = true)
    protected String digerAciklamalar;
    @XmlElement(required = true)
    protected String gosterilecekBilgilendirmeVeOnayMetni;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the egitimKursKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursKodu() {
        return egitimKursKodu;
    }

    /**
     * Sets the value of the egitimKursKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursKodu(String value) {
        this.egitimKursKodu = value;
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
     * Gets the value of the egitimKursYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursYeri() {
        return egitimKursYeri;
    }

    /**
     * Sets the value of the egitimKursYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursYeri(String value) {
        this.egitimKursYeri = value;
    }

    /**
     * Gets the value of the egitimKursYeriKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursYeriKodu() {
        return egitimKursYeriKodu;
    }

    /**
     * Sets the value of the egitimKursYeriKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursYeriKodu(String value) {
        this.egitimKursYeriKodu = value;
    }

    /**
     * Gets the value of the egitimKursTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursTarihi() {
        return egitimKursTarihi;
    }

    /**
     * Sets the value of the egitimKursTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursTarihi(String value) {
        this.egitimKursTarihi = value;
    }

    /**
     * Gets the value of the kayitBaslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKayitBaslangicTarihi() {
        return kayitBaslangicTarihi;
    }

    /**
     * Sets the value of the kayitBaslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKayitBaslangicTarihi(String value) {
        this.kayitBaslangicTarihi = value;
    }

    /**
     * Gets the value of the kayitBitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKayitBitisTarihi() {
        return kayitBitisTarihi;
    }

    /**
     * Sets the value of the kayitBitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKayitBitisTarihi(String value) {
        this.kayitBitisTarihi = value;
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
     * Gets the value of the egitimKursYeriPOIId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursYeriPOIId() {
        return egitimKursYeriPOIId;
    }

    /**
     * Sets the value of the egitimKursYeriPOIId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursYeriPOIId(String value) {
        this.egitimKursYeriPOIId = value;
    }

    /**
     * Gets the value of the basvurudaBulunulabilirMi property.
     * 
     */
    public boolean isBasvurudaBulunulabilirMi() {
        return basvurudaBulunulabilirMi;
    }

    /**
     * Sets the value of the basvurudaBulunulabilirMi property.
     * 
     */
    public void setBasvurudaBulunulabilirMi(boolean value) {
        this.basvurudaBulunulabilirMi = value;
    }

    /**
     * Gets the value of the suresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuresi() {
        return suresi;
    }

    /**
     * Sets the value of the suresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuresi(String value) {
        this.suresi = value;
    }

    /**
     * Gets the value of the gunlerisaatleri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGunlerisaatleri() {
        return gunlerisaatleri;
    }

    /**
     * Sets the value of the gunlerisaatleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGunlerisaatleri(String value) {
        this.gunlerisaatleri = value;
    }

    /**
     * Gets the value of the devamZorunlulugu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevamZorunlulugu() {
        return devamZorunlulugu;
    }

    /**
     * Sets the value of the devamZorunlulugu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevamZorunlulugu(String value) {
        this.devamZorunlulugu = value;
    }

    /**
     * Gets the value of the egitimSonundaVerilenBelgeler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimSonundaVerilenBelgeler() {
        return egitimSonundaVerilenBelgeler;
    }

    /**
     * Sets the value of the egitimSonundaVerilenBelgeler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimSonundaVerilenBelgeler(String value) {
        this.egitimSonundaVerilenBelgeler = value;
    }

    /**
     * Gets the value of the kota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKota() {
        return kota;
    }

    /**
     * Sets the value of the kota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKota(String value) {
        this.kota = value;
    }

    /**
     * Gets the value of the gerceklesenOnKayitSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerceklesenOnKayitSayisi() {
        return gerceklesenOnKayitSayisi;
    }

    /**
     * Sets the value of the gerceklesenOnKayitSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerceklesenOnKayitSayisi(String value) {
        this.gerceklesenOnKayitSayisi = value;
    }

    /**
     * Gets the value of the gerceklesenKesinKayitSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerceklesenKesinKayitSayisi() {
        return gerceklesenKesinKayitSayisi;
    }

    /**
     * Sets the value of the gerceklesenKesinKayitSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerceklesenKesinKayitSayisi(String value) {
        this.gerceklesenKesinKayitSayisi = value;
    }

    /**
     * Gets the value of the katilimOnSartlari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatilimOnSartlari() {
        return katilimOnSartlari;
    }

    /**
     * Sets the value of the katilimOnSartlari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatilimOnSartlari(String value) {
        this.katilimOnSartlari = value;
    }

    /**
     * Gets the value of the egitimKursIcerigi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursIcerigi() {
        return egitimKursIcerigi;
    }

    /**
     * Sets the value of the egitimKursIcerigi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursIcerigi(String value) {
        this.egitimKursIcerigi = value;
    }

    /**
     * Gets the value of the digerAciklamalar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigerAciklamalar() {
        return digerAciklamalar;
    }

    /**
     * Sets the value of the digerAciklamalar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigerAciklamalar(String value) {
        this.digerAciklamalar = value;
    }

    /**
     * Gets the value of the gosterilecekBilgilendirmeVeOnayMetni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGosterilecekBilgilendirmeVeOnayMetni() {
        return gosterilecekBilgilendirmeVeOnayMetni;
    }

    /**
     * Sets the value of the gosterilecekBilgilendirmeVeOnayMetni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGosterilecekBilgilendirmeVeOnayMetni(String value) {
        this.gosterilecekBilgilendirmeVeOnayMetni = value;
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
