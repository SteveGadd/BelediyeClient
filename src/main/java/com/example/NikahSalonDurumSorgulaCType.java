
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nikahSalonDurumSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nikahSalonDurumSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nikahSalonDurumListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfNikahSalonDurumBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nikahSalonDurumSorgulaCType", propOrder = {
    "nikahSalonDurumListesi"
})
public class NikahSalonDurumSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfNikahSalonDurumBilgisi nikahSalonDurumListesi;

    /**
     * Gets the value of the nikahSalonDurumListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNikahSalonDurumBilgisi }
     *     
     */
    public ArrayOfNikahSalonDurumBilgisi getNikahSalonDurumListesi() {
        return nikahSalonDurumListesi;
    }

    /**
     * Sets the value of the nikahSalonDurumListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNikahSalonDurumBilgisi }
     *     
     */
    public void setNikahSalonDurumListesi(ArrayOfNikahSalonDurumBilgisi value) {
        this.nikahSalonDurumListesi = value;
    }

}
