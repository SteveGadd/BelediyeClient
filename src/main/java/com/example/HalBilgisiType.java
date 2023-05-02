
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for halBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="halBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="halKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="halAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "halBilgisiType", propOrder = {
    "halKodu",
    "halAdi"
})
public class HalBilgisiType {

    @XmlElement(required = true)
    protected String halKodu;
    @XmlElement(required = true)
    protected String halAdi;

    /**
     * Gets the value of the halKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalKodu() {
        return halKodu;
    }

    /**
     * Sets the value of the halKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalKodu(String value) {
        this.halKodu = value;
    }

    /**
     * Gets the value of the halAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalAdi() {
        return halAdi;
    }

    /**
     * Sets the value of the halAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalAdi(String value) {
        this.halAdi = value;
    }

}
