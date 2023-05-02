
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for eBeyanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBeyanType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="beyanTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruDurumuAciklamasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanSilinebilirMi" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tasinmazBeyani" type="{http://belediye.turkiye.gov.tr/v3}tasinmazBeyanType"/&gt;
 *         &lt;element name="cevreTemizlikBeyani" type="{http://belediye.turkiye.gov.tr/v3}cevreTemizlikBeyanType"/&gt;
 *         &lt;element name="ilanReklamBeyani" type="{http://belediye.turkiye.gov.tr/v3}ilanReklamBeyanType"/&gt;
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfDetailType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBeyanType", propOrder = {
    "beyanNo",
    "beyanTarihi",
    "beyanTuru",
    "basvuruDurumu",
    "basvuruDurumuAciklamasi",
    "beyanSilinebilirMi",
    "tasinmazBeyani",
    "cevreTemizlikBeyani",
    "ilanReklamBeyani",
    "detayListesi"
})
public class EBeyanType {

    @XmlElement(required = true)
    protected String beyanNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beyanTarihi;
    @XmlElement(required = true)
    protected String beyanTuru;
    @XmlElement(required = true)
    protected String basvuruDurumu;
    @XmlElement(required = true)
    protected String basvuruDurumuAciklamasi;
    protected boolean beyanSilinebilirMi;
    @XmlElement(required = true, nillable = true)
    protected TasinmazBeyanType tasinmazBeyani;
    @XmlElement(required = true, nillable = true)
    protected CevreTemizlikBeyanType cevreTemizlikBeyani;
    @XmlElement(required = true, nillable = true)
    protected IlanReklamBeyanType ilanReklamBeyani;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the beyanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanNo() {
        return beyanNo;
    }

    /**
     * Sets the value of the beyanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanNo(String value) {
        this.beyanNo = value;
    }

    /**
     * Gets the value of the beyanTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeyanTarihi() {
        return beyanTarihi;
    }

    /**
     * Sets the value of the beyanTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeyanTarihi(XMLGregorianCalendar value) {
        this.beyanTarihi = value;
    }

    /**
     * Gets the value of the beyanTuru property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeyanTuru() {
        return beyanTuru;
    }

    /**
     * Sets the value of the beyanTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeyanTuru(String value) {
        this.beyanTuru = value;
    }

    /**
     * Gets the value of the basvuruDurumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruDurumu() {
        return basvuruDurumu;
    }

    /**
     * Sets the value of the basvuruDurumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruDurumu(String value) {
        this.basvuruDurumu = value;
    }

    /**
     * Gets the value of the basvuruDurumuAciklamasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruDurumuAciklamasi() {
        return basvuruDurumuAciklamasi;
    }

    /**
     * Sets the value of the basvuruDurumuAciklamasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruDurumuAciklamasi(String value) {
        this.basvuruDurumuAciklamasi = value;
    }

    /**
     * Gets the value of the beyanSilinebilirMi property.
     * 
     */
    public boolean isBeyanSilinebilirMi() {
        return beyanSilinebilirMi;
    }

    /**
     * Sets the value of the beyanSilinebilirMi property.
     * 
     */
    public void setBeyanSilinebilirMi(boolean value) {
        this.beyanSilinebilirMi = value;
    }

    /**
     * Gets the value of the tasinmazBeyani property.
     * 
     * @return
     *     possible object is
     *     {@link TasinmazBeyanType }
     *     
     */
    public TasinmazBeyanType getTasinmazBeyani() {
        return tasinmazBeyani;
    }

    /**
     * Sets the value of the tasinmazBeyani property.
     * 
     * @param value
     *     allowed object is
     *     {@link TasinmazBeyanType }
     *     
     */
    public void setTasinmazBeyani(TasinmazBeyanType value) {
        this.tasinmazBeyani = value;
    }

    /**
     * Gets the value of the cevreTemizlikBeyani property.
     * 
     * @return
     *     possible object is
     *     {@link CevreTemizlikBeyanType }
     *     
     */
    public CevreTemizlikBeyanType getCevreTemizlikBeyani() {
        return cevreTemizlikBeyani;
    }

    /**
     * Sets the value of the cevreTemizlikBeyani property.
     * 
     * @param value
     *     allowed object is
     *     {@link CevreTemizlikBeyanType }
     *     
     */
    public void setCevreTemizlikBeyani(CevreTemizlikBeyanType value) {
        this.cevreTemizlikBeyani = value;
    }

    /**
     * Gets the value of the ilanReklamBeyani property.
     * 
     * @return
     *     possible object is
     *     {@link IlanReklamBeyanType }
     *     
     */
    public IlanReklamBeyanType getIlanReklamBeyani() {
        return ilanReklamBeyani;
    }

    /**
     * Sets the value of the ilanReklamBeyani property.
     * 
     * @param value
     *     allowed object is
     *     {@link IlanReklamBeyanType }
     *     
     */
    public void setIlanReklamBeyani(IlanReklamBeyanType value) {
        this.ilanReklamBeyani = value;
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
