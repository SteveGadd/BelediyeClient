
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonimBorcParametreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anonimBorcParametreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sorguParametreKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sorguParametreValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anonimBorcParametreType", propOrder = {
    "sorguParametreKey",
    "sorguParametreValue"
})
public class AnonimBorcParametreType {

    @XmlElement(required = true)
    protected String sorguParametreKey;
    @XmlElement(required = true)
    protected String sorguParametreValue;

    /**
     * Gets the value of the sorguParametreKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorguParametreKey() {
        return sorguParametreKey;
    }

    /**
     * Sets the value of the sorguParametreKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorguParametreKey(String value) {
        this.sorguParametreKey = value;
    }

    /**
     * Gets the value of the sorguParametreValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorguParametreValue() {
        return sorguParametreValue;
    }

    /**
     * Sets the value of the sorguParametreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorguParametreValue(String value) {
        this.sorguParametreValue = value;
    }

}
