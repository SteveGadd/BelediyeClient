
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for egitimKursBasvuruBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursBasvuruBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dogumYeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dogumTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="calismaDurumu"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="OGRENCI"/&gt;
 *               &lt;enumeration value="CALISMIYOR"/&gt;
 *               &lt;enumeration value="KAMU_CALISANI"/&gt;
 *               &lt;enumeration value="OZEL_SEKTOR_CALISANI"/&gt;
 *               &lt;enumeration value="KENDI_ISINDE_CALISAN"/&gt;
 *               &lt;enumeration value="EMEKLI"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sonMezuniyetDurumu"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="OKURYAZAR_DEGIL"/&gt;
 *               &lt;enumeration value="OKURYAZAR"/&gt;
 *               &lt;enumeration value="ILKOKUL"/&gt;
 *               &lt;enumeration value="ORTAOKUL"/&gt;
 *               &lt;enumeration value="LISE"/&gt;
 *               &lt;enumeration value="ONLISANS"/&gt;
 *               &lt;enumeration value="LISANS"/&gt;
 *               &lt;enumeration value="YUKSEKLISANS"/&gt;
 *               &lt;enumeration value="DOKTORA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="devamEdenOgrencilikDurumu"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="OGRENCI_DEGIL"/&gt;
 *               &lt;enumeration value="ILKOKUL"/&gt;
 *               &lt;enumeration value="ORTAOKUL"/&gt;
 *               &lt;enumeration value="LISE"/&gt;
 *               &lt;enumeration value="ONLISANS"/&gt;
 *               &lt;enumeration value="LISANS"/&gt;
 *               &lt;enumeration value="YUKSEKLISANS"/&gt;
 *               &lt;enumeration value="DOKTORA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gsmNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ePosta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ikametAdresi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursBasvuruBaseType", propOrder = {
    "adi",
    "soyadi",
    "dogumYeri",
    "dogumTarihi",
    "calismaDurumu",
    "sonMezuniyetDurumu",
    "devamEdenOgrencilikDurumu",
    "gsmNo",
    "ePosta",
    "ikametAdresi"
})
@XmlSeeAlso({
    EgitimKursBasvuruRespType.class,
    EgitimKursBasvuruReqType.class
})
public class EgitimKursBasvuruBaseType {

    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    @XmlElement(required = true)
    protected String dogumYeri;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dogumTarihi;
    @XmlElement(required = true)
    protected String calismaDurumu;
    @XmlElement(required = true)
    protected String sonMezuniyetDurumu;
    @XmlElement(required = true)
    protected String devamEdenOgrencilikDurumu;
    @XmlElement(required = true)
    protected String gsmNo;
    @XmlElement(required = true)
    protected String ePosta;
    @XmlElement(required = true)
    protected String ikametAdresi;

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
     * Gets the value of the dogumYeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogumYeri() {
        return dogumYeri;
    }

    /**
     * Sets the value of the dogumYeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogumYeri(String value) {
        this.dogumYeri = value;
    }

    /**
     * Gets the value of the dogumTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDogumTarihi() {
        return dogumTarihi;
    }

    /**
     * Sets the value of the dogumTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDogumTarihi(XMLGregorianCalendar value) {
        this.dogumTarihi = value;
    }

    /**
     * Gets the value of the calismaDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalismaDurumu() {
        return calismaDurumu;
    }

    /**
     * Sets the value of the calismaDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalismaDurumu(String value) {
        this.calismaDurumu = value;
    }

    /**
     * Gets the value of the sonMezuniyetDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonMezuniyetDurumu() {
        return sonMezuniyetDurumu;
    }

    /**
     * Sets the value of the sonMezuniyetDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonMezuniyetDurumu(String value) {
        this.sonMezuniyetDurumu = value;
    }

    /**
     * Gets the value of the devamEdenOgrencilikDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevamEdenOgrencilikDurumu() {
        return devamEdenOgrencilikDurumu;
    }

    /**
     * Sets the value of the devamEdenOgrencilikDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevamEdenOgrencilikDurumu(String value) {
        this.devamEdenOgrencilikDurumu = value;
    }

    /**
     * Gets the value of the gsmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGsmNo() {
        return gsmNo;
    }

    /**
     * Sets the value of the gsmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGsmNo(String value) {
        this.gsmNo = value;
    }

    /**
     * Gets the value of the ePosta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEPosta() {
        return ePosta;
    }

    /**
     * Sets the value of the ePosta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEPosta(String value) {
        this.ePosta = value;
    }

    /**
     * Gets the value of the ikametAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIkametAdresi() {
        return ikametAdresi;
    }

    /**
     * Sets the value of the ikametAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIkametAdresi(String value) {
        this.ikametAdresi = value;
    }

}
