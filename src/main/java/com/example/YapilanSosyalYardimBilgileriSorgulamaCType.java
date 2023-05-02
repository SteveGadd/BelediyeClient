
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yapilanSosyalYardimBilgileriSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilanSosyalYardimBilgileriSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yapilanSosyalYardimBilgisi" type="{http://belediye.turkiye.gov.tr/v3}yapilanSosyalYardimBilgileriType"/&gt;
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
@XmlType(name = "yapilanSosyalYardimBilgileriSorgulamaCType", propOrder = {
    "yapilanSosyalYardimBilgisi",
    "detayListesi"
})
public class YapilanSosyalYardimBilgileriSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected YapilanSosyalYardimBilgileriType yapilanSosyalYardimBilgisi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the yapilanSosyalYardimBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link YapilanSosyalYardimBilgileriType }
     *     
     */
    public YapilanSosyalYardimBilgileriType getYapilanSosyalYardimBilgisi() {
        return yapilanSosyalYardimBilgisi;
    }

    /**
     * Sets the value of the yapilanSosyalYardimBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link YapilanSosyalYardimBilgileriType }
     *     
     */
    public void setYapilanSosyalYardimBilgisi(YapilanSosyalYardimBilgileriType value) {
        this.yapilanSosyalYardimBilgisi = value;
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
