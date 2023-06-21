
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaskData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaskData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="budget" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="invoiceable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="useInvoicing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="invoiceType" type="{api.timewriter.soap.nl}TaskInvoiceTypeString" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="recurringPattern" type="{api.timewriter.soap.nl}RecurringPattern" minOccurs="0"/>
 *         &lt;element name="id_GR_MED" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT3" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT4" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="id_IT_AT5" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskData", propOrder = {
    "no",
    "groupId",
    "description",
    "closed",
    "budget",
    "invoiceable",
    "useInvoicing",
    "invoiceType",
    "price",
    "recurringPattern",
    "idGRMED",
    "idITAT1",
    "idITAT2",
    "idITAT3",
    "idITAT4",
    "idITAT5"
})
public class TaskData {

    protected Long no;
    protected Long groupId;
    protected String description;
    protected Boolean closed;
    protected Float budget;
    protected Boolean invoiceable;
    protected Boolean useInvoicing;
    protected String invoiceType;
    protected Float price;
    protected RecurringPattern recurringPattern;
    @XmlElement(name = "id_GR_MED")
    protected Long idGRMED;
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

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNo(Long value) {
        this.no = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setGroupId(Long value) {
        this.groupId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClosed(Boolean value) {
        this.closed = value;
    }

    /**
     * Gets the value of the budget property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBudget() {
        return budget;
    }

    /**
     * Sets the value of the budget property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBudget(Float value) {
        this.budget = value;
    }

    /**
     * Gets the value of the invoiceable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInvoiceable() {
        return invoiceable;
    }

    /**
     * Sets the value of the invoiceable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInvoiceable(Boolean value) {
        this.invoiceable = value;
    }

    /**
     * Gets the value of the useInvoicing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseInvoicing() {
        return useInvoicing;
    }

    /**
     * Sets the value of the useInvoicing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseInvoicing(Boolean value) {
        this.useInvoicing = value;
    }

    /**
     * Gets the value of the invoiceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * Sets the value of the invoiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceType(String value) {
        this.invoiceType = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrice(Float value) {
        this.price = value;
    }

    /**
     * Gets the value of the recurringPattern property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPattern }
     *     
     */
    public RecurringPattern getRecurringPattern() {
        return recurringPattern;
    }

    /**
     * Sets the value of the recurringPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPattern }
     *     
     */
    public void setRecurringPattern(RecurringPattern value) {
        this.recurringPattern = value;
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

}
