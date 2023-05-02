
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTVKullanimAmaciCtype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTVKullanimAmaciCtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CTVKullanimAmaciListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfCTVKullanimAmaci"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTVKullanimAmaciCtype", propOrder = {
    "ctvKullanimAmaciListesi"
})
public class CTVKullanimAmaciCtype
    extends IslemSonucType
{

    @XmlElement(name = "CTVKullanimAmaciListesi", required = true)
    protected ArrayOfCTVKullanimAmaci ctvKullanimAmaciListesi;

    /**
     * Gets the value of the ctvKullanimAmaciListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCTVKullanimAmaci }
     *     
     */
    public ArrayOfCTVKullanimAmaci getCTVKullanimAmaciListesi() {
        return ctvKullanimAmaciListesi;
    }

    /**
     * Sets the value of the ctvKullanimAmaciListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCTVKullanimAmaci }
     *     
     */
    public void setCTVKullanimAmaciListesi(ArrayOfCTVKullanimAmaci value) {
        this.ctvKullanimAmaciListesi = value;
    }

}
