
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insaatKullanimSekliCtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insaatKullanimSekliCtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insaatKullanimSekliListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfInsaatKullanimSekli"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insaatKullanimSekliCtype", propOrder = {
    "insaatKullanimSekliListesi"
})
public class InsaatKullanimSekliCtype
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfInsaatKullanimSekli insaatKullanimSekliListesi;

    /**
     * Gets the value of the insaatKullanimSekliListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInsaatKullanimSekli }
     *     
     */
    public ArrayOfInsaatKullanimSekli getInsaatKullanimSekliListesi() {
        return insaatKullanimSekliListesi;
    }

    /**
     * Sets the value of the insaatKullanimSekliListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInsaatKullanimSekli }
     *     
     */
    public void setInsaatKullanimSekliListesi(ArrayOfInsaatKullanimSekli value) {
        this.insaatKullanimSekliListesi = value;
    }

}
