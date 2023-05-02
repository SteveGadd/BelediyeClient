
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suAboneBilgisiCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suAboneBilgisiCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="suAboneListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfSuAboneBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suAboneBilgisiCType", propOrder = {
    "suAboneListesi"
})
public class SuAboneBilgisiCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfSuAboneBilgisi suAboneListesi;

    /**
     * Gets the value of the suAboneListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSuAboneBilgisi }
     *     
     */
    public ArrayOfSuAboneBilgisi getSuAboneListesi() {
        return suAboneListesi;
    }

    /**
     * Sets the value of the suAboneListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSuAboneBilgisi }
     *     
     */
    public void setSuAboneListesi(ArrayOfSuAboneBilgisi value) {
        this.suAboneListesi = value;
    }

}
