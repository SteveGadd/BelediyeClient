
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for basvuruDetaySorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basvuruDetaySorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="aboneNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruTipi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilceAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mahalleAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sokakCaddeAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="disKapiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="icKapiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuranAcikAdres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
 *         &lt;element name="basvuruIstek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cevapSekli" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruSurecListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfEvrakSurecBilgisi"/&gt;
 *         &lt;element name="basvuruDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruCevapTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="basvuruCevapMetin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruNotListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBasvuruNotType"/&gt;
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
@XmlType(name = "basvuruDetaySorgulamaCType", propOrder = {
    "basvuruNumarasi",
    "basvuruTarihi",
    "aboneNo",
    "basvuruTipi",
    "ilceAdi",
    "mahalleAdi",
    "sokakCaddeAdi",
    "disKapiNo",
    "icKapiNo",
    "basvuranAcikAdres",
    "eposta",
    "telefonListesi",
    "basvuruIstek",
    "cevapSekli",
    "basvuruSurecListesi",
    "basvuruDurumu",
    "basvuruCevapTarihi",
    "basvuruCevapMetin",
    "basvuruNotListesi",
    "detayListesi"
})
public class BasvuruDetaySorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected String basvuruNumarasi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar basvuruTarihi;
    @XmlElement(required = true)
    protected String aboneNo;
    @XmlElement(required = true)
    protected String basvuruTipi;
    @XmlElement(required = true)
    protected String ilceAdi;
    @XmlElement(required = true)
    protected String mahalleAdi;
    @XmlElement(required = true)
    protected String sokakCaddeAdi;
    @XmlElement(required = true)
    protected String disKapiNo;
    @XmlElement(required = true)
    protected String icKapiNo;
    @XmlElement(required = true)
    protected String basvuranAcikAdres;
    @XmlElement(required = true)
    protected String eposta;
    @XmlElement(required = true)
    protected ArrayOfTelefonBilgisi telefonListesi;
    @XmlElement(required = true)
    protected String basvuruIstek;
    @XmlElement(required = true)
    protected String cevapSekli;
    @XmlElement(required = true)
    protected ArrayOfEvrakSurecBilgisi basvuruSurecListesi;
    @XmlElement(required = true)
    protected String basvuruDurumu;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar basvuruCevapTarihi;
    @XmlElement(required = true)
    protected String basvuruCevapMetin;
    @XmlElement(required = true)
    protected ArrayOfBasvuruNotType basvuruNotListesi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the basvuruNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruNumarasi() {
        return basvuruNumarasi;
    }

    /**
     * Sets the value of the basvuruNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruNumarasi(String value) {
        this.basvuruNumarasi = value;
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
     * Gets the value of the basvuruTipi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruTipi() {
        return basvuruTipi;
    }

    /**
     * Sets the value of the basvuruTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruTipi(String value) {
        this.basvuruTipi = value;
    }

    /**
     * Gets the value of the ilceAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlceAdi() {
        return ilceAdi;
    }

    /**
     * Sets the value of the ilceAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlceAdi(String value) {
        this.ilceAdi = value;
    }

    /**
     * Gets the value of the mahalleAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMahalleAdi() {
        return mahalleAdi;
    }

    /**
     * Sets the value of the mahalleAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalleAdi(String value) {
        this.mahalleAdi = value;
    }

    /**
     * Gets the value of the sokakCaddeAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSokakCaddeAdi() {
        return sokakCaddeAdi;
    }

    /**
     * Sets the value of the sokakCaddeAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSokakCaddeAdi(String value) {
        this.sokakCaddeAdi = value;
    }

    /**
     * Gets the value of the disKapiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisKapiNo() {
        return disKapiNo;
    }

    /**
     * Sets the value of the disKapiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisKapiNo(String value) {
        this.disKapiNo = value;
    }

    /**
     * Gets the value of the icKapiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcKapiNo() {
        return icKapiNo;
    }

    /**
     * Sets the value of the icKapiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcKapiNo(String value) {
        this.icKapiNo = value;
    }

    /**
     * Gets the value of the basvuranAcikAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuranAcikAdres() {
        return basvuranAcikAdres;
    }

    /**
     * Sets the value of the basvuranAcikAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuranAcikAdres(String value) {
        this.basvuranAcikAdres = value;
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
     * Gets the value of the basvuruIstek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruIstek() {
        return basvuruIstek;
    }

    /**
     * Sets the value of the basvuruIstek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruIstek(String value) {
        this.basvuruIstek = value;
    }

    /**
     * Gets the value of the cevapSekli property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCevapSekli() {
        return cevapSekli;
    }

    /**
     * Sets the value of the cevapSekli property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCevapSekli(String value) {
        this.cevapSekli = value;
    }

    /**
     * Gets the value of the basvuruSurecListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEvrakSurecBilgisi }
     *     
     */
    public ArrayOfEvrakSurecBilgisi getBasvuruSurecListesi() {
        return basvuruSurecListesi;
    }

    /**
     * Sets the value of the basvuruSurecListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEvrakSurecBilgisi }
     *     
     */
    public void setBasvuruSurecListesi(ArrayOfEvrakSurecBilgisi value) {
        this.basvuruSurecListesi = value;
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
     * Gets the value of the basvuruCevapTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBasvuruCevapTarihi() {
        return basvuruCevapTarihi;
    }

    /**
     * Sets the value of the basvuruCevapTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBasvuruCevapTarihi(XMLGregorianCalendar value) {
        this.basvuruCevapTarihi = value;
    }

    /**
     * Gets the value of the basvuruCevapMetin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruCevapMetin() {
        return basvuruCevapMetin;
    }

    /**
     * Sets the value of the basvuruCevapMetin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruCevapMetin(String value) {
        this.basvuruCevapMetin = value;
    }

    /**
     * Gets the value of the basvuruNotListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBasvuruNotType }
     *     
     */
    public ArrayOfBasvuruNotType getBasvuruNotListesi() {
        return basvuruNotListesi;
    }

    /**
     * Sets the value of the basvuruNotListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBasvuruNotType }
     *     
     */
    public void setBasvuruNotListesi(ArrayOfBasvuruNotType value) {
        this.basvuruNotListesi = value;
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
