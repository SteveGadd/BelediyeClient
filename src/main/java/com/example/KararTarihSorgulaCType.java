
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kararTarihSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kararTarihSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kararTarihListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKararTarihBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kararTarihSorgulaCType", propOrder = {
    "kararTarihListesi"
})
public class KararTarihSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfKararTarihBilgisi kararTarihListesi;

    /**
     * Gets the value of the kararTarihListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKararTarihBilgisi }
     *     
     */
    public ArrayOfKararTarihBilgisi getKararTarihListesi() {
        return kararTarihListesi;
    }

    /**
     * Sets the value of the kararTarihListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKararTarihBilgisi }
     *     
     */
    public void setKararTarihListesi(ArrayOfKararTarihBilgisi value) {
        this.kararTarihListesi = value;
    }

}
