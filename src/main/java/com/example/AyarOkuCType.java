
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ayarOkuCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ayarOkuCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deger" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ayarOkuCType", propOrder = {
    "deger"
})
public class AyarOkuCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected String deger;

    /**
     * Gets the value of the deger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeger() {
        return deger;
    }

    /**
     * Sets the value of the deger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeger(String value) {
        this.deger = value;
    }

}
