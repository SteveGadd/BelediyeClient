
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for nikahSalonDurumSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nikahSalonDurumSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nikahSalonKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tarih" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nikahSalonDurumSorgulaGType", propOrder = {
    "nikahSalonKodu",
    "tarih"
})
public class NikahSalonDurumSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String nikahSalonKodu;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tarih;

    /**
     * Gets the value of the nikahSalonKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNikahSalonKodu() {
        return nikahSalonKodu;
    }

    /**
     * Sets the value of the nikahSalonKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNikahSalonKodu(String value) {
        this.nikahSalonKodu = value;
    }

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

}
