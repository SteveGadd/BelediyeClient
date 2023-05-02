
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for egitimKursBasvuruRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursBasvuruRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}egitimKursBasvuruBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="egitimKursKategoriAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursYeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="egitimKursGunSaatBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sonKesinKayitTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="basvuruDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruDurumAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gerekliBelgeBilgileri" type="{http://belediye.turkiye.gov.tr/v3}gerekliBelgeBilgileriType"/&gt;
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
@XmlType(name = "egitimKursBasvuruRespType", propOrder = {
    "tcKimlikNo",
    "basvuruNumarasi",
    "basvuruTarihi",
    "egitimKursKategoriAdi",
    "egitimKursAdi",
    "egitimKursYeri",
    "egitimKursGunSaatBilgisi",
    "sonKesinKayitTarihi",
    "basvuruDurumu",
    "basvuruDurumAciklamasi",
    "gerekliBelgeBilgileri",
    "detayListesi"
})
public class EgitimKursBasvuruRespType
    extends EgitimKursBasvuruBaseType
{

    @XmlElement(required = true)
    protected String tcKimlikNo;
    @XmlElement(required = true)
    protected String basvuruNumarasi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar basvuruTarihi;
    @XmlElement(required = true)
    protected String egitimKursKategoriAdi;
    @XmlElement(required = true)
    protected String egitimKursAdi;
    @XmlElement(required = true)
    protected String egitimKursYeri;
    @XmlElement(required = true)
    protected String egitimKursGunSaatBilgisi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sonKesinKayitTarihi;
    @XmlElement(required = true)
    protected String basvuruDurumu;
    @XmlElement(required = true)
    protected String basvuruDurumAciklamasi;
    @XmlElement(required = true)
    protected GerekliBelgeBilgileriType gerekliBelgeBilgileri;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcKimlikNo(String value) {
        this.tcKimlikNo = value;
    }

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
     * Gets the value of the egitimKursKategoriAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursKategoriAdi() {
        return egitimKursKategoriAdi;
    }

    /**
     * Sets the value of the egitimKursKategoriAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursKategoriAdi(String value) {
        this.egitimKursKategoriAdi = value;
    }

    /**
     * Gets the value of the egitimKursAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursAdi() {
        return egitimKursAdi;
    }

    /**
     * Sets the value of the egitimKursAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursAdi(String value) {
        this.egitimKursAdi = value;
    }

    /**
     * Gets the value of the egitimKursYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursYeri() {
        return egitimKursYeri;
    }

    /**
     * Sets the value of the egitimKursYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursYeri(String value) {
        this.egitimKursYeri = value;
    }

    /**
     * Gets the value of the egitimKursGunSaatBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgitimKursGunSaatBilgisi() {
        return egitimKursGunSaatBilgisi;
    }

    /**
     * Sets the value of the egitimKursGunSaatBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgitimKursGunSaatBilgisi(String value) {
        this.egitimKursGunSaatBilgisi = value;
    }

    /**
     * Gets the value of the sonKesinKayitTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSonKesinKayitTarihi() {
        return sonKesinKayitTarihi;
    }

    /**
     * Sets the value of the sonKesinKayitTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSonKesinKayitTarihi(XMLGregorianCalendar value) {
        this.sonKesinKayitTarihi = value;
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
     * Gets the value of the basvuruDurumAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruDurumAciklamasi() {
        return basvuruDurumAciklamasi;
    }

    /**
     * Sets the value of the basvuruDurumAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruDurumAciklamasi(String value) {
        this.basvuruDurumAciklamasi = value;
    }

    /**
     * Gets the value of the gerekliBelgeBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link GerekliBelgeBilgileriType }
     *     
     */
    public GerekliBelgeBilgileriType getGerekliBelgeBilgileri() {
        return gerekliBelgeBilgileri;
    }

    /**
     * Sets the value of the gerekliBelgeBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link GerekliBelgeBilgileriType }
     *     
     */
    public void setGerekliBelgeBilgileri(GerekliBelgeBilgileriType value) {
        this.gerekliBelgeBilgileri = value;
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
