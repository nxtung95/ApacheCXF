
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateBookingResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBookingResult">
 *   &lt;complexContent>
 *     &lt;extension base="{api.timewriter.nl}RequestResult">
 *       &lt;sequence>
 *         &lt;element name="booking" type="{api.timewriter.nl}Booking"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBookingResult", propOrder = {
    "booking"
})
public class UpdateBookingResult
    extends RequestResult
{

    @XmlElement(required = true)
    protected Booking booking;

    /**
     * Gets the value of the booking property.
     * 
     * @return
     *     possible object is
     *     {@link Booking }
     *     
     */
    public Booking getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking }
     *     
     */
    public void setBooking(Booking value) {
        this.booking = value;
    }

}
