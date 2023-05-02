
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for meclisGundemBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meclisGundemBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gundemNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gundemMadde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meclisGundemBilgisiType", propOrder = {
    "gundemNumarasi",
    "gundemMadde",
    "detayListesi"
})
public class MeclisGundemBilgisiType {

    @XmlElement(required = true)
    protected String gundemNumarasi;
    @XmlElement(required = true)
    protected String gundemMadde;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the gundemNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGundemNumarasi() {
        return gundemNumarasi;
    }

    /**
     * Sets the value of the gundemNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGundemNumarasi(String value) {
        this.gundemNumarasi = value;
    }

    /**
     * Gets the value of the gundemMadde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGundemMadde() {
        return gundemMadde;
    }

    /**
     * Sets the value of the gundemMadde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGundemMadde(String value) {
        this.gundemMadde = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public ArrayOfDetailType getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public void setDetayListesi(ArrayOfDetailType value) {
        this.detayListesi = value;
    }

}
