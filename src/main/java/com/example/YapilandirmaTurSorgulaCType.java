
package com.example;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for yapilandirmaTurSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="yapilandirmaTurSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="yapilandirmaTurListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfYapilandirmaTuru"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "yapilandirmaTurSorgulaCType", propOrder = {
    "yapilandirmaTurListesi",
    "detayListesi"
})
public class YapilandirmaTurSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfYapilandirmaTuru yapilandirmaTurListesi;
    @XmlElementRef(name = "detayListesi", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDetailType> detayListesi;

    /**
     * Gets the value of the yapilandirmaTurListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfYapilandirmaTuru }
     *     
     */
    public ArrayOfYapilandirmaTuru getYapilandirmaTurListesi() {
        return yapilandirmaTurListesi;
    }

    /**
     * Sets the value of the yapilandirmaTurListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfYapilandirmaTuru }
     *     
     */
    public void setYapilandirmaTurListesi(ArrayOfYapilandirmaTuru value) {
        this.yapilandirmaTurListesi = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailType }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDetailType> getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDetailType }{@code >}
     *     
     */
    public void setDetayListesi(JAXBElement<ArrayOfDetailType> value) {
        this.detayListesi = value;
    }

}
