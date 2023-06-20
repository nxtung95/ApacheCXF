
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
 *     &lt;extension base="{api.timewriter.nl}Request">
 *       &lt;sequence>
 *         &lt;element name="aspectType" type="{api.timewriter.nl}AspectTypeString"/>
 *         &lt;element name="filters" type="{api.timewriter.nl}Filters" minOccurs="0"/>
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
    "aspectType",
    "filters"
})
@XmlRootElement(name = "GetAspects")
public class GetAspects
    extends Request
{

    @XmlElement(required = true)
    protected String aspectType;
    protected Filters filters;

    /**
     * Gets the value of the aspectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectType() {
        return aspectType;
    }

    /**
     * Sets the value of the aspectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectType(String value) {
        this.aspectType = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link Filters }
     *     
     */
    public Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filters }
     *     
     */
    public void setFilters(Filters value) {
        this.filters = value;
    }

}
