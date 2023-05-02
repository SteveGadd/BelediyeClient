
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursYeriSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursYeriSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursYeriListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfEgitimKursYeri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursYeriSorgulaCType", propOrder = {
    "egitimKursYeriListesi"
})
public class EgitimKursYeriSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfEgitimKursYeri egitimKursYeriListesi;

    /**
     * Gets the value of the egitimKursYeriListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEgitimKursYeri }
     *     
     */
    public ArrayOfEgitimKursYeri getEgitimKursYeriListesi() {
        return egitimKursYeriListesi;
    }

    /**
     * Sets the value of the egitimKursYeriListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEgitimKursYeri }
     *     
     */
    public void setEgitimKursYeriListesi(ArrayOfEgitimKursYeri value) {
        this.egitimKursYeriListesi = value;
    }

}
