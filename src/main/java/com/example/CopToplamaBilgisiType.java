
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copToplamaBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copToplamaBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="caddeSokakAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toplamaGunleri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toplananTipi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="baslangicSaati" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bitisSaati" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "copToplamaBilgisiType", propOrder = {
    "caddeSokakAdi",
    "toplamaGunleri",
    "toplananTipi",
    "baslangicSaati",
    "bitisSaati",
    "aciklama"
})
public class CopToplamaBilgisiType {

    @XmlElement(required = true)
    protected String caddeSokakAdi;
    @XmlElement(required = true)
    protected String toplamaGunleri;
    @XmlElement(required = true)
    protected String toplananTipi;
    @XmlElement(required = true)
    protected String baslangicSaati;
    @XmlElement(required = true)
    protected String bitisSaati;
    @XmlElement(required = true)
    protected String aciklama;

    /**
     * Gets the value of the caddeSokakAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaddeSokakAdi() {
        return caddeSokakAdi;
    }

    /**
     * Sets the value of the caddeSokakAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaddeSokakAdi(String value) {
        this.caddeSokakAdi = value;
    }

    /**
     * Gets the value of the toplamaGunleri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamaGunleri() {
        return toplamaGunleri;
    }

    /**
     * Sets the value of the toplamaGunleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamaGunleri(String value) {
        this.toplamaGunleri = value;
    }

    /**
     * Gets the value of the toplananTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplananTipi() {
        return toplananTipi;
    }

    /**
     * Sets the value of the toplananTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplananTipi(String value) {
        this.toplananTipi = value;
    }

    /**
     * Gets the value of the baslangicSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicSaati() {
        return baslangicSaati;
    }

    /**
     * Sets the value of the baslangicSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicSaati(String value) {
        this.baslangicSaati = value;
    }

    /**
     * Gets the value of the bitisSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisSaati() {
        return bitisSaati;
    }

    /**
     * Sets the value of the bitisSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisSaati(String value) {
        this.bitisSaati = value;
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
