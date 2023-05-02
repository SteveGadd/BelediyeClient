
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for makbuzIndirGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="makbuzIndirGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kimlik_VergiNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="makbuzNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "makbuzIndirGType", propOrder = {
    "kimlikVergiNo",
    "makbuzNo"
})
public class MakbuzIndirGType
    extends SorguParametreType
{

    @XmlElement(name = "kimlik_VergiNo", required = true)
    protected String kimlikVergiNo;
    @XmlElement(required = true)
    protected String makbuzNo;

    /**
     * Gets the value of the kimlikVergiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKimlikVergiNo() {
        return kimlikVergiNo;
    }

    /**
     * Sets the value of the kimlikVergiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKimlikVergiNo(String value) {
        this.kimlikVergiNo = value;
    }

    /**
     * Gets the value of the makbuzNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakbuzNo() {
        return makbuzNo;
    }

    /**
     * Sets the value of the makbuzNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakbuzNo(String value) {
        this.makbuzNo = value;
    }

}
