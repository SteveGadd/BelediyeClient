
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for sicilBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sicilBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sicilNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="babaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="anaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dogumTarih" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="telefonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
 *         &lt;element name="adresListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfAdresBilgisi"/&gt;
 *         &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "sicilBilgisiType", propOrder = {
    "sicilNo",
    "adi",
    "soyadi",
    "babaAdi",
    "anaAdi",
    "dogumTarih",
    "telefonListesi",
    "adresListesi",
    "eposta",
    "aciklama",
    "detayListesi"
})
public class SicilBilgisiType {

    @XmlElement(required = true)
    protected String sicilNo;
    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    @XmlElement(required = true)
    protected String babaAdi;
    @XmlElement(required = true)
    protected String anaAdi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dogumTarih;
    @XmlElement(required = true)
    protected ArrayOfTelefonBilgisi telefonListesi;
    @XmlElement(required = true)
    protected ArrayOfAdresBilgisi adresListesi;
    @XmlElement(required = true)
    protected String eposta;
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
     * Gets the value of the babaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBabaAdi() {
        return babaAdi;
    }

    /**
     * Sets the value of the babaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBabaAdi(String value) {
        this.babaAdi = value;
    }

    /**
     * Gets the value of the anaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnaAdi() {
        return anaAdi;
    }

    /**
     * Sets the value of the anaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnaAdi(String value) {
        this.anaAdi = value;
    }

    /**
     * Gets the value of the dogumTarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDogumTarih() {
        return dogumTarih;
    }

    /**
     * Sets the value of the dogumTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDogumTarih(XMLGregorianCalendar value) {
        this.dogumTarih = value;
    }

    /**
     * Gets the value of the telefonListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTelefonBilgisi }
     *     
     */
    public ArrayOfTelefonBilgisi getTelefonListesi() {
        return telefonListesi;
    }

    /**
     * Sets the value of the telefonListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTelefonBilgisi }
     *     
     */
    public void setTelefonListesi(ArrayOfTelefonBilgisi value) {
        this.telefonListesi = value;
    }

    /**
     * Gets the value of the adresListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdresBilgisi }
     *     
     */
    public ArrayOfAdresBilgisi getAdresListesi() {
        return adresListesi;
    }

    /**
     * Sets the value of the adresListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdresBilgisi }
     *     
     */
    public void setAdresListesi(ArrayOfAdresBilgisi value) {
        this.adresListesi = value;
    }

    /**
     * Gets the value of the eposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEposta() {
        return eposta;
    }

    /**
     * Sets the value of the eposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEposta(String value) {
        this.eposta = value;
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
