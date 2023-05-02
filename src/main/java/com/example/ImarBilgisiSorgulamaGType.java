
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imarBilgisiSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imarBilgisiSorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sorguTur"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ADRES"/&gt;
 *               &lt;enumeration value="ADAPARSEL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mahalleKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="caddeSokakKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kapiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parsel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imarBilgisiSorgulamaGType", propOrder = {
    "sorguTur",
    "mahalleKodu",
    "caddeSokakKodu",
    "kapiNo",
    "ada",
    "parsel"
})
public class ImarBilgisiSorgulamaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String sorguTur;
    @XmlElement(required = true)
    protected String mahalleKodu;
    @XmlElement(required = true)
    protected String caddeSokakKodu;
    @XmlElement(required = true)
    protected String kapiNo;
    @XmlElement(required = true)
    protected String ada;
    @XmlElement(required = true)
    protected String parsel;

    /**
     * Gets the value of the sorguTur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorguTur() {
        return sorguTur;
    }

    /**
     * Sets the value of the sorguTur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorguTur(String value) {
        this.sorguTur = value;
    }

    /**
     * Gets the value of the mahalleKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMahalleKodu() {
        return mahalleKodu;
    }

    /**
     * Sets the value of the mahalleKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalleKodu(String value) {
        this.mahalleKodu = value;
    }

    /**
     * Gets the value of the caddeSokakKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaddeSokakKodu() {
        return caddeSokakKodu;
    }

    /**
     * Sets the value of the caddeSokakKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaddeSokakKodu(String value) {
        this.caddeSokakKodu = value;
    }

    /**
     * Gets the value of the kapiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKapiNo() {
        return kapiNo;
    }

    /**
     * Sets the value of the kapiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKapiNo(String value) {
        this.kapiNo = value;
    }

    /**
     * Gets the value of the ada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAda() {
        return ada;
    }

    /**
     * Sets the value of the ada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAda(String value) {
        this.ada = value;
    }

    /**
     * Gets the value of the parsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParsel() {
        return parsel;
    }

    /**
     * Sets the value of the parsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParsel(String value) {
        this.parsel = value;
    }

}
