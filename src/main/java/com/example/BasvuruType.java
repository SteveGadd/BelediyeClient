
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basvuruType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basvuruType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aboneNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilceKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mahalleKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sokakCaddeKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="disKapiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="icKapiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuranAcikAdres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuranNVIAdresNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruTipi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
 *         &lt;element name="basvuruDetay" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="koordinat"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="enlem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="boylam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dosyaListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBasvuruDosya"/&gt;
 *         &lt;element name="cevapSekli" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "basvuruType", propOrder = {
    "adi",
    "soyadi",
    "aboneNo",
    "ilceKodu",
    "mahalleKodu",
    "sokakCaddeKodu",
    "disKapiNo",
    "icKapiNo",
    "basvuranAcikAdres",
    "basvuranNVIAdresNo",
    "basvuruTipi",
    "eposta",
    "telefonListesi",
    "basvuruDetay",
    "koordinat",
    "dosyaListesi",
    "cevapSekli",
    "detayListesi"
})
public class BasvuruType {

    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    @XmlElement(required = true)
    protected String aboneNo;
    @XmlElement(required = true)
    protected String ilceKodu;
    @XmlElement(required = true)
    protected String mahalleKodu;
    @XmlElement(required = true)
    protected String sokakCaddeKodu;
    @XmlElement(required = true)
    protected String disKapiNo;
    @XmlElement(required = true)
    protected String icKapiNo;
    @XmlElement(required = true)
    protected String basvuranAcikAdres;
    @XmlElement(required = true)
    protected String basvuranNVIAdresNo;
    @XmlElement(required = true)
    protected String basvuruTipi;
    @XmlElement(required = true)
    protected String eposta;
    @XmlElement(required = true)
    protected ArrayOfTelefonBilgisi telefonListesi;
    @XmlElement(required = true)
    protected String basvuruDetay;
    @XmlElement(required = true)
    protected BasvuruType.Koordinat koordinat;
    @XmlElement(required = true)
    protected ArrayOfBasvuruDosya dosyaListesi;
    @XmlElement(required = true)
    protected String cevapSekli;
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
     * Gets the value of the aboneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboneNo() {
        return aboneNo;
    }

    /**
     * Sets the value of the aboneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboneNo(String value) {
        this.aboneNo = value;
    }

    /**
     * Gets the value of the ilceKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlceKodu() {
        return ilceKodu;
    }

    /**
     * Sets the value of the ilceKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlceKodu(String value) {
        this.ilceKodu = value;
    }

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
     * Gets the value of the sokakCaddeKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSokakCaddeKodu() {
        return sokakCaddeKodu;
    }

    /**
     * Sets the value of the sokakCaddeKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSokakCaddeKodu(String value) {
        this.sokakCaddeKodu = value;
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
     * Gets the value of the basvuranAcikAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuranAcikAdres() {
        return basvuranAcikAdres;
    }

    /**
     * Sets the value of the basvuranAcikAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuranAcikAdres(String value) {
        this.basvuranAcikAdres = value;
    }

    /**
     * Gets the value of the basvuranNVIAdresNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuranNVIAdresNo() {
        return basvuranNVIAdresNo;
    }

    /**
     * Sets the value of the basvuranNVIAdresNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuranNVIAdresNo(String value) {
        this.basvuranNVIAdresNo = value;
    }

    /**
     * Gets the value of the basvuruTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruTipi() {
        return basvuruTipi;
    }

    /**
     * Sets the value of the basvuruTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruTipi(String value) {
        this.basvuruTipi = value;
    }

    /**
     * Gets the value of the eposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEposta() {
        return eposta;
    }

    /**
     * Sets the value of the eposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEposta(String value) {
        this.eposta = value;
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
     * Gets the value of the basvuruDetay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruDetay() {
        return basvuruDetay;
    }

    /**
     * Sets the value of the basvuruDetay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruDetay(String value) {
        this.basvuruDetay = value;
    }

    /**
     * Gets the value of the koordinat property.
     * 
     * @return
     *     possible object is
     *     {@link BasvuruType.Koordinat }
     *     
     */
    public BasvuruType.Koordinat getKoordinat() {
        return koordinat;
    }

    /**
     * Sets the value of the koordinat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasvuruType.Koordinat }
     *     
     */
    public void setKoordinat(BasvuruType.Koordinat value) {
        this.koordinat = value;
    }

    /**
     * Gets the value of the dosyaListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBasvuruDosya }
     *     
     */
    public ArrayOfBasvuruDosya getDosyaListesi() {
        return dosyaListesi;
    }

    /**
     * Sets the value of the dosyaListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBasvuruDosya }
     *     
     */
    public void setDosyaListesi(ArrayOfBasvuruDosya value) {
        this.dosyaListesi = value;
    }

    /**
     * Gets the value of the cevapSekli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCevapSekli() {
        return cevapSekli;
    }

    /**
     * Sets the value of the cevapSekli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCevapSekli(String value) {
        this.cevapSekli = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="enlem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="boylam" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enlem",
        "boylam"
    })
    public static class Koordinat {

        @XmlElement(required = true)
        protected String enlem;
        @XmlElement(required = true)
        protected String boylam;

        /**
         * Gets the value of the enlem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnlem() {
            return enlem;
        }

        /**
         * Sets the value of the enlem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnlem(String value) {
            this.enlem = value;
        }

        /**
         * Gets the value of the boylam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoylam() {
            return boylam;
        }

        /**
         * Sets the value of the boylam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoylam(String value) {
            this.boylam = value;
        }

    }

}
