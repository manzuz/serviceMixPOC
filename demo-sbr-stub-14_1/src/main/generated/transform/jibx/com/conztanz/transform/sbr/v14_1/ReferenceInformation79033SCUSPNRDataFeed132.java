
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide specific reference identification for a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_79033_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_121390_C_CUS_PNRDataFeed_132" name="referenceDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation79033SCUSPNRDataFeed132
{
    private ReferencingDetails121390CCUSPNRDataFeed132 referenceDetails;

    /** 
     * Get the 'referenceDetails' element value. COMMERCIAL AGREEMENT REFERENCE FOR TST NEGO
     * 
     * @return value
     */
    public ReferencingDetails121390CCUSPNRDataFeed132 getReferenceDetails() {
        return referenceDetails;
    }

    /** 
     * Set the 'referenceDetails' element value. COMMERCIAL AGREEMENT REFERENCE FOR TST NEGO
     * 
     * @param referenceDetails
     */
    public void setReferenceDetails(
            ReferencingDetails121390CCUSPNRDataFeed132 referenceDetails) {
        this.referenceDetails = referenceDetails;
    }
}
