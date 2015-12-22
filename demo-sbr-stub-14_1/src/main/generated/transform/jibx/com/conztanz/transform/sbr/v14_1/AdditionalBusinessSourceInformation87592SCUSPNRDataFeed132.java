
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify ownership and creator of a PNR
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalBusinessSourceInformation_87592_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorIdentificationDetails_132898_C_CUS_PNRDataFeed_132" name="originatorDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalBusinessSourceInformation87592SCUSPNRDataFeed132
{
    private OriginatorIdentificationDetails132898CCUSPNRDataFeed132 originatorDetails;

    /** 
     * Get the 'originatorDetails' element value. ORIGINATOR DETAILS
     * 
     * @return value
     */
    public OriginatorIdentificationDetails132898CCUSPNRDataFeed132 getOriginatorDetails() {
        return originatorDetails;
    }

    /** 
     * Set the 'originatorDetails' element value. ORIGINATOR DETAILS
     * 
     * @param originatorDetails
     */
    public void setOriginatorDetails(
            OriginatorIdentificationDetails132898CCUSPNRDataFeed132 originatorDetails) {
        this.originatorDetails = originatorDetails;
    }
}
