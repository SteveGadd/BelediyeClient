
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for copToplamaBilgisiSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="copToplamaBilgisiSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="copToplamaBilgisiListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfCopToplamaBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copToplamaBilgisiSorgulaCType", propOrder = {
    "copToplamaBilgisiListesi"
})
public class CopToplamaBilgisiSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfCopToplamaBilgisi copToplamaBilgisiListesi;

    /**
     * Gets the value of the copToplamaBilgisiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCopToplamaBilgisi }
     *     
     */
    public ArrayOfCopToplamaBilgisi getCopToplamaBilgisiListesi() {
        return copToplamaBilgisiListesi;
    }

    /**
     * Sets the value of the copToplamaBilgisiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCopToplamaBilgisi }
     *     
     */
    public void setCopToplamaBilgisiListesi(ArrayOfCopToplamaBilgisi value) {
        this.copToplamaBilgisiListesi = value;
    }

}
