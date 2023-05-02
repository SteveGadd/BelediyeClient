
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for halSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="halSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="halListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfHalBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "halSorgulaCType", propOrder = {
    "halListesi"
})
public class HalSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfHalBilgisi halListesi;

    /**
     * Gets the value of the halListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHalBilgisi }
     *     
     */
    public ArrayOfHalBilgisi getHalListesi() {
        return halListesi;
    }

    /**
     * Sets the value of the halListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHalBilgisi }
     *     
     */
    public void setHalListesi(ArrayOfHalBilgisi value) {
        this.halListesi = value;
    }

}
