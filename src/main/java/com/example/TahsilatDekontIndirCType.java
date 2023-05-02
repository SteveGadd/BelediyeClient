
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tahsilatDekontIndirCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tahsilatDekontIndirCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dekont" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tahsilatDekontIndirCType", propOrder = {
    "dekont"
})
public class TahsilatDekontIndirCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected byte[] dekont;

    /**
     * Gets the value of the dekont property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDekont() {
        return dekont;
    }

    /**
     * Sets the value of the dekont property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDekont(byte[] value) {
        this.dekont = value;
    }

}
