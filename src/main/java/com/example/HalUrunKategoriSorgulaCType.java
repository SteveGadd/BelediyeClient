
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for halUrunKategoriSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="halUrunKategoriSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="halUrunKategoriListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfHalUrunKategori"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "halUrunKategoriSorgulaCType", propOrder = {
    "halUrunKategoriListesi"
})
public class HalUrunKategoriSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfHalUrunKategori halUrunKategoriListesi;

    /**
     * Gets the value of the halUrunKategoriListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHalUrunKategori }
     *     
     */
    public ArrayOfHalUrunKategori getHalUrunKategoriListesi() {
        return halUrunKategoriListesi;
    }

    /**
     * Sets the value of the halUrunKategoriListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHalUrunKategori }
     *     
     */
    public void setHalUrunKategoriListesi(ArrayOfHalUrunKategori value) {
        this.halUrunKategoriListesi = value;
    }

}
