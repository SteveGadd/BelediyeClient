
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ilanReklamTurType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilanReklamTurType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilanReklamTurKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilanReklamTurAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilanReklamTurType", propOrder = {
    "ilanReklamTurKodu",
    "ilanReklamTurAdi"
})
public class IlanReklamTurType {

    @XmlElement(required = true)
    protected String ilanReklamTurKodu;
    @XmlElement(required = true)
    protected String ilanReklamTurAdi;

    /**
     * Gets the value of the ilanReklamTurKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamTurKodu() {
        return ilanReklamTurKodu;
    }

    /**
     * Sets the value of the ilanReklamTurKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamTurKodu(String value) {
        this.ilanReklamTurKodu = value;
    }

    /**
     * Gets the value of the ilanReklamTurAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamTurAdi() {
        return ilanReklamTurAdi;
    }

    /**
     * Sets the value of the ilanReklamTurAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamTurAdi(String value) {
        this.ilanReklamTurAdi = value;
    }

}
