
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ilanReklamYerSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilanReklamYerSorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ilanTurKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilanReklamYerSorgulamaGType", propOrder = {
    "ilanTurKodu"
})
public class IlanReklamYerSorgulamaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String ilanTurKodu;

    /**
     * Gets the value of the ilanTurKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlanTurKodu() {
        return ilanTurKodu;
    }

    /**
     * Sets the value of the ilanTurKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlanTurKodu(String value) {
        this.ilanTurKodu = value;
    }

}
