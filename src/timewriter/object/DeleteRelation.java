
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
 *         &lt;element name="id1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="relationType" type="{api.timewriter.nl}RelationTypeString"/>
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
    "id1",
    "id2",
    "relationType"
})
@XmlRootElement(name = "DeleteRelation")
public class DeleteRelation
    extends Request
{

    protected long id1;
    protected long id2;
    @XmlElement(required = true)
    protected String relationType;

    /**
     * Gets the value of the id1 property.
     * 
     */
    public long getId1() {
        return id1;
    }

    /**
     * Sets the value of the id1 property.
     * 
     */
    public void setId1(long value) {
        this.id1 = value;
    }

    /**
     * Gets the value of the id2 property.
     * 
     */
    public long getId2() {
        return id2;
    }

    /**
     * Sets the value of the id2 property.
     * 
     */
    public void setId2(long value) {
        this.id2 = value;
    }

    /**
     * Gets the value of the relationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * Sets the value of the relationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationType(String value) {
        this.relationType = value;
    }

}
