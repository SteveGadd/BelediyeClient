
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for belediyeBilgilendirmeTurType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="belediyeBilgilendirmeTurType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bilgilendirmeTurKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bilgilendirmeTurAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bilgilendirmeAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "belediyeBilgilendirmeTurType", propOrder = {
    "bilgilendirmeTurKodu",
    "bilgilendirmeTurAdi",
    "bilgilendirmeAciklama"
})
public class BelediyeBilgilendirmeTurType {

    @XmlElement(required = true)
    protected String bilgilendirmeTurKodu;
    @XmlElement(required = true)
    protected String bilgilendirmeTurAdi;
    @XmlElement(required = true)
    protected String bilgilendirmeAciklama;

    /**
     * Gets the value of the bilgilendirmeTurKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilgilendirmeTurKodu() {
        return bilgilendirmeTurKodu;
    }

    /**
     * Sets the value of the bilgilendirmeTurKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilgilendirmeTurKodu(String value) {
        this.bilgilendirmeTurKodu = value;
    }

    /**
     * Gets the value of the bilgilendirmeTurAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilgilendirmeTurAdi() {
        return bilgilendirmeTurAdi;
    }

    /**
     * Sets the value of the bilgilendirmeTurAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilgilendirmeTurAdi(String value) {
        this.bilgilendirmeTurAdi = value;
    }

    /**
     * Gets the value of the bilgilendirmeAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilgilendirmeAciklama() {
        return bilgilendirmeAciklama;
    }

    /**
     * Sets the value of the bilgilendirmeAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilgilendirmeAciklama(String value) {
        this.bilgilendirmeAciklama = value;
    }

}
