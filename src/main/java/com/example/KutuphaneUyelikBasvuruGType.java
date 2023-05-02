
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneUyelikBasvuruGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikBasvuruGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruBilgileri" type="{http://belediye.turkiye.gov.tr/v3}kutuphaneUyelikBasvuruReqType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kutuphaneUyelikBasvuruGType", propOrder = {
    "basvuruBilgileri"
})
public class KutuphaneUyelikBasvuruGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected KutuphaneUyelikBasvuruReqType basvuruBilgileri;

    /**
     * Gets the value of the basvuruBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link KutuphaneUyelikBasvuruReqType }
     *     
     */
    public KutuphaneUyelikBasvuruReqType getBasvuruBilgileri() {
        return basvuruBilgileri;
    }

    /**
     * Sets the value of the basvuruBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link KutuphaneUyelikBasvuruReqType }
     *     
     */
    public void setBasvuruBilgileri(KutuphaneUyelikBasvuruReqType value) {
        this.basvuruBilgileri = value;
    }

}
