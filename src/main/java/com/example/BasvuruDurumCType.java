
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basvuruDurumCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basvuruDurumCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruDurumListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBasvuruDurum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basvuruDurumCType", propOrder = {
    "basvuruDurumListesi"
})
public class BasvuruDurumCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfBasvuruDurum basvuruDurumListesi;

    /**
     * Gets the value of the basvuruDurumListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBasvuruDurum }
     *     
     */
    public ArrayOfBasvuruDurum getBasvuruDurumListesi() {
        return basvuruDurumListesi;
    }

    /**
     * Sets the value of the basvuruDurumListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBasvuruDurum }
     *     
     */
    public void setBasvuruDurumListesi(ArrayOfBasvuruDurum value) {
        this.basvuruDurumListesi = value;
    }

}
