
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evrakSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evrakSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evrakBilgisi" type="{http://belediye.turkiye.gov.tr/v3}evrakBilgisiType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evrakSorgulamaCType", propOrder = {
    "evrakBilgisi"
})
public class EvrakSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected EvrakBilgisiType evrakBilgisi;

    /**
     * Gets the value of the evrakBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link EvrakBilgisiType }
     *     
     */
    public EvrakBilgisiType getEvrakBilgisi() {
        return evrakBilgisi;
    }

    /**
     * Sets the value of the evrakBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvrakBilgisiType }
     *     
     */
    public void setEvrakBilgisi(EvrakBilgisiType value) {
        this.evrakBilgisi = value;
    }

}
