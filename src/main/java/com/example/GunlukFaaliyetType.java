
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gunlukFaaliyetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gunlukFaaliyetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faaliyetTipi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilce" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mahalle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sokakCadde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "gunlukFaaliyetType", propOrder = {
    "faaliyetTipi",
    "ilce",
    "mahalle",
    "sokakCadde",
    "aciklama"
})
public class GunlukFaaliyetType {

    @XmlElement(required = true)
    protected String faaliyetTipi;
    @XmlElement(required = true)
    protected String ilce;
    @XmlElement(required = true)
    protected String mahalle;
    @XmlElement(required = true)
    protected String sokakCadde;
    @XmlElement(required = true)
    protected String aciklama;

    /**
     * Gets the value of the faaliyetTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaaliyetTipi() {
        return faaliyetTipi;
    }

    /**
     * Sets the value of the faaliyetTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaaliyetTipi(String value) {
        this.faaliyetTipi = value;
    }

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlce(String value) {
        this.ilce = value;
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
     * Gets the value of the sokakCadde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSokakCadde() {
        return sokakCadde;
    }

    /**
     * Sets the value of the sokakCadde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSokakCadde(String value) {
        this.sokakCadde = value;
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
