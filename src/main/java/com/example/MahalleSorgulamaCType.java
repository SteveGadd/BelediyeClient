
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mahalleSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mahalleSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mahalleListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfMahalleBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mahalleSorgulamaCType", propOrder = {
    "mahalleListesi"
})
public class MahalleSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfMahalleBilgisi mahalleListesi;

    /**
     * Gets the value of the mahalleListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMahalleBilgisi }
     *     
     */
    public ArrayOfMahalleBilgisi getMahalleListesi() {
        return mahalleListesi;
    }

    /**
     * Sets the value of the mahalleListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMahalleBilgisi }
     *     
     */
    public void setMahalleListesi(ArrayOfMahalleBilgisi value) {
        this.mahalleListesi = value;
    }

}
