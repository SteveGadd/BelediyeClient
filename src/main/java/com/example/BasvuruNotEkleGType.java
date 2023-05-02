
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basvuruNotEkleGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basvuruNotEkleGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eklenecekNot" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basvuruNotEkleGType", propOrder = {
    "basvuruNo",
    "eklenecekNot"
})
public class BasvuruNotEkleGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String basvuruNo;
    @XmlElement(required = true)
    protected String eklenecekNot;

    /**
     * Gets the value of the basvuruNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruNo() {
        return basvuruNo;
    }

    /**
     * Sets the value of the basvuruNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruNo(String value) {
        this.basvuruNo = value;
    }

    /**
     * Gets the value of the eklenecekNot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEklenecekNot() {
        return eklenecekNot;
    }

    /**
     * Sets the value of the eklenecekNot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEklenecekNot(String value) {
        this.eklenecekNot = value;
    }

}
