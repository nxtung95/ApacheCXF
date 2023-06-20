
package timewriter.object;

import timewriter.object.Booking;
import timewriter.object.Request;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{api.timewriter.nl}Request">
 *       &lt;sequence>
 *         &lt;element name="booking" type="{api.timewriter.nl}Booking"/>
 *         &lt;element name="roundTimes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "booking",
    "roundTimes"
})
@XmlRootElement(name = "UpdateBooking")
public class UpdateBooking
    extends Request
{

    @XmlElement(required = true)
    protected Booking booking;
    protected boolean roundTimes;

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

    /**
     * Gets the value of the roundTimes property.
     * 
     */
    public boolean isRoundTimes() {
        return roundTimes;
    }

    /**
     * Sets the value of the roundTimes property.
     * 
     */
    public void setRoundTimes(boolean value) {
        this.roundTimes = value;
    }

}
