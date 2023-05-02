
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insaatSinifiSorgulamaCtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insaatSinifiSorgulamaCtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insaatSinifiListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfInsaatSinifi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insaatSinifiSorgulamaCtype", propOrder = {
    "insaatSinifiListesi"
})
public class InsaatSinifiSorgulamaCtype
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfInsaatSinifi insaatSinifiListesi;

    /**
     * Gets the value of the insaatSinifiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsaatSinifi }
     *     
     */
    public ArrayOfInsaatSinifi getInsaatSinifiListesi() {
        return insaatSinifiListesi;
    }

    /**
     * Sets the value of the insaatSinifiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsaatSinifi }
     *     
     */
    public void setInsaatSinifiListesi(ArrayOfInsaatSinifi value) {
        this.insaatSinifiListesi = value;
    }

}
