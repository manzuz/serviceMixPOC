
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide specific reference identification for a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_76071_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_117828_C_CUS_PNRDataFeed_132" name="referenceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation76071SCUSPNRDataFeed132
{
    private ReferencingDetails117828CCUSPNRDataFeed132 referenceDetails;

    /** 
     * Get the 'referenceDetails' element value. Details of the referencing
     * 
     * @return value
     */
    public ReferencingDetails117828CCUSPNRDataFeed132 getReferenceDetails() {
        return referenceDetails;
    }

    /** 
     * Set the 'referenceDetails' element value. Details of the referencing
     * 
     * @param referenceDetails
     */
    public void setReferenceDetails(
            ReferencingDetails117828CCUSPNRDataFeed132 referenceDetails) {
        this.referenceDetails = referenceDetails;
    }
}
