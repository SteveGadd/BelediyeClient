
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for barkodluBelgeDogrulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="barkodluBelgeDogrulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belge" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="tcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="belgeOlusturulmaTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "barkodluBelgeDogrulaCType", propOrder = {
    "belge",
    "tcKimlikNo",
    "ad",
    "soyad",
    "belgeOlusturulmaTarihi"
})
public class BarkodluBelgeDogrulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected byte[] belge;
    @XmlElement(required = true)
    protected String tcKimlikNo;
    @XmlElement(required = true)
    protected String ad;
    @XmlElement(required = true)
    protected String soyad;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar belgeOlusturulmaTarihi;

    /**
     * Gets the value of the belge property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBelge() {
        return belge;
    }

    /**
     * Sets the value of the belge property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBelge(byte[] value) {
        this.belge = value;
    }

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcKimlikNo(String value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyad(String value) {
        this.soyad = value;
    }

    /**
     * Gets the value of the belgeOlusturulmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBelgeOlusturulmaTarihi() {
        return belgeOlusturulmaTarihi;
    }

    /**
     * Sets the value of the belgeOlusturulmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBelgeOlusturulmaTarihi(XMLGregorianCalendar value) {
        this.belgeOlusturulmaTarihi = value;
    }

}
