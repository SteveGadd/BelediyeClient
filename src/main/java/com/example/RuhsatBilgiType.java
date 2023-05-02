
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ruhsatBilgiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ruhsatBilgiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruhsatNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ruhsatTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="onaylayan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sonGecerlilikTarihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="durumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="barkodluRuhsatBelgesiBarkodNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ruhsatBilgiType", propOrder = {
    "ruhsatNumarasi",
    "ruhsatTarihi",
    "onaylayan",
    "sonGecerlilikTarihi",
    "durumu",
    "aciklama",
    "barkodluRuhsatBelgesiBarkodNo",
    "detayListesi"
})
public class RuhsatBilgiType {

    @XmlElement(required = true)
    protected String ruhsatNumarasi;
    @XmlElement(required = true)
    protected String ruhsatTarihi;
    @XmlElement(required = true)
    protected String onaylayan;
    @XmlElement(required = true)
    protected String sonGecerlilikTarihi;
    @XmlElement(required = true)
    protected String durumu;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElement(required = true)
    protected String barkodluRuhsatBelgesiBarkodNo;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the ruhsatNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuhsatNumarasi() {
        return ruhsatNumarasi;
    }

    /**
     * Sets the value of the ruhsatNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuhsatNumarasi(String value) {
        this.ruhsatNumarasi = value;
    }

    /**
     * Gets the value of the ruhsatTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuhsatTarihi() {
        return ruhsatTarihi;
    }

    /**
     * Sets the value of the ruhsatTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuhsatTarihi(String value) {
        this.ruhsatTarihi = value;
    }

    /**
     * Gets the value of the onaylayan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnaylayan() {
        return onaylayan;
    }

    /**
     * Sets the value of the onaylayan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnaylayan(String value) {
        this.onaylayan = value;
    }

    /**
     * Gets the value of the sonGecerlilikTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonGecerlilikTarihi() {
        return sonGecerlilikTarihi;
    }

    /**
     * Sets the value of the sonGecerlilikTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonGecerlilikTarihi(String value) {
        this.sonGecerlilikTarihi = value;
    }

    /**
     * Gets the value of the durumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurumu() {
        return durumu;
    }

    /**
     * Sets the value of the durumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurumu(String value) {
        this.durumu = value;
    }

    /**
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAciklama(String value) {
        this.aciklama = value;
    }

    /**
     * Gets the value of the barkodluRuhsatBelgesiBarkodNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarkodluRuhsatBelgesiBarkodNo() {
        return barkodluRuhsatBelgesiBarkodNo;
    }

    /**
     * Sets the value of the barkodluRuhsatBelgesiBarkodNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarkodluRuhsatBelgesiBarkodNo(String value) {
        this.barkodluRuhsatBelgesiBarkodNo = value;
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
