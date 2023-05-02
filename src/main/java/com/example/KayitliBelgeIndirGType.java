
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kayitliBelgeIndirGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kayitliBelgeIndirGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barkodNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kayitliBelgeIndirGType", propOrder = {
    "barkodNo"
})
public class KayitliBelgeIndirGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String barkodNo;

    /**
     * Gets the value of the barkodNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarkodNo() {
        return barkodNo;
    }

    /**
     * Sets the value of the barkodNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarkodNo(String value) {
        this.barkodNo = value;
    }

}
