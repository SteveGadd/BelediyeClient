
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonimBorcSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="anonimBorcSorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sorguParametreTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sorguParametresi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="islemYapantcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "anonimBorcSorgulamaGType", propOrder = {
    "sorguParametreTuru",
    "sorguParametresi",
    "islemYapantcKimlikNo"
})
public class AnonimBorcSorgulamaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String sorguParametreTuru;
    @XmlElement(required = true)
    protected String sorguParametresi;
    @XmlElement(required = true)
    protected String islemYapantcKimlikNo;

    /**
     * Gets the value of the sorguParametreTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorguParametreTuru() {
        return sorguParametreTuru;
    }

    /**
     * Sets the value of the sorguParametreTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorguParametreTuru(String value) {
        this.sorguParametreTuru = value;
    }

    /**
     * Gets the value of the sorguParametresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorguParametresi() {
        return sorguParametresi;
    }

    /**
     * Sets the value of the sorguParametresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorguParametresi(String value) {
        this.sorguParametresi = value;
    }

    /**
     * Gets the value of the islemYapantcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIslemYapantcKimlikNo() {
        return islemYapantcKimlikNo;
    }

    /**
     * Sets the value of the islemYapantcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIslemYapantcKimlikNo(String value) {
        this.islemYapantcKimlikNo = value;
    }

}
