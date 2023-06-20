
package timewriter.object;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AspectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AspectType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IT_MED"/>
 *     &lt;enumeration value="IT_AT1"/>
 *     &lt;enumeration value="IT_AT2"/>
 *     &lt;enumeration value="IT_AT3"/>
 *     &lt;enumeration value="IT_AT4"/>
 *     &lt;enumeration value="IT_AT5"/>
 *     &lt;enumeration value="GR_MED"/>
 *     &lt;enumeration value="GR_AT1"/>
 *     &lt;enumeration value="GR_AT2"/>
 *     &lt;enumeration value="GR_AT3"/>
 *     &lt;enumeration value="GR_AT4"/>
 *     &lt;enumeration value="GR_AT5"/>
 *     &lt;enumeration value="IT_TAA"/>
 *     &lt;enumeration value="GR_TAA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AspectType")
@XmlEnum
public enum AspectType {

    IT_MED("IT_MED"),
    @XmlEnumValue("IT_AT1")
    IT_AT_1("IT_AT1"),
    @XmlEnumValue("IT_AT2")
    IT_AT_2("IT_AT2"),
    @XmlEnumValue("IT_AT3")
    IT_AT_3("IT_AT3"),
    @XmlEnumValue("IT_AT4")
    IT_AT_4("IT_AT4"),
    @XmlEnumValue("IT_AT5")
    IT_AT_5("IT_AT5"),
    GR_MED("GR_MED"),
    @XmlEnumValue("GR_AT1")
    GR_AT_1("GR_AT1"),
    @XmlEnumValue("GR_AT2")
    GR_AT_2("GR_AT2"),
    @XmlEnumValue("GR_AT3")
    GR_AT_3("GR_AT3"),
    @XmlEnumValue("GR_AT4")
    GR_AT_4("GR_AT4"),
    @XmlEnumValue("GR_AT5")
    GR_AT_5("GR_AT5"),
    IT_TAA("IT_TAA"),
    GR_TAA("GR_TAA");
    private final String value;

    AspectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AspectType fromValue(String v) {
        for (AspectType c: AspectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
