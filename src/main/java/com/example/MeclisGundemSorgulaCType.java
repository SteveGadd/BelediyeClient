
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for meclisGundemSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="meclisGundemSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="toplantiTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="toplantiSaati" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toplantiYeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gundemListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfMeclisGundemType"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "meclisGundemSorgulaCType", propOrder = {
    "toplantiTarihi",
    "toplantiSaati",
    "toplantiYeri",
    "gundemListesi",
    "detayListesi"
})
public class MeclisGundemSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar toplantiTarihi;
    @XmlElement(required = true)
    protected String toplantiSaati;
    @XmlElement(required = true)
    protected String toplantiYeri;
    @XmlElement(required = true)
    protected ArrayOfMeclisGundemType gundemListesi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the toplantiTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToplantiTarihi() {
        return toplantiTarihi;
    }

    /**
     * Sets the value of the toplantiTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToplantiTarihi(XMLGregorianCalendar value) {
        this.toplantiTarihi = value;
    }

    /**
     * Gets the value of the toplantiSaati property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplantiSaati() {
        return toplantiSaati;
    }

    /**
     * Sets the value of the toplantiSaati property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplantiSaati(String value) {
        this.toplantiSaati = value;
    }

    /**
     * Gets the value of the toplantiYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplantiYeri() {
        return toplantiYeri;
    }

    /**
     * Sets the value of the toplantiYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplantiYeri(String value) {
        this.toplantiYeri = value;
    }

    /**
     * Gets the value of the gundemListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMeclisGundemType }
     *     
     */
    public ArrayOfMeclisGundemType getGundemListesi() {
        return gundemListesi;
    }

    /**
     * Sets the value of the gundemListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMeclisGundemType }
     *     
     */
    public void setGundemListesi(ArrayOfMeclisGundemType value) {
        this.gundemListesi = value;
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
