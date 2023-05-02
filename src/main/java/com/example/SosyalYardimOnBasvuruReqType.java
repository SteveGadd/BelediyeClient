
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sosyalYardimOnBasvuruReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sosyalYardimOnBasvuruReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sosyalYardimOnBasvuruBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yardimTuruKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ikametAdresiNVIIlceKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "sosyalYardimOnBasvuruReqType", propOrder = {
    "yardimTuruKodu",
    "ikametAdresiNVIIlceKodu",
    "detayListesi"
})
public class SosyalYardimOnBasvuruReqType
    extends SosyalYardimOnBasvuruBaseType
{

    @XmlElement(required = true)
    protected String yardimTuruKodu;
    @XmlElement(required = true)
    protected String ikametAdresiNVIIlceKodu;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the yardimTuruKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimTuruKodu() {
        return yardimTuruKodu;
    }

    /**
     * Sets the value of the yardimTuruKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimTuruKodu(String value) {
        this.yardimTuruKodu = value;
    }

    /**
     * Gets the value of the ikametAdresiNVIIlceKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIkametAdresiNVIIlceKodu() {
        return ikametAdresiNVIIlceKodu;
    }

    /**
     * Sets the value of the ikametAdresiNVIIlceKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIkametAdresiNVIIlceKodu(String value) {
        this.ikametAdresiNVIIlceKodu = value;
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
