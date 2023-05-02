
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tahsilatSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tahsilatSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tahsilatListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTahsilatBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tahsilatSorgulamaCType", propOrder = {
    "tahsilatListesi"
})
public class TahsilatSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfTahsilatBilgisi tahsilatListesi;

    /**
     * Gets the value of the tahsilatListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTahsilatBilgisi }
     *     
     */
    public ArrayOfTahsilatBilgisi getTahsilatListesi() {
        return tahsilatListesi;
    }

    /**
     * Sets the value of the tahsilatListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTahsilatBilgisi }
     *     
     */
    public void setTahsilatListesi(ArrayOfTahsilatBilgisi value) {
        this.tahsilatListesi = value;
    }

}
