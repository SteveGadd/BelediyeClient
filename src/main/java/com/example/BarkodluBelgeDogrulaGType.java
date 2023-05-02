
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for barkodluBelgeDogrulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="barkodluBelgeDogrulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "barkodluBelgeDogrulaGType", propOrder = {
    "tcKimlikNo",
    "barkodNo"
})
public class BarkodluBelgeDogrulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String tcKimlikNo;
    @XmlElement(required = true)
    protected String barkodNo;

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcKimlikNo(String value) {
        this.tcKimlikNo = value;
    }

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
