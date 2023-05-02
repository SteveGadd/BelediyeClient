
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mezarlikBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mezarlikBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mezarlikKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mezarlikAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mezarlikUlasimBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iletisimBilgisi"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="adresListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfAdresBilgisi"/&gt;
 *                   &lt;element name="telefonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
 *                   &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mezarlikBilgisiType", propOrder = {
    "mezarlikKodu",
    "mezarlikAdi",
    "mezarlikUlasimBilgisi",
    "iletisimBilgisi"
})
public class MezarlikBilgisiType {

    @XmlElement(required = true)
    protected String mezarlikKodu;
    @XmlElement(required = true)
    protected String mezarlikAdi;
    @XmlElement(required = true)
    protected String mezarlikUlasimBilgisi;
    @XmlElement(required = true, nillable = true)
    protected MezarlikBilgisiType.IletisimBilgisi iletisimBilgisi;

    /**
     * Gets the value of the mezarlikKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezarlikKodu() {
        return mezarlikKodu;
    }

    /**
     * Sets the value of the mezarlikKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezarlikKodu(String value) {
        this.mezarlikKodu = value;
    }

    /**
     * Gets the value of the mezarlikAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezarlikAdi() {
        return mezarlikAdi;
    }

    /**
     * Sets the value of the mezarlikAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezarlikAdi(String value) {
        this.mezarlikAdi = value;
    }

    /**
     * Gets the value of the mezarlikUlasimBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezarlikUlasimBilgisi() {
        return mezarlikUlasimBilgisi;
    }

    /**
     * Sets the value of the mezarlikUlasimBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezarlikUlasimBilgisi(String value) {
        this.mezarlikUlasimBilgisi = value;
    }

    /**
     * Gets the value of the iletisimBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link MezarlikBilgisiType.IletisimBilgisi }
     *     
     */
    public MezarlikBilgisiType.IletisimBilgisi getIletisimBilgisi() {
        return iletisimBilgisi;
    }

    /**
     * Sets the value of the iletisimBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link MezarlikBilgisiType.IletisimBilgisi }
     *     
     */
    public void setIletisimBilgisi(MezarlikBilgisiType.IletisimBilgisi value) {
        this.iletisimBilgisi = value;
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
     *         &lt;element name="adresListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfAdresBilgisi"/&gt;
     *         &lt;element name="telefonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
     *         &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "adresListesi",
        "telefonListesi",
        "eposta"
    })
    public static class IletisimBilgisi {

        @XmlElement(required = true)
        protected ArrayOfAdresBilgisi adresListesi;
        @XmlElement(required = true)
        protected ArrayOfTelefonBilgisi telefonListesi;
        @XmlElement(required = true)
        protected String eposta;

        /**
         * Gets the value of the adresListesi property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfAdresBilgisi }
         *     
         */
        public ArrayOfAdresBilgisi getAdresListesi() {
            return adresListesi;
        }

        /**
         * Sets the value of the adresListesi property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfAdresBilgisi }
         *     
         */
        public void setAdresListesi(ArrayOfAdresBilgisi value) {
            this.adresListesi = value;
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

    }

}
