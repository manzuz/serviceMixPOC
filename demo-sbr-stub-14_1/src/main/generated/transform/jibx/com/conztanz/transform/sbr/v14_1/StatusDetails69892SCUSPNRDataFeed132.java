
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a status and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_69892_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_108998_C_CUS_PNRDataFeed_132" name="statusDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails69892SCUSPNRDataFeed132
{
    private StatusDetails108998CCUSPNRDataFeed132 statusDetails;

    /** 
     * Get the 'statusDetails' element value. This composite provides indicators on the SSR and seat elements
     * 
     * @return value
     */
    public StatusDetails108998CCUSPNRDataFeed132 getStatusDetails() {
        return statusDetails;
    }

    /** 
     * Set the 'statusDetails' element value. This composite provides indicators on the SSR and seat elements
     * 
     * @param statusDetails
     */
    public void setStatusDetails(
            StatusDetails108998CCUSPNRDataFeed132 statusDetails) {
        this.statusDetails = statusDetails;
    }
}
