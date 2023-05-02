
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tahakkukSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tahakkukSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tahakkukListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTahakkukBilgisi"/&gt;
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
@XmlType(name = "tahakkukSorgulamaCType", propOrder = {
    "tahakkukListesi",
    "odemeYerleri",
    "detayListesi"
})
public class TahakkukSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfTahakkukBilgisi tahakkukListesi;
    @XmlElement(required = true)
    protected String odemeYerleri;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the tahakkukListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTahakkukBilgisi }
     *     
     */
    public ArrayOfTahakkukBilgisi getTahakkukListesi() {
        return tahakkukListesi;
    }

    /**
     * Sets the value of the tahakkukListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTahakkukBilgisi }
     *     
     */
    public void setTahakkukListesi(ArrayOfTahakkukBilgisi value) {
        this.tahakkukListesi = value;
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
