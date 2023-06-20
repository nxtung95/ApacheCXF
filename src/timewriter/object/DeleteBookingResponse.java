
package timewriter.object;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{api.timewriter.nl}DeleteBookingResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result"
})
@XmlRootElement(name = "DeleteBookingResponse")
public class DeleteBookingResponse {

    @XmlElement(required = true)
    protected DeleteBookingResult result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteBookingResult }
     *     
     */
    public DeleteBookingResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteBookingResult }
     *     
     */
    public void setResult(DeleteBookingResult value) {
        this.result = value;
    }

}