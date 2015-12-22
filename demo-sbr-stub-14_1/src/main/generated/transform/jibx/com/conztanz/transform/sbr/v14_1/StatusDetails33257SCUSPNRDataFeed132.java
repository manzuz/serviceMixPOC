
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a status and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_33257_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_57832_C_CUS_PNRDataFeed_132" name="statusDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails33257SCUSPNRDataFeed132
{
    private StatusDetails57832CCUSPNRDataFeed132 statusDetails;

    /** 
     * Get the 'statusDetails' element value. indicates an open segment
     * 
     * @return value
     */
    public StatusDetails57832CCUSPNRDataFeed132 getStatusDetails() {
        return statusDetails;
    }

    /** 
     * Set the 'statusDetails' element value. indicates an open segment
     * 
     * @param statusDetails
     */
    public void setStatusDetails(
            StatusDetails57832CCUSPNRDataFeed132 statusDetails) {
        this.statusDetails = statusDetails;
    }
}
