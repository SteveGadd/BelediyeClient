
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneUyelikSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kutuphaneUyelikListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKutuphaneUyelikBilgileri"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kutuphaneUyelikSorgulamaCType", propOrder = {
    "kutuphaneUyelikListesi",
    "detayListesi"
})
public class KutuphaneUyelikSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfKutuphaneUyelikBilgileri kutuphaneUyelikListesi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the kutuphaneUyelikListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKutuphaneUyelikBilgileri }
     *     
     */
    public ArrayOfKutuphaneUyelikBilgileri getKutuphaneUyelikListesi() {
        return kutuphaneUyelikListesi;
    }

    /**
     * Sets the value of the kutuphaneUyelikListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKutuphaneUyelikBilgileri }
     *     
     */
    public void setKutuphaneUyelikListesi(ArrayOfKutuphaneUyelikBilgileri value) {
        this.kutuphaneUyelikListesi = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public ArrayOfDetailType getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public void setDetayListesi(ArrayOfDetailType value) {
        this.detayListesi = value;
    }

}
