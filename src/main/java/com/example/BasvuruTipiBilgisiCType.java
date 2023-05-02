
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basvuruTipiBilgisiCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basvuruTipiBilgisiCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruTipiListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBasvuruTipiBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basvuruTipiBilgisiCType", propOrder = {
    "basvuruTipiListesi"
})
public class BasvuruTipiBilgisiCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfBasvuruTipiBilgisi basvuruTipiListesi;

    /**
     * Gets the value of the basvuruTipiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBasvuruTipiBilgisi }
     *     
     */
    public ArrayOfBasvuruTipiBilgisi getBasvuruTipiListesi() {
        return basvuruTipiListesi;
    }

    /**
     * Sets the value of the basvuruTipiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBasvuruTipiBilgisi }
     *     
     */
    public void setBasvuruTipiListesi(ArrayOfBasvuruTipiBilgisi value) {
        this.basvuruTipiListesi = value;
    }

}
