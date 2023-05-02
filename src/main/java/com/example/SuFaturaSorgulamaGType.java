
package com.example;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suFaturaSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="suFaturaSorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aboneNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yil" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suFaturaSorgulamaGType", propOrder = {
    "aboneNo",
    "yil"
})
public class SuFaturaSorgulamaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String aboneNo;
    @XmlElement(required = true)
    protected BigInteger yil;

    /**
     * Gets the value of the aboneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAboneNo() {
        return aboneNo;
    }

    /**
     * Sets the value of the aboneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAboneNo(String value) {
        this.aboneNo = value;
    }

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

}
