
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sosyalYardimBasvuruSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sosyalYardimBasvuruSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sosyalYardimBasvuruListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfSosyalYardimBasvuruBilgi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sosyalYardimBasvuruSorgulamaCType", propOrder = {
    "sosyalYardimBasvuruListesi"
})
public class SosyalYardimBasvuruSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfSosyalYardimBasvuruBilgi sosyalYardimBasvuruListesi;

    /**
     * Gets the value of the sosyalYardimBasvuruListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSosyalYardimBasvuruBilgi }
     *     
     */
    public ArrayOfSosyalYardimBasvuruBilgi getSosyalYardimBasvuruListesi() {
        return sosyalYardimBasvuruListesi;
    }

    /**
     * Sets the value of the sosyalYardimBasvuruListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSosyalYardimBasvuruBilgi }
     *     
     */
    public void setSosyalYardimBasvuruListesi(ArrayOfSosyalYardimBasvuruBilgi value) {
        this.sosyalYardimBasvuruListesi = value;
    }

}
