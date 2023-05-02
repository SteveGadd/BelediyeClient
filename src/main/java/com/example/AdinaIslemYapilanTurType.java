
package com.example;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adinaIslemYapilanTurType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="adinaIslemYapilanTurType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GERCEK"/&gt;
 *     &lt;enumeration value="TUZEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "adinaIslemYapilanTurType")
@XmlEnum
public enum AdinaIslemYapilanTurType {

    GERCEK,
    TUZEL;

    public String value() {
        return name();
    }

    public static AdinaIslemYapilanTurType fromValue(String v) {
        return valueOf(v);
    }

}
