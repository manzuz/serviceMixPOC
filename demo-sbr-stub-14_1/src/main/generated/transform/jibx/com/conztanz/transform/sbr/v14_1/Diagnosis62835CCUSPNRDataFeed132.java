
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the diagnosis and its type
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Diagnosis_62835_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="billingDetails"/>
 *     &lt;xs:element type="xs:string" name="billingQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Diagnosis62835CCUSPNRDataFeed132
{
    private String billingDetails;
    private String billingQualifier;

    /** 
     * Get the 'billingDetails' element value. This data element can convey either an agency accounting or a billing number.
     * 
     * @return value
     */
    public String getBillingDetails() {
        return billingDetails;
    }

    /** 
     * Set the 'billingDetails' element value. This data element can convey either an agency accounting or a billing number.
     * 
     * @param billingDetails
     */
    public void setBillingDetails(String billingDetails) {
        this.billingDetails = billingDetails;
    }

    /** 
     * Get the 'billingQualifier' element value. This data element is used to specify the type of billable information that could be found in this segment
     * 
     * @return value
     */
    public String getBillingQualifier() {
        return billingQualifier;
    }

    /** 
     * Set the 'billingQualifier' element value. This data element is used to specify the type of billable information that could be found in this segment
     * 
     * @param billingQualifier
     */
    public void setBillingQualifier(String billingQualifier) {
        this.billingQualifier = billingQualifier;
    }
}
