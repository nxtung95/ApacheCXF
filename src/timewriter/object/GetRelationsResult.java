
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetRelationsResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetRelationsResult">
 *   &lt;complexContent>
 *     &lt;extension base="{api.timewriter.nl}RequestResult">
 *       &lt;sequence>
 *         &lt;element name="relationList" type="{api.timewriter.nl}RelationList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetRelationsResult", propOrder = {
    "relationList"
})
public class GetRelationsResult
    extends RequestResult
{

    @XmlElement(required = true)
    protected RelationList relationList;

    /**
     * Gets the value of the relationList property.
     * 
     * @return
     *     possible object is
     *     {@link RelationList }
     *     
     */
    public RelationList getRelationList() {
        return relationList;
    }

    /**
     * Sets the value of the relationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationList }
     *     
     */
    public void setRelationList(RelationList value) {
        this.relationList = value;
    }

}
