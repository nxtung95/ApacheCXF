
package timewriter.object;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringPatternType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecurringPatternType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WEEK"/>
 *     &lt;enumeration value="MONTH"/>
 *     &lt;enumeration value="YEAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecurringPatternType")
@XmlEnum
public enum RecurringPatternType {

    WEEK,
    MONTH,
    YEAR;

    public String value() {
        return name();
    }

    public static RecurringPatternType fromValue(String v) {
        return valueOf(v);
    }

}
