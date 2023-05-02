
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hayvanSahiplenmeBasvuruBilgileriSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hayvanSahiplenmeBasvuruBilgileriSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfHayvanSahiplenmeBasvuruBilgileri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hayvanSahiplenmeBasvuruBilgileriSorgulaCType", propOrder = {
    "basvuruListesi"
})
public class HayvanSahiplenmeBasvuruBilgileriSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfHayvanSahiplenmeBasvuruBilgileri basvuruListesi;

    /**
     * Gets the value of the basvuruListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHayvanSahiplenmeBasvuruBilgileri }
     *     
     */
    public ArrayOfHayvanSahiplenmeBasvuruBilgileri getBasvuruListesi() {
        return basvuruListesi;
    }

    /**
     * Sets the value of the basvuruListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHayvanSahiplenmeBasvuruBilgileri }
     *     
     */
    public void setBasvuruListesi(ArrayOfHayvanSahiplenmeBasvuruBilgileri value) {
        this.basvuruListesi = value;
    }

}
