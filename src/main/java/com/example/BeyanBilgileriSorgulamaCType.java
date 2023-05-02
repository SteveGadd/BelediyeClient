
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beyanBilgileriSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beyanBilgileriSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBeyanBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beyanBilgileriSorgulamaCType", propOrder = {
    "beyanListesi"
})
public class BeyanBilgileriSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfBeyanBilgisi beyanListesi;

    /**
     * Gets the value of the beyanListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBeyanBilgisi }
     *     
     */
    public ArrayOfBeyanBilgisi getBeyanListesi() {
        return beyanListesi;
    }

    /**
     * Sets the value of the beyanListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBeyanBilgisi }
     *     
     */
    public void setBeyanListesi(ArrayOfBeyanBilgisi value) {
        this.beyanListesi = value;
    }

}
