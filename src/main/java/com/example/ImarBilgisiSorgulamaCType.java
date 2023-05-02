
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for imarBilgisiSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imarBilgisiSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imarBilgisi" type="{http://belediye.turkiye.gov.tr/v3}imarBilgisiType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imarBilgisiSorgulamaCType", propOrder = {
    "imarBilgisi"
})
public class ImarBilgisiSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true, nillable = true)
    protected ImarBilgisiType imarBilgisi;

    /**
     * Gets the value of the imarBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link ImarBilgisiType }
     *     
     */
    public ImarBilgisiType getImarBilgisi() {
        return imarBilgisi;
    }

    /**
     * Sets the value of the imarBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImarBilgisiType }
     *     
     */
    public void setImarBilgisi(ImarBilgisiType value) {
        this.imarBilgisi = value;
    }

}
