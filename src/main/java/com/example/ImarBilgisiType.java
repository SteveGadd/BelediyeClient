
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imarBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imarBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kadastroBilgisi"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pafta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="parsel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="alan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="imarPlani"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="imarAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="tasdikTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="olcek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="mahalle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="sokak" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="binaYuksekligi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="katAdedi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="binaDerinligi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="onBahceMesafesi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="yanBahceMesafesi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="arkaBahceMesafesi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kotAlinacakNokta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nizamDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="insaatSekli" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="KAKS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TAKS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ifrazSarti"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="cephe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="alani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="derinlik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="emsal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enfazlakonutsayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ortalamaKonutAlani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="toplamInsaatAlani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="plandaTahsisliAlanBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="onayBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="imarResim" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="imarResimUzanti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="imarKurumURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planNotDokuman" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="planNotDokumanUzanti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="planNot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imarBilgisiType", propOrder = {
    "kadastroBilgisi",
    "imarPlani",
    "imarResim",
    "imarResimUzanti",
    "imarKurumURL",
    "planNotDokuman",
    "planNotDokumanUzanti",
    "planNot"
})
public class ImarBilgisiType {

    @XmlElement(required = true)
    protected ImarBilgisiType.KadastroBilgisi kadastroBilgisi;
    @XmlElement(required = true)
    protected ImarBilgisiType.ImarPlani imarPlani;
    @XmlElement(required = true)
    protected byte[] imarResim;
    @XmlElement(required = true)
    protected String imarResimUzanti;
    @XmlElement(required = true)
    protected String imarKurumURL;
    @XmlElement(required = true)
    protected byte[] planNotDokuman;
    @XmlElement(required = true)
    protected String planNotDokumanUzanti;
    @XmlElement(required = true)
    protected String planNot;

    /**
     * Gets the value of the kadastroBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link ImarBilgisiType.KadastroBilgisi }
     *     
     */
    public ImarBilgisiType.KadastroBilgisi getKadastroBilgisi() {
        return kadastroBilgisi;
    }

    /**
     * Sets the value of the kadastroBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImarBilgisiType.KadastroBilgisi }
     *     
     */
    public void setKadastroBilgisi(ImarBilgisiType.KadastroBilgisi value) {
        this.kadastroBilgisi = value;
    }

    /**
     * Gets the value of the imarPlani property.
     * 
     * @return
     *     possible object is
     *     {@link ImarBilgisiType.ImarPlani }
     *     
     */
    public ImarBilgisiType.ImarPlani getImarPlani() {
        return imarPlani;
    }

    /**
     * Sets the value of the imarPlani property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImarBilgisiType.ImarPlani }
     *     
     */
    public void setImarPlani(ImarBilgisiType.ImarPlani value) {
        this.imarPlani = value;
    }

    /**
     * Gets the value of the imarResim property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImarResim() {
        return imarResim;
    }

    /**
     * Sets the value of the imarResim property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImarResim(byte[] value) {
        this.imarResim = value;
    }

    /**
     * Gets the value of the imarResimUzanti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImarResimUzanti() {
        return imarResimUzanti;
    }

    /**
     * Sets the value of the imarResimUzanti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImarResimUzanti(String value) {
        this.imarResimUzanti = value;
    }

    /**
     * Gets the value of the imarKurumURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImarKurumURL() {
        return imarKurumURL;
    }

    /**
     * Sets the value of the imarKurumURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImarKurumURL(String value) {
        this.imarKurumURL = value;
    }

    /**
     * Gets the value of the planNotDokuman property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPlanNotDokuman() {
        return planNotDokuman;
    }

    /**
     * Sets the value of the planNotDokuman property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPlanNotDokuman(byte[] value) {
        this.planNotDokuman = value;
    }

    /**
     * Gets the value of the planNotDokumanUzanti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNotDokumanUzanti() {
        return planNotDokumanUzanti;
    }

    /**
     * Sets the value of the planNotDokumanUzanti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNotDokumanUzanti(String value) {
        this.planNotDokumanUzanti = value;
    }

    /**
     * Gets the value of the planNot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanNot() {
        return planNot;
    }

    /**
     * Sets the value of the planNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanNot(String value) {
        this.planNot = value;
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
     *         &lt;element name="imarAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="tasdikTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="olcek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="mahalle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="sokak" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="binaYuksekligi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="katAdedi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="binaDerinligi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="onBahceMesafesi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="yanBahceMesafesi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="arkaBahceMesafesi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kotAlinacakNokta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nizamDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="insaatSekli" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="KAKS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TAKS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ifrazSarti"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="cephe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="alani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="derinlik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="emsal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enfazlakonutsayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ortalamaKonutAlani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="toplamInsaatAlani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="plandaTahsisliAlanBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="onayBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "imarAdi",
        "tasdikTarihi",
        "olcek",
        "mahalle",
        "sokak",
        "binaYuksekligi",
        "katAdedi",
        "binaDerinligi",
        "onBahceMesafesi",
        "yanBahceMesafesi",
        "arkaBahceMesafesi",
        "kotAlinacakNokta",
        "nizamDurumu",
        "insaatSekli",
        "kaks",
        "taks",
        "ifrazSarti",
        "emsal",
        "enfazlakonutsayisi",
        "ortalamaKonutAlani",
        "toplamInsaatAlani",
        "plandaTahsisliAlanBilgisi",
        "aciklama",
        "onayBilgisi"
    })
    public static class ImarPlani {

        @XmlElement(required = true)
        protected String imarAdi;
        @XmlElement(required = true)
        protected String tasdikTarihi;
        @XmlElement(required = true)
        protected String olcek;
        @XmlElement(required = true)
        protected String mahalle;
        @XmlElement(required = true)
        protected String sokak;
        @XmlElement(required = true)
        protected String binaYuksekligi;
        @XmlElement(required = true)
        protected String katAdedi;
        @XmlElement(required = true)
        protected String binaDerinligi;
        @XmlElement(required = true)
        protected String onBahceMesafesi;
        @XmlElement(required = true)
        protected String yanBahceMesafesi;
        @XmlElement(required = true)
        protected String arkaBahceMesafesi;
        @XmlElement(required = true)
        protected String kotAlinacakNokta;
        @XmlElement(required = true)
        protected String nizamDurumu;
        @XmlElement(required = true)
        protected String insaatSekli;
        @XmlElement(name = "KAKS", required = true)
        protected String kaks;
        @XmlElement(name = "TAKS", required = true)
        protected String taks;
        @XmlElement(required = true, nillable = true)
        protected ImarBilgisiType.ImarPlani.IfrazSarti ifrazSarti;
        @XmlElement(required = true)
        protected String emsal;
        @XmlElement(required = true)
        protected String enfazlakonutsayisi;
        @XmlElement(required = true)
        protected String ortalamaKonutAlani;
        @XmlElement(required = true)
        protected String toplamInsaatAlani;
        @XmlElement(required = true)
        protected String plandaTahsisliAlanBilgisi;
        @XmlElement(required = true)
        protected String aciklama;
        @XmlElement(required = true)
        protected String onayBilgisi;

        /**
         * Gets the value of the imarAdi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImarAdi() {
            return imarAdi;
        }

        /**
         * Sets the value of the imarAdi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImarAdi(String value) {
            this.imarAdi = value;
        }

        /**
         * Gets the value of the tasdikTarihi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTasdikTarihi() {
            return tasdikTarihi;
        }

        /**
         * Sets the value of the tasdikTarihi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTasdikTarihi(String value) {
            this.tasdikTarihi = value;
        }

        /**
         * Gets the value of the olcek property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOlcek() {
            return olcek;
        }

        /**
         * Sets the value of the olcek property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOlcek(String value) {
            this.olcek = value;
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
         * Gets the value of the sokak property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSokak() {
            return sokak;
        }

        /**
         * Sets the value of the sokak property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSokak(String value) {
            this.sokak = value;
        }

        /**
         * Gets the value of the binaYuksekligi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBinaYuksekligi() {
            return binaYuksekligi;
        }

        /**
         * Sets the value of the binaYuksekligi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBinaYuksekligi(String value) {
            this.binaYuksekligi = value;
        }

        /**
         * Gets the value of the katAdedi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKatAdedi() {
            return katAdedi;
        }

        /**
         * Sets the value of the katAdedi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKatAdedi(String value) {
            this.katAdedi = value;
        }

        /**
         * Gets the value of the binaDerinligi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBinaDerinligi() {
            return binaDerinligi;
        }

        /**
         * Sets the value of the binaDerinligi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBinaDerinligi(String value) {
            this.binaDerinligi = value;
        }

        /**
         * Gets the value of the onBahceMesafesi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnBahceMesafesi() {
            return onBahceMesafesi;
        }

        /**
         * Sets the value of the onBahceMesafesi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnBahceMesafesi(String value) {
            this.onBahceMesafesi = value;
        }

        /**
         * Gets the value of the yanBahceMesafesi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYanBahceMesafesi() {
            return yanBahceMesafesi;
        }

        /**
         * Sets the value of the yanBahceMesafesi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYanBahceMesafesi(String value) {
            this.yanBahceMesafesi = value;
        }

        /**
         * Gets the value of the arkaBahceMesafesi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArkaBahceMesafesi() {
            return arkaBahceMesafesi;
        }

        /**
         * Sets the value of the arkaBahceMesafesi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArkaBahceMesafesi(String value) {
            this.arkaBahceMesafesi = value;
        }

        /**
         * Gets the value of the kotAlinacakNokta property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKotAlinacakNokta() {
            return kotAlinacakNokta;
        }

        /**
         * Sets the value of the kotAlinacakNokta property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKotAlinacakNokta(String value) {
            this.kotAlinacakNokta = value;
        }

        /**
         * Gets the value of the nizamDurumu property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNizamDurumu() {
            return nizamDurumu;
        }

        /**
         * Sets the value of the nizamDurumu property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNizamDurumu(String value) {
            this.nizamDurumu = value;
        }

        /**
         * Gets the value of the insaatSekli property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInsaatSekli() {
            return insaatSekli;
        }

        /**
         * Sets the value of the insaatSekli property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInsaatSekli(String value) {
            this.insaatSekli = value;
        }

        /**
         * Gets the value of the kaks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKAKS() {
            return kaks;
        }

        /**
         * Sets the value of the kaks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKAKS(String value) {
            this.kaks = value;
        }

        /**
         * Gets the value of the taks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTAKS() {
            return taks;
        }

        /**
         * Sets the value of the taks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTAKS(String value) {
            this.taks = value;
        }

        /**
         * Gets the value of the ifrazSarti property.
         * 
         * @return
         *     possible object is
         *     {@link ImarBilgisiType.ImarPlani.IfrazSarti }
         *     
         */
        public ImarBilgisiType.ImarPlani.IfrazSarti getIfrazSarti() {
            return ifrazSarti;
        }

        /**
         * Sets the value of the ifrazSarti property.
         * 
         * @param value
         *     allowed object is
         *     {@link ImarBilgisiType.ImarPlani.IfrazSarti }
         *     
         */
        public void setIfrazSarti(ImarBilgisiType.ImarPlani.IfrazSarti value) {
            this.ifrazSarti = value;
        }

        /**
         * Gets the value of the emsal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmsal() {
            return emsal;
        }

        /**
         * Sets the value of the emsal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmsal(String value) {
            this.emsal = value;
        }

        /**
         * Gets the value of the enfazlakonutsayisi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnfazlakonutsayisi() {
            return enfazlakonutsayisi;
        }

        /**
         * Sets the value of the enfazlakonutsayisi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnfazlakonutsayisi(String value) {
            this.enfazlakonutsayisi = value;
        }

        /**
         * Gets the value of the ortalamaKonutAlani property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrtalamaKonutAlani() {
            return ortalamaKonutAlani;
        }

        /**
         * Sets the value of the ortalamaKonutAlani property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrtalamaKonutAlani(String value) {
            this.ortalamaKonutAlani = value;
        }

        /**
         * Gets the value of the toplamInsaatAlani property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToplamInsaatAlani() {
            return toplamInsaatAlani;
        }

        /**
         * Sets the value of the toplamInsaatAlani property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToplamInsaatAlani(String value) {
            this.toplamInsaatAlani = value;
        }

        /**
         * Gets the value of the plandaTahsisliAlanBilgisi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlandaTahsisliAlanBilgisi() {
            return plandaTahsisliAlanBilgisi;
        }

        /**
         * Sets the value of the plandaTahsisliAlanBilgisi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlandaTahsisliAlanBilgisi(String value) {
            this.plandaTahsisliAlanBilgisi = value;
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
         * Gets the value of the onayBilgisi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnayBilgisi() {
            return onayBilgisi;
        }

        /**
         * Sets the value of the onayBilgisi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnayBilgisi(String value) {
            this.onayBilgisi = value;
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
         *         &lt;element name="cephe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="alani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="derinlik" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "cephe",
            "alani",
            "derinlik"
        })
        public static class IfrazSarti {

            @XmlElement(required = true)
            protected String cephe;
            @XmlElement(required = true)
            protected String alani;
            @XmlElement(required = true)
            protected String derinlik;

            /**
             * Gets the value of the cephe property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCephe() {
                return cephe;
            }

            /**
             * Sets the value of the cephe property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCephe(String value) {
                this.cephe = value;
            }

            /**
             * Gets the value of the alani property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlani() {
                return alani;
            }

            /**
             * Sets the value of the alani property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlani(String value) {
                this.alani = value;
            }

            /**
             * Gets the value of the derinlik property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDerinlik() {
                return derinlik;
            }

            /**
             * Sets the value of the derinlik property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDerinlik(String value) {
                this.derinlik = value;
            }

        }

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
     *         &lt;element name="pafta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="parsel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="alan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    @XmlType(name = "", propOrder = {
        "pafta",
        "ada",
        "parsel",
        "alan",
        "aciklama"
    })
    public static class KadastroBilgisi {

        @XmlElement(required = true)
        protected String pafta;
        @XmlElement(required = true)
        protected String ada;
        @XmlElement(required = true)
        protected String parsel;
        @XmlElement(required = true)
        protected String alan;
        @XmlElement(required = true)
        protected String aciklama;

        /**
         * Gets the value of the pafta property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPafta() {
            return pafta;
        }

        /**
         * Sets the value of the pafta property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPafta(String value) {
            this.pafta = value;
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
         * Gets the value of the alan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlan() {
            return alan;
        }

        /**
         * Sets the value of the alan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlan(String value) {
            this.alan = value;
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

}
