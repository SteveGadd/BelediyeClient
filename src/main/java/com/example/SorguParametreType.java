
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sorguParametreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sorguParametreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belediyeKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kullaniciAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sifre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ipAdresi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sorguParametreType", propOrder = {
    "belediyeKodu",
    "kullaniciAdi",
    "sifre",
    "ipAdresi"
})
@XmlSeeAlso({
    NobetciEczaneSorgulamaGType.class,
    SokakCaddeSorgulamaGType.class,
    ArsaRayicBedelBilgisiGType.class,
    AnonimBorcSorgulamaGType.class,
    AnonimBorcSorgulama2GType.class,
    MahalleSorgulamaGType.class,
    ImarBilgisiSorgulamaGType.class,
    AyarOkuGType.class,
    HizmetSorgulaGType.class,
    UcretTarifesiSorgulaGType.class,
    NikahSalonDurumSorgulaGType.class,
    CopToplamaBilgisiSorgulaGType.class,
    VefatBilgisiSorgulaGType.class,
    MezarYeriSorgulaGType.class,
    KararTarihSorgulaGType.class,
    KararSorgulaGType.class,
    HalUrunKategoriSorgulaGType.class,
    HalUrunBilgisiSorgulaGType.class,
    MakbuzIndirGType.class,
    InsaatTuruSorgulamaGType.class,
    BarkodluBelgeDogrulaGType.class,
    IlanReklamYerSorgulamaGType.class,
    KatalogTaramaGType.class,
    EgitimKursYeriSorgulaGType.class,
    EgitimKursBilgileriSorgulaGType.class,
    BarinaktakiHayvanSorgulaGType.class,
    HayvanResimIndirGType.class,
    KisiselSorgulamaGType.class
})
public class SorguParametreType {

    @XmlElement(required = true)
    protected String belediyeKodu;
    @XmlElement(required = true)
    protected String kullaniciAdi;
    @XmlElement(required = true)
    protected String sifre;
    @XmlElement(required = true)
    protected String ipAdresi;

    /**
     * Gets the value of the belediyeKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelediyeKodu() {
        return belediyeKodu;
    }

    /**
     * Sets the value of the belediyeKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelediyeKodu(String value) {
        this.belediyeKodu = value;
    }

    /**
     * Gets the value of the kullaniciAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * Sets the value of the kullaniciAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullaniciAdi(String value) {
        this.kullaniciAdi = value;
    }

    /**
     * Gets the value of the sifre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * Sets the value of the sifre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSifre(String value) {
        this.sifre = value;
    }

    /**
     * Gets the value of the ipAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAdresi() {
        return ipAdresi;
    }

    /**
     * Sets the value of the ipAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAdresi(String value) {
        this.ipAdresi = value;
    }

}
