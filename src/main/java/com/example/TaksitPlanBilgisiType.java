
package com.example;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for taksitPlanBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taksitPlanBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taksitNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sonOdemeTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="tutar" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taksitPlanBilgisiType", propOrder = {
    "taksitNo",
    "sonOdemeTarihi",
    "tutar"
})
public class TaksitPlanBilgisiType {

    @XmlElement(required = true)
    protected String taksitNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sonOdemeTarihi;
    @XmlElement(required = true)
    protected BigDecimal tutar;

    /**
     * Gets the value of the taksitNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaksitNo() {
        return taksitNo;
    }

    /**
     * Sets the value of the taksitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaksitNo(String value) {
        this.taksitNo = value;
    }

    /**
     * Gets the value of the sonOdemeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSonOdemeTarihi() {
        return sonOdemeTarihi;
    }

    /**
     * Sets the value of the sonOdemeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSonOdemeTarihi(XMLGregorianCalendar value) {
        this.sonOdemeTarihi = value;
    }

    /**
     * Gets the value of the tutar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTutar() {
        return tutar;
    }

    /**
     * Sets the value of the tutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTutar(BigDecimal value) {
        this.tutar = value;
    }

}
