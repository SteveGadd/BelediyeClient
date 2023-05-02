
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hizmetSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hizmetSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hizmetListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfHizmetBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hizmetSorgulaCType", propOrder = {
    "hizmetListesi"
})
public class HizmetSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfHizmetBilgisi hizmetListesi;

    /**
     * Gets the value of the hizmetListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHizmetBilgisi }
     *     
     */
    public ArrayOfHizmetBilgisi getHizmetListesi() {
        return hizmetListesi;
    }

    /**
     * Sets the value of the hizmetListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHizmetBilgisi }
     *     
     */
    public void setHizmetListesi(ArrayOfHizmetBilgisi value) {
        this.hizmetListesi = value;
    }

}
