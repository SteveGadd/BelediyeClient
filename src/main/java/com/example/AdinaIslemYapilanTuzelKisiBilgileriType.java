
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adinaIslemYapilanTuzelKisiBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adinaIslemYapilanTuzelKisiBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="islemYapanYetkiTur"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="MUNFERIDEN"/&gt;
 *               &lt;enumeration value="MUSTEREKEN"/&gt;
 *               &lt;enumeration value="HIZMETEYETKILI"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sicilNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unvan" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vergiDairesi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vergiNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adinaIslemYapilanTuzelKisiBilgileriType", propOrder = {
    "islemYapanYetkiTur",
    "sicilNumarasi",
    "unvan",
    "vergiDairesi",
    "vergiNumarasi"
})
public class AdinaIslemYapilanTuzelKisiBilgileriType {

    @XmlElement(required = true)
    protected String islemYapanYetkiTur;
    @XmlElement(required = true)
    protected String sicilNumarasi;
    @XmlElement(required = true)
    protected String unvan;
    @XmlElement(required = true)
    protected String vergiDairesi;
    @XmlElement(required = true)
    protected String vergiNumarasi;

    /**
     * Gets the value of the islemYapanYetkiTur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemYapanYetkiTur() {
        return islemYapanYetkiTur;
    }

    /**
     * Sets the value of the islemYapanYetkiTur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemYapanYetkiTur(String value) {
        this.islemYapanYetkiTur = value;
    }

    /**
     * Gets the value of the sicilNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicilNumarasi() {
        return sicilNumarasi;
    }

    /**
     * Sets the value of the sicilNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicilNumarasi(String value) {
        this.sicilNumarasi = value;
    }

    /**
     * Gets the value of the unvan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnvan() {
        return unvan;
    }

    /**
     * Sets the value of the unvan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnvan(String value) {
        this.unvan = value;
    }

    /**
     * Gets the value of the vergiDairesi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergiDairesi() {
        return vergiDairesi;
    }

    /**
     * Sets the value of the vergiDairesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergiDairesi(String value) {
        this.vergiDairesi = value;
    }

    /**
     * Gets the value of the vergiNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVergiNumarasi() {
        return vergiNumarasi;
    }

    /**
     * Sets the value of the vergiNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVergiNumarasi(String value) {
        this.vergiNumarasi = value;
    }

}
