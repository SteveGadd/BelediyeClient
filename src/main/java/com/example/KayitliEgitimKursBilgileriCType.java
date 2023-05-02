
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kayitliEgitimKursBilgileriCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kayitliEgitimKursBilgileriCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfkayitliEgitimKursBilgileri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kayitliEgitimKursBilgileriCType", propOrder = {
    "egitimKursListesi"
})
public class KayitliEgitimKursBilgileriCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfkayitliEgitimKursBilgileri egitimKursListesi;

    /**
     * Gets the value of the egitimKursListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfkayitliEgitimKursBilgileri }
     *     
     */
    public ArrayOfkayitliEgitimKursBilgileri getEgitimKursListesi() {
        return egitimKursListesi;
    }

    /**
     * Sets the value of the egitimKursListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfkayitliEgitimKursBilgileri }
     *     
     */
    public void setEgitimKursListesi(ArrayOfkayitliEgitimKursBilgileri value) {
        this.egitimKursListesi = value;
    }

}
