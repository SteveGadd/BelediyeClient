
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for katalogTaramaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="katalogTaramaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arananKutuphaneKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aramaMetni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aramaTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "katalogTaramaGType", propOrder = {
    "arananKutuphaneKodu",
    "aramaMetni",
    "aramaTuru",
    "detayListesi"
})
public class KatalogTaramaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String arananKutuphaneKodu;
    @XmlElement(required = true)
    protected String aramaMetni;
    @XmlElement(required = true)
    protected String aramaTuru;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the arananKutuphaneKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArananKutuphaneKodu() {
        return arananKutuphaneKodu;
    }

    /**
     * Sets the value of the arananKutuphaneKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArananKutuphaneKodu(String value) {
        this.arananKutuphaneKodu = value;
    }

    /**
     * Gets the value of the aramaMetni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAramaMetni() {
        return aramaMetni;
    }

    /**
     * Sets the value of the aramaMetni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAramaMetni(String value) {
        this.aramaMetni = value;
    }

    /**
     * Gets the value of the aramaTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAramaTuru() {
        return aramaTuru;
    }

    /**
     * Sets the value of the aramaTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAramaTuru(String value) {
        this.aramaTuru = value;
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
