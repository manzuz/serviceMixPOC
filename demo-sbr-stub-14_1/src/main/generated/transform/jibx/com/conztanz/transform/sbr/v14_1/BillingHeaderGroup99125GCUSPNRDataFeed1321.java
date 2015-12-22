
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BillingHeaderGroup_99125_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorOfRequestDetails_79778_S_CUS_PNRDataFeed_132" name="originatorDetails"/>
 *     &lt;xs:element type="StatusDetails_79779_S_CUS_PNRDataFeed_132" name="pnrStatus" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BillingHeaderGroup99125GCUSPNRDataFeed1321
{
    private OriginatorOfRequestDetails79778SCUSPNRDataFeed132 originatorDetails;
    private StatusDetails79779SCUSPNRDataFeed132 pnrStatus;

    /** 
     * Get the 'originatorDetails' element value. Information about the originator of the request.
     * 
     * @return value
     */
    public OriginatorOfRequestDetails79778SCUSPNRDataFeed132 getOriginatorDetails() {
        return originatorDetails;
    }

    /** 
     * Set the 'originatorDetails' element value. Information about the originator of the request.
     * 
     * @param originatorDetails
     */
    public void setOriginatorDetails(
            OriginatorOfRequestDetails79778SCUSPNRDataFeed132 originatorDetails) {
        this.originatorDetails = originatorDetails;
    }

    /** 
     * Get the 'pnrStatus' element value. Status related to the PNR
     * 
     * @return value
     */
    public StatusDetails79779SCUSPNRDataFeed132 getPnrStatus() {
        return pnrStatus;
    }

    /** 
     * Set the 'pnrStatus' element value. Status related to the PNR
     * 
     * @param pnrStatus
     */
    public void setPnrStatus(StatusDetails79779SCUSPNRDataFeed132 pnrStatus) {
        this.pnrStatus = pnrStatus;
    }
}
