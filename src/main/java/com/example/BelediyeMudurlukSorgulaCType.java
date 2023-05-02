
package com.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for belediyeMudurlukSorgulaCType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="belediyeMudurlukSorgulaCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v3}islemSonucType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belediyeMudurlukListesi" type="{http://belediye.turkiye.gov.tr/v3}arrayOfBelediyeMudurlukBilgisi"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "belediyeMudurlukSorgulaCType", propOrder = {
    "belediyeMudurlukListesi"
})
public class BelediyeMudurlukSorgulaCType
    extends IslemSonucType
{

    @XmlElement(required = true)
    protected ArrayOfBelediyeMudurlukBilgisi belediyeMudurlukListesi;

    /**
     * Gets the value of the belediyeMudurlukListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBelediyeMudurlukBilgisi }
     *     
     */
    public ArrayOfBelediyeMudurlukBilgisi getBelediyeMudurlukListesi() {
        return belediyeMudurlukListesi;
    }

    /**
     * Sets the value of the belediyeMudurlukListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBelediyeMudurlukBilgisi }
     *     
     */
    public void setBelediyeMudurlukListesi(ArrayOfBelediyeMudurlukBilgisi value) {
        this.belediyeMudurlukListesi = value;
    }

}
