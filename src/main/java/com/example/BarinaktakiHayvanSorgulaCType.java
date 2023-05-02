
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for barinaktakiHayvanSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="barinaktakiHayvanSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hayvanListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBarinaktakiHayvanBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "barinaktakiHayvanSorgulaCType", propOrder = {
    "hayvanListesi"
})
public class BarinaktakiHayvanSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfBarinaktakiHayvanBilgisi hayvanListesi;

    /**
     * Gets the value of the hayvanListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBarinaktakiHayvanBilgisi }
     *     
     */
    public ArrayOfBarinaktakiHayvanBilgisi getHayvanListesi() {
        return hayvanListesi;
    }

    /**
     * Sets the value of the hayvanListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBarinaktakiHayvanBilgisi }
     *     
     */
    public void setHayvanListesi(ArrayOfBarinaktakiHayvanBilgisi value) {
        this.hayvanListesi = value;
    }

}
