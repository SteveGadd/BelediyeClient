
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for yapilandirmaBasvuruBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilandirmaBasvuruBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SicilNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yapilandirmaTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="yapilandirmayaEsasTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="yapilandirmaOdemeTercihi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taksitListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTaksitPlanBilgisi" minOccurs="0"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yapilandirmaBasvuruBilgileriType", propOrder = {
    "basvuruNo",
    "sicilNo",
    "yapilandirmaTuru",
    "basvuruTarihi",
    "yapilandirmayaEsasTutar",
    "yapilandirmaOdemeTercihi",
    "basvuruDurumu",
    "aciklama",
    "taksitListesi",
    "detayListesi"
})
public class YapilandirmaBasvuruBilgileriType {

    @XmlElement(required = true)
    protected String basvuruNo;
    @XmlElement(name = "SicilNo", required = true)
    protected String sicilNo;
    @XmlElement(required = true)
    protected String yapilandirmaTuru;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar basvuruTarihi;
    @XmlElement(required = true)
    protected BigDecimal yapilandirmayaEsasTutar;
    @XmlElement(required = true)
    protected String yapilandirmaOdemeTercihi;
    @XmlElement(required = true)
    protected String basvuruDurumu;
    @XmlElement(required = true)
    protected String aciklama;
    @XmlElementRef(name = "taksitListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTaksitPlanBilgisi> taksitListesi;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the basvuruNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruNo() {
        return basvuruNo;
    }

    /**
     * Sets the value of the basvuruNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruNo(String value) {
        this.basvuruNo = value;
    }

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
     * Gets the value of the yapilandirmaTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYapilandirmaTuru() {
        return yapilandirmaTuru;
    }

    /**
     * Sets the value of the yapilandirmaTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYapilandirmaTuru(String value) {
        this.yapilandirmaTuru = value;
    }

    /**
     * Gets the value of the basvuruTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBasvuruTarihi() {
        return basvuruTarihi;
    }

    /**
     * Sets the value of the basvuruTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBasvuruTarihi(XMLGregorianCalendar value) {
        this.basvuruTarihi = value;
    }

    /**
     * Gets the value of the yapilandirmayaEsasTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYapilandirmayaEsasTutar() {
        return yapilandirmayaEsasTutar;
    }

    /**
     * Sets the value of the yapilandirmayaEsasTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYapilandirmayaEsasTutar(BigDecimal value) {
        this.yapilandirmayaEsasTutar = value;
    }

    /**
     * Gets the value of the yapilandirmaOdemeTercihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYapilandirmaOdemeTercihi() {
        return yapilandirmaOdemeTercihi;
    }

    /**
     * Sets the value of the yapilandirmaOdemeTercihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYapilandirmaOdemeTercihi(String value) {
        this.yapilandirmaOdemeTercihi = value;
    }

    /**
     * Gets the value of the basvuruDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruDurumu() {
        return basvuruDurumu;
    }

    /**
     * Sets the value of the basvuruDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruDurumu(String value) {
        this.basvuruDurumu = value;
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
     * Gets the value of the taksitListesi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaksitPlanBilgisi }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTaksitPlanBilgisi> getTaksitListesi() {
        return taksitListesi;
    }

    /**
     * Sets the value of the taksitListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTaksitPlanBilgisi }{@code >}
     *     
     */
    public void setTaksitListesi(JAXBElement<ArrayOfTaksitPlanBilgisi> value) {
        this.taksitListesi = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetailType> getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailType }{@code >}
     *     
     */
    public void setDetayListesi(JAXBElement<ArrayOfDetailType> value) {
        this.detayListesi = value;
    }

}
