
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Relation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Relation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id1" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="id2" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="relationType" type="{api.timewriter.nl}RelationTypeString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Relation", propOrder = {
    "id1",
    "id2",
    "relationType"
})
public class Relation {

    protected long id1;
    protected long id2;
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
