
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a status and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_76518_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_118451_C_CUS_PNRDataFeed_132" name="statusDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails76518SCUSPNRDataFeed132
{
    private StatusDetails118451CCUSPNRDataFeed132 statusDetails;

    /** 
     * Get the 'statusDetails' element value. Status details
     * 
     * @return value
     */
    public StatusDetails118451CCUSPNRDataFeed132 getStatusDetails() {
        return statusDetails;
    }

    /** 
     * Set the 'statusDetails' element value. Status details
     * 
     * @param statusDetails
     */
    public void setStatusDetails(
            StatusDetails118451CCUSPNRDataFeed132 statusDetails) {
        this.statusDetails = statusDetails;
    }
}
