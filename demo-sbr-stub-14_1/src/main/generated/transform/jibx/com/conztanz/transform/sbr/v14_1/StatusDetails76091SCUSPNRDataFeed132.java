
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a status and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_76091_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_117853_C_CUS_PNRDataFeed_132" name="statusDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails76091SCUSPNRDataFeed132
{
    private StatusDetails117853CCUSPNRDataFeed132 statusDetails;

    /** 
     * Get the 'statusDetails' element value. Contains the bag acceptance status, 'statusIndicator' containing BAS, 'action' containing: "BFA" for fully accepted "BPA" for provisionally accepted "BNA" for not accepted
     * 
     * @return value
     */
    public StatusDetails117853CCUSPNRDataFeed132 getStatusDetails() {
        return statusDetails;
    }

    /** 
     * Set the 'statusDetails' element value. Contains the bag acceptance status, 'statusIndicator' containing BAS, 'action' containing: "BFA" for fully accepted "BPA" for provisionally accepted "BNA" for not accepted
     * 
     * @param statusDetails
     */
    public void setStatusDetails(
            StatusDetails117853CCUSPNRDataFeed132 statusDetails) {
        this.statusDetails = statusDetails;
    }
}
