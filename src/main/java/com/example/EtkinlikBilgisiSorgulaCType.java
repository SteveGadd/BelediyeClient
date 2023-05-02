
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for etkinlikBilgisiSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etkinlikBilgisiSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sorgulamaZamanAralikBilgisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="etkinlikListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfEtkinlikBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etkinlikBilgisiSorgulaCType", propOrder = {
    "sorgulamaZamanAralikBilgisi",
    "etkinlikListesi"
})
public class EtkinlikBilgisiSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected String sorgulamaZamanAralikBilgisi;
    @XmlElement(required = true)
    protected ArrayOfEtkinlikBilgisi etkinlikListesi;

    /**
     * Gets the value of the sorgulamaZamanAralikBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSorgulamaZamanAralikBilgisi() {
        return sorgulamaZamanAralikBilgisi;
    }

    /**
     * Sets the value of the sorgulamaZamanAralikBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSorgulamaZamanAralikBilgisi(String value) {
        this.sorgulamaZamanAralikBilgisi = value;
    }

    /**
     * Gets the value of the etkinlikListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEtkinlikBilgisi }
     *     
     */
    public ArrayOfEtkinlikBilgisi getEtkinlikListesi() {
        return etkinlikListesi;
    }

    /**
     * Sets the value of the etkinlikListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEtkinlikBilgisi }
     *     
     */
    public void setEtkinlikListesi(ArrayOfEtkinlikBilgisi value) {
        this.etkinlikListesi = value;
    }

}
