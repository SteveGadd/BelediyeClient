
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kararSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kararSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kararListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKararBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kararSorgulaCType", propOrder = {
    "kararListesi"
})
public class KararSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfKararBilgisi kararListesi;

    /**
     * Gets the value of the kararListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKararBilgisi }
     *     
     */
    public ArrayOfKararBilgisi getKararListesi() {
        return kararListesi;
    }

    /**
     * Sets the value of the kararListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKararBilgisi }
     *     
     */
    public void setKararListesi(ArrayOfKararBilgisi value) {
        this.kararListesi = value;
    }

}
