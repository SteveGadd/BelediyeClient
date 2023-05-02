
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acikAdres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NVIadresNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresBilgisiType", propOrder = {
    "adresTuru",
    "acikAdres",
    "nvIadresNo"
})
public class AdresBilgisiType {

    @XmlElement(required = true)
    protected String adresTuru;
    @XmlElement(required = true)
    protected String acikAdres;
    @XmlElement(name = "NVIadresNo", required = true)
    protected String nvIadresNo;

    /**
     * Gets the value of the adresTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresTuru() {
        return adresTuru;
    }

    /**
     * Sets the value of the adresTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresTuru(String value) {
        this.adresTuru = value;
    }

    /**
     * Gets the value of the acikAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcikAdres() {
        return acikAdres;
    }

    /**
     * Sets the value of the acikAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcikAdres(String value) {
        this.acikAdres = value;
    }

    /**
     * Gets the value of the nvIadresNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNVIadresNo() {
        return nvIadresNo;
    }

    /**
     * Sets the value of the nvIadresNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNVIadresNo(String value) {
        this.nvIadresNo = value;
    }

}
