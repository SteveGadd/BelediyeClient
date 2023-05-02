
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nobetciEczaneSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nobetciEczaneSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nobetciEczaneListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfNobetciEczane"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nobetciEczaneSorgulamaCType", propOrder = {
    "nobetciEczaneListesi"
})
public class NobetciEczaneSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfNobetciEczane nobetciEczaneListesi;

    /**
     * Gets the value of the nobetciEczaneListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNobetciEczane }
     *     
     */
    public ArrayOfNobetciEczane getNobetciEczaneListesi() {
        return nobetciEczaneListesi;
    }

    /**
     * Sets the value of the nobetciEczaneListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNobetciEczane }
     *     
     */
    public void setNobetciEczaneListesi(ArrayOfNobetciEczane value) {
        this.nobetciEczaneListesi = value;
    }

}
