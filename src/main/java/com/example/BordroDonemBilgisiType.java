
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bordroDonemBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bordroDonemBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bordroDonemKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bordroDonemAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bordroDonemBilgisiType", propOrder = {
    "bordroDonemKodu",
    "bordroDonemAdi"
})
public class BordroDonemBilgisiType {

    @XmlElement(required = true)
    protected String bordroDonemKodu;
    @XmlElement(required = true)
    protected String bordroDonemAdi;

    /**
     * Gets the value of the bordroDonemKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBordroDonemKodu() {
        return bordroDonemKodu;
    }

    /**
     * Sets the value of the bordroDonemKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBordroDonemKodu(String value) {
        this.bordroDonemKodu = value;
    }

    /**
     * Gets the value of the bordroDonemAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBordroDonemAdi() {
        return bordroDonemAdi;
    }

    /**
     * Sets the value of the bordroDonemAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBordroDonemAdi(String value) {
        this.bordroDonemAdi = value;
    }

}
