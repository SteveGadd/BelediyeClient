
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yapilandirmaTuruType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilandirmaTuruType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yapilandirmaTurKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yapilandirmaTurAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="onBasvuruMu" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="yapilandirmayaEsasTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="kapsamdakiBorcListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfYapilandirmaKapsamindakiBorcBilgisi" minOccurs="0"/&gt;
 *         &lt;element name="taksitSecenekleri" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTaksitSecenek"/&gt;
 *         &lt;element name="bilgilendirmeMetni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yapilandirmaTuruType", propOrder = {
    "yapilandirmaTurKodu",
    "yapilandirmaTurAdi",
    "onBasvuruMu",
    "yapilandirmayaEsasTutar",
    "kapsamdakiBorcListesi",
    "taksitSecenekleri",
    "bilgilendirmeMetni",
    "detayListesi"
})
public class YapilandirmaTuruType {

    @XmlElement(required = true)
    protected String yapilandirmaTurKodu;
    @XmlElement(required = true)
    protected String yapilandirmaTurAdi;
    protected boolean onBasvuruMu;
    @XmlElement(required = true)
    protected BigDecimal yapilandirmayaEsasTutar;
    protected ArrayOfYapilandirmaKapsamindakiBorcBilgisi kapsamdakiBorcListesi;
    @XmlElement(required = true)
    protected ArrayOfTaksitSecenek taksitSecenekleri;
    @XmlElement(required = true)
    protected String bilgilendirmeMetni;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the yapilandirmaTurKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYapilandirmaTurKodu() {
        return yapilandirmaTurKodu;
    }

    /**
     * Sets the value of the yapilandirmaTurKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYapilandirmaTurKodu(String value) {
        this.yapilandirmaTurKodu = value;
    }

    /**
     * Gets the value of the yapilandirmaTurAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYapilandirmaTurAdi() {
        return yapilandirmaTurAdi;
    }

    /**
     * Sets the value of the yapilandirmaTurAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYapilandirmaTurAdi(String value) {
        this.yapilandirmaTurAdi = value;
    }

    /**
     * Gets the value of the onBasvuruMu property.
     * 
     */
    public boolean isOnBasvuruMu() {
        return onBasvuruMu;
    }

    /**
     * Sets the value of the onBasvuruMu property.
     * 
     */
    public void setOnBasvuruMu(boolean value) {
        this.onBasvuruMu = value;
    }

    /**
     * Gets the value of the yapilandirmayaEsasTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYapilandirmayaEsasTutar() {
        return yapilandirmayaEsasTutar;
    }

    /**
     * Sets the value of the yapilandirmayaEsasTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYapilandirmayaEsasTutar(BigDecimal value) {
        this.yapilandirmayaEsasTutar = value;
    }

    /**
     * Gets the value of the kapsamdakiBorcListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfYapilandirmaKapsamindakiBorcBilgisi }
     *     
     */
    public ArrayOfYapilandirmaKapsamindakiBorcBilgisi getKapsamdakiBorcListesi() {
        return kapsamdakiBorcListesi;
    }

    /**
     * Sets the value of the kapsamdakiBorcListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfYapilandirmaKapsamindakiBorcBilgisi }
     *     
     */
    public void setKapsamdakiBorcListesi(ArrayOfYapilandirmaKapsamindakiBorcBilgisi value) {
        this.kapsamdakiBorcListesi = value;
    }

    /**
     * Gets the value of the taksitSecenekleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTaksitSecenek }
     *     
     */
    public ArrayOfTaksitSecenek getTaksitSecenekleri() {
        return taksitSecenekleri;
    }

    /**
     * Sets the value of the taksitSecenekleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTaksitSecenek }
     *     
     */
    public void setTaksitSecenekleri(ArrayOfTaksitSecenek value) {
        this.taksitSecenekleri = value;
    }

    /**
     * Gets the value of the bilgilendirmeMetni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilgilendirmeMetni() {
        return bilgilendirmeMetni;
    }

    /**
     * Sets the value of the bilgilendirmeMetni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilgilendirmeMetni(String value) {
        this.bilgilendirmeMetni = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetailType> getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailType }{@code >}
     *     
     */
    public void setDetayListesi(JAXBElement<ArrayOfDetailType> value) {
        this.detayListesi = value;
    }

}
