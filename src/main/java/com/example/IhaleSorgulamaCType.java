
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ihaleSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ihaleSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ihaleListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfIhaleBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ihaleSorgulamaCType", propOrder = {
    "ihaleListesi"
})
public class IhaleSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfIhaleBilgisi ihaleListesi;

    /**
     * Gets the value of the ihaleListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIhaleBilgisi }
     *     
     */
    public ArrayOfIhaleBilgisi getIhaleListesi() {
        return ihaleListesi;
    }

    /**
     * Sets the value of the ihaleListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIhaleBilgisi }
     *     
     */
    public void setIhaleListesi(ArrayOfIhaleBilgisi value) {
        this.ihaleListesi = value;
    }

}
