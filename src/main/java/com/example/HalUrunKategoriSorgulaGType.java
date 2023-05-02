
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for halUrunKategoriSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="halUrunKategoriSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="halKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "halUrunKategoriSorgulaGType", propOrder = {
    "halKodu"
})
public class HalUrunKategoriSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String halKodu;

    /**
     * Gets the value of the halKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalKodu() {
        return halKodu;
    }

    /**
     * Sets the value of the halKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalKodu(String value) {
        this.halKodu = value;
    }

}
