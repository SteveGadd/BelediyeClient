
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneUyelikBasvuruBilgileriSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikBasvuruBilgileriSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKutuphaneUyelikBasvuruBilgileri"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kutuphaneUyelikBasvuruBilgileriSorgulamaCType", propOrder = {
    "basvuruListesi"
})
public class KutuphaneUyelikBasvuruBilgileriSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfKutuphaneUyelikBasvuruBilgileri basvuruListesi;

    /**
     * Gets the value of the basvuruListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKutuphaneUyelikBasvuruBilgileri }
     *     
     */
    public ArrayOfKutuphaneUyelikBasvuruBilgileri getBasvuruListesi() {
        return basvuruListesi;
    }

    /**
     * Sets the value of the basvuruListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKutuphaneUyelikBasvuruBilgileri }
     *     
     */
    public void setBasvuruListesi(ArrayOfKutuphaneUyelikBasvuruBilgileri value) {
        this.basvuruListesi = value;
    }

}
