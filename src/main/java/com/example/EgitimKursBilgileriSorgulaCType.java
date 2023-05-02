
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursBilgileriSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursBilgileriSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfEgitimKursBilgileri"/&gt;
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
@XmlType(name = "egitimKursBilgileriSorgulaCType", propOrder = {
    "egitimKursListesi",
    "detayListesi"
})
public class EgitimKursBilgileriSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfEgitimKursBilgileri egitimKursListesi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the egitimKursListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEgitimKursBilgileri }
     *     
     */
    public ArrayOfEgitimKursBilgileri getEgitimKursListesi() {
        return egitimKursListesi;
    }

    /**
     * Sets the value of the egitimKursListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEgitimKursBilgileri }
     *     
     */
    public void setEgitimKursListesi(ArrayOfEgitimKursBilgileri value) {
        this.egitimKursListesi = value;
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
