
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bordroDonemSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bordroDonemSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bordroDonemListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBordroDonemBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bordroDonemSorgulaCType", propOrder = {
    "bordroDonemListesi"
})
public class BordroDonemSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfBordroDonemBilgisi bordroDonemListesi;

    /**
     * Gets the value of the bordroDonemListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBordroDonemBilgisi }
     *     
     */
    public ArrayOfBordroDonemBilgisi getBordroDonemListesi() {
        return bordroDonemListesi;
    }

    /**
     * Sets the value of the bordroDonemListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBordroDonemBilgisi }
     *     
     */
    public void setBordroDonemListesi(ArrayOfBordroDonemBilgisi value) {
        this.bordroDonemListesi = value;
    }

}
