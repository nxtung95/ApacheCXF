
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{api.timewriter.soap.nl}Request">
 *       &lt;sequence>
 *         &lt;element name="aspect" type="{api.timewriter.soap.nl}Aspect"/>
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
