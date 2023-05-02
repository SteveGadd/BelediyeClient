
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for yapilandirmaKapsamindakiBorcBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilandirmaKapsamindakiBorcBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sicilNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adSoyadUnvan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tahakkukAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tahakkukTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="sonOdemeTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="toplamBorc" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
@XmlType(name = "yapilandirmaKapsamindakiBorcBilgisiType", propOrder = {
    "sicilNumarasi",
    "adSoyadUnvan",
    "tahakkukAdi",
    "tahakkukTarihi",
    "sonOdemeTarihi",
    "toplamBorc",
    "detayListesi"
})
public class YapilandirmaKapsamindakiBorcBilgisiType {

    @XmlElement(required = true)
    protected String sicilNumarasi;
    @XmlElement(required = true)
    protected String adSoyadUnvan;
    @XmlElement(required = true)
    protected String tahakkukAdi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tahakkukTarihi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sonOdemeTarihi;
    @XmlElement(required = true)
    protected BigDecimal toplamBorc;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the sicilNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicilNumarasi() {
        return sicilNumarasi;
    }

    /**
     * Sets the value of the sicilNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicilNumarasi(String value) {
        this.sicilNumarasi = value;
    }

    /**
     * Gets the value of the adSoyadUnvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdSoyadUnvan() {
        return adSoyadUnvan;
    }

    /**
     * Sets the value of the adSoyadUnvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdSoyadUnvan(String value) {
        this.adSoyadUnvan = value;
    }

    /**
     * Gets the value of the tahakkukAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahakkukAdi() {
        return tahakkukAdi;
    }

    /**
     * Sets the value of the tahakkukAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahakkukAdi(String value) {
        this.tahakkukAdi = value;
    }

    /**
     * Gets the value of the tahakkukTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTahakkukTarihi() {
        return tahakkukTarihi;
    }

    /**
     * Sets the value of the tahakkukTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTahakkukTarihi(XMLGregorianCalendar value) {
        this.tahakkukTarihi = value;
    }

    /**
     * Gets the value of the sonOdemeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSonOdemeTarihi() {
        return sonOdemeTarihi;
    }

    /**
     * Sets the value of the sonOdemeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSonOdemeTarihi(XMLGregorianCalendar value) {
        this.sonOdemeTarihi = value;
    }

    /**
     * Gets the value of the toplamBorc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToplamBorc() {
        return toplamBorc;
    }

    /**
     * Sets the value of the toplamBorc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToplamBorc(BigDecimal value) {
        this.toplamBorc = value;
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
