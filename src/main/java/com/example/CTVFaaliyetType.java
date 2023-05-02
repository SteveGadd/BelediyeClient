
package com.example;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CTVFaaliyetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTVFaaliyetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anaFaaliyet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kullanimAmaciKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kullanimAmaciAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mukellefiyetTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="kullanimBaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="hissePay" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="hissePayda" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ekAlanDegeri" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTVFaaliyetType", propOrder = {
    "anaFaaliyet",
    "kullanimAmaciKodu",
    "kullanimAmaciAdi",
    "mukellefiyetTarihi",
    "kullanimBaslangicTarihi",
    "hissePay",
    "hissePayda",
    "ekAlanDegeri"
})
public class CTVFaaliyetType {

    @XmlElement(required = true)
    protected String anaFaaliyet;
    @XmlElement(required = true)
    protected String kullanimAmaciKodu;
    @XmlElement(required = true)
    protected String kullanimAmaciAdi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mukellefiyetTarihi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kullanimBaslangicTarihi;
    @XmlElement(required = true)
    protected BigInteger hissePay;
    @XmlElement(required = true)
    protected BigInteger hissePayda;
    @XmlElement(required = true)
    protected String ekAlanDegeri;

    /**
     * Gets the value of the anaFaaliyet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnaFaaliyet() {
        return anaFaaliyet;
    }

    /**
     * Sets the value of the anaFaaliyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnaFaaliyet(String value) {
        this.anaFaaliyet = value;
    }

    /**
     * Gets the value of the kullanimAmaciKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullanimAmaciKodu() {
        return kullanimAmaciKodu;
    }

    /**
     * Sets the value of the kullanimAmaciKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullanimAmaciKodu(String value) {
        this.kullanimAmaciKodu = value;
    }

    /**
     * Gets the value of the kullanimAmaciAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullanimAmaciAdi() {
        return kullanimAmaciAdi;
    }

    /**
     * Sets the value of the kullanimAmaciAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullanimAmaciAdi(String value) {
        this.kullanimAmaciAdi = value;
    }

    /**
     * Gets the value of the mukellefiyetTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMukellefiyetTarihi() {
        return mukellefiyetTarihi;
    }

    /**
     * Sets the value of the mukellefiyetTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMukellefiyetTarihi(XMLGregorianCalendar value) {
        this.mukellefiyetTarihi = value;
    }

    /**
     * Gets the value of the kullanimBaslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKullanimBaslangicTarihi() {
        return kullanimBaslangicTarihi;
    }

    /**
     * Sets the value of the kullanimBaslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKullanimBaslangicTarihi(XMLGregorianCalendar value) {
        this.kullanimBaslangicTarihi = value;
    }

    /**
     * Gets the value of the hissePay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHissePay() {
        return hissePay;
    }

    /**
     * Sets the value of the hissePay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHissePay(BigInteger value) {
        this.hissePay = value;
    }

    /**
     * Gets the value of the hissePayda property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHissePayda() {
        return hissePayda;
    }

    /**
     * Sets the value of the hissePayda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHissePayda(BigInteger value) {
        this.hissePayda = value;
    }

    /**
     * Gets the value of the ekAlanDegeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEkAlanDegeri() {
        return ekAlanDegeri;
    }

    /**
     * Sets the value of the ekAlanDegeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEkAlanDegeri(String value) {
        this.ekAlanDegeri = value;
    }

}
