
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursBasvuruGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursBasvuruGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruBilgileri" type="{http://belediye.turkiye.gov.tr/v3}egitimKursBasvuruReqType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursBasvuruGType", propOrder = {
    "basvuruBilgileri"
})
public class EgitimKursBasvuruGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected EgitimKursBasvuruReqType basvuruBilgileri;

    /**
     * Gets the value of the basvuruBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link EgitimKursBasvuruReqType }
     *     
     */
    public EgitimKursBasvuruReqType getBasvuruBilgileri() {
        return basvuruBilgileri;
    }

    /**
     * Sets the value of the basvuruBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link EgitimKursBasvuruReqType }
     *     
     */
    public void setBasvuruBilgileri(EgitimKursBasvuruReqType value) {
        this.basvuruBilgileri = value;
    }

}
