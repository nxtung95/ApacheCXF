
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateAspectResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAspectResult">
 *   &lt;complexContent>
 *     &lt;extension base="{api.timewriter.nl}RequestResult">
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
@XmlType(name = "UpdateAspectResult", propOrder = {
    "aspect"
})
public class UpdateAspectResult
    extends RequestResult
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
