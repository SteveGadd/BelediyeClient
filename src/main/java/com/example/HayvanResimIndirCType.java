
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hayvanResimIndirCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hayvanResimIndirCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hayvanResim" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hayvanResimIndirCType", propOrder = {
    "hayvanResim"
})
public class HayvanResimIndirCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected byte[] hayvanResim;

    /**
     * Gets the value of the hayvanResim property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHayvanResim() {
        return hayvanResim;
    }

    /**
     * Sets the value of the hayvanResim property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHayvanResim(byte[] value) {
        this.hayvanResim = value;
    }

}
