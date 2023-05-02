
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneUyelikDetaySorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikDetaySorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kutuphaneKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uyelikNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kutuphaneUyelikDetaySorgulamaGType", propOrder = {
    "kutuphaneKodu",
    "uyelikNumarasi"
})
public class KutuphaneUyelikDetaySorgulamaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String kutuphaneKodu;
    @XmlElement(required = true)
    protected String uyelikNumarasi;

    /**
     * Gets the value of the kutuphaneKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKutuphaneKodu() {
        return kutuphaneKodu;
    }

    /**
     * Sets the value of the kutuphaneKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKutuphaneKodu(String value) {
        this.kutuphaneKodu = value;
    }

    /**
     * Gets the value of the uyelikNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUyelikNumarasi() {
        return uyelikNumarasi;
    }

    /**
     * Sets the value of the uyelikNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUyelikNumarasi(String value) {
        this.uyelikNumarasi = value;
    }

}
