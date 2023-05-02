
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mezarYeriSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mezarYeriSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mezarlikKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="meftaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="meftaSoyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="meftaBabaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="meftaAnaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mezarYeriSorgulaGType", propOrder = {
    "mezarlikKodu",
    "meftaAdi",
    "meftaSoyadi",
    "meftaBabaAdi",
    "meftaAnaAdi"
})
public class MezarYeriSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String mezarlikKodu;
    @XmlElement(required = true)
    protected String meftaAdi;
    @XmlElement(required = true)
    protected String meftaSoyadi;
    @XmlElement(required = true)
    protected String meftaBabaAdi;
    @XmlElement(required = true)
    protected String meftaAnaAdi;

    /**
     * Gets the value of the mezarlikKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMezarlikKodu() {
        return mezarlikKodu;
    }

    /**
     * Sets the value of the mezarlikKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMezarlikKodu(String value) {
        this.mezarlikKodu = value;
    }

    /**
     * Gets the value of the meftaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeftaAdi() {
        return meftaAdi;
    }

    /**
     * Sets the value of the meftaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeftaAdi(String value) {
        this.meftaAdi = value;
    }

    /**
     * Gets the value of the meftaSoyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeftaSoyadi() {
        return meftaSoyadi;
    }

    /**
     * Sets the value of the meftaSoyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeftaSoyadi(String value) {
        this.meftaSoyadi = value;
    }

    /**
     * Gets the value of the meftaBabaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeftaBabaAdi() {
        return meftaBabaAdi;
    }

    /**
     * Sets the value of the meftaBabaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeftaBabaAdi(String value) {
        this.meftaBabaAdi = value;
    }

    /**
     * Gets the value of the meftaAnaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeftaAnaAdi() {
        return meftaAnaAdi;
    }

    /**
     * Sets the value of the meftaAnaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeftaAnaAdi(String value) {
        this.meftaAnaAdi = value;
    }

}
