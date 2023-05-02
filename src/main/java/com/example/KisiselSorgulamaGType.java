
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kisiselSorgulamaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kisiselSorgulamaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tcKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="adinaIslemYapilanBilgileri" type="{http://belediye.turkiye.gov.tr/v3}adinaIslemYapilanBilgileriType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kisiselSorgulamaGType", propOrder = {
    "tcKimlikNo",
    "adinaIslemYapilanBilgileri"
})
@XmlSeeAlso({
    SuFaturaSorgulamaGType.class,
    TahakkukSorgulamaGType.class,
    TahsilatSorgulamaGType.class,
    BasvuruYapGType.class,
    BasvuruDetaySorgulaGType.class,
    BasvuruNotEkleGType.class,
    BasvuruyuTekrarAcGType.class,
    EvrakSorgulamaGType.class,
    NikahSorgulaGType.class,
    BilgilendirmeIstegiYapGType.class,
    TahsilatDekontIndirGType.class,
    EmlakRayicBelgeSorgulaGType.class,
    KayitliBelgeIndirGType.class,
    BordroSorgulaGType.class,
    TasinmazBeyanType.class,
    EBeyanSorgulamaGType.class,
    BeyanSilGType.class,
    CevreTemizlikBeyanType.class,
    IlanReklamBeyanType.class,
    KutuphaneUyelikDetaySorgulamaGType.class,
    KutuphaneUyelikBasvuruGType.class,
    EgitimKursBasvuruGType.class,
    EgitimKursTalepBasvuruGType.class,
    RuhsatSorgulaGType.class,
    YapilanSosyaYardimBilgileriSorgulaGType.class,
    SosyalYardimOnBasvuruGType.class,
    HayvanSahiplenmeBasvuruGType.class,
    YapilandirmaTurSorgulaGType.class,
    YapilandirmaBasvuruGType.class
})
public class KisiselSorgulamaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String tcKimlikNo;
    @XmlElement(required = true)
    protected AdinaIslemYapilanBilgileriType adinaIslemYapilanBilgileri;

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcKimlikNo(String value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the adinaIslemYapilanBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link AdinaIslemYapilanBilgileriType }
     *     
     */
    public AdinaIslemYapilanBilgileriType getAdinaIslemYapilanBilgileri() {
        return adinaIslemYapilanBilgileri;
    }

    /**
     * Sets the value of the adinaIslemYapilanBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdinaIslemYapilanBilgileriType }
     *     
     */
    public void setAdinaIslemYapilanBilgileri(AdinaIslemYapilanBilgileriType value) {
        this.adinaIslemYapilanBilgileri = value;
    }

}
