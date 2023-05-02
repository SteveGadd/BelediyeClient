
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for hayvanSahiplenmeBasvuruRespType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hayvanSahiplenmeBasvuruRespType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}hayvanSahiplenmeBasvuruBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basvuruNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="hayvanBilgisi" type="{http://belediye.turkiye.gov.tr/v3}barinaktakiHayvanBilgisi"/&gt;
 *         &lt;element name="basvuruDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="basvuruDurumuAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "hayvanSahiplenmeBasvuruRespType", propOrder = {
    "basvuruNumarasi",
    "basvuruTarihi",
    "hayvanBilgisi",
    "basvuruDurumu",
    "basvuruDurumuAciklama",
    "detayListesi"
})
public class HayvanSahiplenmeBasvuruRespType
    extends HayvanSahiplenmeBasvuruBaseType
{

    @XmlElement(required = true)
    protected String basvuruNumarasi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar basvuruTarihi;
    @XmlElement(required = true)
    protected BarinaktakiHayvanBilgisi hayvanBilgisi;
    @XmlElement(required = true)
    protected String basvuruDurumu;
    @XmlElement(required = true)
    protected String basvuruDurumuAciklama;
    @XmlElement(required = true)
    protected ArrayOfDetailType detayListesi;

    /**
     * Gets the value of the basvuruNumarasi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruNumarasi() {
        return basvuruNumarasi;
    }

    /**
     * Sets the value of the basvuruNumarasi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruNumarasi(String value) {
        this.basvuruNumarasi = value;
    }

    /**
     * Gets the value of the basvuruTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBasvuruTarihi() {
        return basvuruTarihi;
    }

    /**
     * Sets the value of the basvuruTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBasvuruTarihi(XMLGregorianCalendar value) {
        this.basvuruTarihi = value;
    }

    /**
     * Gets the value of the hayvanBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link BarinaktakiHayvanBilgisi }
     *     
     */
    public BarinaktakiHayvanBilgisi getHayvanBilgisi() {
        return hayvanBilgisi;
    }

    /**
     * Sets the value of the hayvanBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarinaktakiHayvanBilgisi }
     *     
     */
    public void setHayvanBilgisi(BarinaktakiHayvanBilgisi value) {
        this.hayvanBilgisi = value;
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
     * Gets the value of the basvuruDurumuAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasvuruDurumuAciklama() {
        return basvuruDurumuAciklama;
    }

    /**
     * Sets the value of the basvuruDurumuAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasvuruDurumuAciklama(String value) {
        this.basvuruDurumuAciklama = value;
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
