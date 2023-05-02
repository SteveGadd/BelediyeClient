
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basvuruyuTekrarAcGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basvuruyuTekrarAcGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acilmaNedeni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basvuruyuTekrarAcGType", propOrder = {
    "basvuruNo",
    "acilmaNedeni"
})
public class BasvuruyuTekrarAcGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String basvuruNo;
    @XmlElement(required = true)
    protected String acilmaNedeni;

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
     * Gets the value of the acilmaNedeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcilmaNedeni() {
        return acilmaNedeni;
    }

    /**
     * Sets the value of the acilmaNedeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcilmaNedeni(String value) {
        this.acilmaNedeni = value;
    }

}
