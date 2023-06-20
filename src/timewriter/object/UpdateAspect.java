
package timewriter.object;

import timewriter.object.Aspect;
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
 *         &lt;element name="aspect" type="{api.timewriter.nl}Aspect"/>
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
    "aspect"
})
@XmlRootElement(name = "UpdateAspect")
public class UpdateAspect
    extends Request
{

    @XmlElement(required = true)
    protected Aspect aspect;

    /**
     * Gets the value of the aspect property.
     * 
     * @return
     *     possible object is
     *     {@link Aspect }
     *     
     */
    public Aspect getAspect() {
        return aspect;
    }

    /**
     * Sets the value of the aspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aspect }
     *     
     */
    public void setAspect(Aspect value) {
        this.aspect = value;
    }

}
