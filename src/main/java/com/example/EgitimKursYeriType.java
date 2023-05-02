
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursYeriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursYeriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursYeriKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursYeriAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursYeriPOIId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursYeriType", propOrder = {
    "egitimKursYeriKodu",
    "egitimKursYeriAdi",
    "egitimKursYeriPOIId"
})
public class EgitimKursYeriType {

    @XmlElement(required = true)
    protected String egitimKursYeriKodu;
    @XmlElement(required = true)
    protected String egitimKursYeriAdi;
    @XmlElement(required = true)
    protected String egitimKursYeriPOIId;

    /**
     * Gets the value of the egitimKursYeriKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursYeriKodu() {
        return egitimKursYeriKodu;
    }

    /**
     * Sets the value of the egitimKursYeriKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursYeriKodu(String value) {
        this.egitimKursYeriKodu = value;
    }

    /**
     * Gets the value of the egitimKursYeriAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursYeriAdi() {
        return egitimKursYeriAdi;
    }

    /**
     * Sets the value of the egitimKursYeriAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursYeriAdi(String value) {
        this.egitimKursYeriAdi = value;
    }

    /**
     * Gets the value of the egitimKursYeriPOIId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursYeriPOIId() {
        return egitimKursYeriPOIId;
    }

    /**
     * Sets the value of the egitimKursYeriPOIId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursYeriPOIId(String value) {
        this.egitimKursYeriPOIId = value;
    }

}
