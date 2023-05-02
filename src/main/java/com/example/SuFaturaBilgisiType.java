
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for suFaturaBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suFaturaBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aboneNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="donem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faturaNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faturaTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="sonOdemeTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="faturaDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="odemeTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="odemeYeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="m3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kiyasMiktari" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="cezaTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tenzilat" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="faturaTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "suFaturaBilgisiType", propOrder = {
    "aboneNo",
    "donem",
    "faturaNo",
    "adi",
    "soyadi",
    "faturaTarihi",
    "sonOdemeTarihi",
    "faturaDurumu",
    "odemeTarihi",
    "odemeYeri",
    "m3",
    "kiyasMiktari",
    "tutar",
    "cezaTutari",
    "tenzilat",
    "faturaTutari",
    "aciklama",
    "detayListesi"
})
public class SuFaturaBilgisiType {

    @XmlElement(required = true)
    protected String aboneNo;
    @XmlElement(required = true)
    protected String donem;
    @XmlElement(required = true)
    protected String faturaNo;
    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar faturaTarihi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sonOdemeTarihi;
    @XmlElement(required = true)
    protected String faturaDurumu;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar odemeTarihi;
    @XmlElement(required = true)
    protected String odemeYeri;
    @XmlElement(required = true)
    protected String m3;
    @XmlElement(required = true)
    protected BigDecimal kiyasMiktari;
    @XmlElement(required = true)
    protected BigDecimal tutar;
    @XmlElement(required = true)
    protected BigDecimal cezaTutari;
    @XmlElement(required = true)
    protected BigDecimal tenzilat;
    @XmlElement(required = true)
    protected BigDecimal faturaTutari;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the aboneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboneNo() {
        return aboneNo;
    }

    /**
     * Sets the value of the aboneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboneNo(String value) {
        this.aboneNo = value;
    }

    /**
     * Gets the value of the donem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonem() {
        return donem;
    }

    /**
     * Sets the value of the donem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonem(String value) {
        this.donem = value;
    }

    /**
     * Gets the value of the faturaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaturaNo() {
        return faturaNo;
    }

    /**
     * Sets the value of the faturaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaturaNo(String value) {
        this.faturaNo = value;
    }

    /**
     * Gets the value of the adi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdi() {
        return adi;
    }

    /**
     * Sets the value of the adi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdi(String value) {
        this.adi = value;
    }

    /**
     * Gets the value of the soyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyadi() {
        return soyadi;
    }

    /**
     * Sets the value of the soyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyadi(String value) {
        this.soyadi = value;
    }

    /**
     * Gets the value of the faturaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFaturaTarihi() {
        return faturaTarihi;
    }

    /**
     * Sets the value of the faturaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFaturaTarihi(XMLGregorianCalendar value) {
        this.faturaTarihi = value;
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
     * Gets the value of the faturaDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaturaDurumu() {
        return faturaDurumu;
    }

    /**
     * Sets the value of the faturaDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaturaDurumu(String value) {
        this.faturaDurumu = value;
    }

    /**
     * Gets the value of the odemeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOdemeTarihi() {
        return odemeTarihi;
    }

    /**
     * Sets the value of the odemeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOdemeTarihi(XMLGregorianCalendar value) {
        this.odemeTarihi = value;
    }

    /**
     * Gets the value of the odemeYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdemeYeri() {
        return odemeYeri;
    }

    /**
     * Sets the value of the odemeYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdemeYeri(String value) {
        this.odemeYeri = value;
    }

    /**
     * Gets the value of the m3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getM3() {
        return m3;
    }

    /**
     * Sets the value of the m3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setM3(String value) {
        this.m3 = value;
    }

    /**
     * Gets the value of the kiyasMiktari property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKiyasMiktari() {
        return kiyasMiktari;
    }

    /**
     * Sets the value of the kiyasMiktari property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKiyasMiktari(BigDecimal value) {
        this.kiyasMiktari = value;
    }

    /**
     * Gets the value of the tutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTutar() {
        return tutar;
    }

    /**
     * Sets the value of the tutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTutar(BigDecimal value) {
        this.tutar = value;
    }

    /**
     * Gets the value of the cezaTutari property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCezaTutari() {
        return cezaTutari;
    }

    /**
     * Sets the value of the cezaTutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCezaTutari(BigDecimal value) {
        this.cezaTutari = value;
    }

    /**
     * Gets the value of the tenzilat property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTenzilat() {
        return tenzilat;
    }

    /**
     * Sets the value of the tenzilat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTenzilat(BigDecimal value) {
        this.tenzilat = value;
    }

    /**
     * Gets the value of the faturaTutari property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFaturaTutari() {
        return faturaTutari;
    }

    /**
     * Sets the value of the faturaTutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFaturaTutari(BigDecimal value) {
        this.faturaTutari = value;
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
