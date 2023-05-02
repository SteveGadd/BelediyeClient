
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tasinmazBeyanBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tasinmazBeyanBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sicilNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faaliyetTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pafta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parsel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "tasinmazBeyanBilgisiType", propOrder = {
    "beyanNo",
    "sicilNo",
    "beyanTuru",
    "faaliyetTuru",
    "pafta",
    "ada",
    "parsel",
    "adres",
    "detayListesi"
})
@XmlSeeAlso({
    KayitliEmlakRayicBelgesiType.class
})
public class TasinmazBeyanBilgisiType {

    @XmlElement(required = true)
    protected String beyanNo;
    @XmlElement(required = true)
    protected String sicilNo;
    @XmlElement(required = true)
    protected String beyanTuru;
    @XmlElement(required = true)
    protected String faaliyetTuru;
    @XmlElement(required = true)
    protected String pafta;
    @XmlElement(required = true)
    protected String ada;
    @XmlElement(required = true)
    protected String parsel;
    @XmlElement(required = true)
    protected String adres;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the beyanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanNo() {
        return beyanNo;
    }

    /**
     * Sets the value of the beyanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanNo(String value) {
        this.beyanNo = value;
    }

    /**
     * Gets the value of the sicilNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicilNo() {
        return sicilNo;
    }

    /**
     * Sets the value of the sicilNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicilNo(String value) {
        this.sicilNo = value;
    }

    /**
     * Gets the value of the beyanTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanTuru() {
        return beyanTuru;
    }

    /**
     * Sets the value of the beyanTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanTuru(String value) {
        this.beyanTuru = value;
    }

    /**
     * Gets the value of the faaliyetTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaaliyetTuru() {
        return faaliyetTuru;
    }

    /**
     * Sets the value of the faaliyetTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaaliyetTuru(String value) {
        this.faaliyetTuru = value;
    }

    /**
     * Gets the value of the pafta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPafta() {
        return pafta;
    }

    /**
     * Sets the value of the pafta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPafta(String value) {
        this.pafta = value;
    }

    /**
     * Gets the value of the ada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAda() {
        return ada;
    }

    /**
     * Sets the value of the ada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAda(String value) {
        this.ada = value;
    }

    /**
     * Gets the value of the parsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParsel() {
        return parsel;
    }

    /**
     * Sets the value of the parsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParsel(String value) {
        this.parsel = value;
    }

    /**
     * Gets the value of the adres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdres() {
        return adres;
    }

    /**
     * Sets the value of the adres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdres(String value) {
        this.adres = value;
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
