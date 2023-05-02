
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sicilSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sicilSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sicilListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfSicilBilgisiType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sicilSorgulamaCType", propOrder = {
    "sicilListesi"
})
public class SicilSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfSicilBilgisiType sicilListesi;

    /**
     * Gets the value of the sicilListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSicilBilgisiType }
     *     
     */
    public ArrayOfSicilBilgisiType getSicilListesi() {
        return sicilListesi;
    }

    /**
     * Sets the value of the sicilListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSicilBilgisiType }
     *     
     */
    public void setSicilListesi(ArrayOfSicilBilgisiType value) {
        this.sicilListesi = value;
    }

}
