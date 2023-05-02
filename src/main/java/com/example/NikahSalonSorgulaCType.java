
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nikahSalonSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nikahSalonSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nikahSalonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfNikahSalonBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nikahSalonSorgulaCType", propOrder = {
    "nikahSalonListesi"
})
public class NikahSalonSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfNikahSalonBilgisi nikahSalonListesi;

    /**
     * Gets the value of the nikahSalonListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNikahSalonBilgisi }
     *     
     */
    public ArrayOfNikahSalonBilgisi getNikahSalonListesi() {
        return nikahSalonListesi;
    }

    /**
     * Sets the value of the nikahSalonListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNikahSalonBilgisi }
     *     
     */
    public void setNikahSalonListesi(ArrayOfNikahSalonBilgisi value) {
        this.nikahSalonListesi = value;
    }

}
