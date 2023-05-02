
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonimBorcSorgulama2GType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anonimBorcSorgulama2GType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sorguParametreTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sorguParametreListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfAnonimBorcParametreBilgisi"/&gt;
 *         &lt;element name="islemYapantcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anonimBorcSorgulama2GType", propOrder = {
    "sorguParametreTuru",
    "sorguParametreListesi",
    "islemYapantcKimlikNo"
})
public class AnonimBorcSorgulama2GType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String sorguParametreTuru;
    @XmlElement(required = true)
    protected ArrayOfAnonimBorcParametreBilgisi sorguParametreListesi;
    @XmlElement(required = true)
    protected String islemYapantcKimlikNo;

    /**
     * Gets the value of the sorguParametreTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorguParametreTuru() {
        return sorguParametreTuru;
    }

    /**
     * Sets the value of the sorguParametreTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorguParametreTuru(String value) {
        this.sorguParametreTuru = value;
    }

    /**
     * Gets the value of the sorguParametreListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnonimBorcParametreBilgisi }
     *     
     */
    public ArrayOfAnonimBorcParametreBilgisi getSorguParametreListesi() {
        return sorguParametreListesi;
    }

    /**
     * Sets the value of the sorguParametreListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnonimBorcParametreBilgisi }
     *     
     */
    public void setSorguParametreListesi(ArrayOfAnonimBorcParametreBilgisi value) {
        this.sorguParametreListesi = value;
    }

    /**
     * Gets the value of the islemYapantcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemYapantcKimlikNo() {
        return islemYapantcKimlikNo;
    }

    /**
     * Sets the value of the islemYapantcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemYapantcKimlikNo(String value) {
        this.islemYapantcKimlikNo = value;
    }

}
