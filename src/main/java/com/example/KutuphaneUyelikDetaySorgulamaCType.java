
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kutuphaneUyelikDetaySorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kutuphaneUyelikDetaySorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kutuphaneUyelikBilgisi" type="{http://belediye.turkiye.gov.tr/v3}kutuphaneUyelikBilgileriType"/&gt;
 *         &lt;element name="elinizdekiIadeTarihiGecmeyenKitapSayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="elinizdekiIadeTarihiGecenKitapSayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="elinizdekiToplamKitapSayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="simdiyeKadaraldiginizKitapSayisi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="alinanKitapListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKutuphanedenAlinanKitaplar"/&gt;
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
@XmlType(name = "kutuphaneUyelikDetaySorgulamaCType", propOrder = {
    "kutuphaneUyelikBilgisi",
    "elinizdekiIadeTarihiGecmeyenKitapSayisi",
    "elinizdekiIadeTarihiGecenKitapSayisi",
    "elinizdekiToplamKitapSayisi",
    "simdiyeKadaraldiginizKitapSayisi",
    "alinanKitapListesi",
    "detayListesi"
})
public class KutuphaneUyelikDetaySorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected KutuphaneUyelikBilgileriType kutuphaneUyelikBilgisi;
    @XmlElement(required = true)
    protected String elinizdekiIadeTarihiGecmeyenKitapSayisi;
    @XmlElement(required = true)
    protected String elinizdekiIadeTarihiGecenKitapSayisi;
    @XmlElement(required = true)
    protected String elinizdekiToplamKitapSayisi;
    @XmlElement(required = true)
    protected String simdiyeKadaraldiginizKitapSayisi;
    @XmlElement(required = true)
    protected ArrayOfKutuphanedenAlinanKitaplar alinanKitapListesi;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the kutuphaneUyelikBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KutuphaneUyelikBilgileriType }
     *     
     */
    public KutuphaneUyelikBilgileriType getKutuphaneUyelikBilgisi() {
        return kutuphaneUyelikBilgisi;
    }

    /**
     * Sets the value of the kutuphaneUyelikBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KutuphaneUyelikBilgileriType }
     *     
     */
    public void setKutuphaneUyelikBilgisi(KutuphaneUyelikBilgileriType value) {
        this.kutuphaneUyelikBilgisi = value;
    }

    /**
     * Gets the value of the elinizdekiIadeTarihiGecmeyenKitapSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElinizdekiIadeTarihiGecmeyenKitapSayisi() {
        return elinizdekiIadeTarihiGecmeyenKitapSayisi;
    }

    /**
     * Sets the value of the elinizdekiIadeTarihiGecmeyenKitapSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElinizdekiIadeTarihiGecmeyenKitapSayisi(String value) {
        this.elinizdekiIadeTarihiGecmeyenKitapSayisi = value;
    }

    /**
     * Gets the value of the elinizdekiIadeTarihiGecenKitapSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElinizdekiIadeTarihiGecenKitapSayisi() {
        return elinizdekiIadeTarihiGecenKitapSayisi;
    }

    /**
     * Sets the value of the elinizdekiIadeTarihiGecenKitapSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElinizdekiIadeTarihiGecenKitapSayisi(String value) {
        this.elinizdekiIadeTarihiGecenKitapSayisi = value;
    }

    /**
     * Gets the value of the elinizdekiToplamKitapSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElinizdekiToplamKitapSayisi() {
        return elinizdekiToplamKitapSayisi;
    }

    /**
     * Sets the value of the elinizdekiToplamKitapSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElinizdekiToplamKitapSayisi(String value) {
        this.elinizdekiToplamKitapSayisi = value;
    }

    /**
     * Gets the value of the simdiyeKadaraldiginizKitapSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimdiyeKadaraldiginizKitapSayisi() {
        return simdiyeKadaraldiginizKitapSayisi;
    }

    /**
     * Sets the value of the simdiyeKadaraldiginizKitapSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimdiyeKadaraldiginizKitapSayisi(String value) {
        this.simdiyeKadaraldiginizKitapSayisi = value;
    }

    /**
     * Gets the value of the alinanKitapListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKutuphanedenAlinanKitaplar }
     *     
     */
    public ArrayOfKutuphanedenAlinanKitaplar getAlinanKitapListesi() {
        return alinanKitapListesi;
    }

    /**
     * Sets the value of the alinanKitapListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKutuphanedenAlinanKitaplar }
     *     
     */
    public void setAlinanKitapListesi(ArrayOfKutuphanedenAlinanKitaplar value) {
        this.alinanKitapListesi = value;
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
