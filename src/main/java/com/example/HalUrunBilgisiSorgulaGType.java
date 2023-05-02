
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for halUrunBilgisiSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="halUrunBilgisiSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tarih" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="halKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="kategoriKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "halUrunBilgisiSorgulaGType", propOrder = {
    "tarih",
    "halKodu",
    "kategoriKodu"
})
public class HalUrunBilgisiSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tarih;
    @XmlElement(required = true)
    protected String halKodu;
    @XmlElement(required = true)
    protected String kategoriKodu;

    /**
     * Gets the value of the tarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTarih() {
        return tarih;
    }

    /**
     * Sets the value of the tarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTarih(XMLGregorianCalendar value) {
        this.tarih = value;
    }

    /**
     * Gets the value of the halKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalKodu() {
        return halKodu;
    }

    /**
     * Sets the value of the halKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalKodu(String value) {
        this.halKodu = value;
    }

    /**
     * Gets the value of the kategoriKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKategoriKodu() {
        return kategoriKodu;
    }

    /**
     * Sets the value of the kategoriKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKategoriKodu(String value) {
        this.kategoriKodu = value;
    }

}
