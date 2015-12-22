
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify additional details about a particular traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificTravellerDetails_109774_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="referenceNumber"/>
 *     &lt;xs:element type="xs:string" name="surname" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificTravellerDetails109774CCUSPNRDataFeed132
{
    private BigDecimal referenceNumber;
    private String surname;

    /** 
     * Get the 'referenceNumber' element value. The passenger's number.
     * 
     * @return value
     */
    public BigDecimal getReferenceNumber() {
        return referenceNumber;
    }

    /** 
     * Set the 'referenceNumber' element value. The passenger's number.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(BigDecimal referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    /** 
     * Get the 'surname' element value. The passenger's name.
     * 
     * @return value
     */
    public String getSurname() {
        return surname;
    }

    /** 
     * Set the 'surname' element value. The passenger's name.
     * 
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
