
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAspectsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAspectsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{api.timewriter.soap.nl}RequestResult">
 *       &lt;sequence>
 *         &lt;element name="aspectList" type="{api.timewriter.soap.nl}AspectList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAspectsResult", propOrder = {
    "aspectList"
})
public class GetAspectsResult
    extends RequestResult
{

    @XmlElement(required = true)
    protected AspectList aspectList;

    /**
     * Gets the value of the aspectList property.
     * 
     * @return
     *     possible object is
     *     {@link AspectList }
     *     
     */
    public AspectList getAspectList() {
        return aspectList;
    }

    /**
     * Sets the value of the aspectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AspectList }
     *     
     */
    public void setAspectList(AspectList value) {
        this.aspectList = value;
    }

}
