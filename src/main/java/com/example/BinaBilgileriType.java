
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for binaBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="binaBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="binaMetreKare" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="binaPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="binaPayda" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="binaPayMetreKare" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="insaatBitimTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="insaatTuruKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insaatTuruAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insaatSinifiKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="insaatSinifiAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kullanimSekliKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kullanimSekliAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="asansorVarmi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="kaloriferVarmi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "binaBilgileriType", propOrder = {
    "binaMetreKare",
    "binaPay",
    "binaPayda",
    "binaPayMetreKare",
    "insaatBitimTarihi",
    "insaatTuruKodu",
    "insaatTuruAdi",
    "insaatSinifiKodu",
    "insaatSinifiAdi",
    "kullanimSekliKodu",
    "kullanimSekliAdi",
    "asansorVarmi",
    "kaloriferVarmi"
})
public class BinaBilgileriType {

    @XmlElement(required = true, nillable = true)
    protected BigDecimal binaMetreKare;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal binaPay;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal binaPayda;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal binaPayMetreKare;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar insaatBitimTarihi;
    @XmlElement(required = true)
    protected String insaatTuruKodu;
    @XmlElement(required = true)
    protected String insaatTuruAdi;
    @XmlElement(required = true)
    protected String insaatSinifiKodu;
    @XmlElement(required = true)
    protected String insaatSinifiAdi;
    @XmlElement(required = true)
    protected String kullanimSekliKodu;
    @XmlElement(required = true)
    protected String kullanimSekliAdi;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean asansorVarmi;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean kaloriferVarmi;

    /**
     * Gets the value of the binaMetreKare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBinaMetreKare() {
        return binaMetreKare;
    }

    /**
     * Sets the value of the binaMetreKare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBinaMetreKare(BigDecimal value) {
        this.binaMetreKare = value;
    }

    /**
     * Gets the value of the binaPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBinaPay() {
        return binaPay;
    }

    /**
     * Sets the value of the binaPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBinaPay(BigDecimal value) {
        this.binaPay = value;
    }

    /**
     * Gets the value of the binaPayda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBinaPayda() {
        return binaPayda;
    }

    /**
     * Sets the value of the binaPayda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBinaPayda(BigDecimal value) {
        this.binaPayda = value;
    }

    /**
     * Gets the value of the binaPayMetreKare property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBinaPayMetreKare() {
        return binaPayMetreKare;
    }

    /**
     * Sets the value of the binaPayMetreKare property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBinaPayMetreKare(BigDecimal value) {
        this.binaPayMetreKare = value;
    }

    /**
     * Gets the value of the insaatBitimTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInsaatBitimTarihi() {
        return insaatBitimTarihi;
    }

    /**
     * Sets the value of the insaatBitimTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInsaatBitimTarihi(XMLGregorianCalendar value) {
        this.insaatBitimTarihi = value;
    }

    /**
     * Gets the value of the insaatTuruKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatTuruKodu() {
        return insaatTuruKodu;
    }

    /**
     * Sets the value of the insaatTuruKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatTuruKodu(String value) {
        this.insaatTuruKodu = value;
    }

    /**
     * Gets the value of the insaatTuruAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatTuruAdi() {
        return insaatTuruAdi;
    }

    /**
     * Sets the value of the insaatTuruAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatTuruAdi(String value) {
        this.insaatTuruAdi = value;
    }

    /**
     * Gets the value of the insaatSinifiKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatSinifiKodu() {
        return insaatSinifiKodu;
    }

    /**
     * Sets the value of the insaatSinifiKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatSinifiKodu(String value) {
        this.insaatSinifiKodu = value;
    }

    /**
     * Gets the value of the insaatSinifiAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsaatSinifiAdi() {
        return insaatSinifiAdi;
    }

    /**
     * Sets the value of the insaatSinifiAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsaatSinifiAdi(String value) {
        this.insaatSinifiAdi = value;
    }

    /**
     * Gets the value of the kullanimSekliKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullanimSekliKodu() {
        return kullanimSekliKodu;
    }

    /**
     * Sets the value of the kullanimSekliKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullanimSekliKodu(String value) {
        this.kullanimSekliKodu = value;
    }

    /**
     * Gets the value of the kullanimSekliAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullanimSekliAdi() {
        return kullanimSekliAdi;
    }

    /**
     * Sets the value of the kullanimSekliAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullanimSekliAdi(String value) {
        this.kullanimSekliAdi = value;
    }

    /**
     * Gets the value of the asansorVarmi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsansorVarmi() {
        return asansorVarmi;
    }

    /**
     * Sets the value of the asansorVarmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsansorVarmi(Boolean value) {
        this.asansorVarmi = value;
    }

    /**
     * Gets the value of the kaloriferVarmi property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKaloriferVarmi() {
        return kaloriferVarmi;
    }

    /**
     * Sets the value of the kaloriferVarmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKaloriferVarmi(Boolean value) {
        this.kaloriferVarmi = value;
    }

}
