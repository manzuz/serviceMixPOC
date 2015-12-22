
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerNameInfo_183799_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="quantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="otherType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="uniqueCustomerIdentifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="infantIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="travellerIdentificationCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="gender" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="age" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerNameInfo183799CCUSPNRDataFeed132
{
    private String qualifier;
    private BigDecimal quantity;
    private String type;
    private String otherType;
    private String uniqueCustomerIdentifier;
    private String infantIndicator;
    private String travellerIdentificationCode;
    private String gender;
    private BigDecimal age;

    /** 
     * Get the 'qualifier' element value. PAX = PAX IN = Infant
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. PAX = PAX IN = Infant
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'quantity' element value.
     * 
     * @return value
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value.
     * 
     * @param quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'type' element value. Passenger type (PTC).
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Passenger type (PTC).
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'otherType' element value. Passenger type (PTC).
     * 
     * @return value
     */
    public String getOtherType() {
        return otherType;
    }

    /** 
     * Set the 'otherType' element value. Passenger type (PTC).
     * 
     * @param otherType
     */
    public void setOtherType(String otherType) {
        this.otherType = otherType;
    }

    /** 
     * Get the 'uniqueCustomerIdentifier' element value.
     * 
     * @return value
     */
    public String getUniqueCustomerIdentifier() {
        return uniqueCustomerIdentifier;
    }

    /** 
     * Set the 'uniqueCustomerIdentifier' element value.
     * 
     * @param uniqueCustomerIdentifier
     */
    public void setUniqueCustomerIdentifier(String uniqueCustomerIdentifier) {
        this.uniqueCustomerIdentifier = uniqueCustomerIdentifier;
    }

    /** 
     * Get the 'infantIndicator' element value.
     * 
     * @return value
     */
    public String getInfantIndicator() {
        return infantIndicator;
    }

    /** 
     * Set the 'infantIndicator' element value.
     * 
     * @param infantIndicator
     */
    public void setInfantIndicator(String infantIndicator) {
        this.infantIndicator = infantIndicator;
    }

    /** 
     * Get the 'travellerIdentificationCode' element value.
     * 
     * @return value
     */
    public String getTravellerIdentificationCode() {
        return travellerIdentificationCode;
    }

    /** 
     * Set the 'travellerIdentificationCode' element value.
     * 
     * @param travellerIdentificationCode
     */
    public void setTravellerIdentificationCode(
            String travellerIdentificationCode) {
        this.travellerIdentificationCode = travellerIdentificationCode;
    }

    /** 
     * Get the 'gender' element value.
     * 
     * @return value
     */
    public String getGender() {
        return gender;
    }

    /** 
     * Set the 'gender' element value.
     * 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** 
     * Get the 'age' element value.
     * 
     * @return value
     */
    public BigDecimal getAge() {
        return age;
    }

    /** 
     * Set the 'age' element value.
     * 
     * @param age
     */
    public void setAge(BigDecimal age) {
        this.age = age;
    }
}
