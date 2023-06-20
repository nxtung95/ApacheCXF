
package timewriter.object;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kvk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vatReverseCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debtorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="debtorLedgerAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="turnoverLedgerAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceData", propOrder = {
    "address",
    "postalCode",
    "city",
    "countryCode",
    "contact",
    "kvk",
    "vatId",
    "vatReverseCharge",
    "email",
    "debtorId",
    "reference",
    "debtorLedgerAccountCode",
    "turnoverLedgerAccountCode"
})
public class InvoiceData {

    protected String address;
    protected String postalCode;
    protected String city;
    protected String countryCode;
    protected String contact;
    protected String kvk;
    protected String vatId;
    protected Boolean vatReverseCharge;
    protected String email;
    protected String debtorId;
    protected String reference;
    protected String debtorLedgerAccountCode;
    protected String turnoverLedgerAccountCode;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the kvk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKvk() {
        return kvk;
    }

    /**
     * Sets the value of the kvk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKvk(String value) {
        this.kvk = value;
    }

    /**
     * Gets the value of the vatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatId() {
        return vatId;
    }

    /**
     * Sets the value of the vatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatId(String value) {
        this.vatId = value;
    }

    /**
     * Gets the value of the vatReverseCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVatReverseCharge() {
        return vatReverseCharge;
    }

    /**
     * Sets the value of the vatReverseCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVatReverseCharge(Boolean value) {
        this.vatReverseCharge = value;
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
     * Gets the value of the debtorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorId() {
        return debtorId;
    }

    /**
     * Sets the value of the debtorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorId(String value) {
        this.debtorId = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Gets the value of the debtorLedgerAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtorLedgerAccountCode() {
        return debtorLedgerAccountCode;
    }

    /**
     * Sets the value of the debtorLedgerAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtorLedgerAccountCode(String value) {
        this.debtorLedgerAccountCode = value;
    }

    /**
     * Gets the value of the turnoverLedgerAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoverLedgerAccountCode() {
        return turnoverLedgerAccountCode;
    }

    /**
     * Sets the value of the turnoverLedgerAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoverLedgerAccountCode(String value) {
        this.turnoverLedgerAccountCode = value;
    }

}
