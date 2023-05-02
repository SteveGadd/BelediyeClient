
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hayvanSahiplenmeBasvuruBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hayvanSahiplenmeBasvuruBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gsmNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ePosta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iletisimAdresi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruHakkindaAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hayvanSahiplenmeBasvuruBaseType", propOrder = {
    "adi",
    "soyadi",
    "gsmNo",
    "ePosta",
    "iletisimAdresi",
    "basvuruHakkindaAciklama"
})
@XmlSeeAlso({
    HayvanSahiplenmeBasvuruRespType.class,
    HayvanSahiplenmeBasvuruReqType.class
})
public class HayvanSahiplenmeBasvuruBaseType {

    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    @XmlElement(required = true)
    protected String gsmNo;
    @XmlElement(required = true)
    protected String ePosta;
    @XmlElement(required = true)
    protected String iletisimAdresi;
    @XmlElement(required = true)
    protected String basvuruHakkindaAciklama;

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
     * Gets the value of the iletisimAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIletisimAdresi() {
        return iletisimAdresi;
    }

    /**
     * Sets the value of the iletisimAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIletisimAdresi(String value) {
        this.iletisimAdresi = value;
    }

    /**
     * Gets the value of the basvuruHakkindaAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruHakkindaAciklama() {
        return basvuruHakkindaAciklama;
    }

    /**
     * Sets the value of the basvuruHakkindaAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruHakkindaAciklama(String value) {
        this.basvuruHakkindaAciklama = value;
    }

}
