
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sosyalYardimOnBasvuruBilgileriSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sosyalYardimOnBasvuruBilgileriSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfSosyalYardimOnBasvuruBilgileri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sosyalYardimOnBasvuruBilgileriSorgulamaCType", propOrder = {
    "basvuruListesi"
})
public class SosyalYardimOnBasvuruBilgileriSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfSosyalYardimOnBasvuruBilgileri basvuruListesi;

    /**
     * Gets the value of the basvuruListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSosyalYardimOnBasvuruBilgileri }
     *     
     */
    public ArrayOfSosyalYardimOnBasvuruBilgileri getBasvuruListesi() {
        return basvuruListesi;
    }

    /**
     * Sets the value of the basvuruListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSosyalYardimOnBasvuruBilgileri }
     *     
     */
    public void setBasvuruListesi(ArrayOfSosyalYardimOnBasvuruBilgileri value) {
        this.basvuruListesi = value;
    }

}
