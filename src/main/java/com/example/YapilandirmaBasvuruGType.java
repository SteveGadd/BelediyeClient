
package com.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yapilandirmaBasvuruGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilandirmaBasvuruGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yapilandirmaTurKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cepTelefonu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ePosta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="taksitSecenekKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yapilandirmaBasvuruGType", propOrder = {
    "yapilandirmaTurKodu",
    "cepTelefonu",
    "ePosta",
    "taksitSecenekKodu",
    "detayListesi"
})
public class YapilandirmaBasvuruGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String yapilandirmaTurKodu;
    @XmlElement(required = true)
    protected String cepTelefonu;
    @XmlElement(required = true)
    protected String ePosta;
    @XmlElement(required = true)
    protected String taksitSecenekKodu;
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
     * Gets the value of the cepTelefonu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepTelefonu() {
        return cepTelefonu;
    }

    /**
     * Sets the value of the cepTelefonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepTelefonu(String value) {
        this.cepTelefonu = value;
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
     * Gets the value of the taksitSecenekKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaksitSecenekKodu() {
        return taksitSecenekKodu;
    }

    /**
     * Sets the value of the taksitSecenekKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaksitSecenekKodu(String value) {
        this.taksitSecenekKodu = value;
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
