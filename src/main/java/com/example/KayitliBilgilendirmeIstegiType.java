
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kayitliBilgilendirmeIstegiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kayitliBilgilendirmeIstegiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cepTelefonu" type="{http://belediye.turkiye.gov.tr/v3}telefonBilgisiType"/&gt;
 *         &lt;element name="ilgilenilenMahalleListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfMahalleBilgisi"/&gt;
 *         &lt;element name="secilenSMSBilgilendirmeKategoriListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBelediyeBilgilendirmeTur"/&gt;
 *         &lt;element name="secilenEpostaBilgilendirmeKategoriListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBelediyeBilgilendirmeTur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kayitliBilgilendirmeIstegiType", propOrder = {
    "eposta",
    "cepTelefonu",
    "ilgilenilenMahalleListesi",
    "secilenSMSBilgilendirmeKategoriListesi",
    "secilenEpostaBilgilendirmeKategoriListesi"
})
public class KayitliBilgilendirmeIstegiType {

    @XmlElement(required = true)
    protected String eposta;
    @XmlElement(required = true)
    protected TelefonBilgisiType cepTelefonu;
    @XmlElement(required = true)
    protected ArrayOfMahalleBilgisi ilgilenilenMahalleListesi;
    @XmlElement(required = true)
    protected ArrayOfBelediyeBilgilendirmeTur secilenSMSBilgilendirmeKategoriListesi;
    @XmlElement(required = true)
    protected ArrayOfBelediyeBilgilendirmeTur secilenEpostaBilgilendirmeKategoriListesi;

    /**
     * Gets the value of the eposta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEposta() {
        return eposta;
    }

    /**
     * Sets the value of the eposta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEposta(String value) {
        this.eposta = value;
    }

    /**
     * Gets the value of the cepTelefonu property.
     * 
     * @return
     *     possible object is
     *     {@link TelefonBilgisiType }
     *     
     */
    public TelefonBilgisiType getCepTelefonu() {
        return cepTelefonu;
    }

    /**
     * Sets the value of the cepTelefonu property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefonBilgisiType }
     *     
     */
    public void setCepTelefonu(TelefonBilgisiType value) {
        this.cepTelefonu = value;
    }

    /**
     * Gets the value of the ilgilenilenMahalleListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMahalleBilgisi }
     *     
     */
    public ArrayOfMahalleBilgisi getIlgilenilenMahalleListesi() {
        return ilgilenilenMahalleListesi;
    }

    /**
     * Sets the value of the ilgilenilenMahalleListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMahalleBilgisi }
     *     
     */
    public void setIlgilenilenMahalleListesi(ArrayOfMahalleBilgisi value) {
        this.ilgilenilenMahalleListesi = value;
    }

    /**
     * Gets the value of the secilenSMSBilgilendirmeKategoriListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBelediyeBilgilendirmeTur }
     *     
     */
    public ArrayOfBelediyeBilgilendirmeTur getSecilenSMSBilgilendirmeKategoriListesi() {
        return secilenSMSBilgilendirmeKategoriListesi;
    }

    /**
     * Sets the value of the secilenSMSBilgilendirmeKategoriListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBelediyeBilgilendirmeTur }
     *     
     */
    public void setSecilenSMSBilgilendirmeKategoriListesi(ArrayOfBelediyeBilgilendirmeTur value) {
        this.secilenSMSBilgilendirmeKategoriListesi = value;
    }

    /**
     * Gets the value of the secilenEpostaBilgilendirmeKategoriListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBelediyeBilgilendirmeTur }
     *     
     */
    public ArrayOfBelediyeBilgilendirmeTur getSecilenEpostaBilgilendirmeKategoriListesi() {
        return secilenEpostaBilgilendirmeKategoriListesi;
    }

    /**
     * Sets the value of the secilenEpostaBilgilendirmeKategoriListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBelediyeBilgilendirmeTur }
     *     
     */
    public void setSecilenEpostaBilgilendirmeKategoriListesi(ArrayOfBelediyeBilgilendirmeTur value) {
        this.secilenEpostaBilgilendirmeKategoriListesi = value;
    }

}
