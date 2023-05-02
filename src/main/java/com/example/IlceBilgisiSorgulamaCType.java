
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ilceBilgisiSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilceBilgisiSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilceListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfIlceBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilceBilgisiSorgulamaCType", propOrder = {
    "ilceListesi"
})
public class IlceBilgisiSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfIlceBilgisi ilceListesi;

    /**
     * Gets the value of the ilceListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfIlceBilgisi }
     *     
     */
    public ArrayOfIlceBilgisi getIlceListesi() {
        return ilceListesi;
    }

    /**
     * Sets the value of the ilceListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfIlceBilgisi }
     *     
     */
    public void setIlceListesi(ArrayOfIlceBilgisi value) {
        this.ilceListesi = value;
    }

}
