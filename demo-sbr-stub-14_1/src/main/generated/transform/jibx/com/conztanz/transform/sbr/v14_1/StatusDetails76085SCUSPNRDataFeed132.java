
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a status and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_76085_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_117844_C_CUS_PNRDataFeed_132" name="statusDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails76085SCUSPNRDataFeed132
{
    private StatusDetails117844CCUSPNRDataFeed132 statusDetails;

    /** 
     * Get the 'statusDetails' element value. Baggage type details
     * 
     * @return value
     */
    public StatusDetails117844CCUSPNRDataFeed132 getStatusDetails() {
        return statusDetails;
    }

    /** 
     * Set the 'statusDetails' element value. Baggage type details
     * 
     * @param statusDetails
     */
    public void setStatusDetails(
            StatusDetails117844CCUSPNRDataFeed132 statusDetails) {
        this.statusDetails = statusDetails;
    }
}
