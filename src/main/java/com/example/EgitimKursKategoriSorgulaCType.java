
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursKategoriSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursKategoriSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="egitimKursKategoriListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfEgitimKursKategori"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursKategoriSorgulaCType", propOrder = {
    "egitimKursKategoriListesi"
})
public class EgitimKursKategoriSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfEgitimKursKategori egitimKursKategoriListesi;

    /**
     * Gets the value of the egitimKursKategoriListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEgitimKursKategori }
     *     
     */
    public ArrayOfEgitimKursKategori getEgitimKursKategoriListesi() {
        return egitimKursKategoriListesi;
    }

    /**
     * Sets the value of the egitimKursKategoriListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEgitimKursKategori }
     *     
     */
    public void setEgitimKursKategoriListesi(ArrayOfEgitimKursKategori value) {
        this.egitimKursKategoriListesi = value;
    }

}
