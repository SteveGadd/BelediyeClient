
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bilgilendirmeIstegiSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bilgilendirmeIstegiSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kayitliBilgilendirmeIstegi" type="{http://belediye.turkiye.gov.tr/v3}kayitliBilgilendirmeIstegiType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bilgilendirmeIstegiSorgulaCType", propOrder = {
    "kayitliBilgilendirmeIstegi"
})
public class BilgilendirmeIstegiSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true, nillable = true)
    protected KayitliBilgilendirmeIstegiType kayitliBilgilendirmeIstegi;

    /**
     * Gets the value of the kayitliBilgilendirmeIstegi property.
     * 
     * @return
     *     possible object is
     *     {@link KayitliBilgilendirmeIstegiType }
     *     
     */
    public KayitliBilgilendirmeIstegiType getKayitliBilgilendirmeIstegi() {
        return kayitliBilgilendirmeIstegi;
    }

    /**
     * Sets the value of the kayitliBilgilendirmeIstegi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KayitliBilgilendirmeIstegiType }
     *     
     */
    public void setKayitliBilgilendirmeIstegi(KayitliBilgilendirmeIstegiType value) {
        this.kayitliBilgilendirmeIstegi = value;
    }

}
