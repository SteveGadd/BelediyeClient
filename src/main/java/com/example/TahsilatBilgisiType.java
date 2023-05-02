
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tahsilatBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tahsilatBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sicilNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adSoyadUnvan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tahsilatNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tahsilatTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tahakkukAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yilDonem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tahakkukTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="gecikmeZammi" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="tahsilatTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="makbuzBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dekontIndirilebilirMi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "tahsilatBilgisiType", propOrder = {
    "sicilNo",
    "adSoyadUnvan",
    "tahsilatNo",
    "tahsilatTarihi",
    "tahakkukAdi",
    "yilDonem",
    "tahakkukTutar",
    "gecikmeZammi",
    "tahsilatTutar",
    "makbuzBilgisi",
    "aciklama",
    "dekontIndirilebilirMi",
    "detayListesi"
})
public class TahsilatBilgisiType {

    @XmlElement(required = true)
    protected String sicilNo;
    @XmlElement(required = true)
    protected String adSoyadUnvan;
    @XmlElement(required = true)
    protected String tahsilatNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tahsilatTarihi;
    @XmlElement(required = true)
    protected String tahakkukAdi;
    @XmlElement(required = true)
    protected String yilDonem;
    @XmlElement(required = true)
    protected BigDecimal tahakkukTutar;
    @XmlElement(required = true)
    protected BigDecimal gecikmeZammi;
    @XmlElement(required = true)
    protected BigDecimal tahsilatTutar;
    @XmlElement(required = true)
    protected String makbuzBilgisi;
    @XmlElement(required = true)
    protected String aciklama;
    protected boolean dekontIndirilebilirMi;
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
     * Gets the value of the tahsilatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahsilatNo() {
        return tahsilatNo;
    }

    /**
     * Sets the value of the tahsilatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahsilatNo(String value) {
        this.tahsilatNo = value;
    }

    /**
     * Gets the value of the tahsilatTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTahsilatTarihi() {
        return tahsilatTarihi;
    }

    /**
     * Sets the value of the tahsilatTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTahsilatTarihi(XMLGregorianCalendar value) {
        this.tahsilatTarihi = value;
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
     * Gets the value of the tahsilatTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTahsilatTutar() {
        return tahsilatTutar;
    }

    /**
     * Sets the value of the tahsilatTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTahsilatTutar(BigDecimal value) {
        this.tahsilatTutar = value;
    }

    /**
     * Gets the value of the makbuzBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakbuzBilgisi() {
        return makbuzBilgisi;
    }

    /**
     * Sets the value of the makbuzBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakbuzBilgisi(String value) {
        this.makbuzBilgisi = value;
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
     * Gets the value of the dekontIndirilebilirMi property.
     * 
     */
    public boolean isDekontIndirilebilirMi() {
        return dekontIndirilebilirMi;
    }

    /**
     * Sets the value of the dekontIndirilebilirMi property.
     * 
     */
    public void setDekontIndirilebilirMi(boolean value) {
        this.dekontIndirilebilirMi = value;
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
