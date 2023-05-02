
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arsaRayicBedelBilgisiCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arsaRayicBedelBilgisiCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arsaRayicBedelListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfArsaRayicBedelBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arsaRayicBedelBilgisiCType", propOrder = {
    "arsaRayicBedelListesi"
})
public class ArsaRayicBedelBilgisiCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfArsaRayicBedelBilgisi arsaRayicBedelListesi;

    /**
     * Gets the value of the arsaRayicBedelListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfArsaRayicBedelBilgisi }
     *     
     */
    public ArrayOfArsaRayicBedelBilgisi getArsaRayicBedelListesi() {
        return arsaRayicBedelListesi;
    }

    /**
     * Sets the value of the arsaRayicBedelListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfArsaRayicBedelBilgisi }
     *     
     */
    public void setArsaRayicBedelListesi(ArrayOfArsaRayicBedelBilgisi value) {
        this.arsaRayicBedelListesi = value;
    }

}
