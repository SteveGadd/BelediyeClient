
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hizmetSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hizmetSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belediyeMudurlukKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hizmetSorgulaGType", propOrder = {
    "belediyeMudurlukKodu"
})
public class HizmetSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String belediyeMudurlukKodu;

    /**
     * Gets the value of the belediyeMudurlukKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelediyeMudurlukKodu() {
        return belediyeMudurlukKodu;
    }

    /**
     * Sets the value of the belediyeMudurlukKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelediyeMudurlukKodu(String value) {
        this.belediyeMudurlukKodu = value;
    }

}
