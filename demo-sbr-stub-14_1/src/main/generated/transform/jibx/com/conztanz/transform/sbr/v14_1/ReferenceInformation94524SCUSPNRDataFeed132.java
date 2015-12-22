
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify an association between references given to travellers, to products, to services
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_94524_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_142140_C_CUS_PNRDataFeed_132" name="referenceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation94524SCUSPNRDataFeed132
{
    private ReferencingDetails142140CCUSPNRDataFeed132 referenceDetails;

    /** 
     * Get the 'referenceDetails' element value. REFERENCING DETAILS
     * 
     * @return value
     */
    public ReferencingDetails142140CCUSPNRDataFeed132 getReferenceDetails() {
        return referenceDetails;
    }

    /** 
     * Set the 'referenceDetails' element value. REFERENCING DETAILS
     * 
     * @param referenceDetails
     */
    public void setReferenceDetails(
            ReferencingDetails142140CCUSPNRDataFeed132 referenceDetails) {
        this.referenceDetails = referenceDetails;
    }
}
