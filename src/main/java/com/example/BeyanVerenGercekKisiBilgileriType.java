
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beyanVerenGercekKisiBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beyanVerenGercekKisiBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanVerenKisiAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanVerenKisiSoyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telefonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
 *         &lt;element name="ePosta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanVerenSifat"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="KENDISI"/&gt;
 *               &lt;enumeration value="KANUNITEMSILCI"/&gt;
 *               &lt;enumeration value="VEKIL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beyanVerenGercekKisiBilgileriType", propOrder = {
    "beyanVerenKisiAdi",
    "beyanVerenKisiSoyadi",
    "telefonListesi",
    "ePosta",
    "beyanVerenSifat"
})
public class BeyanVerenGercekKisiBilgileriType {

    @XmlElement(required = true)
    protected String beyanVerenKisiAdi;
    @XmlElement(required = true)
    protected String beyanVerenKisiSoyadi;
    @XmlElement(required = true)
    protected ArrayOfTelefonBilgisi telefonListesi;
    @XmlElement(required = true)
    protected String ePosta;
    @XmlElement(required = true)
    protected String beyanVerenSifat;

    /**
     * Gets the value of the beyanVerenKisiAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanVerenKisiAdi() {
        return beyanVerenKisiAdi;
    }

    /**
     * Sets the value of the beyanVerenKisiAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanVerenKisiAdi(String value) {
        this.beyanVerenKisiAdi = value;
    }

    /**
     * Gets the value of the beyanVerenKisiSoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanVerenKisiSoyadi() {
        return beyanVerenKisiSoyadi;
    }

    /**
     * Sets the value of the beyanVerenKisiSoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanVerenKisiSoyadi(String value) {
        this.beyanVerenKisiSoyadi = value;
    }

    /**
     * Gets the value of the telefonListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTelefonBilgisi }
     *     
     */
    public ArrayOfTelefonBilgisi getTelefonListesi() {
        return telefonListesi;
    }

    /**
     * Sets the value of the telefonListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTelefonBilgisi }
     *     
     */
    public void setTelefonListesi(ArrayOfTelefonBilgisi value) {
        this.telefonListesi = value;
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
     * Gets the value of the beyanVerenSifat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanVerenSifat() {
        return beyanVerenSifat;
    }

    /**
     * Sets the value of the beyanVerenSifat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanVerenSifat(String value) {
        this.beyanVerenSifat = value;
    }

}
