
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sosyalYardimOnBasvuruGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sosyalYardimOnBasvuruGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruBilgileri" type="{http://belediye.turkiye.gov.tr/v3}sosyalYardimOnBasvuruReqType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sosyalYardimOnBasvuruGType", propOrder = {
    "basvuruBilgileri"
})
public class SosyalYardimOnBasvuruGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected SosyalYardimOnBasvuruReqType basvuruBilgileri;

    /**
     * Gets the value of the basvuruBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link SosyalYardimOnBasvuruReqType }
     *     
     */
    public SosyalYardimOnBasvuruReqType getBasvuruBilgileri() {
        return basvuruBilgileri;
    }

    /**
     * Sets the value of the basvuruBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link SosyalYardimOnBasvuruReqType }
     *     
     */
    public void setBasvuruBilgileri(SosyalYardimOnBasvuruReqType value) {
        this.basvuruBilgileri = value;
    }

}
