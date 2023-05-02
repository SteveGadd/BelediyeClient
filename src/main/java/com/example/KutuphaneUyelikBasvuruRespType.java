
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for kutuphaneUyelikBasvuruRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikBasvuruRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kutuphaneUyelikBasvuruBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="kutuphaneAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kutuphaneKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruDurumAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "kutuphaneUyelikBasvuruRespType", propOrder = {
    "tcKimlikNo",
    "basvuruNumarasi",
    "basvuruTarihi",
    "kutuphaneAdi",
    "kutuphaneKodu",
    "basvuruDurumu",
    "basvuruDurumAciklamasi",
    "detayListesi"
})
public class KutuphaneUyelikBasvuruRespType
    extends KutuphaneUyelikBasvuruBaseType
{

    @XmlElement(required = true)
    protected String tcKimlikNo;
    @XmlElement(required = true)
    protected String basvuruNumarasi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar basvuruTarihi;
    @XmlElement(required = true)
    protected String kutuphaneAdi;
    @XmlElement(required = true)
    protected String kutuphaneKodu;
    @XmlElement(required = true)
    protected String basvuruDurumu;
    @XmlElement(required = true)
    protected String basvuruDurumAciklamasi;
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
     * Gets the value of the kutuphaneAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKutuphaneAdi() {
        return kutuphaneAdi;
    }

    /**
     * Sets the value of the kutuphaneAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKutuphaneAdi(String value) {
        this.kutuphaneAdi = value;
    }

    /**
     * Gets the value of the kutuphaneKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKutuphaneKodu() {
        return kutuphaneKodu;
    }

    /**
     * Sets the value of the kutuphaneKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKutuphaneKodu(String value) {
        this.kutuphaneKodu = value;
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
