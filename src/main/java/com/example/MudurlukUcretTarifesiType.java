
package com.example;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mudurlukUcretTarifesiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mudurlukUcretTarifesiType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belediyeMudurlukKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="belediyeMudurlukAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tarifeYil" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="mudurlukAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ucretTarifesiListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfUcretTarifesiBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mudurlukUcretTarifesiType", propOrder = {
    "belediyeMudurlukKodu",
    "belediyeMudurlukAdi",
    "tarifeYil",
    "mudurlukAciklama",
    "ucretTarifesiListesi"
})
public class MudurlukUcretTarifesiType {

    @XmlElement(required = true)
    protected String belediyeMudurlukKodu;
    @XmlElement(required = true)
    protected String belediyeMudurlukAdi;
    @XmlElement(required = true)
    protected BigInteger tarifeYil;
    @XmlElement(required = true)
    protected String mudurlukAciklama;
    @XmlElement(required = true)
    protected ArrayOfUcretTarifesiBilgisi ucretTarifesiListesi;

    /**
     * Gets the value of the belediyeMudurlukKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelediyeMudurlukKodu() {
        return belediyeMudurlukKodu;
    }

    /**
     * Sets the value of the belediyeMudurlukKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelediyeMudurlukKodu(String value) {
        this.belediyeMudurlukKodu = value;
    }

    /**
     * Gets the value of the belediyeMudurlukAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelediyeMudurlukAdi() {
        return belediyeMudurlukAdi;
    }

    /**
     * Sets the value of the belediyeMudurlukAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelediyeMudurlukAdi(String value) {
        this.belediyeMudurlukAdi = value;
    }

    /**
     * Gets the value of the tarifeYil property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTarifeYil() {
        return tarifeYil;
    }

    /**
     * Sets the value of the tarifeYil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTarifeYil(BigInteger value) {
        this.tarifeYil = value;
    }

    /**
     * Gets the value of the mudurlukAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMudurlukAciklama() {
        return mudurlukAciklama;
    }

    /**
     * Sets the value of the mudurlukAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMudurlukAciklama(String value) {
        this.mudurlukAciklama = value;
    }

    /**
     * Gets the value of the ucretTarifesiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUcretTarifesiBilgisi }
     *     
     */
    public ArrayOfUcretTarifesiBilgisi getUcretTarifesiListesi() {
        return ucretTarifesiListesi;
    }

    /**
     * Sets the value of the ucretTarifesiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUcretTarifesiBilgisi }
     *     
     */
    public void setUcretTarifesiListesi(ArrayOfUcretTarifesiBilgisi value) {
        this.ucretTarifesiListesi = value;
    }

}
