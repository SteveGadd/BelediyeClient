
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ruhsatBasvuruSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ruhsatBasvuruSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruhsatBasvuruListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfRuhsatBasvuruBilgi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ruhsatBasvuruSorgulamaCType", propOrder = {
    "ruhsatBasvuruListesi"
})
public class RuhsatBasvuruSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfRuhsatBasvuruBilgi ruhsatBasvuruListesi;

    /**
     * Gets the value of the ruhsatBasvuruListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRuhsatBasvuruBilgi }
     *     
     */
    public ArrayOfRuhsatBasvuruBilgi getRuhsatBasvuruListesi() {
        return ruhsatBasvuruListesi;
    }

    /**
     * Sets the value of the ruhsatBasvuruListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRuhsatBasvuruBilgi }
     *     
     */
    public void setRuhsatBasvuruListesi(ArrayOfRuhsatBasvuruBilgi value) {
        this.ruhsatBasvuruListesi = value;
    }

}
