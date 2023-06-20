
package timewriter.object;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;


/**
 * <p>Java class for Booking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Booking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="approvalLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="leaveState" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="invoiced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tariff" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="id_IT_MED" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_GR_MED" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_TAA" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="name_IT_MED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_GR_MED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_IT_TAA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_IT_AT1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_IT_AT2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_IT_AT3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_IT_AT4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name_IT_AT5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="userFieldList" type="{api.timewriter.nl}UserFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Booking", propOrder = {
    "id",
    "start",
    "duration",
    "approvalLevel",
    "leaveState",
    "invoiced",
    "tariff",
    "idITMED",
    "idGRMED",
    "idITTAA",
    "idITAT1",
    "idITAT2",
    "idITAT3",
    "idITAT4",
    "idITAT5",
    "nameITMED",
    "nameGRMED",
    "nameITTAA",
    "nameITAT1",
    "nameITAT2",
    "nameITAT3",
    "nameITAT4",
    "nameITAT5",
    "timestamp",
    "userFieldList"
})
public class Booking {

    protected Long id;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(required = true)
    protected BigInteger duration;
    protected BigInteger approvalLevel;
    protected BigInteger leaveState;
    protected Boolean invoiced;
    protected Float tariff;
    @XmlElement(name = "id_IT_MED")
    protected Long idITMED;
    @XmlElement(name = "id_GR_MED")
    protected Long idGRMED;
    @XmlElement(name = "id_IT_TAA")
    protected Long idITTAA;
    @XmlElement(name = "id_IT_AT1")
    protected Long idITAT1;
    @XmlElement(name = "id_IT_AT2")
    protected Long idITAT2;
    @XmlElement(name = "id_IT_AT3")
    protected Long idITAT3;
    @XmlElement(name = "id_IT_AT4")
    protected Long idITAT4;
    @XmlElement(name = "id_IT_AT5")
    protected Long idITAT5;
    @XmlElement(name = "name_IT_MED")
    protected String nameITMED;
    @XmlElement(name = "name_GR_MED")
    protected String nameGRMED;
    @XmlElement(name = "name_IT_TAA")
    protected String nameITTAA;
    @XmlElement(name = "name_IT_AT1")
    protected String nameITAT1;
    @XmlElement(name = "name_IT_AT2")
    protected String nameITAT2;
    @XmlElement(name = "name_IT_AT3")
    protected String nameITAT3;
    @XmlElement(name = "name_IT_AT4")
    protected String nameITAT4;
    @XmlElement(name = "name_IT_AT5")
    protected String nameITAT5;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    protected UserFieldList userFieldList;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStart(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the approvalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApprovalLevel() {
        return approvalLevel;
    }

    /**
     * Sets the value of the approvalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApprovalLevel(BigInteger value) {
        this.approvalLevel = value;
    }

    /**
     * Gets the value of the leaveState property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeaveState() {
        return leaveState;
    }

    /**
     * Sets the value of the leaveState property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeaveState(BigInteger value) {
        this.leaveState = value;
    }

    /**
     * Gets the value of the invoiced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvoiced() {
        return invoiced;
    }

    /**
     * Sets the value of the invoiced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvoiced(Boolean value) {
        this.invoiced = value;
    }

    /**
     * Gets the value of the tariff property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTariff() {
        return tariff;
    }

    /**
     * Sets the value of the tariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTariff(Float value) {
        this.tariff = value;
    }

    /**
     * Gets the value of the idITMED property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdITMED() {
        return idITMED;
    }

    /**
     * Sets the value of the idITMED property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdITMED(Long value) {
        this.idITMED = value;
    }

    /**
     * Gets the value of the idGRMED property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdGRMED() {
        return idGRMED;
    }

    /**
     * Sets the value of the idGRMED property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdGRMED(Long value) {
        this.idGRMED = value;
    }

    /**
     * Gets the value of the idITTAA property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdITTAA() {
        return idITTAA;
    }

    /**
     * Sets the value of the idITTAA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdITTAA(Long value) {
        this.idITTAA = value;
    }

    /**
     * Gets the value of the idITAT1 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdITAT1() {
        return idITAT1;
    }

    /**
     * Sets the value of the idITAT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdITAT1(Long value) {
        this.idITAT1 = value;
    }

    /**
     * Gets the value of the idITAT2 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdITAT2() {
        return idITAT2;
    }

    /**
     * Sets the value of the idITAT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdITAT2(Long value) {
        this.idITAT2 = value;
    }

    /**
     * Gets the value of the idITAT3 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdITAT3() {
        return idITAT3;
    }

    /**
     * Sets the value of the idITAT3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdITAT3(Long value) {
        this.idITAT3 = value;
    }

    /**
     * Gets the value of the idITAT4 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdITAT4() {
        return idITAT4;
    }

    /**
     * Sets the value of the idITAT4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdITAT4(Long value) {
        this.idITAT4 = value;
    }

    /**
     * Gets the value of the idITAT5 property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdITAT5() {
        return idITAT5;
    }

    /**
     * Sets the value of the idITAT5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdITAT5(Long value) {
        this.idITAT5 = value;
    }

    /**
     * Gets the value of the nameITMED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameITMED() {
        return nameITMED;
    }

    /**
     * Sets the value of the nameITMED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameITMED(String value) {
        this.nameITMED = value;
    }

    /**
     * Gets the value of the nameGRMED property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameGRMED() {
        return nameGRMED;
    }

    /**
     * Sets the value of the nameGRMED property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameGRMED(String value) {
        this.nameGRMED = value;
    }

    /**
     * Gets the value of the nameITTAA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameITTAA() {
        return nameITTAA;
    }

    /**
     * Sets the value of the nameITTAA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameITTAA(String value) {
        this.nameITTAA = value;
    }

    /**
     * Gets the value of the nameITAT1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameITAT1() {
        return nameITAT1;
    }

    /**
     * Sets the value of the nameITAT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameITAT1(String value) {
        this.nameITAT1 = value;
    }

    /**
     * Gets the value of the nameITAT2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameITAT2() {
        return nameITAT2;
    }

    /**
     * Sets the value of the nameITAT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameITAT2(String value) {
        this.nameITAT2 = value;
    }

    /**
     * Gets the value of the nameITAT3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameITAT3() {
        return nameITAT3;
    }

    /**
     * Sets the value of the nameITAT3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameITAT3(String value) {
        this.nameITAT3 = value;
    }

    /**
     * Gets the value of the nameITAT4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameITAT4() {
        return nameITAT4;
    }

    /**
     * Sets the value of the nameITAT4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameITAT4(String value) {
        this.nameITAT4 = value;
    }

    /**
     * Gets the value of the nameITAT5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameITAT5() {
        return nameITAT5;
    }

    /**
     * Sets the value of the nameITAT5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameITAT5(String value) {
        this.nameITAT5 = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the userFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link UserFieldList }
     *     
     */
    public UserFieldList getUserFieldList() {
        return userFieldList;
    }

    /**
     * Sets the value of the userFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFieldList }
     *     
     */
    public void setUserFieldList(UserFieldList value) {
        this.userFieldList = value;
    }

}
