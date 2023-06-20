
package timewriter.object;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT1-IT_AT1"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT2-IT_AT2"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT3-IT_AT3"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT4-IT_AT4"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT5-IT_AT5"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_MED-IT_MED"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT1-IT_AT1_ALL"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT2-IT_AT2_ALL"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT3-IT_AT3_ALL"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT4-IT_AT4_ALL"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_AT5-IT_AT5_ALL"/>
 *     &lt;enumeration value="GROUP_MEMBER-GR_MED-IT_MED_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT1"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT1"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-GR_AT1"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-GR_AT1"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT1_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT1_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT2"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT2"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-GR_AT2"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-GR_AT2"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT2_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT2_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT3"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT3"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-GR_AT3"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-GR_AT3"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT3_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT3_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT4"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT4"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-GR_AT4"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-GR_AT4"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT4_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT4_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT5"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT5"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-GR_AT5"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-GR_AT5"/>
 *     &lt;enumeration value="AUTHORIZATION-IT_MED-IT_AT5_ALL"/>
 *     &lt;enumeration value="AUTHORIZATION-GR_MED-IT_AT5_ALL"/>
 *     &lt;enumeration value="COMBINATION-IT_AT1-IT_AT2"/>
 *     &lt;enumeration value="COMBINATION-IT_AT1-GR_AT2"/>
 *     &lt;enumeration value="COMBINATION-GR_AT1-IT_AT2"/>
 *     &lt;enumeration value="COMBINATION-GR_AT1-GR_AT2"/>
 *     &lt;enumeration value="COMBINATION-IT_AT1-IT_AT2_ALL"/>
 *     &lt;enumeration value="COMBINATION-GR_AT1-IT_AT2_ALL"/>
 *     &lt;enumeration value="COMBINATION-IT_AT2-IT_AT3"/>
 *     &lt;enumeration value="COMBINATION-IT_AT2-GR_AT3"/>
 *     &lt;enumeration value="COMBINATION-GR_AT2-IT_AT3"/>
 *     &lt;enumeration value="COMBINATION-GR_AT2-GR_AT3"/>
 *     &lt;enumeration value="COMBINATION-IT_AT2-IT_AT3_ALL"/>
 *     &lt;enumeration value="COMBINATION-GR_AT2-IT_AT3_ALL"/>
 *     &lt;enumeration value="COMBINATION-IT_AT3-IT_AT4"/>
 *     &lt;enumeration value="COMBINATION-IT_AT3-GR_AT4"/>
 *     &lt;enumeration value="COMBINATION-GR_AT3-IT_AT4"/>
 *     &lt;enumeration value="COMBINATION-GR_AT3-GR_AT4"/>
 *     &lt;enumeration value="COMBINATION-IT_AT3-IT_AT4_ALL"/>
 *     &lt;enumeration value="COMBINATION-GR_AT3-IT_AT4_ALL"/>
 *     &lt;enumeration value="COMBINATION-IT_AT4-IT_AT5"/>
 *     &lt;enumeration value="COMBINATION-IT_AT4-GR_AT5"/>
 *     &lt;enumeration value="COMBINATION-GR_AT4-IT_AT5"/>
 *     &lt;enumeration value="COMBINATION-GR_AT4-GR_AT5"/>
 *     &lt;enumeration value="COMBINATION-IT_AT4-IT_AT5_ALL"/>
 *     &lt;enumeration value="COMBINATION-GR_AT4-IT_AT5_ALL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationType")
@XmlEnum
public enum RelationType {

    @XmlEnumValue("GROUP_MEMBER-GR_AT1-IT_AT1")
    GROUP_MEMBER_GR_AT_1_IT_AT_1("GROUP_MEMBER-GR_AT1-IT_AT1"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT2-IT_AT2")
    GROUP_MEMBER_GR_AT_2_IT_AT_2("GROUP_MEMBER-GR_AT2-IT_AT2"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT3-IT_AT3")
    GROUP_MEMBER_GR_AT_3_IT_AT_3("GROUP_MEMBER-GR_AT3-IT_AT3"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT4-IT_AT4")
    GROUP_MEMBER_GR_AT_4_IT_AT_4("GROUP_MEMBER-GR_AT4-IT_AT4"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT5-IT_AT5")
    GROUP_MEMBER_GR_AT_5_IT_AT_5("GROUP_MEMBER-GR_AT5-IT_AT5"),
    @XmlEnumValue("GROUP_MEMBER-GR_MED-IT_MED")
    GROUP_MEMBER_GR_MED_IT_MED("GROUP_MEMBER-GR_MED-IT_MED"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT1-IT_AT1_ALL")
    GROUP_MEMBER_GR_AT_1_IT_AT_1_ALL("GROUP_MEMBER-GR_AT1-IT_AT1_ALL"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT2-IT_AT2_ALL")
    GROUP_MEMBER_GR_AT_2_IT_AT_2_ALL("GROUP_MEMBER-GR_AT2-IT_AT2_ALL"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT3-IT_AT3_ALL")
    GROUP_MEMBER_GR_AT_3_IT_AT_3_ALL("GROUP_MEMBER-GR_AT3-IT_AT3_ALL"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT4-IT_AT4_ALL")
    GROUP_MEMBER_GR_AT_4_IT_AT_4_ALL("GROUP_MEMBER-GR_AT4-IT_AT4_ALL"),
    @XmlEnumValue("GROUP_MEMBER-GR_AT5-IT_AT5_ALL")
    GROUP_MEMBER_GR_AT_5_IT_AT_5_ALL("GROUP_MEMBER-GR_AT5-IT_AT5_ALL"),
    @XmlEnumValue("GROUP_MEMBER-GR_MED-IT_MED_ALL")
    GROUP_MEMBER_GR_MED_IT_MED_ALL("GROUP_MEMBER-GR_MED-IT_MED_ALL"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT1")
    AUTHORIZATION_IT_MED_IT_AT_1("AUTHORIZATION-IT_MED-IT_AT1"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT1")
    AUTHORIZATION_GR_MED_IT_AT_1("AUTHORIZATION-GR_MED-IT_AT1"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-GR_AT1")
    AUTHORIZATION_GR_MED_GR_AT_1("AUTHORIZATION-GR_MED-GR_AT1"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-GR_AT1")
    AUTHORIZATION_IT_MED_GR_AT_1("AUTHORIZATION-IT_MED-GR_AT1"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT1_ALL")
    AUTHORIZATION_IT_MED_IT_AT_1_ALL("AUTHORIZATION-IT_MED-IT_AT1_ALL"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT1_ALL")
    AUTHORIZATION_GR_MED_IT_AT_1_ALL("AUTHORIZATION-GR_MED-IT_AT1_ALL"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT2")
    AUTHORIZATION_IT_MED_IT_AT_2("AUTHORIZATION-IT_MED-IT_AT2"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT2")
    AUTHORIZATION_GR_MED_IT_AT_2("AUTHORIZATION-GR_MED-IT_AT2"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-GR_AT2")
    AUTHORIZATION_GR_MED_GR_AT_2("AUTHORIZATION-GR_MED-GR_AT2"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-GR_AT2")
    AUTHORIZATION_IT_MED_GR_AT_2("AUTHORIZATION-IT_MED-GR_AT2"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT2_ALL")
    AUTHORIZATION_IT_MED_IT_AT_2_ALL("AUTHORIZATION-IT_MED-IT_AT2_ALL"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT2_ALL")
    AUTHORIZATION_GR_MED_IT_AT_2_ALL("AUTHORIZATION-GR_MED-IT_AT2_ALL"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT3")
    AUTHORIZATION_IT_MED_IT_AT_3("AUTHORIZATION-IT_MED-IT_AT3"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT3")
    AUTHORIZATION_GR_MED_IT_AT_3("AUTHORIZATION-GR_MED-IT_AT3"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-GR_AT3")
    AUTHORIZATION_GR_MED_GR_AT_3("AUTHORIZATION-GR_MED-GR_AT3"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-GR_AT3")
    AUTHORIZATION_IT_MED_GR_AT_3("AUTHORIZATION-IT_MED-GR_AT3"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT3_ALL")
    AUTHORIZATION_IT_MED_IT_AT_3_ALL("AUTHORIZATION-IT_MED-IT_AT3_ALL"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT3_ALL")
    AUTHORIZATION_GR_MED_IT_AT_3_ALL("AUTHORIZATION-GR_MED-IT_AT3_ALL"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT4")
    AUTHORIZATION_IT_MED_IT_AT_4("AUTHORIZATION-IT_MED-IT_AT4"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT4")
    AUTHORIZATION_GR_MED_IT_AT_4("AUTHORIZATION-GR_MED-IT_AT4"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-GR_AT4")
    AUTHORIZATION_GR_MED_GR_AT_4("AUTHORIZATION-GR_MED-GR_AT4"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-GR_AT4")
    AUTHORIZATION_IT_MED_GR_AT_4("AUTHORIZATION-IT_MED-GR_AT4"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT4_ALL")
    AUTHORIZATION_IT_MED_IT_AT_4_ALL("AUTHORIZATION-IT_MED-IT_AT4_ALL"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT4_ALL")
    AUTHORIZATION_GR_MED_IT_AT_4_ALL("AUTHORIZATION-GR_MED-IT_AT4_ALL"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT5")
    AUTHORIZATION_IT_MED_IT_AT_5("AUTHORIZATION-IT_MED-IT_AT5"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT5")
    AUTHORIZATION_GR_MED_IT_AT_5("AUTHORIZATION-GR_MED-IT_AT5"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-GR_AT5")
    AUTHORIZATION_GR_MED_GR_AT_5("AUTHORIZATION-GR_MED-GR_AT5"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-GR_AT5")
    AUTHORIZATION_IT_MED_GR_AT_5("AUTHORIZATION-IT_MED-GR_AT5"),
    @XmlEnumValue("AUTHORIZATION-IT_MED-IT_AT5_ALL")
    AUTHORIZATION_IT_MED_IT_AT_5_ALL("AUTHORIZATION-IT_MED-IT_AT5_ALL"),
    @XmlEnumValue("AUTHORIZATION-GR_MED-IT_AT5_ALL")
    AUTHORIZATION_GR_MED_IT_AT_5_ALL("AUTHORIZATION-GR_MED-IT_AT5_ALL"),
    @XmlEnumValue("COMBINATION-IT_AT1-IT_AT2")
    COMBINATION_IT_AT_1_IT_AT_2("COMBINATION-IT_AT1-IT_AT2"),
    @XmlEnumValue("COMBINATION-IT_AT1-GR_AT2")
    COMBINATION_IT_AT_1_GR_AT_2("COMBINATION-IT_AT1-GR_AT2"),
    @XmlEnumValue("COMBINATION-GR_AT1-IT_AT2")
    COMBINATION_GR_AT_1_IT_AT_2("COMBINATION-GR_AT1-IT_AT2"),
    @XmlEnumValue("COMBINATION-GR_AT1-GR_AT2")
    COMBINATION_GR_AT_1_GR_AT_2("COMBINATION-GR_AT1-GR_AT2"),
    @XmlEnumValue("COMBINATION-IT_AT1-IT_AT2_ALL")
    COMBINATION_IT_AT_1_IT_AT_2_ALL("COMBINATION-IT_AT1-IT_AT2_ALL"),
    @XmlEnumValue("COMBINATION-GR_AT1-IT_AT2_ALL")
    COMBINATION_GR_AT_1_IT_AT_2_ALL("COMBINATION-GR_AT1-IT_AT2_ALL"),
    @XmlEnumValue("COMBINATION-IT_AT2-IT_AT3")
    COMBINATION_IT_AT_2_IT_AT_3("COMBINATION-IT_AT2-IT_AT3"),
    @XmlEnumValue("COMBINATION-IT_AT2-GR_AT3")
    COMBINATION_IT_AT_2_GR_AT_3("COMBINATION-IT_AT2-GR_AT3"),
    @XmlEnumValue("COMBINATION-GR_AT2-IT_AT3")
    COMBINATION_GR_AT_2_IT_AT_3("COMBINATION-GR_AT2-IT_AT3"),
    @XmlEnumValue("COMBINATION-GR_AT2-GR_AT3")
    COMBINATION_GR_AT_2_GR_AT_3("COMBINATION-GR_AT2-GR_AT3"),
    @XmlEnumValue("COMBINATION-IT_AT2-IT_AT3_ALL")
    COMBINATION_IT_AT_2_IT_AT_3_ALL("COMBINATION-IT_AT2-IT_AT3_ALL"),
    @XmlEnumValue("COMBINATION-GR_AT2-IT_AT3_ALL")
    COMBINATION_GR_AT_2_IT_AT_3_ALL("COMBINATION-GR_AT2-IT_AT3_ALL"),
    @XmlEnumValue("COMBINATION-IT_AT3-IT_AT4")
    COMBINATION_IT_AT_3_IT_AT_4("COMBINATION-IT_AT3-IT_AT4"),
    @XmlEnumValue("COMBINATION-IT_AT3-GR_AT4")
    COMBINATION_IT_AT_3_GR_AT_4("COMBINATION-IT_AT3-GR_AT4"),
    @XmlEnumValue("COMBINATION-GR_AT3-IT_AT4")
    COMBINATION_GR_AT_3_IT_AT_4("COMBINATION-GR_AT3-IT_AT4"),
    @XmlEnumValue("COMBINATION-GR_AT3-GR_AT4")
    COMBINATION_GR_AT_3_GR_AT_4("COMBINATION-GR_AT3-GR_AT4"),
    @XmlEnumValue("COMBINATION-IT_AT3-IT_AT4_ALL")
    COMBINATION_IT_AT_3_IT_AT_4_ALL("COMBINATION-IT_AT3-IT_AT4_ALL"),
    @XmlEnumValue("COMBINATION-GR_AT3-IT_AT4_ALL")
    COMBINATION_GR_AT_3_IT_AT_4_ALL("COMBINATION-GR_AT3-IT_AT4_ALL"),
    @XmlEnumValue("COMBINATION-IT_AT4-IT_AT5")
    COMBINATION_IT_AT_4_IT_AT_5("COMBINATION-IT_AT4-IT_AT5"),
    @XmlEnumValue("COMBINATION-IT_AT4-GR_AT5")
    COMBINATION_IT_AT_4_GR_AT_5("COMBINATION-IT_AT4-GR_AT5"),
    @XmlEnumValue("COMBINATION-GR_AT4-IT_AT5")
    COMBINATION_GR_AT_4_IT_AT_5("COMBINATION-GR_AT4-IT_AT5"),
    @XmlEnumValue("COMBINATION-GR_AT4-GR_AT5")
    COMBINATION_GR_AT_4_GR_AT_5("COMBINATION-GR_AT4-GR_AT5"),
    @XmlEnumValue("COMBINATION-IT_AT4-IT_AT5_ALL")
    COMBINATION_IT_AT_4_IT_AT_5_ALL("COMBINATION-IT_AT4-IT_AT5_ALL"),
    @XmlEnumValue("COMBINATION-GR_AT4-IT_AT5_ALL")
    COMBINATION_GR_AT_4_IT_AT_5_ALL("COMBINATION-GR_AT4-IT_AT5_ALL");
    private final String value;

    RelationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationType fromValue(String v) {
        for (RelationType c: RelationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
