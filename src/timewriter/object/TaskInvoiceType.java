
package timewriter.object;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskInvoiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaskInvoiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="SUBSEQUENT_CALC"/>
 *     &lt;enumeration value="FIXED_PRICE"/>
 *     &lt;enumeration value="RECURRING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaskInvoiceType")
@XmlEnum
public enum TaskInvoiceType {

    NONE,
    SUBSEQUENT_CALC,
    FIXED_PRICE,
    RECURRING;

    public String value() {
        return name();
    }

    public static TaskInvoiceType fromValue(String v) {
        return valueOf(v);
    }

}
