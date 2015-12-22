
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide specific reference identification for a traveller.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceInformation_32300_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferencingDetails_17164_C_CUS_PNRDataFeed_132" name="referenceDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceInformation32300SCUSPNRDataFeed132
{
    private ReferencingDetails17164CCUSPNRDataFeed132 referenceDetails;

    /** 
     * Get the 'referenceDetails' element value. Used to specify the passenger association and the data per passanger.
     * 
     * @return value
     */
    public ReferencingDetails17164CCUSPNRDataFeed132 getReferenceDetails() {
        return referenceDetails;
    }

    /** 
     * Set the 'referenceDetails' element value. Used to specify the passenger association and the data per passanger.
     * 
     * @param referenceDetails
     */
    public void setReferenceDetails(
            ReferencingDetails17164CCUSPNRDataFeed132 referenceDetails) {
        this.referenceDetails = referenceDetails;
    }
}
