
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nikahSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nikahSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nikahListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfNikahBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nikahSorgulaCType", propOrder = {
    "nikahListesi"
})
public class NikahSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfNikahBilgisi nikahListesi;

    /**
     * Gets the value of the nikahListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNikahBilgisi }
     *     
     */
    public ArrayOfNikahBilgisi getNikahListesi() {
        return nikahListesi;
    }

    /**
     * Sets the value of the nikahListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNikahBilgisi }
     *     
     */
    public void setNikahListesi(ArrayOfNikahBilgisi value) {
        this.nikahListesi = value;
    }

}
