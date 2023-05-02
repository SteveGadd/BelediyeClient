
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ilanReklamYerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilanReklamYerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilanReklamYerKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilanReklamYerAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilanReklamYerType", propOrder = {
    "ilanReklamYerKodu",
    "ilanReklamYerAdi"
})
public class IlanReklamYerType {

    @XmlElement(required = true)
    protected String ilanReklamYerKodu;
    @XmlElement(required = true)
    protected String ilanReklamYerAdi;

    /**
     * Gets the value of the ilanReklamYerKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamYerKodu() {
        return ilanReklamYerKodu;
    }

    /**
     * Sets the value of the ilanReklamYerKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamYerKodu(String value) {
        this.ilanReklamYerKodu = value;
    }

    /**
     * Gets the value of the ilanReklamYerAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamYerAdi() {
        return ilanReklamYerAdi;
    }

    /**
     * Sets the value of the ilanReklamYerAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamYerAdi(String value) {
        this.ilanReklamYerAdi = value;
    }

}
