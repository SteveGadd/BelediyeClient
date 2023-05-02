
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yapilanSosyaYardimBilgileriSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilanSosyaYardimBilgileriSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yardimDetaySorgulamaKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yapilanSosyaYardimBilgileriSorgulaGType", propOrder = {
    "yardimDetaySorgulamaKodu"
})
public class YapilanSosyaYardimBilgileriSorgulaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String yardimDetaySorgulamaKodu;

    /**
     * Gets the value of the yardimDetaySorgulamaKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimDetaySorgulamaKodu() {
        return yardimDetaySorgulamaKodu;
    }

    /**
     * Sets the value of the yardimDetaySorgulamaKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimDetaySorgulamaKodu(String value) {
        this.yardimDetaySorgulamaKodu = value;
    }

}
