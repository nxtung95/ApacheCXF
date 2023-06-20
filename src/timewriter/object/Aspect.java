
package timewriter.object;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Aspect complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Aspect">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="aspectType" type="{api.timewriter.nl}AspectTypeString"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overhead" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="validFrom" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="validTo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="notForAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notForAuthorizations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notForCombinations" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notForTariffAgreements" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notForBudgets" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="notForProgramModules" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invoiceData" type="{api.timewriter.nl}InvoiceData" minOccurs="0"/>
 *         &lt;element name="taskData" type="{api.timewriter.nl}TaskData" minOccurs="0"/>
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
@XmlType(name = "Aspect", propOrder = {
    "id",
    "aspectType",
    "name",
    "category",
    "abbreviation",
    "loginName",
    "password",
    "email",
    "overhead",
    "validFrom",
    "validTo",
    "notForAccess",
    "notForAuthorizations",
    "notForCombinations",
    "notForTariffAgreements",
    "notForBudgets",
    "notForProgramModules",
    "invoiceData",
    "taskData",
    "userFieldList"
})
public class Aspect {

    protected Long id;
    @XmlElement(required = true)
    protected String aspectType;
    @XmlElement(required = true)
    protected String name;
    protected String category;
    protected String abbreviation;
    protected String loginName;
    protected String password;
    protected String email;
    protected Boolean overhead;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validFrom;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar validTo;
    protected Boolean notForAccess;
    protected Boolean notForAuthorizations;
    protected Boolean notForCombinations;
    protected Boolean notForTariffAgreements;
    protected Boolean notForBudgets;
    protected Boolean notForProgramModules;
    protected InvoiceData invoiceData;
    protected TaskData taskData;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the loginName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * Sets the value of the loginName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the overhead property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverhead() {
        return overhead;
    }

    /**
     * Sets the value of the overhead property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverhead(Boolean value) {
        this.overhead = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the notForAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotForAccess() {
        return notForAccess;
    }

    /**
     * Sets the value of the notForAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotForAccess(Boolean value) {
        this.notForAccess = value;
    }

    /**
     * Gets the value of the notForAuthorizations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotForAuthorizations() {
        return notForAuthorizations;
    }

    /**
     * Sets the value of the notForAuthorizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotForAuthorizations(Boolean value) {
        this.notForAuthorizations = value;
    }

    /**
     * Gets the value of the notForCombinations property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotForCombinations() {
        return notForCombinations;
    }

    /**
     * Sets the value of the notForCombinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotForCombinations(Boolean value) {
        this.notForCombinations = value;
    }

    /**
     * Gets the value of the notForTariffAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotForTariffAgreements() {
        return notForTariffAgreements;
    }

    /**
     * Sets the value of the notForTariffAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotForTariffAgreements(Boolean value) {
        this.notForTariffAgreements = value;
    }

    /**
     * Gets the value of the notForBudgets property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotForBudgets() {
        return notForBudgets;
    }

    /**
     * Sets the value of the notForBudgets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotForBudgets(Boolean value) {
        this.notForBudgets = value;
    }

    /**
     * Gets the value of the notForProgramModules property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotForProgramModules() {
        return notForProgramModules;
    }

    /**
     * Sets the value of the notForProgramModules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotForProgramModules(Boolean value) {
        this.notForProgramModules = value;
    }

    /**
     * Gets the value of the invoiceData property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceData }
     *     
     */
    public InvoiceData getInvoiceData() {
        return invoiceData;
    }

    /**
     * Sets the value of the invoiceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceData }
     *     
     */
    public void setInvoiceData(InvoiceData value) {
        this.invoiceData = value;
    }

    /**
     * Gets the value of the taskData property.
     * 
     * @return
     *     possible object is
     *     {@link TaskData }
     *     
     */
    public TaskData getTaskData() {
        return taskData;
    }

    /**
     * Sets the value of the taskData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskData }
     *     
     */
    public void setTaskData(TaskData value) {
        this.taskData = value;
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
