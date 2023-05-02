
package com.example;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tahsilatSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tahsilatSorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tahsilatYili" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tahsilatSorgulamaGType", propOrder = {
    "tahsilatYili"
})
public class TahsilatSorgulamaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected BigInteger tahsilatYili;

    /**
     * Gets the value of the tahsilatYili property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTahsilatYili() {
        return tahsilatYili;
    }

    /**
     * Sets the value of the tahsilatYili property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTahsilatYili(BigInteger value) {
        this.tahsilatYili = value;
    }

}
