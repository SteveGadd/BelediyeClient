
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ozetBorcBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ozetBorcBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vadesiGecmisToplamBorcTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="toplamGecikmeZammiTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="vadesiGelmemisBorcTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="toplamBorcTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ozetBorcBilgileriType", propOrder = {
    "vadesiGecmisToplamBorcTutari",
    "toplamGecikmeZammiTutari",
    "vadesiGelmemisBorcTutari",
    "toplamBorcTutari"
})
public class OzetBorcBilgileriType {

    @XmlElement(required = true)
    protected BigDecimal vadesiGecmisToplamBorcTutari;
    @XmlElement(required = true)
    protected BigDecimal toplamGecikmeZammiTutari;
    @XmlElement(required = true)
    protected BigDecimal vadesiGelmemisBorcTutari;
    @XmlElement(required = true)
    protected BigDecimal toplamBorcTutari;

    /**
     * Gets the value of the vadesiGecmisToplamBorcTutari property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVadesiGecmisToplamBorcTutari() {
        return vadesiGecmisToplamBorcTutari;
    }

    /**
     * Sets the value of the vadesiGecmisToplamBorcTutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVadesiGecmisToplamBorcTutari(BigDecimal value) {
        this.vadesiGecmisToplamBorcTutari = value;
    }

    /**
     * Gets the value of the toplamGecikmeZammiTutari property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToplamGecikmeZammiTutari() {
        return toplamGecikmeZammiTutari;
    }

    /**
     * Sets the value of the toplamGecikmeZammiTutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToplamGecikmeZammiTutari(BigDecimal value) {
        this.toplamGecikmeZammiTutari = value;
    }

    /**
     * Gets the value of the vadesiGelmemisBorcTutari property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVadesiGelmemisBorcTutari() {
        return vadesiGelmemisBorcTutari;
    }

    /**
     * Sets the value of the vadesiGelmemisBorcTutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVadesiGelmemisBorcTutari(BigDecimal value) {
        this.vadesiGelmemisBorcTutari = value;
    }

    /**
     * Gets the value of the toplamBorcTutari property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToplamBorcTutari() {
        return toplamBorcTutari;
    }

    /**
     * Sets the value of the toplamBorcTutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToplamBorcTutari(BigDecimal value) {
        this.toplamBorcTutari = value;
    }

}
