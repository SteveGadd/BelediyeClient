
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ihaleBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ihaleBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kurumAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ihaleKayitNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ihaleZamani" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ihaleKonusu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ihaleTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ihaleUsulu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ihaleDosyaURL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ihaleBilgisi", propOrder = {
    "kurumAdi",
    "ihaleKayitNo",
    "ihaleZamani",
    "ihaleKonusu",
    "ihaleTuru",
    "ihaleUsulu",
    "ihaleDosyaURL",
    "detayListesi"
})
public class IhaleBilgisi {

    @XmlElement(required = true)
    protected String kurumAdi;
    @XmlElement(required = true)
    protected String ihaleKayitNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ihaleZamani;
    @XmlElement(required = true)
    protected String ihaleKonusu;
    @XmlElement(required = true)
    protected String ihaleTuru;
    @XmlElement(required = true)
    protected String ihaleUsulu;
    @XmlElement(required = true)
    protected String ihaleDosyaURL;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the kurumAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKurumAdi() {
        return kurumAdi;
    }

    /**
     * Sets the value of the kurumAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKurumAdi(String value) {
        this.kurumAdi = value;
    }

    /**
     * Gets the value of the ihaleKayitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhaleKayitNo() {
        return ihaleKayitNo;
    }

    /**
     * Sets the value of the ihaleKayitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhaleKayitNo(String value) {
        this.ihaleKayitNo = value;
    }

    /**
     * Gets the value of the ihaleZamani property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIhaleZamani() {
        return ihaleZamani;
    }

    /**
     * Sets the value of the ihaleZamani property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIhaleZamani(XMLGregorianCalendar value) {
        this.ihaleZamani = value;
    }

    /**
     * Gets the value of the ihaleKonusu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhaleKonusu() {
        return ihaleKonusu;
    }

    /**
     * Sets the value of the ihaleKonusu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhaleKonusu(String value) {
        this.ihaleKonusu = value;
    }

    /**
     * Gets the value of the ihaleTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhaleTuru() {
        return ihaleTuru;
    }

    /**
     * Sets the value of the ihaleTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhaleTuru(String value) {
        this.ihaleTuru = value;
    }

    /**
     * Gets the value of the ihaleUsulu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhaleUsulu() {
        return ihaleUsulu;
    }

    /**
     * Sets the value of the ihaleUsulu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhaleUsulu(String value) {
        this.ihaleUsulu = value;
    }

    /**
     * Gets the value of the ihaleDosyaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIhaleDosyaURL() {
        return ihaleDosyaURL;
    }

    /**
     * Sets the value of the ihaleDosyaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIhaleDosyaURL(String value) {
        this.ihaleDosyaURL = value;
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
