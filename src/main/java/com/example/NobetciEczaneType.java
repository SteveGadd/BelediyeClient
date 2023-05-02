
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nobetciEczaneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nobetciEczaneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eczaneAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eczaneAdres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eczaneTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eczaneFaks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eczaneKoordinat"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nobetciEczaneType", propOrder = {
    "eczaneAdi",
    "eczaneAdres",
    "eczaneTelefon",
    "eczaneFaks",
    "eczaneKoordinat"
})
public class NobetciEczaneType {

    @XmlElement(required = true)
    protected String eczaneAdi;
    @XmlElement(required = true)
    protected String eczaneAdres;
    @XmlElement(required = true)
    protected String eczaneTelefon;
    @XmlElement(required = true)
    protected String eczaneFaks;
    @XmlElement(required = true, nillable = true)
    protected NobetciEczaneType.EczaneKoordinat eczaneKoordinat;

    /**
     * Gets the value of the eczaneAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEczaneAdi() {
        return eczaneAdi;
    }

    /**
     * Sets the value of the eczaneAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEczaneAdi(String value) {
        this.eczaneAdi = value;
    }

    /**
     * Gets the value of the eczaneAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEczaneAdres() {
        return eczaneAdres;
    }

    /**
     * Sets the value of the eczaneAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEczaneAdres(String value) {
        this.eczaneAdres = value;
    }

    /**
     * Gets the value of the eczaneTelefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEczaneTelefon() {
        return eczaneTelefon;
    }

    /**
     * Sets the value of the eczaneTelefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEczaneTelefon(String value) {
        this.eczaneTelefon = value;
    }

    /**
     * Gets the value of the eczaneFaks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEczaneFaks() {
        return eczaneFaks;
    }

    /**
     * Sets the value of the eczaneFaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEczaneFaks(String value) {
        this.eczaneFaks = value;
    }

    /**
     * Gets the value of the eczaneKoordinat property.
     * 
     * @return
     *     possible object is
     *     {@link NobetciEczaneType.EczaneKoordinat }
     *     
     */
    public NobetciEczaneType.EczaneKoordinat getEczaneKoordinat() {
        return eczaneKoordinat;
    }

    /**
     * Sets the value of the eczaneKoordinat property.
     * 
     * @param value
     *     allowed object is
     *     {@link NobetciEczaneType.EczaneKoordinat }
     *     
     */
    public void setEczaneKoordinat(NobetciEczaneType.EczaneKoordinat value) {
        this.eczaneKoordinat = value;
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
    public static class EczaneKoordinat {

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
