
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gerekliBelgeBilgileriType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gerekliBelgeBilgileriType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gerekliBelgelerIcinAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="gerekliBelgeListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBasvuruGerekliBelgeler"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gerekliBelgeBilgileriType", propOrder = {
    "gerekliBelgelerIcinAciklama",
    "gerekliBelgeListesi"
})
public class GerekliBelgeBilgileriType {

    @XmlElement(required = true)
    protected String gerekliBelgelerIcinAciklama;
    @XmlElement(required = true)
    protected ArrayOfBasvuruGerekliBelgeler gerekliBelgeListesi;

    /**
     * Gets the value of the gerekliBelgelerIcinAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGerekliBelgelerIcinAciklama() {
        return gerekliBelgelerIcinAciklama;
    }

    /**
     * Sets the value of the gerekliBelgelerIcinAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGerekliBelgelerIcinAciklama(String value) {
        this.gerekliBelgelerIcinAciklama = value;
    }

    /**
     * Gets the value of the gerekliBelgeListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBasvuruGerekliBelgeler }
     *     
     */
    public ArrayOfBasvuruGerekliBelgeler getGerekliBelgeListesi() {
        return gerekliBelgeListesi;
    }

    /**
     * Sets the value of the gerekliBelgeListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBasvuruGerekliBelgeler }
     *     
     */
    public void setGerekliBelgeListesi(ArrayOfBasvuruGerekliBelgeler value) {
        this.gerekliBelgeListesi = value;
    }

}
