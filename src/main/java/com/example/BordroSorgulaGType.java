
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bordroSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bordroSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="donem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bordroSorgulaGType", propOrder = {
    "donem"
})
public class BordroSorgulaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String donem;

    /**
     * Gets the value of the donem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonem() {
        return donem;
    }

    /**
     * Sets the value of the donem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonem(String value) {
        this.donem = value;
    }

}
