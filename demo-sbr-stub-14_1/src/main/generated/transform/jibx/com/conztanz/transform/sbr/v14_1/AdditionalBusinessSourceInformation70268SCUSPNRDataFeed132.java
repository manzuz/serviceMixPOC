
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify ownership and creator of a PNR
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalBusinessSourceInformation_70268_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorIdentificationDetails_109511_C_CUS_PNRDataFeed_132" name="originatorDetails"/>
 *     &lt;xs:element type="xs:string" name="systemCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalBusinessSourceInformation70268SCUSPNRDataFeed132
{
    private OriginatorIdentificationDetails109511CCUSPNRDataFeed132 originatorDetails;
    private String systemCode;

    /** 
     * Get the 'originatorDetails' element value. ORIGINATOR DETAILS
     * 
     * @return value
     */
    public OriginatorIdentificationDetails109511CCUSPNRDataFeed132 getOriginatorDetails() {
        return originatorDetails;
    }

    /** 
     * Set the 'originatorDetails' element value. ORIGINATOR DETAILS
     * 
     * @param originatorDetails
     */
    public void setOriginatorDetails(
            OriginatorIdentificationDetails109511CCUSPNRDataFeed132 originatorDetails) {
        this.originatorDetails = originatorDetails;
    }

    /** 
     * Get the 'systemCode' element value. Electronic ticket issuing carrier
     * 
     * @return value
     */
    public String getSystemCode() {
        return systemCode;
    }

    /** 
     * Set the 'systemCode' element value. Electronic ticket issuing carrier
     * 
     * @param systemCode
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
}
