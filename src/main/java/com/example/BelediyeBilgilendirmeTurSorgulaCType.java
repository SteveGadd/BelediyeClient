
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for belediyeBilgilendirmeTurSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="belediyeBilgilendirmeTurSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bilgilendirmeTurListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBelediyeBilgilendirmeTur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "belediyeBilgilendirmeTurSorgulaCType", propOrder = {
    "bilgilendirmeTurListesi"
})
public class BelediyeBilgilendirmeTurSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfBelediyeBilgilendirmeTur bilgilendirmeTurListesi;

    /**
     * Gets the value of the bilgilendirmeTurListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBelediyeBilgilendirmeTur }
     *     
     */
    public ArrayOfBelediyeBilgilendirmeTur getBilgilendirmeTurListesi() {
        return bilgilendirmeTurListesi;
    }

    /**
     * Sets the value of the bilgilendirmeTurListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBelediyeBilgilendirmeTur }
     *     
     */
    public void setBilgilendirmeTurListesi(ArrayOfBelediyeBilgilendirmeTur value) {
        this.bilgilendirmeTurListesi = value;
    }

}
