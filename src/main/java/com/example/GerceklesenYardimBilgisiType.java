
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gerceklesenYardimBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gerceklesenYardimBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yardimTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yardimMiktari" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yardimKanali" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yardimDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "gerceklesenYardimBilgisiType", propOrder = {
    "yardimTarihi",
    "yardimMiktari",
    "yardimKanali",
    "yardimDurumu",
    "aciklama"
})
public class GerceklesenYardimBilgisiType {

    @XmlElement(required = true)
    protected String yardimTarihi;
    @XmlElement(required = true)
    protected String yardimMiktari;
    @XmlElement(required = true)
    protected String yardimKanali;
    @XmlElement(required = true)
    protected String yardimDurumu;
    @XmlElement(required = true)
    protected String aciklama;

    /**
     * Gets the value of the yardimTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimTarihi() {
        return yardimTarihi;
    }

    /**
     * Sets the value of the yardimTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimTarihi(String value) {
        this.yardimTarihi = value;
    }

    /**
     * Gets the value of the yardimMiktari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimMiktari() {
        return yardimMiktari;
    }

    /**
     * Sets the value of the yardimMiktari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimMiktari(String value) {
        this.yardimMiktari = value;
    }

    /**
     * Gets the value of the yardimKanali property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimKanali() {
        return yardimKanali;
    }

    /**
     * Sets the value of the yardimKanali property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimKanali(String value) {
        this.yardimKanali = value;
    }

    /**
     * Gets the value of the yardimDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimDurumu() {
        return yardimDurumu;
    }

    /**
     * Sets the value of the yardimDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimDurumu(String value) {
        this.yardimDurumu = value;
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
