
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ilanReklamTurCtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilanReklamTurCtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilanReklamTurListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfilanReklamTur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilanReklamTurCtype", propOrder = {
    "ilanReklamTurListesi"
})
public class IlanReklamTurCtype
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfilanReklamTur ilanReklamTurListesi;

    /**
     * Gets the value of the ilanReklamTurListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfilanReklamTur }
     *     
     */
    public ArrayOfilanReklamTur getIlanReklamTurListesi() {
        return ilanReklamTurListesi;
    }

    /**
     * Sets the value of the ilanReklamTurListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfilanReklamTur }
     *     
     */
    public void setIlanReklamTurListesi(ArrayOfilanReklamTur value) {
        this.ilanReklamTurListesi = value;
    }

}
