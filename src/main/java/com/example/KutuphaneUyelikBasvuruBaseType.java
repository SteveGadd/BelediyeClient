
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for kutuphaneUyelikBasvuruBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikBasvuruBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dogumYeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dogumTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="fotograf" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
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
@XmlType(name = "kutuphaneUyelikBasvuruBaseType", propOrder = {
    "adi",
    "soyadi",
    "dogumYeri",
    "dogumTarihi",
    "fotograf",
    "gsmNo",
    "ePosta",
    "ikametAdresi"
})
@XmlSeeAlso({
    KutuphaneUyelikBasvuruRespType.class,
    KutuphaneUyelikBasvuruReqType.class
})
public class KutuphaneUyelikBasvuruBaseType {

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
    protected byte[] fotograf;
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
     * Gets the value of the fotograf property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFotograf() {
        return fotograf;
    }

    /**
     * Sets the value of the fotograf property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFotograf(byte[] value) {
        this.fotograf = value;
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
