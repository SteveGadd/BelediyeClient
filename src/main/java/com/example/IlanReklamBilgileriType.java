
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ilanReklamBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilanReklamBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilanReklamTurKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilanReklamTurAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilanReklamYerKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilanReklamYerAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilanReklamYerAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilanReklamPlaka" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ilanReklamBaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ilanReklamBitisTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="adet" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="yuzsayisi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ebatEn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ebatBoy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilanReklamBilgileriType", propOrder = {
    "ilanReklamTurKodu",
    "ilanReklamTurAdi",
    "ilanReklamYerKodu",
    "ilanReklamYerAdi",
    "ilanReklamYerAciklamasi",
    "ilanReklamPlaka",
    "ilanReklamBaslangicTarihi",
    "ilanReklamBitisTarihi",
    "adet",
    "yuzsayisi",
    "ebatEn",
    "ebatBoy"
})
public class IlanReklamBilgileriType {

    @XmlElement(required = true)
    protected String ilanReklamTurKodu;
    @XmlElement(required = true)
    protected String ilanReklamTurAdi;
    @XmlElement(required = true)
    protected String ilanReklamYerKodu;
    @XmlElement(required = true)
    protected String ilanReklamYerAdi;
    @XmlElement(required = true)
    protected String ilanReklamYerAciklamasi;
    @XmlElement(required = true)
    protected String ilanReklamPlaka;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ilanReklamBaslangicTarihi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ilanReklamBitisTarihi;
    protected int adet;
    protected int yuzsayisi;
    protected int ebatEn;
    protected int ebatBoy;

    /**
     * Gets the value of the ilanReklamTurKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamTurKodu() {
        return ilanReklamTurKodu;
    }

    /**
     * Sets the value of the ilanReklamTurKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamTurKodu(String value) {
        this.ilanReklamTurKodu = value;
    }

    /**
     * Gets the value of the ilanReklamTurAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamTurAdi() {
        return ilanReklamTurAdi;
    }

    /**
     * Sets the value of the ilanReklamTurAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamTurAdi(String value) {
        this.ilanReklamTurAdi = value;
    }

    /**
     * Gets the value of the ilanReklamYerKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamYerKodu() {
        return ilanReklamYerKodu;
    }

    /**
     * Sets the value of the ilanReklamYerKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamYerKodu(String value) {
        this.ilanReklamYerKodu = value;
    }

    /**
     * Gets the value of the ilanReklamYerAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamYerAdi() {
        return ilanReklamYerAdi;
    }

    /**
     * Sets the value of the ilanReklamYerAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamYerAdi(String value) {
        this.ilanReklamYerAdi = value;
    }

    /**
     * Gets the value of the ilanReklamYerAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamYerAciklamasi() {
        return ilanReklamYerAciklamasi;
    }

    /**
     * Sets the value of the ilanReklamYerAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamYerAciklamasi(String value) {
        this.ilanReklamYerAciklamasi = value;
    }

    /**
     * Gets the value of the ilanReklamPlaka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanReklamPlaka() {
        return ilanReklamPlaka;
    }

    /**
     * Sets the value of the ilanReklamPlaka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanReklamPlaka(String value) {
        this.ilanReklamPlaka = value;
    }

    /**
     * Gets the value of the ilanReklamBaslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIlanReklamBaslangicTarihi() {
        return ilanReklamBaslangicTarihi;
    }

    /**
     * Sets the value of the ilanReklamBaslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIlanReklamBaslangicTarihi(XMLGregorianCalendar value) {
        this.ilanReklamBaslangicTarihi = value;
    }

    /**
     * Gets the value of the ilanReklamBitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIlanReklamBitisTarihi() {
        return ilanReklamBitisTarihi;
    }

    /**
     * Sets the value of the ilanReklamBitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIlanReklamBitisTarihi(XMLGregorianCalendar value) {
        this.ilanReklamBitisTarihi = value;
    }

    /**
     * Gets the value of the adet property.
     * 
     */
    public int getAdet() {
        return adet;
    }

    /**
     * Sets the value of the adet property.
     * 
     */
    public void setAdet(int value) {
        this.adet = value;
    }

    /**
     * Gets the value of the yuzsayisi property.
     * 
     */
    public int getYuzsayisi() {
        return yuzsayisi;
    }

    /**
     * Sets the value of the yuzsayisi property.
     * 
     */
    public void setYuzsayisi(int value) {
        this.yuzsayisi = value;
    }

    /**
     * Gets the value of the ebatEn property.
     * 
     */
    public int getEbatEn() {
        return ebatEn;
    }

    /**
     * Sets the value of the ebatEn property.
     * 
     */
    public void setEbatEn(int value) {
        this.ebatEn = value;
    }

    /**
     * Gets the value of the ebatBoy property.
     * 
     */
    public int getEbatBoy() {
        return ebatBoy;
    }

    /**
     * Sets the value of the ebatBoy property.
     * 
     */
    public void setEbatBoy(int value) {
        this.ebatBoy = value;
    }

}
