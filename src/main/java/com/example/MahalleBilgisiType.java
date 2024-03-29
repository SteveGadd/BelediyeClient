
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mahalleBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mahalleBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mahalleKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mahalleAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mahalleBilgisiType", propOrder = {
    "mahalleKodu",
    "mahalleAdi"
})
public class MahalleBilgisiType {

    @XmlElement(required = true)
    protected String mahalleKodu;
    @XmlElement(required = true)
    protected String mahalleAdi;

    /**
     * Gets the value of the mahalleKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMahalleKodu() {
        return mahalleKodu;
    }

    /**
     * Sets the value of the mahalleKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalleKodu(String value) {
        this.mahalleKodu = value;
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
     * Sets the value of the mahalleAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalleAdi(String value) {
        this.mahalleAdi = value;
    }

}
