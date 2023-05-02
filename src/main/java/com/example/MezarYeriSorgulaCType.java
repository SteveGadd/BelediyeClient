
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mezarYeriSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mezarYeriSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mezarYeriListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfMezarYeriBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mezarYeriSorgulaCType", propOrder = {
    "mezarYeriListesi"
})
public class MezarYeriSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfMezarYeriBilgisi mezarYeriListesi;

    /**
     * Gets the value of the mezarYeriListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMezarYeriBilgisi }
     *     
     */
    public ArrayOfMezarYeriBilgisi getMezarYeriListesi() {
        return mezarYeriListesi;
    }

    /**
     * Sets the value of the mezarYeriListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMezarYeriBilgisi }
     *     
     */
    public void setMezarYeriListesi(ArrayOfMezarYeriBilgisi value) {
        this.mezarYeriListesi = value;
    }

}
