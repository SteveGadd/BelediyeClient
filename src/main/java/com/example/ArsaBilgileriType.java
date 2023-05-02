
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arsaBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arsaBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arsaAlani" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="arsaPay" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="arsaPayda" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="araziCinsi"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="KIRAC"/&gt;
 *               &lt;enumeration value="TABAN"/&gt;
 *               &lt;enumeration value="SULAK"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arsaBilgileriType", propOrder = {
    "arsaAlani",
    "arsaPay",
    "arsaPayda",
    "araziCinsi"
})
public class ArsaBilgileriType {

    @XmlElement(required = true, nillable = true)
    protected BigDecimal arsaAlani;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal arsaPay;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal arsaPayda;
    @XmlElement(required = true, nillable = true)
    protected String araziCinsi;

    /**
     * Gets the value of the arsaAlani property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArsaAlani() {
        return arsaAlani;
    }

    /**
     * Sets the value of the arsaAlani property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArsaAlani(BigDecimal value) {
        this.arsaAlani = value;
    }

    /**
     * Gets the value of the arsaPay property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArsaPay() {
        return arsaPay;
    }

    /**
     * Sets the value of the arsaPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArsaPay(BigDecimal value) {
        this.arsaPay = value;
    }

    /**
     * Gets the value of the arsaPayda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArsaPayda() {
        return arsaPayda;
    }

    /**
     * Sets the value of the arsaPayda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArsaPayda(BigDecimal value) {
        this.arsaPayda = value;
    }

    /**
     * Gets the value of the araziCinsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAraziCinsi() {
        return araziCinsi;
    }

    /**
     * Sets the value of the araziCinsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAraziCinsi(String value) {
        this.araziCinsi = value;
    }

}
