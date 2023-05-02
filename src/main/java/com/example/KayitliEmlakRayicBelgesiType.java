
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for kayitliEmlakRayicBelgesiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kayitliEmlakRayicBelgesiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}tasinmazBeyanBilgisiType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barkodNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="olusturulmaTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="belgeninVerilecegiKurum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kayitliEmlakRayicBelgesiType", propOrder = {
    "barkodNo",
    "olusturulmaTarihi",
    "belgeninVerilecegiKurum"
})
public class KayitliEmlakRayicBelgesiType
    extends TasinmazBeyanBilgisiType
{

    @XmlElement(required = true)
    protected String barkodNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar olusturulmaTarihi;
    @XmlElement(required = true)
    protected String belgeninVerilecegiKurum;

    /**
     * Gets the value of the barkodNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarkodNo() {
        return barkodNo;
    }

    /**
     * Sets the value of the barkodNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarkodNo(String value) {
        this.barkodNo = value;
    }

    /**
     * Gets the value of the olusturulmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOlusturulmaTarihi() {
        return olusturulmaTarihi;
    }

    /**
     * Sets the value of the olusturulmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOlusturulmaTarihi(XMLGregorianCalendar value) {
        this.olusturulmaTarihi = value;
    }

    /**
     * Gets the value of the belgeninVerilecegiKurum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelgeninVerilecegiKurum() {
        return belgeninVerilecegiKurum;
    }

    /**
     * Sets the value of the belgeninVerilecegiKurum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelgeninVerilecegiKurum(String value) {
        this.belgeninVerilecegiKurum = value;
    }

}
