
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for telefonBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telefonBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="telefonTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ulkeKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefonNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telefonBilgisiType", propOrder = {
    "telefonTuru",
    "ulkeKodu",
    "telefonNo"
})
public class TelefonBilgisiType {

    @XmlElement(required = true)
    protected String telefonTuru;
    @XmlElement(required = true)
    protected String ulkeKodu;
    @XmlElement(required = true)
    protected String telefonNo;

    /**
     * Gets the value of the telefonTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonTuru() {
        return telefonTuru;
    }

    /**
     * Sets the value of the telefonTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonTuru(String value) {
        this.telefonTuru = value;
    }

    /**
     * Gets the value of the ulkeKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlkeKodu() {
        return ulkeKodu;
    }

    /**
     * Sets the value of the ulkeKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlkeKodu(String value) {
        this.ulkeKodu = value;
    }

    /**
     * Gets the value of the telefonNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonNo() {
        return telefonNo;
    }

    /**
     * Sets the value of the telefonNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonNo(String value) {
        this.telefonNo = value;
    }

}
