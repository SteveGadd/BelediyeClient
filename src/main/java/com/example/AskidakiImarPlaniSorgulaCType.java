
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for askidakiImarPlaniSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="askidakiImarPlaniSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="imarAskiListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfImarAskiBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "askidakiImarPlaniSorgulaCType", propOrder = {
    "imarAskiListesi"
})
public class AskidakiImarPlaniSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfImarAskiBilgisi imarAskiListesi;

    /**
     * Gets the value of the imarAskiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImarAskiBilgisi }
     *     
     */
    public ArrayOfImarAskiBilgisi getImarAskiListesi() {
        return imarAskiListesi;
    }

    /**
     * Sets the value of the imarAskiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImarAskiBilgisi }
     *     
     */
    public void setImarAskiListesi(ArrayOfImarAskiBilgisi value) {
        this.imarAskiListesi = value;
    }

}
