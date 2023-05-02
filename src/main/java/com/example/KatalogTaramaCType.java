
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for katalogTaramaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="katalogTaramaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taramaSonucListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKatalogTaramaSonuc"/&gt;
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
@XmlType(name = "katalogTaramaCType", propOrder = {
    "taramaSonucListesi",
    "detayListesi"
})
public class KatalogTaramaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfKatalogTaramaSonuc taramaSonucListesi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the taramaSonucListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKatalogTaramaSonuc }
     *     
     */
    public ArrayOfKatalogTaramaSonuc getTaramaSonucListesi() {
        return taramaSonucListesi;
    }

    /**
     * Sets the value of the taramaSonucListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKatalogTaramaSonuc }
     *     
     */
    public void setTaramaSonucListesi(ArrayOfKatalogTaramaSonuc value) {
        this.taramaSonucListesi = value;
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
