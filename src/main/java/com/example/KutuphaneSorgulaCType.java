
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kutuphaneListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKutuphaneBilgileri"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kutuphaneSorgulaCType", propOrder = {
    "kutuphaneListesi",
    "detayListesi"
})
public class KutuphaneSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfKutuphaneBilgileri kutuphaneListesi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the kutuphaneListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKutuphaneBilgileri }
     *     
     */
    public ArrayOfKutuphaneBilgileri getKutuphaneListesi() {
        return kutuphaneListesi;
    }

    /**
     * Sets the value of the kutuphaneListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKutuphaneBilgileri }
     *     
     */
    public void setKutuphaneListesi(ArrayOfKutuphaneBilgileri value) {
        this.kutuphaneListesi = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public ArrayOfDetailType getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public void setDetayListesi(ArrayOfDetailType value) {
        this.detayListesi = value;
    }

}
