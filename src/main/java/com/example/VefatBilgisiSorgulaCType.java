
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vefatBilgisiSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vefatBilgisiSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vefatBilgisiListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfVefatBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vefatBilgisiSorgulaCType", propOrder = {
    "vefatBilgisiListesi"
})
public class VefatBilgisiSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfVefatBilgisi vefatBilgisiListesi;

    /**
     * Gets the value of the vefatBilgisiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVefatBilgisi }
     *     
     */
    public ArrayOfVefatBilgisi getVefatBilgisiListesi() {
        return vefatBilgisiListesi;
    }

    /**
     * Sets the value of the vefatBilgisiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVefatBilgisi }
     *     
     */
    public void setVefatBilgisiListesi(ArrayOfVefatBilgisi value) {
        this.vefatBilgisiListesi = value;
    }

}
