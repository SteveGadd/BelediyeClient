
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basvuruDosyaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basvuruDosyaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dosyaCesidi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dosyauzanti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="belgeTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="belgeSayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dosya" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basvuruDosyaType", propOrder = {
    "dosyaCesidi",
    "dosyauzanti",
    "belgeTarihi",
    "belgeSayisi",
    "dosya"
})
public class BasvuruDosyaType {

    @XmlElement(required = true)
    protected String dosyaCesidi;
    @XmlElement(required = true)
    protected String dosyauzanti;
    @XmlElement(required = true)
    protected String belgeTarihi;
    @XmlElement(required = true)
    protected String belgeSayisi;
    @XmlElement(required = true)
    protected byte[] dosya;

    /**
     * Gets the value of the dosyaCesidi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosyaCesidi() {
        return dosyaCesidi;
    }

    /**
     * Sets the value of the dosyaCesidi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosyaCesidi(String value) {
        this.dosyaCesidi = value;
    }

    /**
     * Gets the value of the dosyauzanti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDosyauzanti() {
        return dosyauzanti;
    }

    /**
     * Sets the value of the dosyauzanti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDosyauzanti(String value) {
        this.dosyauzanti = value;
    }

    /**
     * Gets the value of the belgeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeTarihi() {
        return belgeTarihi;
    }

    /**
     * Sets the value of the belgeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeTarihi(String value) {
        this.belgeTarihi = value;
    }

    /**
     * Gets the value of the belgeSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeSayisi() {
        return belgeSayisi;
    }

    /**
     * Sets the value of the belgeSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeSayisi(String value) {
        this.belgeSayisi = value;
    }

    /**
     * Gets the value of the dosya property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDosya() {
        return dosya;
    }

    /**
     * Sets the value of the dosya property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDosya(byte[] value) {
        this.dosya = value;
    }

}
