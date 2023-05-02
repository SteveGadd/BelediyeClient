
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for borcSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="borcSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ozetBorcBilgisi" type="{http://belediye.turkiye.gov.tr/v3}ozetBorcBilgileriType"/&gt;
 *         &lt;element name="borcListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBorcBilgisi"/&gt;
 *         &lt;element name="odemeYerleri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "borcSorgulamaCType", propOrder = {
    "ozetBorcBilgisi",
    "borcListesi",
    "odemeYerleri",
    "detayListesi"
})
public class BorcSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true, nillable = true)
    protected OzetBorcBilgileriType ozetBorcBilgisi;
    @XmlElement(required = true)
    protected ArrayOfBorcBilgisi borcListesi;
    @XmlElement(required = true)
    protected String odemeYerleri;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the ozetBorcBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link OzetBorcBilgileriType }
     *     
     */
    public OzetBorcBilgileriType getOzetBorcBilgisi() {
        return ozetBorcBilgisi;
    }

    /**
     * Sets the value of the ozetBorcBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link OzetBorcBilgileriType }
     *     
     */
    public void setOzetBorcBilgisi(OzetBorcBilgileriType value) {
        this.ozetBorcBilgisi = value;
    }

    /**
     * Gets the value of the borcListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBorcBilgisi }
     *     
     */
    public ArrayOfBorcBilgisi getBorcListesi() {
        return borcListesi;
    }

    /**
     * Sets the value of the borcListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBorcBilgisi }
     *     
     */
    public void setBorcListesi(ArrayOfBorcBilgisi value) {
        this.borcListesi = value;
    }

    /**
     * Gets the value of the odemeYerleri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdemeYerleri() {
        return odemeYerleri;
    }

    /**
     * Sets the value of the odemeYerleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdemeYerleri(String value) {
        this.odemeYerleri = value;
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
