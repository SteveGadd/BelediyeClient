
package com.example;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arsaRayicBedelBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arsaRayicBedelBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yil" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="mahalleAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="caddeSokakAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rayicDegeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arsaRayicBedelBilgisiType", propOrder = {
    "yil",
    "mahalleAdi",
    "caddeSokakAdi",
    "rayicDegeri"
})
public class ArsaRayicBedelBilgisiType {

    @XmlElement(required = true)
    protected BigInteger yil;
    @XmlElement(required = true)
    protected String mahalleAdi;
    @XmlElement(required = true)
    protected String caddeSokakAdi;
    @XmlElement(required = true)
    protected String rayicDegeri;

    /**
     * Gets the value of the yil property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYil() {
        return yil;
    }

    /**
     * Sets the value of the yil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYil(BigInteger value) {
        this.yil = value;
    }

    /**
     * Gets the value of the mahalleAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMahalleAdi() {
        return mahalleAdi;
    }

    /**
     * Sets the value of the mahalleAdi propert.y
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalleAdi(String value) {
        this.mahalleAdi = value;
    }

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
     * Gets the value of the rayicDegeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRayicDegeri() {
        return rayicDegeri;
    }

    /**
     * Sets the value of the rayicDegeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRayicDegeri(String value) {
        this.rayicDegeri = value;
    }

}
