
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of consumer references by type, company, number and reference to a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsumerReferenceIdentification_187627_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="referenceQualifier"/>
 *     &lt;xs:element type="xs:string" name="referenceNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConsumerReferenceIdentification187627CCUSPNRDataFeed132
{
    private String referenceQualifier;
    private String referenceNumber;

    /** 
     * Get the 'referenceQualifier' element value. Kind of customer reference - 1  Customer IDentification number (ID) - CD Corporate Discount number (CD) - PC Promotional Code number (PC)
     * 
     * @return value
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /** 
     * Set the 'referenceQualifier' element value. Kind of customer reference - 1  Customer IDentification number (ID) - CD Corporate Discount number (CD) - PC Promotional Code number (PC)
     * 
     * @param referenceQualifier
     */
    public void setReferenceQualifier(String referenceQualifier) {
        this.referenceQualifier = referenceQualifier;
    }

    /** 
     * Get the 'referenceNumber' element value. Value corresponding to the customer reference qualifier (ID value, CD value, PC value).
     * 
     * @return value
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /** 
     * Set the 'referenceNumber' element value. Value corresponding to the customer reference qualifier (ID value, CD value, PC value).
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}
