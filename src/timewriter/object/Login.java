
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
 *         &lt;element name="api_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="softwareDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "apiKey",
    "userKey",
    "softwareDesc"
})
@XmlRootElement(name = "Login")
public class Login {

    @XmlElement(name = "api_key", required = true)
    protected String apiKey;
    @XmlElement(name = "user_key", required = true)
    protected String userKey;
    @XmlElement(required = true)
    protected String softwareDesc;

    /**
     * Gets the value of the apiKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * Sets the value of the apiKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApiKey(String value) {
        this.apiKey = value;
    }

    /**
     * Gets the value of the userKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserKey() {
        return userKey;
    }

    /**
     * Sets the value of the userKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserKey(String value) {
        this.userKey = value;
    }

    /**
     * Gets the value of the softwareDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareDesc() {
        return softwareDesc;
    }

    /**
     * Sets the value of the softwareDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareDesc(String value) {
        this.softwareDesc = value;
    }

}
