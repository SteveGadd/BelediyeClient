
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ucretTarifesiSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ucretTarifesiSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mudurlukUcretTarifesiListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfMudurlukUcretTarifesiType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucretTarifesiSorgulaCType", propOrder = {
    "mudurlukUcretTarifesiListesi"
})
public class UcretTarifesiSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfMudurlukUcretTarifesiType mudurlukUcretTarifesiListesi;

    /**
     * Gets the value of the mudurlukUcretTarifesiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMudurlukUcretTarifesiType }
     *     
     */
    public ArrayOfMudurlukUcretTarifesiType getMudurlukUcretTarifesiListesi() {
        return mudurlukUcretTarifesiListesi;
    }

    /**
     * Sets the value of the mudurlukUcretTarifesiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMudurlukUcretTarifesiType }
     *     
     */
    public void setMudurlukUcretTarifesiListesi(ArrayOfMudurlukUcretTarifesiType value) {
        this.mudurlukUcretTarifesiListesi = value;
    }

}
