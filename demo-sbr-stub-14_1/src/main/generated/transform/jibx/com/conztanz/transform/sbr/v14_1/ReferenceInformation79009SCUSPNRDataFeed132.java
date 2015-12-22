
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide specific reference identification for a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_79009_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_121348_C_CUS_PNRDataFeed_132" name="referenceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation79009SCUSPNRDataFeed132
{
    private ReferencingDetails121348CCUSPNRDataFeed132 referenceDetails;

    /** 
     * Get the 'referenceDetails' element value. Details of the reference
     * 
     * @return value
     */
    public ReferencingDetails121348CCUSPNRDataFeed132 getReferenceDetails() {
        return referenceDetails;
    }

    /** 
     * Set the 'referenceDetails' element value. Details of the reference
     * 
     * @param referenceDetails
     */
    public void setReferenceDetails(
            ReferencingDetails121348CCUSPNRDataFeed132 referenceDetails) {
        this.referenceDetails = referenceDetails;
    }
}
