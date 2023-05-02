
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for basvuruNotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basvuruNotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="notSiraNumarasi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="notTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="notMetin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basvuruNotType", propOrder = {
    "notSiraNumarasi",
    "notTarihi",
    "notMetin"
})
public class BasvuruNotType {

    protected int notSiraNumarasi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar notTarihi;
    @XmlElement(required = true)
    protected String notMetin;

    /**
     * Gets the value of the notSiraNumarasi property.
     * 
     */
    public int getNotSiraNumarasi() {
        return notSiraNumarasi;
    }

    /**
     * Sets the value of the notSiraNumarasi property.
     * 
     */
    public void setNotSiraNumarasi(int value) {
        this.notSiraNumarasi = value;
    }

    /**
     * Gets the value of the notTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNotTarihi() {
        return notTarihi;
    }

    /**
     * Sets the value of the notTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotTarihi(XMLGregorianCalendar value) {
        this.notTarihi = value;
    }

    /**
     * Gets the value of the notMetin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotMetin() {
        return notMetin;
    }

    /**
     * Sets the value of the notMetin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotMetin(String value) {
        this.notMetin = value;
    }

}
