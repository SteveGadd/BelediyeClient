
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tasinmazBeyanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tasinmazBeyanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}kisiselSorgulamaGType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tasinmazBeyanTuru"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="ARSA"/&gt;
 *               &lt;enumeration value="ARAZI"/&gt;
 *               &lt;enumeration value="BINA"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="beyanVerenKisiBilgileri" type="{http://belediye.turkiye.gov.tr/v3}beyanVerenGercekKisiBilgileriType"/&gt;
 *         &lt;element name="beyanaKonuKisiBilgileri" type="{http://belediye.turkiye.gov.tr/v3}beyanaKonuKisiBilgileriType"/&gt;
 *         &lt;element name="basvuruAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanaKonuTasinmazAdresBilgileri" type="{http://belediye.turkiye.gov.tr/v3}tasinmazAdresBilgileriType"/&gt;
 *         &lt;element name="beyanaKonuTasinmazTapuBilgileri" type="{http://belediye.turkiye.gov.tr/v3}tasinmazTapubilgileriType"/&gt;
 *         &lt;element name="beyanaKonuArsaBilgileri" type="{http://belediye.turkiye.gov.tr/v3}arsaBilgileriType"/&gt;
 *         &lt;element name="beyanaKonuTasinmazBinaBilgileri" type="{http://belediye.turkiye.gov.tr/v3}binaBilgileriType"/&gt;
 *         &lt;element name="beyanaIliskinDosyaEkleri" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBasvuruDosya"/&gt;
 *         &lt;element name="varsaKisitlilikHalibaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="varsaMuafiyetBasangicYili" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="varsaMuafiyetSuresiYil" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tasinmazBeyanType", propOrder = {
    "tasinmazBeyanTuru",
    "beyanVerenKisiBilgileri",
    "beyanaKonuKisiBilgileri",
    "basvuruAciklama",
    "beyanaKonuTasinmazAdresBilgileri",
    "beyanaKonuTasinmazTapuBilgileri",
    "beyanaKonuArsaBilgileri",
    "beyanaKonuTasinmazBinaBilgileri",
    "beyanaIliskinDosyaEkleri",
    "varsaKisitlilikHalibaslangicTarihi",
    "varsaMuafiyetBasangicYili",
    "varsaMuafiyetSuresiYil"
})
public class TasinmazBeyanType
    extends KisiselSorgulamaGType
{

    @XmlElement(required = true)
    protected String tasinmazBeyanTuru;
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
    protected ArsaBilgileriType beyanaKonuArsaBilgileri;
    @XmlElement(required = true, nillable = true)
    protected BinaBilgileriType beyanaKonuTasinmazBinaBilgileri;
    @XmlElement(required = true)
    protected ArrayOfBasvuruDosya beyanaIliskinDosyaEkleri;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar varsaKisitlilikHalibaslangicTarihi;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short varsaMuafiyetBasangicYili;
    @XmlElement(required = true, type = Short.class, nillable = true)
    protected Short varsaMuafiyetSuresiYil;

    /**
     * Gets the value of the tasinmazBeyanTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTasinmazBeyanTuru() {
        return tasinmazBeyanTuru;
    }

    /**
     * Sets the value of the tasinmazBeyanTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTasinmazBeyanTuru(String value) {
        this.tasinmazBeyanTuru = value;
    }

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
     * Gets the value of the beyanaKonuArsaBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link ArsaBilgileriType }
     *     
     */
    public ArsaBilgileriType getBeyanaKonuArsaBilgileri() {
        return beyanaKonuArsaBilgileri;
    }

    /**
     * Sets the value of the beyanaKonuArsaBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArsaBilgileriType }
     *     
     */
    public void setBeyanaKonuArsaBilgileri(ArsaBilgileriType value) {
        this.beyanaKonuArsaBilgileri = value;
    }

    /**
     * Gets the value of the beyanaKonuTasinmazBinaBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link BinaBilgileriType }
     *     
     */
    public BinaBilgileriType getBeyanaKonuTasinmazBinaBilgileri() {
        return beyanaKonuTasinmazBinaBilgileri;
    }

    /**
     * Sets the value of the beyanaKonuTasinmazBinaBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaBilgileriType }
     *     
     */
    public void setBeyanaKonuTasinmazBinaBilgileri(BinaBilgileriType value) {
        this.beyanaKonuTasinmazBinaBilgileri = value;
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
     * Gets the value of the varsaKisitlilikHalibaslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVarsaKisitlilikHalibaslangicTarihi() {
        return varsaKisitlilikHalibaslangicTarihi;
    }

    /**
     * Sets the value of the varsaKisitlilikHalibaslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVarsaKisitlilikHalibaslangicTarihi(XMLGregorianCalendar value) {
        this.varsaKisitlilikHalibaslangicTarihi = value;
    }

    /**
     * Gets the value of the varsaMuafiyetBasangicYili property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVarsaMuafiyetBasangicYili() {
        return varsaMuafiyetBasangicYili;
    }

    /**
     * Sets the value of the varsaMuafiyetBasangicYili property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVarsaMuafiyetBasangicYili(Short value) {
        this.varsaMuafiyetBasangicYili = value;
    }

    /**
     * Gets the value of the varsaMuafiyetSuresiYil property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVarsaMuafiyetSuresiYil() {
        return varsaMuafiyetSuresiYil;
    }

    /**
     * Sets the value of the varsaMuafiyetSuresiYil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVarsaMuafiyetSuresiYil(Short value) {
        this.varsaMuafiyetSuresiYil = value;
    }

}
