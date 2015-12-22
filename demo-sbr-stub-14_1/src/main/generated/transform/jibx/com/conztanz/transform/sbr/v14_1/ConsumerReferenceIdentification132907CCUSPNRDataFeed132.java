
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of consumer references by type, company, number and reference to a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsumerReferenceIdentification_132907_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="referenceQualifier"/>
 *     &lt;xs:element type="xs:string" name="referenceNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConsumerReferenceIdentification132907CCUSPNRDataFeed132
{
    private String referenceQualifier;
    private String referenceNumber;

    /** 
     * Get the 'referenceQualifier' element value. Indicator - 1  for ID (customer number) - CD for CD (customer discount number) - PC for PC (promotional code number)
     * 
     * @return value
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /** 
     * Set the 'referenceQualifier' element value. Indicator - 1  for ID (customer number) - CD for CD (customer discount number) - PC for PC (promotional code number)
     * 
     * @param referenceQualifier
     */
    public void setReferenceQualifier(String referenceQualifier) {
        this.referenceQualifier = referenceQualifier;
    }

    /** 
     * Get the 'referenceNumber' element value. Either the ID or CD number
     * 
     * @return value
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /** 
     * Set the 'referenceNumber' element value. Either the ID or CD number
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}
