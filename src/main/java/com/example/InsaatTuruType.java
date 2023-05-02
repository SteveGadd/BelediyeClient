
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insaatTuruType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insaatTuruType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insaatTurKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insaatTurAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insaatTuruType", propOrder = {
    "insaatTurKodu",
    "insaatTurAdi"
})
public class InsaatTuruType {

    @XmlElement(required = true)
    protected String insaatTurKodu;
    @XmlElement(required = true)
    protected String insaatTurAdi;

    /**
     * Gets the value of the insaatTurKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatTurKodu() {
        return insaatTurKodu;
    }

    /**
     * Sets the value of the insaatTurKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatTurKodu(String value) {
        this.insaatTurKodu = value;
    }

    /**
     * Gets the value of the insaatTurAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatTurAdi() {
        return insaatTurAdi;
    }

    /**
     * Sets the value of the insaatTurAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatTurAdi(String value) {
        this.insaatTurAdi = value;
    }

}
