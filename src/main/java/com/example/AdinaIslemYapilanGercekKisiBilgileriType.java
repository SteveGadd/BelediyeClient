
package com.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adinaIslemYapilanGercekKisiBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adinaIslemYapilanGercekKisiBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="islemYapanTur"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="KENDISI"/&gt;
 *               &lt;enumeration value="VELI"/&gt;
 *               &lt;enumeration value="VASI"/&gt;
 *               &lt;enumeration value="VEKIL"/&gt;
 *               &lt;enumeration value="VARIS"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="adinaIslemYapilanTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adinaIslemYapilanAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adinaIslemYapilanSoyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adinaIslemYapilanDogumTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adinaIslemYapilanGercekKisiBilgileriType", propOrder = {
    "islemYapanTur",
    "adinaIslemYapilanTCKimlikNo",
    "adinaIslemYapilanAdi",
    "adinaIslemYapilanSoyadi",
    "adinaIslemYapilanDogumTarihi"
})
public class AdinaIslemYapilanGercekKisiBilgileriType {

    @XmlElement(required = true)
    protected String islemYapanTur;
    @XmlElement(required = true)
    protected String adinaIslemYapilanTCKimlikNo;
    @XmlElement(required = true)
    protected String adinaIslemYapilanAdi;
    @XmlElement(required = true)
    protected String adinaIslemYapilanSoyadi;
    @XmlElementRef(name = "adinaIslemYapilanDogumTarihi", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adinaIslemYapilanDogumTarihi;

    /**
     * Gets the value of the islemYapanTur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemYapanTur() {
        return islemYapanTur;
    }

    /**
     * Sets the value of the islemYapanTur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemYapanTur(String value) {
        this.islemYapanTur = value;
    }

    /**
     * Gets the value of the adinaIslemYapilanTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdinaIslemYapilanTCKimlikNo() {
        return adinaIslemYapilanTCKimlikNo;
    }

    /**
     * Sets the value of the adinaIslemYapilanTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdinaIslemYapilanTCKimlikNo(String value) {
        this.adinaIslemYapilanTCKimlikNo = value;
    }

    /**
     * Gets the value of the adinaIslemYapilanAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdinaIslemYapilanAdi() {
        return adinaIslemYapilanAdi;
    }

    /**
     * Sets the value of the adinaIslemYapilanAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdinaIslemYapilanAdi(String value) {
        this.adinaIslemYapilanAdi = value;
    }

    /**
     * Gets the value of the adinaIslemYapilanSoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdinaIslemYapilanSoyadi() {
        return adinaIslemYapilanSoyadi;
    }

    /**
     * Sets the value of the adinaIslemYapilanSoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdinaIslemYapilanSoyadi(String value) {
        this.adinaIslemYapilanSoyadi = value;
    }

    /**
     * Gets the value of the adinaIslemYapilanDogumTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdinaIslemYapilanDogumTarihi() {
        return adinaIslemYapilanDogumTarihi;
    }

    /**
     * Sets the value of the adinaIslemYapilanDogumTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdinaIslemYapilanDogumTarihi(JAXBElement<String> value) {
        this.adinaIslemYapilanDogumTarihi = value;
    }

}
