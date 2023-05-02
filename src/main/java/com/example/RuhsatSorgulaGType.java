
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ruhsatSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ruhsatSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruhsatTuruKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruhsatSorgulaGType", propOrder = {
    "ruhsatTuruKodu"
})
public class RuhsatSorgulaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String ruhsatTuruKodu;

    /**
     * Gets the value of the ruhsatTuruKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuhsatTuruKodu() {
        return ruhsatTuruKodu;
    }

    /**
     * Sets the value of the ruhsatTuruKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuhsatTuruKodu(String value) {
        this.ruhsatTuruKodu = value;
    }

}
