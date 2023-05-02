
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ayarOkuGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ayarOkuGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ayar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ayarOkuGType", propOrder = {
    "ayar"
})
public class AyarOkuGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String ayar;

    /**
     * Gets the value of the ayar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAyar() {
        return ayar;
    }

    /**
     * Sets the value of the ayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAyar(String value) {
        this.ayar = value;
    }

}
