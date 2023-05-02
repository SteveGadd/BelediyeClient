
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mezarlikSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mezarlikSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mezarlikListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfMezarlikBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mezarlikSorgulaCType", propOrder = {
    "mezarlikListesi"
})
public class MezarlikSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfMezarlikBilgisi mezarlikListesi;

    /**
     * Gets the value of the mezarlikListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMezarlikBilgisi }
     *     
     */
    public ArrayOfMezarlikBilgisi getMezarlikListesi() {
        return mezarlikListesi;
    }

    /**
     * Sets the value of the mezarlikListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMezarlikBilgisi }
     *     
     */
    public void setMezarlikListesi(ArrayOfMezarlikBilgisi value) {
        this.mezarlikListesi = value;
    }

}
