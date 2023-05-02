
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taksitSecenekType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taksitSecenekType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aylikTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="toplamTutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taksitSecenekType", propOrder = {
    "kod",
    "adi",
    "aylikTutar",
    "toplamTutar"
})
public class TaksitSecenekType {

    @XmlElement(name = "Kod", required = true)
    protected String kod;
    @XmlElement(name = "Adi", required = true)
    protected String adi;
    @XmlElement(required = true)
    protected BigDecimal aylikTutar;
    @XmlElement(required = true)
    protected BigDecimal toplamTutar;

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKod(String value) {
        this.kod = value;
    }

    /**
     * Gets the value of the adi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdi() {
        return adi;
    }

    /**
     * Sets the value of the adi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdi(String value) {
        this.adi = value;
    }

    /**
     * Gets the value of the aylikTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAylikTutar() {
        return aylikTutar;
    }

    /**
     * Sets the value of the aylikTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAylikTutar(BigDecimal value) {
        this.aylikTutar = value;
    }

    /**
     * Gets the value of the toplamTutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToplamTutar() {
        return toplamTutar;
    }

    /**
     * Sets the value of the toplamTutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToplamTutar(BigDecimal value) {
        this.toplamTutar = value;
    }

}
