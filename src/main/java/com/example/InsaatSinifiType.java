
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insaatSinifiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insaatSinifiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insaatSinifKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insaatSinifAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insaatSinifiType", propOrder = {
    "insaatSinifKodu",
    "insaatSinifAdi"
})
public class InsaatSinifiType {

    @XmlElement(required = true)
    protected String insaatSinifKodu;
    @XmlElement(required = true)
    protected String insaatSinifAdi;

    /**
     * Gets the value of the insaatSinifKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatSinifKodu() {
        return insaatSinifKodu;
    }

    /**
     * Sets the value of the insaatSinifKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatSinifKodu(String value) {
        this.insaatSinifKodu = value;
    }

    /**
     * Gets the value of the insaatSinifAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatSinifAdi() {
        return insaatSinifAdi;
    }

    /**
     * Sets the value of the insaatSinifAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatSinifAdi(String value) {
        this.insaatSinifAdi = value;
    }

}
