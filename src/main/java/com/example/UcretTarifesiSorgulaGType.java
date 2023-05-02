
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ucretTarifesiSorgulaGType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ucretTarifesiSorgulaGType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}sorguParametreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belediyeMudurlukKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="arananIfade" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ucretTarifesiSorgulaGType", propOrder = {
    "belediyeMudurlukKodu",
    "arananIfade"
})
public class UcretTarifesiSorgulaGType
    extends SorguParametreType
{

    @XmlElement(required = true)
    protected String belediyeMudurlukKodu;
    @XmlElement(required = true)
    protected String arananIfade;

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
     * Gets the value of the arananIfade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArananIfade() {
        return arananIfade;
    }

    /**
     * Sets the value of the arananIfade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArananIfade(String value) {
        this.arananIfade = value;
    }

}
