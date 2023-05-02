
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for halUrunBilgisiSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="halUrunBilgisiSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="halUrunListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfHalUrunBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "halUrunBilgisiSorgulaCType", propOrder = {
    "halUrunListesi"
})
public class HalUrunBilgisiSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfHalUrunBilgisi halUrunListesi;

    /**
     * Gets the value of the halUrunListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHalUrunBilgisi }
     *     
     */
    public ArrayOfHalUrunBilgisi getHalUrunListesi() {
        return halUrunListesi;
    }

    /**
     * Sets the value of the halUrunListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHalUrunBilgisi }
     *     
     */
    public void setHalUrunListesi(ArrayOfHalUrunBilgisi value) {
        this.halUrunListesi = value;
    }

}
