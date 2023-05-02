
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nikahSalonBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nikahSalonBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nikahSalonKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nikahSalonAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iletisimBilgisi"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="adresListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfAdresBilgisi"/&gt;
 *                   &lt;element name="telefonBilgisi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
 *                   &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "nikahSalonBilgisiType", propOrder = {
    "nikahSalonKodu",
    "nikahSalonAdi",
    "iletisimBilgisi",
    "detayListesi"
})
public class NikahSalonBilgisiType {

    @XmlElement(required = true)
    protected String nikahSalonKodu;
    @XmlElement(required = true)
    protected String nikahSalonAdi;
    @XmlElement(required = true)
    protected NikahSalonBilgisiType.IletisimBilgisi iletisimBilgisi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the nikahSalonKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNikahSalonKodu() {
        return nikahSalonKodu;
    }

    /**
     * Sets the value of the nikahSalonKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNikahSalonKodu(String value) {
        this.nikahSalonKodu = value;
    }

    /**
     * Gets the value of the nikahSalonAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNikahSalonAdi() {
        return nikahSalonAdi;
    }

    /**
     * Sets the value of the nikahSalonAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNikahSalonAdi(String value) {
        this.nikahSalonAdi = value;
    }

    /**
     * Gets the value of the iletisimBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link NikahSalonBilgisiType.IletisimBilgisi }
     *     
     */
    public NikahSalonBilgisiType.IletisimBilgisi getIletisimBilgisi() {
        return iletisimBilgisi;
    }

    /**
     * Sets the value of the iletisimBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NikahSalonBilgisiType.IletisimBilgisi }
     *     
     */
    public void setIletisimBilgisi(NikahSalonBilgisiType.IletisimBilgisi value) {
        this.iletisimBilgisi = value;
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
     *         &lt;element name="adresListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfAdresBilgisi"/&gt;
     *         &lt;element name="telefonBilgisi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
     *         &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "adresListesi",
        "telefonBilgisi",
        "eposta",
        "aciklama"
    })
    public static class IletisimBilgisi {

        @XmlElement(required = true)
        protected ArrayOfAdresBilgisi adresListesi;
        @XmlElement(required = true)
        protected ArrayOfTelefonBilgisi telefonBilgisi;
        @XmlElement(required = true)
        protected String eposta;
        @XmlElement(required = true)
        protected String aciklama;

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
         * Gets the value of the telefonBilgisi property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfTelefonBilgisi }
         *     
         */
        public ArrayOfTelefonBilgisi getTelefonBilgisi() {
            return telefonBilgisi;
        }

        /**
         * Sets the value of the telefonBilgisi property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfTelefonBilgisi }
         *     
         */
        public void setTelefonBilgisi(ArrayOfTelefonBilgisi value) {
            this.telefonBilgisi = value;
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
