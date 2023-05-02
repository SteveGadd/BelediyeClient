
package com.example;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arsaRayicBedelBilgisiGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arsaRayicBedelBilgisiGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yil" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="mahalleKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="caddeSokakKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arsaRayicBedelBilgisiGType", propOrder = {
    "yil",
    "mahalleKodu",
    "caddeSokakKodu"
})
public class ArsaRayicBedelBilgisiGType
    extends SorguParametreType
{

    @XmlElement(required = true, nillable = true)
    protected BigInteger yil;
    @XmlElement(required = true)
    protected String mahalleKodu;
    @XmlElement(required = true, nillable = true)
    protected String caddeSokakKodu;

    /**
     * Gets the value of the yil property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYil() {
        return yil;
    }

    /**
     * Sets the value of the yil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYil(BigInteger value) {
        this.yil = value;
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

}
