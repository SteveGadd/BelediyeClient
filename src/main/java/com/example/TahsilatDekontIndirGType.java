
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tahsilatDekontIndirGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tahsilatDekontIndirGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tahsilatNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tahsilatDekontIndirGType", propOrder = {
    "tahsilatNo"
})
public class TahsilatDekontIndirGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String tahsilatNo;

    /**
     * Gets the value of the tahsilatNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTahsilatNo() {
        return tahsilatNo;
    }

    /**
     * Sets the value of the tahsilatNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTahsilatNo(String value) {
        this.tahsilatNo = value;
    }

}
