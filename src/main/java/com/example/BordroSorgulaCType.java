
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bordroSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bordroSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belge" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bordroSorgulaCType", propOrder = {
    "belge"
})
public class BordroSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected byte[] belge;

    /**
     * Gets the value of the belge property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBelge() {
        return belge;
    }

    /**
     * Sets the value of the belge property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBelge(byte[] value) {
        this.belge = value;
    }

}
