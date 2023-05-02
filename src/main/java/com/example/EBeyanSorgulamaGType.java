
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eBeyanSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBeyanSorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanTuru"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="TUMU"/&gt;
 *               &lt;enumeration value="EMLAK"/&gt;
 *               &lt;enumeration value="CTV"/&gt;
 *               &lt;enumeration value="ILANREKLAM"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBeyanSorgulamaGType", propOrder = {
    "beyanTuru"
})
public class EBeyanSorgulamaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String beyanTuru;

    /**
     * Gets the value of the beyanTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanTuru() {
        return beyanTuru;
    }

    /**
     * Sets the value of the beyanTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanTuru(String value) {
        this.beyanTuru = value;
    }

}
