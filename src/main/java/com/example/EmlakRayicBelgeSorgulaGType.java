
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for emlakRayicBelgeSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emlakRayicBelgeSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "emlakRayicBelgeSorgulaGType", propOrder = {
    "beyanNo",
    "belgeninVerilecegiKurum"
})
public class EmlakRayicBelgeSorgulaGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String beyanNo;
    @XmlElement(required = true)
    protected String belgeninVerilecegiKurum;

    /**
     * Gets the value of the beyanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanNo() {
        return beyanNo;
    }

    /**
     * Sets the value of the beyanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanNo(String value) {
        this.beyanNo = value;
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
