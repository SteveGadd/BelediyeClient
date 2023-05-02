
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for evrakSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="evrakSorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="evrakYil" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="evrakNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evrakSorgulamaGType", propOrder = {
    "evrakYil",
    "evrakNo"
})
public class EvrakSorgulamaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String evrakYil;
    @XmlElement(required = true)
    protected String evrakNo;

    /**
     * Gets the value of the evrakYil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvrakYil() {
        return evrakYil;
    }

    /**
     * Sets the value of the evrakYil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvrakYil(String value) {
        this.evrakYil = value;
    }

    /**
     * Gets the value of the evrakNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvrakNo() {
        return evrakNo;
    }

    /**
     * Sets the value of the evrakNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvrakNo(String value) {
        this.evrakNo = value;
    }

}
