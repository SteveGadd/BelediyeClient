
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for borcBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="borcBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sicilNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tahakkukNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="odemeyeEsasNumara" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adSoyadUnvan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adresBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tahakkukTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tahakkukAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yilDonem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tahakkukTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="gecikmeZammi" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="toplamTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="odenenTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="odenecekTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="sonOdemeTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tahakkukDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bagliBorcOdemeyeEsasNumara" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "borcBilgileriType", propOrder = {
    "sicilNo",
    "tahakkukNo",
    "odemeyeEsasNumara",
    "adSoyadUnvan",
    "adresBilgisi",
    "tahakkukTarihi",
    "tahakkukAdi",
    "yilDonem",
    "tahakkukTutar",
    "gecikmeZammi",
    "toplamTutar",
    "odenenTutar",
    "odenecekTutar",
    "sonOdemeTarihi",
    "tahakkukDurumu",
    "bagliBorcOdemeyeEsasNumara",
    "aciklama",
    "detayListesi"
})
public class BorcBilgileriType {

    @XmlElement(required = true)
    protected String sicilNo;
    @XmlElement(required = true)
    protected String tahakkukNo;
    @XmlElement(required = true)
    protected String odemeyeEsasNumara;
    @XmlElement(required = true)
    protected String adSoyadUnvan;
    @XmlElement(required = true)
    protected String adresBilgisi;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tahakkukTarihi;
    @XmlElement(required = true)
    protected String tahakkukAdi;
    @XmlElement(required = true)
    protected String yilDonem;
    @XmlElement(required = true)
    protected BigDecimal tahakkukTutar;
    @XmlElement(required = true)
    protected BigDecimal gecikmeZammi;
    @XmlElement(required = true)
    protected BigDecimal toplamTutar;
    @XmlElement(required = true)
    protected BigDecimal odenenTutar;
    @XmlElement(required = true)
    protected BigDecimal odenecekTutar;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sonOdemeTarihi;
    @XmlElement(required = true)
    protected String tahakkukDurumu;
    @XmlElement(required = true)
    protected String bagliBorcOdemeyeEsasNumara;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the sicilNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicilNo() {
        return sicilNo;
    }

    /**
     * Sets the value of the sicilNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicilNo(String value) {
        this.sicilNo = value;
    }

    /**
     * Gets the value of the tahakkukNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahakkukNo() {
        return tahakkukNo;
    }

    /**
     * Sets the value of the tahakkukNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahakkukNo(String value) {
        this.tahakkukNo = value;
    }

    /**
     * Gets the value of the odemeyeEsasNumara property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdemeyeEsasNumara() {
        return odemeyeEsasNumara;
    }

    /**
     * Sets the value of the odemeyeEsasNumara property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdemeyeEsasNumara(String value) {
        this.odemeyeEsasNumara = value;
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
     * Gets the value of the adresBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresBilgisi() {
        return adresBilgisi;
    }

    /**
     * Sets the value of the adresBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresBilgisi(String value) {
        this.adresBilgisi = value;
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
     * Gets the value of the yilDonem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYilDonem() {
        return yilDonem;
    }

    /**
     * Sets the value of the yilDonem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYilDonem(String value) {
        this.yilDonem = value;
    }

    /**
     * Gets the value of the tahakkukTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTahakkukTutar() {
        return tahakkukTutar;
    }

    /**
     * Sets the value of the tahakkukTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTahakkukTutar(BigDecimal value) {
        this.tahakkukTutar = value;
    }

    /**
     * Gets the value of the gecikmeZammi property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGecikmeZammi() {
        return gecikmeZammi;
    }

    /**
     * Sets the value of the gecikmeZammi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGecikmeZammi(BigDecimal value) {
        this.gecikmeZammi = value;
    }

    /**
     * Gets the value of the toplamTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToplamTutar() {
        return toplamTutar;
    }

    /**
     * Sets the value of the toplamTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToplamTutar(BigDecimal value) {
        this.toplamTutar = value;
    }

    /**
     * Gets the value of the odenenTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOdenenTutar() {
        return odenenTutar;
    }

    /**
     * Sets the value of the odenenTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOdenenTutar(BigDecimal value) {
        this.odenenTutar = value;
    }

    /**
     * Gets the value of the odenecekTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOdenecekTutar() {
        return odenecekTutar;
    }

    /**
     * Sets the value of the odenecekTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOdenecekTutar(BigDecimal value) {
        this.odenecekTutar = value;
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
     * Gets the value of the tahakkukDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahakkukDurumu() {
        return tahakkukDurumu;
    }

    /**
     * Sets the value of the tahakkukDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahakkukDurumu(String value) {
        this.tahakkukDurumu = value;
    }

    /**
     * Gets the value of the bagliBorcOdemeyeEsasNumara property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagliBorcOdemeyeEsasNumara() {
        return bagliBorcOdemeyeEsasNumara;
    }

    /**
     * Sets the value of the bagliBorcOdemeyeEsasNumara property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagliBorcOdemeyeEsasNumara(String value) {
        this.bagliBorcOdemeyeEsasNumara = value;
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
