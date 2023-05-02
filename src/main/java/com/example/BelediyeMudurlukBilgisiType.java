
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for belediyeMudurlukBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="belediyeMudurlukBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
 *         &lt;element name="mudurlukAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mudurlukKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "belediyeMudurlukBilgisiType", propOrder = {
    "iletisimBilgisi",
    "mudurlukAdi",
    "mudurlukKodu"
})
public class BelediyeMudurlukBilgisiType {

    @XmlElement(required = true, nillable = true)
    protected BelediyeMudurlukBilgisiType.IletisimBilgisi iletisimBilgisi;
    @XmlElement(required = true)
    protected String mudurlukAdi;
    @XmlElement(required = true)
    protected String mudurlukKodu;

    /**
     * Gets the value of the iletisimBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link BelediyeMudurlukBilgisiType.IletisimBilgisi }
     *     
     */
    public BelediyeMudurlukBilgisiType.IletisimBilgisi getIletisimBilgisi() {
        return iletisimBilgisi;
    }

    /**
     * Sets the value of the iletisimBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BelediyeMudurlukBilgisiType.IletisimBilgisi }
     *     
     */
    public void setIletisimBilgisi(BelediyeMudurlukBilgisiType.IletisimBilgisi value) {
        this.iletisimBilgisi = value;
    }

    /**
     * Gets the value of the mudurlukAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMudurlukAdi() {
        return mudurlukAdi;
    }

    /**
     * Sets the value of the mudurlukAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMudurlukAdi(String value) {
        this.mudurlukAdi = value;
    }

    /**
     * Gets the value of the mudurlukKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMudurlukKodu() {
        return mudurlukKodu;
    }

    /**
     * Sets the value of the mudurlukKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMudurlukKodu(String value) {
        this.mudurlukKodu = value;
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
