
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kayitliEmlakRayicBelgesiSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kayitliEmlakRayicBelgesiSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kayitliEmlakRayicBelgeListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKayitliEmlakRayicBelgesi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kayitliEmlakRayicBelgesiSorgulaCType", propOrder = {
    "kayitliEmlakRayicBelgeListesi"
})
public class KayitliEmlakRayicBelgesiSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfKayitliEmlakRayicBelgesi kayitliEmlakRayicBelgeListesi;

    /**
     * Gets the value of the kayitliEmlakRayicBelgeListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKayitliEmlakRayicBelgesi }
     *     
     */
    public ArrayOfKayitliEmlakRayicBelgesi getKayitliEmlakRayicBelgeListesi() {
        return kayitliEmlakRayicBelgeListesi;
    }

    /**
     * Sets the value of the kayitliEmlakRayicBelgeListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKayitliEmlakRayicBelgesi }
     *     
     */
    public void setKayitliEmlakRayicBelgeListesi(ArrayOfKayitliEmlakRayicBelgesi value) {
        this.kayitliEmlakRayicBelgeListesi = value;
    }

}
