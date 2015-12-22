
package com.conztanz.transform.sbr.v14_1;

/** 
 * To advise the requester system the status of the reply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_79779_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_122349_C_CUS_PNRDataFeed_132" name="statusInformation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails79779SCUSPNRDataFeed132
{
    private StatusDetails122349CCUSPNRDataFeed132 statusInformation;

    /** 
     * Get the 'statusInformation' element value. STATUS DETAILS
     * 
     * @return value
     */
    public StatusDetails122349CCUSPNRDataFeed132 getStatusInformation() {
        return statusInformation;
    }

    /** 
     * Set the 'statusInformation' element value. STATUS DETAILS
     * 
     * @param statusInformation
     */
    public void setStatusInformation(
            StatusDetails122349CCUSPNRDataFeed132 statusInformation) {
        this.statusInformation = statusInformation;
    }
}
