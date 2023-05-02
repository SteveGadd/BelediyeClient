
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hayvanSahiplenmeBasvuruGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hayvanSahiplenmeBasvuruGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruBilgileri" type="{http://belediye.turkiye.gov.tr/v3}hayvanSahiplenmeBasvuruReqType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hayvanSahiplenmeBasvuruGType", propOrder = {
    "basvuruBilgileri"
})
public class HayvanSahiplenmeBasvuruGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected HayvanSahiplenmeBasvuruReqType basvuruBilgileri;

    /**
     * Gets the value of the basvuruBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link HayvanSahiplenmeBasvuruReqType }
     *     
     */
    public HayvanSahiplenmeBasvuruReqType getBasvuruBilgileri() {
        return basvuruBilgileri;
    }

    /**
     * Sets the value of the basvuruBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link HayvanSahiplenmeBasvuruReqType }
     *     
     */
    public void setBasvuruBilgileri(HayvanSahiplenmeBasvuruReqType value) {
        this.basvuruBilgileri = value;
    }

}
