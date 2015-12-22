
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerSurnameInformation_10304_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="surname"/>
 *     &lt;xs:element type="xs:string" name="qualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="quantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="staffType" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerSurnameInformation10304CCUSPNRDataFeed132
{
    private String surname;
    private String qualifier;
    private BigDecimal quantity;
    private String staffType;

    /** 
     * Get the 'surname' element value. - Traveler Last Name - Group name
     * 
     * @return value
     */
    public String getSurname() {
        return surname;
    }

    /** 
     * Set the 'surname' element value. - Traveler Last Name - Group name
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /** 
     * Get the 'qualifier' element value. - G for group (The traveler type is in C324/6353)
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. - G for group (The traveler type is in C324/6353)
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'quantity' element value. - 1 :one traveler with exceptions below. - 2 :traveler accompanied by an infant for whom only the given name is present. - n : number of unassigned passengers in the group - in the case of a noname, indicates the NIP of the noname element
     * 
     * @return value
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value. - 1 :one traveler with exceptions below. - 2 :traveler accompanied by an infant for whom only the given name is present. - n : number of unassigned passengers in the group - in the case of a noname, indicates the NIP of the noname element
     * 
     * @param quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'staffType' element value. Staff type
     * 
     * @return value
     */
    public String getStaffType() {
        return staffType;
    }

    /** 
     * Set the 'staffType' element value. Staff type
     * 
     * @param staffType
     */
    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }
}
