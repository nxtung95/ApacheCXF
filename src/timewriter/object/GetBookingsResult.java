
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBookingsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBookingsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{api.timewriter.soap.nl}RequestResult">
 *       &lt;sequence>
 *         &lt;element name="bookingList" type="{api.timewriter.soap.nl}BookingList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBookingsResult", propOrder = {
    "bookingList"
})
public class GetBookingsResult
    extends RequestResult
{

    @XmlElement(required = true)
    protected BookingList bookingList;

    /**
     * Gets the value of the bookingList property.
     * 
     * @return
     *     possible object is
     *     {@link BookingList }
     *     
     */
    public BookingList getBookingList() {
        return bookingList;
    }

    /**
     * Sets the value of the bookingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingList }
     *     
     */
    public void setBookingList(BookingList value) {
        this.bookingList = value;
    }

}
