
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insaatKullanimSekliType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insaatKullanimSekliType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insaatKullanimSekliKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insaatKullanimSekliAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insaatKullanimSekliType", propOrder = {
    "insaatKullanimSekliKodu",
    "insaatKullanimSekliAdi"
})
public class InsaatKullanimSekliType {

    @XmlElement(required = true)
    protected String insaatKullanimSekliKodu;
    @XmlElement(required = true)
    protected String insaatKullanimSekliAdi;

    /**
     * Gets the value of the insaatKullanimSekliKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatKullanimSekliKodu() {
        return insaatKullanimSekliKodu;
    }

    /**
     * Sets the value of the insaatKullanimSekliKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatKullanimSekliKodu(String value) {
        this.insaatKullanimSekliKodu = value;
    }

    /**
     * Gets the value of the insaatKullanimSekliAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatKullanimSekliAdi() {
        return insaatKullanimSekliAdi;
    }

    /**
     * Sets the value of the insaatKullanimSekliAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatKullanimSekliAdi(String value) {
        this.insaatKullanimSekliAdi = value;
    }

}
