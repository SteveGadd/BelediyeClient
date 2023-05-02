
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for kararSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kararSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kararTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="kararNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aramaMetni" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kararSorgulaGType", propOrder = {
    "kararTarihi",
    "kararNo",
    "aramaMetni"
})
public class KararSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar kararTarihi;
    @XmlElement(required = true)
    protected String kararNo;
    @XmlElement(required = true)
    protected String aramaMetni;

    /**
     * Gets the value of the kararTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKararTarihi() {
        return kararTarihi;
    }

    /**
     * Sets the value of the kararTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKararTarihi(XMLGregorianCalendar value) {
        this.kararTarihi = value;
    }

    /**
     * Gets the value of the kararNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKararNo() {
        return kararNo;
    }

    /**
     * Sets the value of the kararNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKararNo(String value) {
        this.kararNo = value;
    }

    /**
     * Gets the value of the aramaMetni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAramaMetni() {
        return aramaMetni;
    }

    /**
     * Sets the value of the aramaMetni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAramaMetni(String value) {
        this.aramaMetni = value;
    }

}
