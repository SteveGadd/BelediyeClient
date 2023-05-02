
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yapilanSosyalYardimBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilanSosyalYardimBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sosyalYardimBasvuruBilgiType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yapilanYardimMiktari" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kalanYardimMiktari" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="toplamYardimMiktari" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yardimDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gerceklesenYardimListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfGerceklesenYardimBilgisiType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yapilanSosyalYardimBilgileriType", propOrder = {
    "yapilanYardimMiktari",
    "kalanYardimMiktari",
    "toplamYardimMiktari",
    "yardimDurumu",
    "gerceklesenYardimListesi"
})
public class YapilanSosyalYardimBilgileriType
    extends SosyalYardimBasvuruBilgiType
{

    @XmlElement(required = true)
    protected String yapilanYardimMiktari;
    @XmlElement(required = true)
    protected String kalanYardimMiktari;
    @XmlElement(required = true)
    protected String toplamYardimMiktari;
    @XmlElement(required = true)
    protected String yardimDurumu;
    @XmlElement(required = true)
    protected ArrayOfGerceklesenYardimBilgisiType gerceklesenYardimListesi;

    /**
     * Gets the value of the yapilanYardimMiktari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYapilanYardimMiktari() {
        return yapilanYardimMiktari;
    }

    /**
     * Sets the value of the yapilanYardimMiktari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYapilanYardimMiktari(String value) {
        this.yapilanYardimMiktari = value;
    }

    /**
     * Gets the value of the kalanYardimMiktari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKalanYardimMiktari() {
        return kalanYardimMiktari;
    }

    /**
     * Sets the value of the kalanYardimMiktari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKalanYardimMiktari(String value) {
        this.kalanYardimMiktari = value;
    }

    /**
     * Gets the value of the toplamYardimMiktari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToplamYardimMiktari() {
        return toplamYardimMiktari;
    }

    /**
     * Sets the value of the toplamYardimMiktari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToplamYardimMiktari(String value) {
        this.toplamYardimMiktari = value;
    }

    /**
     * Gets the value of the yardimDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYardimDurumu() {
        return yardimDurumu;
    }

    /**
     * Sets the value of the yardimDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYardimDurumu(String value) {
        this.yardimDurumu = value;
    }

    /**
     * Gets the value of the gerceklesenYardimListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGerceklesenYardimBilgisiType }
     *     
     */
    public ArrayOfGerceklesenYardimBilgisiType getGerceklesenYardimListesi() {
        return gerceklesenYardimListesi;
    }

    /**
     * Sets the value of the gerceklesenYardimListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGerceklesenYardimBilgisiType }
     *     
     */
    public void setGerceklesenYardimListesi(ArrayOfGerceklesenYardimBilgisiType value) {
        this.gerceklesenYardimListesi = value;
    }

}
