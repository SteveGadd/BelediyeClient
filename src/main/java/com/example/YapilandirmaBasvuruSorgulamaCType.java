
package com.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yapilandirmaBasvuruSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilandirmaBasvuruSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yapilandirmaBasvuruListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfYapilandirmaBasvuruBilgileri"/&gt;
 *         &lt;element name="odemeKanallari" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "yapilandirmaBasvuruSorgulamaCType", propOrder = {
    "yapilandirmaBasvuruListesi",
    "odemeKanallari",
    "detayListesi"
})
public class YapilandirmaBasvuruSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfYapilandirmaBasvuruBilgileri yapilandirmaBasvuruListesi;
    @XmlElement(required = true)
    protected String odemeKanallari;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the yapilandirmaBasvuruListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfYapilandirmaBasvuruBilgileri }
     *     
     */
    public ArrayOfYapilandirmaBasvuruBilgileri getYapilandirmaBasvuruListesi() {
        return yapilandirmaBasvuruListesi;
    }

    /**
     * Sets the value of the yapilandirmaBasvuruListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfYapilandirmaBasvuruBilgileri }
     *     
     */
    public void setYapilandirmaBasvuruListesi(ArrayOfYapilandirmaBasvuruBilgileri value) {
        this.yapilandirmaBasvuruListesi = value;
    }

    /**
     * Gets the value of the odemeKanallari property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdemeKanallari() {
        return odemeKanallari;
    }

    /**
     * Sets the value of the odemeKanallari property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdemeKanallari(String value) {
        this.odemeKanallari = value;
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
