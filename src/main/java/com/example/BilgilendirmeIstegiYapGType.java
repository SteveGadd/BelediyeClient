
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bilgilendirmeIstegiYapGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bilgilendirmeIstegiYapGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="soyadi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cepTelefonu" type="{http://belediye.turkiye.gov.tr/v3}telefonBilgisiType"/&gt;
 *         &lt;element name="ilgilenilenMahalleListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKod"/&gt;
 *         &lt;element name="belediyeIletisimBilgisiniGuncelle" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="secilenSMSBilgilendirmeKategoriListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKod"/&gt;
 *         &lt;element name="secilenEpostaBilgilendirmeKategoriListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfKod"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bilgilendirmeIstegiYapGType", propOrder = {
    "adi",
    "soyadi",
    "eposta",
    "cepTelefonu",
    "ilgilenilenMahalleListesi",
    "belediyeIletisimBilgisiniGuncelle",
    "secilenSMSBilgilendirmeKategoriListesi",
    "secilenEpostaBilgilendirmeKategoriListesi"
})
public class BilgilendirmeIstegiYapGType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String adi;
    @XmlElement(required = true)
    protected String soyadi;
    @XmlElement(required = true)
    protected String eposta;
    @XmlElement(required = true)
    protected TelefonBilgisiType cepTelefonu;
    @XmlElement(required = true)
    protected ArrayOfKod ilgilenilenMahalleListesi;
    protected boolean belediyeIletisimBilgisiniGuncelle;
    @XmlElement(required = true)
    protected ArrayOfKod secilenSMSBilgilendirmeKategoriListesi;
    @XmlElement(required = true)
    protected ArrayOfKod secilenEpostaBilgilendirmeKategoriListesi;

    /**
     * Gets the value of the adi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdi() {
        return adi;
    }

    /**
     * Sets the value of the adi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdi(String value) {
        this.adi = value;
    }

    /**
     * Gets the value of the soyadi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyadi() {
        return soyadi;
    }

    /**
     * Sets the value of the soyadi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyadi(String value) {
        this.soyadi = value;
    }

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
     *     {@link ArrayOfKod }
     *     
     */
    public ArrayOfKod getIlgilenilenMahalleListesi() {
        return ilgilenilenMahalleListesi;
    }

    /**
     * Sets the value of the ilgilenilenMahalleListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKod }
     *     
     */
    public void setIlgilenilenMahalleListesi(ArrayOfKod value) {
        this.ilgilenilenMahalleListesi = value;
    }

    /**
     * Gets the value of the belediyeIletisimBilgisiniGuncelle property.
     * 
     */
    public boolean isBelediyeIletisimBilgisiniGuncelle() {
        return belediyeIletisimBilgisiniGuncelle;
    }

    /**
     * Sets the value of the belediyeIletisimBilgisiniGuncelle property.
     * 
     */
    public void setBelediyeIletisimBilgisiniGuncelle(boolean value) {
        this.belediyeIletisimBilgisiniGuncelle = value;
    }

    /**
     * Gets the value of the secilenSMSBilgilendirmeKategoriListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKod }
     *     
     */
    public ArrayOfKod getSecilenSMSBilgilendirmeKategoriListesi() {
        return secilenSMSBilgilendirmeKategoriListesi;
    }

    /**
     * Sets the value of the secilenSMSBilgilendirmeKategoriListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKod }
     *     
     */
    public void setSecilenSMSBilgilendirmeKategoriListesi(ArrayOfKod value) {
        this.secilenSMSBilgilendirmeKategoriListesi = value;
    }

    /**
     * Gets the value of the secilenEpostaBilgilendirmeKategoriListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKod }
     *     
     */
    public ArrayOfKod getSecilenEpostaBilgilendirmeKategoriListesi() {
        return secilenEpostaBilgilendirmeKategoriListesi;
    }

    /**
     * Sets the value of the secilenEpostaBilgilendirmeKategoriListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKod }
     *     
     */
    public void setSecilenEpostaBilgilendirmeKategoriListesi(ArrayOfKod value) {
        this.secilenEpostaBilgilendirmeKategoriListesi = value;
    }

}
