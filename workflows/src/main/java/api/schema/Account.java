//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.06 at 11:37:05 AM GMT 
//


package api.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="org_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="extra_fields" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="credit_card_stored" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="plans"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="plan" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="service_id" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *                             &lt;element name="approval_required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="end_user_required" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="setup_fee" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="cost_per_month" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                             &lt;element name="trial_period_days" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="cancellation_period" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="default" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="custom" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="users"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="user"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                             &lt;element name="created_at" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="updated_at" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="account_id" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *                             &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="extra_fields" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "createdAt",
    "updatedAt",
    "state",
    "orgName",
    "extraFields",
    "creditCardStored",
    "plans",
    "users"
})
public class Account {

    protected byte id;
    @XmlElement(name = "created_at", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "updated_at", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(required = true)
    protected String state;
    @XmlElement(name = "org_name", required = true)
    protected String orgName;
    @XmlElement(name = "extra_fields", required = true)
    protected String extraFields;
    @XmlElement(name = "credit_card_stored", required = true)
    protected String creditCardStored;
    @XmlElement(required = true)
    protected Plans plans;
    @XmlElement(required = true)
    protected Users users;

    /**
     * Gets the value of the id property.
     * 
     */
    public byte getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(byte value) {
        this.id = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the extraFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraFields() {
        return extraFields;
    }

    /**
     * Sets the value of the extraFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraFields(String value) {
        this.extraFields = value;
    }

    /**
     * Gets the value of the creditCardStored property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardStored() {
        return creditCardStored;
    }

    /**
     * Sets the value of the creditCardStored property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardStored(String value) {
        this.creditCardStored = value;
    }

    /**
     * Gets the value of the plans property.
     * 
     * @return
     *     possible object is
     *     {@link Plans }
     *     
     */
    public Plans getPlans() {
        return plans;
    }

    /**
     * Sets the value of the plans property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plans }
     *     
     */
    public void setPlans(Plans value) {
        this.plans = value;
    }

    /**
     * Gets the value of the users property.
     * 
     * @return
     *     possible object is
     *     {@link Users }
     *     
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Sets the value of the users property.
     * 
     * @param value
     *     allowed object is
     *     {@link Users }
     *     
     */
    public void setUsers(Users value) {
        this.users = value;
    }

}
