
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a status and related information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_129394_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_188467_C_CUS_PNRDataFeed_132" name="statusDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails129394SCUSPNRDataFeed132
{
    private StatusDetails188467CCUSPNRDataFeed132 statusDetails;

    /** 
     * Get the 'statusDetails' element value. indicates an open segment
     * 
     * @return value
     */
    public StatusDetails188467CCUSPNRDataFeed132 getStatusDetails() {
        return statusDetails;
    }

    /** 
     * Set the 'statusDetails' element value. indicates an open segment
     * 
     * @param statusDetails
     */
    public void setStatusDetails(
            StatusDetails188467CCUSPNRDataFeed132 statusDetails) {
        this.statusDetails = statusDetails;
    }
}
