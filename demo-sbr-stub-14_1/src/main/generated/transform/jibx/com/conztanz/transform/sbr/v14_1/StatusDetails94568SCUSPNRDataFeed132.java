
package com.conztanz.transform.sbr.v14_1;

/** 
 * To advise the requester system the status of the reply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_94568_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_142190_C_CUS_PNRDataFeed_132" name="statusInformation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails94568SCUSPNRDataFeed132
{
    private StatusDetails142190CCUSPNRDataFeed132 statusInformation;

    /** 
     * Get the 'statusInformation' element value. will we perform the fraud screening ?
     * 
     * @return value
     */
    public StatusDetails142190CCUSPNRDataFeed132 getStatusInformation() {
        return statusInformation;
    }

    /** 
     * Set the 'statusInformation' element value. will we perform the fraud screening ?
     * 
     * @param statusInformation
     */
    public void setStatusInformation(
            StatusDetails142190CCUSPNRDataFeed132 statusInformation) {
        this.statusInformation = statusInformation;
    }
}
