
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cevreTemizlikBeyanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cevreTemizlikBeyanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanVerenKisiBilgileri" type="{http://belediye.turkiye.gov.tr/v3}beyanVerenGercekKisiBilgileriType"/&gt;
 *         &lt;element name="beyanaKonuKisiBilgileri" type="{http://belediye.turkiye.gov.tr/v3}beyanaKonuKisiBilgileriType"/&gt;
 *         &lt;element name="basvuruAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanaKonuTasinmazAdresBilgileri" type="{http://belediye.turkiye.gov.tr/v3}tasinmazAdresBilgileriType"/&gt;
 *         &lt;element name="beyanaKonuTasinmazTapuBilgileri" type="{http://belediye.turkiye.gov.tr/v3}tasinmazTapubilgileriType"/&gt;
 *         &lt;element name="faaliyetBilgisi" type="{http://belediye.turkiye.gov.tr/v3}CTVFaaliyetType"/&gt;
 *         &lt;element name="beyanaIliskinDosyaEkleri" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBasvuruDosya"/&gt;
 *         &lt;element name="mulkSahibiTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="mulkSahibiAdSoyad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cevreTemizlikBeyanType", propOrder = {
    "beyanVerenKisiBilgileri",
    "beyanaKonuKisiBilgileri",
    "basvuruAciklama",
    "beyanaKonuTasinmazAdresBilgileri",
    "beyanaKonuTasinmazTapuBilgileri",
    "faaliyetBilgisi",
    "beyanaIliskinDosyaEkleri",
    "mulkSahibiTCKimlikNo",
    "mulkSahibiAdSoyad"
})
public class CevreTemizlikBeyanType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected BeyanVerenGercekKisiBilgileriType beyanVerenKisiBilgileri;
    @XmlElement(required = true)
    protected BeyanaKonuKisiBilgileriType beyanaKonuKisiBilgileri;
    @XmlElement(required = true)
    protected String basvuruAciklama;
    @XmlElement(required = true)
    protected TasinmazAdresBilgileriType beyanaKonuTasinmazAdresBilgileri;
    @XmlElement(required = true)
    protected TasinmazTapubilgileriType beyanaKonuTasinmazTapuBilgileri;
    @XmlElement(required = true)
    protected CTVFaaliyetType faaliyetBilgisi;
    @XmlElement(required = true)
    protected ArrayOfBasvuruDosya beyanaIliskinDosyaEkleri;
    @XmlElement(required = true)
    protected String mulkSahibiTCKimlikNo;
    @XmlElement(required = true)
    protected String mulkSahibiAdSoyad;

    /**
     * Gets the value of the beyanVerenKisiBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link BeyanVerenGercekKisiBilgileriType }
     *     
     */
    public BeyanVerenGercekKisiBilgileriType getBeyanVerenKisiBilgileri() {
        return beyanVerenKisiBilgileri;
    }

    /**
     * Sets the value of the beyanVerenKisiBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeyanVerenGercekKisiBilgileriType }
     *     
     */
    public void setBeyanVerenKisiBilgileri(BeyanVerenGercekKisiBilgileriType value) {
        this.beyanVerenKisiBilgileri = value;
    }

    /**
     * Gets the value of the beyanaKonuKisiBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link BeyanaKonuKisiBilgileriType }
     *     
     */
    public BeyanaKonuKisiBilgileriType getBeyanaKonuKisiBilgileri() {
        return beyanaKonuKisiBilgileri;
    }

    /**
     * Sets the value of the beyanaKonuKisiBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeyanaKonuKisiBilgileriType }
     *     
     */
    public void setBeyanaKonuKisiBilgileri(BeyanaKonuKisiBilgileriType value) {
        this.beyanaKonuKisiBilgileri = value;
    }

    /**
     * Gets the value of the basvuruAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruAciklama() {
        return basvuruAciklama;
    }

    /**
     * Sets the value of the basvuruAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruAciklama(String value) {
        this.basvuruAciklama = value;
    }

    /**
     * Gets the value of the beyanaKonuTasinmazAdresBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link TasinmazAdresBilgileriType }
     *     
     */
    public TasinmazAdresBilgileriType getBeyanaKonuTasinmazAdresBilgileri() {
        return beyanaKonuTasinmazAdresBilgileri;
    }

    /**
     * Sets the value of the beyanaKonuTasinmazAdresBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasinmazAdresBilgileriType }
     *     
     */
    public void setBeyanaKonuTasinmazAdresBilgileri(TasinmazAdresBilgileriType value) {
        this.beyanaKonuTasinmazAdresBilgileri = value;
    }

    /**
     * Gets the value of the beyanaKonuTasinmazTapuBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link TasinmazTapubilgileriType }
     *     
     */
    public TasinmazTapubilgileriType getBeyanaKonuTasinmazTapuBilgileri() {
        return beyanaKonuTasinmazTapuBilgileri;
    }

    /**
     * Sets the value of the beyanaKonuTasinmazTapuBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasinmazTapubilgileriType }
     *     
     */
    public void setBeyanaKonuTasinmazTapuBilgileri(TasinmazTapubilgileriType value) {
        this.beyanaKonuTasinmazTapuBilgileri = value;
    }

    /**
     * Gets the value of the faaliyetBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link CTVFaaliyetType }
     *     
     */
    public CTVFaaliyetType getFaaliyetBilgisi() {
        return faaliyetBilgisi;
    }

    /**
     * Sets the value of the faaliyetBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTVFaaliyetType }
     *     
     */
    public void setFaaliyetBilgisi(CTVFaaliyetType value) {
        this.faaliyetBilgisi = value;
    }

    /**
     * Gets the value of the beyanaIliskinDosyaEkleri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBasvuruDosya }
     *     
     */
    public ArrayOfBasvuruDosya getBeyanaIliskinDosyaEkleri() {
        return beyanaIliskinDosyaEkleri;
    }

    /**
     * Sets the value of the beyanaIliskinDosyaEkleri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBasvuruDosya }
     *     
     */
    public void setBeyanaIliskinDosyaEkleri(ArrayOfBasvuruDosya value) {
        this.beyanaIliskinDosyaEkleri = value;
    }

    /**
     * Gets the value of the mulkSahibiTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulkSahibiTCKimlikNo() {
        return mulkSahibiTCKimlikNo;
    }

    /**
     * Sets the value of the mulkSahibiTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulkSahibiTCKimlikNo(String value) {
        this.mulkSahibiTCKimlikNo = value;
    }

    /**
     * Gets the value of the mulkSahibiAdSoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMulkSahibiAdSoyad() {
        return mulkSahibiAdSoyad;
    }

    /**
     * Sets the value of the mulkSahibiAdSoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMulkSahibiAdSoyad(String value) {
        this.mulkSahibiAdSoyad = value;
    }

}
