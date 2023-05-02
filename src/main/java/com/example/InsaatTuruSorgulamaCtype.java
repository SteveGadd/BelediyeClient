
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insaatTuruSorgulamaCtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insaatTuruSorgulamaCtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insaatTuruListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfInsaatTuru"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insaatTuruSorgulamaCtype", propOrder = {
    "insaatTuruListesi"
})
public class InsaatTuruSorgulamaCtype
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfInsaatTuru insaatTuruListesi;

    /**
     * Gets the value of the insaatTuruListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsaatTuru }
     *     
     */
    public ArrayOfInsaatTuru getInsaatTuruListesi() {
        return insaatTuruListesi;
    }

    /**
     * Sets the value of the insaatTuruListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsaatTuru }
     *     
     */
    public void setInsaatTuruListesi(ArrayOfInsaatTuru value) {
        this.insaatTuruListesi = value;
    }

}
