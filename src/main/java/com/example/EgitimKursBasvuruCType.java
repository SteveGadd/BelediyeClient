
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for egitimKursBasvuruCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="egitimKursBasvuruCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gerekliBelgeBilgileri" type="{http://belediye.turkiye.gov.tr/v3}gerekliBelgeBilgileriType"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egitimKursBasvuruCType", propOrder = {
    "gerekliBelgeBilgileri",
    "detayListesi"
})
public class EgitimKursBasvuruCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected GerekliBelgeBilgileriType gerekliBelgeBilgileri;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the gerekliBelgeBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link GerekliBelgeBilgileriType }
     *     
     */
    public GerekliBelgeBilgileriType getGerekliBelgeBilgileri() {
        return gerekliBelgeBilgileri;
    }

    /**
     * Sets the value of the gerekliBelgeBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link GerekliBelgeBilgileriType }
     *     
     */
    public void setGerekliBelgeBilgileri(GerekliBelgeBilgileriType value) {
        this.gerekliBelgeBilgileri = value;
    }

    /**
     * Gets the value of the detayListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public ArrayOfDetailType getDetayListesi() {
        return detayListesi;
    }

    /**
     * Sets the value of the detayListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDetailType }
     *     
     */
    public void setDetayListesi(ArrayOfDetailType value) {
        this.detayListesi = value;
    }

}
