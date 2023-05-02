
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sokakCaddeSorgulamaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sokakCaddeSorgulamaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sokakCaddeListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfSokakCaddeBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sokakCaddeSorgulamaCType", propOrder = {
    "sokakCaddeListesi"
})
public class SokakCaddeSorgulamaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfSokakCaddeBilgisi sokakCaddeListesi;

    /**
     * Gets the value of the sokakCaddeListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSokakCaddeBilgisi }
     *     
     */
    public ArrayOfSokakCaddeBilgisi getSokakCaddeListesi() {
        return sokakCaddeListesi;
    }

    /**
     * Sets the value of the sokakCaddeListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSokakCaddeBilgisi }
     *     
     */
    public void setSokakCaddeListesi(ArrayOfSokakCaddeBilgisi value) {
        this.sokakCaddeListesi = value;
    }

}
