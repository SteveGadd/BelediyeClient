
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adinaIslemYapilanIletisimBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adinaIslemYapilanIletisimBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adinaIslemYapilanAcikAdres" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adinaIslemYapilanNVIAdresNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adinaIslemYapilanePosta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adinaIslemYapilanTelefonListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfTelefonBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adinaIslemYapilanIletisimBilgileriType", propOrder = {
    "adinaIslemYapilanAcikAdres",
    "adinaIslemYapilanNVIAdresNo",
    "adinaIslemYapilanePosta",
    "adinaIslemYapilanTelefonListesi"
})
public class AdinaIslemYapilanIletisimBilgileriType {

    @XmlElement(required = true)
    protected String adinaIslemYapilanAcikAdres;
    @XmlElement(required = true)
    protected String adinaIslemYapilanNVIAdresNo;
    @XmlElement(required = true)
    protected String adinaIslemYapilanePosta;
    @XmlElement(required = true)
    protected ArrayOfTelefonBilgisi adinaIslemYapilanTelefonListesi;

    /**
     * Gets the value of the adinaIslemYapilanAcikAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdinaIslemYapilanAcikAdres() {
        return adinaIslemYapilanAcikAdres;
    }

    /**
     * Sets the value of the adinaIslemYapilanAcikAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdinaIslemYapilanAcikAdres(String value) {
        this.adinaIslemYapilanAcikAdres = value;
    }

    /**
     * Gets the value of the adinaIslemYapilanNVIAdresNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdinaIslemYapilanNVIAdresNo() {
        return adinaIslemYapilanNVIAdresNo;
    }

    /**
     * Sets the value of the adinaIslemYapilanNVIAdresNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdinaIslemYapilanNVIAdresNo(String value) {
        this.adinaIslemYapilanNVIAdresNo = value;
    }

    /**
     * Gets the value of the adinaIslemYapilanePosta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdinaIslemYapilanePosta() {
        return adinaIslemYapilanePosta;
    }

    /**
     * Sets the value of the adinaIslemYapilanePosta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdinaIslemYapilanePosta(String value) {
        this.adinaIslemYapilanePosta = value;
    }

    /**
     * Gets the value of the adinaIslemYapilanTelefonListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTelefonBilgisi }
     *     
     */
    public ArrayOfTelefonBilgisi getAdinaIslemYapilanTelefonListesi() {
        return adinaIslemYapilanTelefonListesi;
    }

    /**
     * Sets the value of the adinaIslemYapilanTelefonListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTelefonBilgisi }
     *     
     */
    public void setAdinaIslemYapilanTelefonListesi(ArrayOfTelefonBilgisi value) {
        this.adinaIslemYapilanTelefonListesi = value;
    }

}
