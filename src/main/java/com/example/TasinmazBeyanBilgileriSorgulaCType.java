
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tasinmazBeyanBilgileriSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tasinmazBeyanBilgileriSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTasinmazBeyanBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tasinmazBeyanBilgileriSorgulaCType", propOrder = {
    "beyanListesi"
})
public class TasinmazBeyanBilgileriSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfTasinmazBeyanBilgisi beyanListesi;

    /**
     * Gets the value of the beyanListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTasinmazBeyanBilgisi }
     *     
     */
    public ArrayOfTasinmazBeyanBilgisi getBeyanListesi() {
        return beyanListesi;
    }

    /**
     * Sets the value of the beyanListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTasinmazBeyanBilgisi }
     *     
     */
    public void setBeyanListesi(ArrayOfTasinmazBeyanBilgisi value) {
        this.beyanListesi = value;
    }

}
