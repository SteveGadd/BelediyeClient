
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ilanReklamYerCtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilanReklamYerCtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilanReklamYerListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfilanReklamYer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilanReklamYerCtype", propOrder = {
    "ilanReklamYerListesi"
})
public class IlanReklamYerCtype
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfilanReklamYer ilanReklamYerListesi;

    /**
     * Gets the value of the ilanReklamYerListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfilanReklamYer }
     *     
     */
    public ArrayOfilanReklamYer getIlanReklamYerListesi() {
        return ilanReklamYerListesi;
    }

    /**
     * Sets the value of the ilanReklamYerListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfilanReklamYer }
     *     
     */
    public void setIlanReklamYerListesi(ArrayOfilanReklamYer value) {
        this.ilanReklamYerListesi = value;
    }

}
