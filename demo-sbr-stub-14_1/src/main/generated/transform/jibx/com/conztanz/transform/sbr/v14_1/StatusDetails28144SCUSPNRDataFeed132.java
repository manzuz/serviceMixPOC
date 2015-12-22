
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a status and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_28144_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_50209_C_CUS_PNRDataFeed_132" name="statusDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails28144SCUSPNRDataFeed132
{
    private StatusDetails50209CCUSPNRDataFeed132 statusDetails;

    /** 
     * Get the 'statusDetails' element value.
     * 
     * @return value
     */
    public StatusDetails50209CCUSPNRDataFeed132 getStatusDetails() {
        return statusDetails;
    }

    /** 
     * Set the 'statusDetails' element value.
     * 
     * @param statusDetails
     */
    public void setStatusDetails(
            StatusDetails50209CCUSPNRDataFeed132 statusDetails) {
        this.statusDetails = statusDetails;
    }
}
