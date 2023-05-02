
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ozetBorcBilgileriSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ozetBorcBilgileriSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ozetBorcBilgisi" type="{http://belediye.turkiye.gov.tr/v3}ozetBorcBilgileriType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ozetBorcBilgileriSorgulamaCType", propOrder = {
    "ozetBorcBilgisi"
})
public class OzetBorcBilgileriSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected OzetBorcBilgileriType ozetBorcBilgisi;

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

}
