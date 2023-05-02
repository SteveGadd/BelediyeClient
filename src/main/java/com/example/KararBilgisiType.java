
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kararBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kararBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kararNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kararTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="teklif" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="karar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kararOzeti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kararSonuc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kararBilgisiType", propOrder = {
    "kararNumarasi",
    "kararTarihi",
    "teklif",
    "karar",
    "kararOzeti",
    "kararSonuc",
    "detayListesi"
})
public class KararBilgisiType {

    @XmlElement(required = true)
    protected String kararNumarasi;
    @XmlElement(required = true)
    protected String kararTarihi;
    @XmlElement(required = true)
    protected String teklif;
    @XmlElement(required = true)
    protected String karar;
    @XmlElement(required = true)
    protected String kararOzeti;
    @XmlElement(required = true)
    protected String kararSonuc;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the kararNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKararNumarasi() {
        return kararNumarasi;
    }

    /**
     * Sets the value of the kararNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKararNumarasi(String value) {
        this.kararNumarasi = value;
    }

    /**
     * Gets the value of the kararTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKararTarihi() {
        return kararTarihi;
    }

    /**
     * Sets the value of the kararTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKararTarihi(String value) {
        this.kararTarihi = value;
    }

    /**
     * Gets the value of the teklif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTeklif() {
        return teklif;
    }

    /**
     * Sets the value of the teklif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTeklif(String value) {
        this.teklif = value;
    }

    /**
     * Gets the value of the karar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKarar() {
        return karar;
    }

    /**
     * Sets the value of the karar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKarar(String value) {
        this.karar = value;
    }

    /**
     * Gets the value of the kararOzeti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKararOzeti() {
        return kararOzeti;
    }

    /**
     * Sets the value of the kararOzeti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKararOzeti(String value) {
        this.kararOzeti = value;
    }

    /**
     * Gets the value of the kararSonuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKararSonuc() {
        return kararSonuc;
    }

    /**
     * Sets the value of the kararSonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKararSonuc(String value) {
        this.kararSonuc = value;
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
