
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide specific reference identification for a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_83029_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_126838_C_CUS_PNRDataFeed_132" name="referenceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation83029SCUSPNRDataFeed132
{
    private ReferencingDetails126838CCUSPNRDataFeed132 referenceDetails;

    /** 
     * Get the 'referenceDetails' element value. Reference details
     * 
     * @return value
     */
    public ReferencingDetails126838CCUSPNRDataFeed132 getReferenceDetails() {
        return referenceDetails;
    }

    /** 
     * Set the 'referenceDetails' element value. Reference details
     * 
     * @param referenceDetails
     */
    public void setReferenceDetails(
            ReferencingDetails126838CCUSPNRDataFeed132 referenceDetails) {
        this.referenceDetails = referenceDetails;
    }
}
