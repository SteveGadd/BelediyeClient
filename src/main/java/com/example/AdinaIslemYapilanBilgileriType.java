
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adinaIslemYapilanBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adinaIslemYapilanBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adinaIslemYapilanTur" type="{http://belediye.turkiye.gov.tr/v3}adinaIslemYapilanTurType"/&gt;
 *         &lt;element name="adinaislemYapilan"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="adinaIslemYapilanGercekKisiBilgileri" type="{http://belediye.turkiye.gov.tr/v3}adinaIslemYapilanGercekKisiBilgileriType"/&gt;
 *                   &lt;element name="adinaIslemYapilanTuzelKisiBilgileri" type="{http://belediye.turkiye.gov.tr/v3}adinaIslemYapilanTuzelKisiBilgileriType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="yetkiKontrolKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adinaIslemYapilanBilgileriType", propOrder = {
    "adinaIslemYapilanTur",
    "adinaislemYapilan",
    "yetkiKontrolKodu"
})
public class AdinaIslemYapilanBilgileriType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AdinaIslemYapilanTurType adinaIslemYapilanTur;
    @XmlElement(required = true)
    protected AdinaIslemYapilanBilgileriType.AdinaislemYapilan adinaislemYapilan;
    @XmlElement(required = true)
    protected String yetkiKontrolKodu;

    /**
     * Gets the value of the adinaIslemYapilanTur property.
     * 
     * @return
     *     possible object is
     *     {@link AdinaIslemYapilanTurType }
     *     
     */
    public AdinaIslemYapilanTurType getAdinaIslemYapilanTur() {
        return adinaIslemYapilanTur;
    }

    /**
     * Sets the value of the adinaIslemYapilanTur property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdinaIslemYapilanTurType }
     *     
     */
    public void setAdinaIslemYapilanTur(AdinaIslemYapilanTurType value) {
        this.adinaIslemYapilanTur = value;
    }

    /**
     * Gets the value of the adinaislemYapilan property.
     * 
     * @return
     *     possible object is
     *     {@link AdinaIslemYapilanBilgileriType.AdinaislemYapilan }
     *     
     */
    public AdinaIslemYapilanBilgileriType.AdinaislemYapilan getAdinaislemYapilan() {
        return adinaislemYapilan;
    }

    /**
     * Sets the value of the adinaislemYapilan property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdinaIslemYapilanBilgileriType.AdinaislemYapilan }
     *     
     */
    public void setAdinaislemYapilan(AdinaIslemYapilanBilgileriType.AdinaislemYapilan value) {
        this.adinaislemYapilan = value;
    }

    /**
     * Gets the value of the yetkiKontrolKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYetkiKontrolKodu() {
        return yetkiKontrolKodu;
    }

    /**
     * Sets the value of the yetkiKontrolKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYetkiKontrolKodu(String value) {
        this.yetkiKontrolKodu = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="adinaIslemYapilanGercekKisiBilgileri" type="{http://belediye.turkiye.gov.tr/v3}adinaIslemYapilanGercekKisiBilgileriType"/&gt;
     *         &lt;element name="adinaIslemYapilanTuzelKisiBilgileri" type="{http://belediye.turkiye.gov.tr/v3}adinaIslemYapilanTuzelKisiBilgileriType"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "adinaIslemYapilanGercekKisiBilgileri",
        "adinaIslemYapilanTuzelKisiBilgileri"
    })
    public static class AdinaislemYapilan {

        protected AdinaIslemYapilanGercekKisiBilgileriType adinaIslemYapilanGercekKisiBilgileri;
        protected AdinaIslemYapilanTuzelKisiBilgileriType adinaIslemYapilanTuzelKisiBilgileri;

        /**
         * Gets the value of the adinaIslemYapilanGercekKisiBilgileri property.
         * 
         * @return
         *     possible object is
         *     {@link AdinaIslemYapilanGercekKisiBilgileriType }
         *     
         */
        public AdinaIslemYapilanGercekKisiBilgileriType getAdinaIslemYapilanGercekKisiBilgileri() {
            return adinaIslemYapilanGercekKisiBilgileri;
        }

        /**
         * Sets the value of the adinaIslemYapilanGercekKisiBilgileri property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdinaIslemYapilanGercekKisiBilgileriType }
         *     
         */
        public void setAdinaIslemYapilanGercekKisiBilgileri(AdinaIslemYapilanGercekKisiBilgileriType value) {
            this.adinaIslemYapilanGercekKisiBilgileri = value;
        }

        /**
         * Gets the value of the adinaIslemYapilanTuzelKisiBilgileri property.
         * 
         * @return
         *     possible object is
         *     {@link AdinaIslemYapilanTuzelKisiBilgileriType }
         *     
         */
        public AdinaIslemYapilanTuzelKisiBilgileriType getAdinaIslemYapilanTuzelKisiBilgileri() {
            return adinaIslemYapilanTuzelKisiBilgileri;
        }

        /**
         * Sets the value of the adinaIslemYapilanTuzelKisiBilgileri property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdinaIslemYapilanTuzelKisiBilgileriType }
         *     
         */
        public void setAdinaIslemYapilanTuzelKisiBilgileri(AdinaIslemYapilanTuzelKisiBilgileriType value) {
            this.adinaIslemYapilanTuzelKisiBilgileri = value;
        }

    }

}
