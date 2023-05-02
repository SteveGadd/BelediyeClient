
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for islemSonucType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="islemSonucType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belediyeKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sonucKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sonucAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "islemSonucType", propOrder = {
    "belediyeKodu",
    "sonucKodu",
    "sonucAciklamasi"
})
@XmlSeeAlso({
    SuFaturaSorgulamaCType.class,
    SuAboneBilgisiCType.class,
    FaaliyetBilgisiCType.class,
    NobetciEczaneSorgulamaCType.class,
    TahakkukSorgulamaCType.class,
    TahsilatSorgulamaCType.class,
    BorcSorgulamaCType.class,
    OzetBorcBilgileriSorgulamaCType.class,
    SicilSorgulamaCType.class,
    MahalleSorgulamaCType.class,
    SokakCaddeSorgulamaCType.class,
    ArsaRayicBedelBilgisiCType.class,
    BeyanBilgileriSorgulamaCType.class,
    ImarBilgisiSorgulamaCType.class,
    IlceBilgisiSorgulamaCType.class,
    BasvuruTipiBilgisiCType.class,
    BasvuruDurumCType.class,
    BasvuruYapCType.class,
    BasvuruDetaySorgulamaCType.class,
    AyarOkuCType.class,
    AyarOkuListeCType.class,
    BelediyeMudurlukSorgulaCType.class,
    HizmetSorgulaCType.class,
    UcretTarifesiSorgulaCType.class,
    IhaleSorgulamaCType.class,
    EvrakSorgulamaCType.class,
    NikahSalonSorgulaCType.class,
    NikahSalonDurumSorgulaCType.class,
    CopToplamaBilgisiSorgulaCType.class,
    VefatBilgisiSorgulaCType.class,
    NikahSorgulaCType.class,
    MezarYeriSorgulaCType.class,
    EtkinlikBilgisiSorgulaCType.class,
    KararTarihSorgulaCType.class,
    KararSorgulaCType.class,
    MeclisGundemSorgulaCType.class,
    HalSorgulaCType.class,
    HalUrunKategoriSorgulaCType.class,
    HalUrunBilgisiSorgulaCType.class,
    BelediyeBilgilendirmeTurSorgulaCType.class,
    BilgilendirmeIstegiSorgulaCType.class,
    AskidakiImarPlaniSorgulaCType.class,
    TahsilatDekontIndirCType.class,
    MezarlikSorgulaCType.class,
    InsaatTuruSorgulamaCtype.class,
    TasinmazBeyanBilgileriSorgulaCType.class,
    EmlakRayicBelgeSorgulaCType.class,
    KayitliEmlakRayicBelgesiSorgulaCType.class,
    BarkodluBelgeDogrulaCType.class,
    BordroDonemSorgulaCType.class,
    BordroSorgulaCType.class,
    EBeyanSorgulamaCType.class,
    InsaatSinifiSorgulamaCtype.class,
    InsaatKullanimSekliCtype.class,
    CTVKullanimAmaciCtype.class,
    IlanReklamTurCtype.class,
    IlanReklamYerCtype.class,
    KutuphaneSorgulaCType.class,
    KatalogTaramaCType.class,
    KutuphaneUyelikSorgulamaCType.class,
    KutuphaneUyelikDetaySorgulamaCType.class,
    KutuphaneUyelikBasvuruBilgileriSorgulamaCType.class,
    EgitimKursKategoriSorgulaCType.class,
    EgitimKursYeriSorgulaCType.class,
    EgitimKursBilgileriSorgulaCType.class,
    KayitliEgitimKursBilgileriCType.class,
    EgitimKursBasvuruBilgileriSorgulamaCType.class,
    EgitimKursBasvuruCType.class,
    TalepEdilecekEgitimKursSorgulaCType.class,
    RuhsatBasvuruSorgulamaCType.class,
    RuhsatSorgulamaCType.class,
    SosyalYardimBasvuruSorgulamaCType.class,
    YapilanSosyalYardimBilgileriSorgulamaCType.class,
    SosyalYardimOnBasvuruBilgileriSorgulamaCType.class,
    SosyalYardimOnBasvuruCType.class,
    BarinaktakiHayvanSorgulaCType.class,
    HayvanSahiplenmeBasvuruBilgileriSorgulaCType.class,
    HayvanResimIndirCType.class,
    YapilandirmaBasvuruSorgulamaCType.class,
    YapilandirmaTurSorgulaCType.class,
    YapilandirmaBasvuruCType.class,
    EncumenGundemSorgulaCType.class
})
public class IslemSonucType {

    @XmlElement(required = true)
    protected String belediyeKodu;
    @XmlElement(required = true)
    protected String sonucKodu;
    @XmlElement(required = true)
    protected String sonucAciklamasi;

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
     * Gets the value of the sonucKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucKodu() {
        return sonucKodu;
    }

    /**
     * Sets the value of the sonucKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucKodu(String value) {
        this.sonucKodu = value;
    }

    /**
     * Gets the value of the sonucAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSonucAciklamasi() {
        return sonucAciklamasi;
    }

    /**
     * Sets the value of the sonucAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSonucAciklamasi(String value) {
        this.sonucAciklamasi = value;
    }

}
