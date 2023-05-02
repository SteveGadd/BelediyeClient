
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tasinmazTapubilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tasinmazTapubilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TAKBISVerisimi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="paftaNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parsel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ciltNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sayfaNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="iktisapTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tasinmazTapubilgileriType", propOrder = {
    "takbisVerisimi",
    "paftaNo",
    "ada",
    "parsel",
    "ciltNo",
    "sayfaNo",
    "iktisapTarihi"
})
public class TasinmazTapubilgileriType {

    @XmlElement(name = "TAKBISVerisimi")
    protected boolean takbisVerisimi;
    @XmlElement(required = true)
    protected String paftaNo;
    @XmlElement(required = true)
    protected String ada;
    @XmlElement(required = true)
    protected String parsel;
    @XmlElement(required = true)
    protected String ciltNo;
    @XmlElement(required = true)
    protected String sayfaNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar iktisapTarihi;

    /**
     * Gets the value of the takbisVerisimi property.
     * 
     */
    public boolean isTAKBISVerisimi() {
        return takbisVerisimi;
    }

    /**
     * Sets the value of the takbisVerisimi property.
     * 
     */
    public void setTAKBISVerisimi(boolean value) {
        this.takbisVerisimi = value;
    }

    /**
     * Gets the value of the paftaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaftaNo() {
        return paftaNo;
    }

    /**
     * Sets the value of the paftaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaftaNo(String value) {
        this.paftaNo = value;
    }

    /**
     * Gets the value of the ada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAda() {
        return ada;
    }

    /**
     * Sets the value of the ada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAda(String value) {
        this.ada = value;
    }

    /**
     * Gets the value of the parsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParsel() {
        return parsel;
    }

    /**
     * Sets the value of the parsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParsel(String value) {
        this.parsel = value;
    }

    /**
     * Gets the value of the ciltNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiltNo() {
        return ciltNo;
    }

    /**
     * Sets the value of the ciltNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiltNo(String value) {
        this.ciltNo = value;
    }

    /**
     * Gets the value of the sayfaNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSayfaNo() {
        return sayfaNo;
    }

    /**
     * Sets the value of the sayfaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSayfaNo(String value) {
        this.sayfaNo = value;
    }

    /**
     * Gets the value of the iktisapTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIktisapTarihi() {
        return iktisapTarihi;
    }

    /**
     * Sets the value of the iktisapTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIktisapTarihi(XMLGregorianCalendar value) {
        this.iktisapTarihi = value;
    }

}
