
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ruhsatSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ruhsatSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruhsatListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfRuhsatBilgi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruhsatSorgulamaCType", propOrder = {
    "ruhsatListesi"
})
public class RuhsatSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfRuhsatBilgi ruhsatListesi;

    /**
     * Gets the value of the ruhsatListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuhsatBilgi }
     *     
     */
    public ArrayOfRuhsatBilgi getRuhsatListesi() {
        return ruhsatListesi;
    }

    /**
     * Sets the value of the ruhsatListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuhsatBilgi }
     *     
     */
    public void setRuhsatListesi(ArrayOfRuhsatBilgi value) {
        this.ruhsatListesi = value;
    }

}
