
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for beyanBilgisiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beyanBilgisiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beyanNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sicilNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanTuru" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="beyanTarih" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="adresListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfAdresBilgisi"/&gt;
 *         &lt;element name="ada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pafta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parsel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="rayicBedel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="edinmeTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="arsaAlani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="arsaHisseOran" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="binaAlani" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="binaHisseOran" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "beyanBilgisiType", propOrder = {
    "beyanNo",
    "sicilNo",
    "beyanTuru",
    "beyanTarih",
    "adresListesi",
    "ada",
    "pafta",
    "parsel",
    "rayicBedel",
    "edinmeTarihi",
    "arsaAlani",
    "arsaHisseOran",
    "binaAlani",
    "binaHisseOran",
    "aciklama",
    "detayListesi"
})
public class BeyanBilgisiType {

    @XmlElement(required = true)
    protected String beyanNo;
    @XmlElement(required = true)
    protected String sicilNo;
    @XmlElement(required = true)
    protected String beyanTuru;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beyanTarih;
    @XmlElement(required = true)
    protected ArrayOfAdresBilgisi adresListesi;
    @XmlElement(required = true)
    protected String ada;
    @XmlElement(required = true)
    protected String pafta;
    @XmlElement(required = true)
    protected String parsel;
    @XmlElement(required = true)
    protected String rayicBedel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar edinmeTarihi;
    @XmlElement(required = true)
    protected String arsaAlani;
    @XmlElement(required = true)
    protected String arsaHisseOran;
    @XmlElement(required = true)
    protected String binaAlani;
    @XmlElement(required = true)
    protected String binaHisseOran;
    @XmlElement(required = true)
    protected String aciklama;
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
     * Gets the value of the sicilNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicilNo() {
        return sicilNo;
    }

    /**
     * Sets the value of the sicilNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicilNo(String value) {
        this.sicilNo = value;
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
     * Gets the value of the beyanTarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeyanTarih() {
        return beyanTarih;
    }

    /**
     * Sets the value of the beyanTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeyanTarih(XMLGregorianCalendar value) {
        this.beyanTarih = value;
    }

    /**
     * Gets the value of the adresListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAdresBilgisi }
     *     
     */
    public ArrayOfAdresBilgisi getAdresListesi() {
        return adresListesi;
    }

    /**
     * Sets the value of the adresListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAdresBilgisi }
     *     
     */
    public void setAdresListesi(ArrayOfAdresBilgisi value) {
        this.adresListesi = value;
    }

    /**
     * Gets the value of the ada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAda() {
        return ada;
    }

    /**
     * Sets the value of the ada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAda(String value) {
        this.ada = value;
    }

    /**
     * Gets the value of the pafta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPafta() {
        return pafta;
    }

    /**
     * Sets the value of the pafta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPafta(String value) {
        this.pafta = value;
    }

    /**
     * Gets the value of the parsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParsel() {
        return parsel;
    }

    /**
     * Sets the value of the parsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParsel(String value) {
        this.parsel = value;
    }

    /**
     * Gets the value of the rayicBedel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRayicBedel() {
        return rayicBedel;
    }

    /**
     * Sets the value of the rayicBedel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRayicBedel(String value) {
        this.rayicBedel = value;
    }

    /**
     * Gets the value of the edinmeTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEdinmeTarihi() {
        return edinmeTarihi;
    }

    /**
     * Sets the value of the edinmeTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEdinmeTarihi(XMLGregorianCalendar value) {
        this.edinmeTarihi = value;
    }

    /**
     * Gets the value of the arsaAlani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArsaAlani() {
        return arsaAlani;
    }

    /**
     * Sets the value of the arsaAlani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArsaAlani(String value) {
        this.arsaAlani = value;
    }

    /**
     * Gets the value of the arsaHisseOran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArsaHisseOran() {
        return arsaHisseOran;
    }

    /**
     * Sets the value of the arsaHisseOran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArsaHisseOran(String value) {
        this.arsaHisseOran = value;
    }

    /**
     * Gets the value of the binaAlani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaAlani() {
        return binaAlani;
    }

    /**
     * Sets the value of the binaAlani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaAlani(String value) {
        this.binaAlani = value;
    }

    /**
     * Gets the value of the binaHisseOran property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaHisseOran() {
        return binaHisseOran;
    }

    /**
     * Sets the value of the binaHisseOran property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaHisseOran(String value) {
        this.binaHisseOran = value;
    }

    /**
     * Gets the value of the aciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAciklama() {
        return aciklama;
    }

    /**
     * Sets the value of the aciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAciklama(String value) {
        this.aciklama = value;
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
