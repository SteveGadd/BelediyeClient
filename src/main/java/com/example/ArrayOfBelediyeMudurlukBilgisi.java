
package com.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfBelediyeMudurlukBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfBelediyeMudurlukBilgisi"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mudurlukBilgisi" type="{http://belediye.turkiye.gov.tr/v3}belediyeMudurlukBilgisiType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfBelediyeMudurlukBilgisi", propOrder = {
    "mudurlukBilgisi"
})
public class ArrayOfBelediyeMudurlukBilgisi {

    protected List<BelediyeMudurlukBilgisiType> mudurlukBilgisi;

    /**
     * Gets the value of the mudurlukBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mudurlukBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMudurlukBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BelediyeMudurlukBilgisiType }
     * 
     * 
     */
    public List<BelediyeMudurlukBilgisiType> getMudurlukBilgisi() {
        if (mudurlukBilgisi == null) {
            mudurlukBilgisi = new ArrayList<BelediyeMudurlukBilgisiType>();
        }
        return this.mudurlukBilgisi;
    }

}
