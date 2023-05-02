
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneUyelikBasvuruReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikBasvuruReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kutuphaneUyelikBasvuruBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvurulanKutuphaneKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "kutuphaneUyelikBasvuruReqType", propOrder = {
    "basvurulanKutuphaneKodu",
    "ikametAdresiNVIIlceKodu",
    "detayListesi"
})
public class KutuphaneUyelikBasvuruReqType
    extends KutuphaneUyelikBasvuruBaseType
{

    @XmlElement(required = true)
    protected String basvurulanKutuphaneKodu;
    @XmlElement(required = true)
    protected String ikametAdresiNVIIlceKodu;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the basvurulanKutuphaneKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvurulanKutuphaneKodu() {
        return basvurulanKutuphaneKodu;
    }

    /**
     * Sets the value of the basvurulanKutuphaneKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvurulanKutuphaneKodu(String value) {
        this.basvurulanKutuphaneKodu = value;
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
