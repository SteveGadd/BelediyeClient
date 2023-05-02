
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eBeyanSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eBeyanSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eBeyanListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfEBeyanType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eBeyanSorgulamaCType", propOrder = {
    "eBeyanListesi"
})
public class EBeyanSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfEBeyanType eBeyanListesi;

    /**
     * Gets the value of the eBeyanListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEBeyanType }
     *     
     */
    public ArrayOfEBeyanType getEBeyanListesi() {
        return eBeyanListesi;
    }

    /**
     * Sets the value of the eBeyanListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEBeyanType }
     *     
     */
    public void setEBeyanListesi(ArrayOfEBeyanType value) {
        this.eBeyanListesi = value;
    }

}
