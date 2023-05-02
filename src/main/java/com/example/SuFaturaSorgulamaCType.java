
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suFaturaSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suFaturaSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="suFaturaListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfSuFaturaBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suFaturaSorgulamaCType", propOrder = {
    "suFaturaListesi"
})
public class SuFaturaSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfSuFaturaBilgisi suFaturaListesi;

    /**
     * Gets the value of the suFaturaListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSuFaturaBilgisi }
     *     
     */
    public ArrayOfSuFaturaBilgisi getSuFaturaListesi() {
        return suFaturaListesi;
    }

    /**
     * Sets the value of the suFaturaListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSuFaturaBilgisi }
     *     
     */
    public void setSuFaturaListesi(ArrayOfSuFaturaBilgisi value) {
        this.suFaturaListesi = value;
    }

}
