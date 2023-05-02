
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for evrakSurecBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evrakSurecBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atananBirim" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="atanmaTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="birimcevapTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="durumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evrakSurecBilgisi", propOrder = {
    "atananBirim",
    "atanmaTarihi",
    "birimcevapTarihi",
    "durumu",
    "aciklama"
})
public class EvrakSurecBilgisi {

    @XmlElement(required = true)
    protected String atananBirim;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar atanmaTarihi;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birimcevapTarihi;
    @XmlElement(required = true)
    protected String durumu;
    @XmlElement(required = true)
    protected String aciklama;

    /**
     * Gets the value of the atananBirim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtananBirim() {
        return atananBirim;
    }

    /**
     * Sets the value of the atananBirim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtananBirim(String value) {
        this.atananBirim = value;
    }

    /**
     * Gets the value of the atanmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAtanmaTarihi() {
        return atanmaTarihi;
    }

    /**
     * Sets the value of the atanmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAtanmaTarihi(XMLGregorianCalendar value) {
        this.atanmaTarihi = value;
    }

    /**
     * Gets the value of the birimcevapTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirimcevapTarihi() {
        return birimcevapTarihi;
    }

    /**
     * Sets the value of the birimcevapTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirimcevapTarihi(XMLGregorianCalendar value) {
        this.birimcevapTarihi = value;
    }

    /**
     * Gets the value of the durumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurumu() {
        return durumu;
    }

    /**
     * Sets the value of the durumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurumu(String value) {
        this.durumu = value;
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

}
