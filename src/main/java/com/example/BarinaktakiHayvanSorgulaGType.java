
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for barinaktakiHayvanSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="barinaktakiHayvanSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hayvanTurKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cinsIrkKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "barinaktakiHayvanSorgulaGType", propOrder = {
    "hayvanTurKodu",
    "cinsIrkKodu"
})
public class BarinaktakiHayvanSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String hayvanTurKodu;
    @XmlElement(required = true)
    protected String cinsIrkKodu;

    /**
     * Gets the value of the hayvanTurKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHayvanTurKodu() {
        return hayvanTurKodu;
    }

    /**
     * Sets the value of the hayvanTurKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHayvanTurKodu(String value) {
        this.hayvanTurKodu = value;
    }

    /**
     * Gets the value of the cinsIrkKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCinsIrkKodu() {
        return cinsIrkKodu;
    }

    /**
     * Sets the value of the cinsIrkKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCinsIrkKodu(String value) {
        this.cinsIrkKodu = value;
    }

}
