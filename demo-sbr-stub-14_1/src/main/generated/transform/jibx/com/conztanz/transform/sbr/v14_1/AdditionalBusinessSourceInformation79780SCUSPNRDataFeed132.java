
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify additional originator and source information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalBusinessSourceInformation_79780_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorIdentificationDetails_122350_C_CUS_PNRDataFeed_132" name="originatorDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalBusinessSourceInformation79780SCUSPNRDataFeed132
{
    private OriginatorIdentificationDetails122350CCUSPNRDataFeed132 originatorDetails;

    /** 
     * Get the 'originatorDetails' element value. originator details
     * 
     * @return value
     */
    public OriginatorIdentificationDetails122350CCUSPNRDataFeed132 getOriginatorDetails() {
        return originatorDetails;
    }

    /** 
     * Set the 'originatorDetails' element value. originator details
     * 
     * @param originatorDetails
     */
    public void setOriginatorDetails(
            OriginatorIdentificationDetails122350CCUSPNRDataFeed132 originatorDetails) {
        this.originatorDetails = originatorDetails;
    }
}
