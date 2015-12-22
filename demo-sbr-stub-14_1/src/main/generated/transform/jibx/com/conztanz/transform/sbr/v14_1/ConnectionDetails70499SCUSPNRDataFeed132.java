
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify connection city and airline designator.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConnectionDetails_70499_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ConnectionDetails_109781_C_CUS_PNRDataFeed_132" name="connectionDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConnectionDetails70499SCUSPNRDataFeed132
{
    private ConnectionDetails109781CCUSPNRDataFeed132 connectionDetails;

    /** 
     * Get the 'connectionDetails' element value. Routing conenction info.
     * 
     * @return value
     */
    public ConnectionDetails109781CCUSPNRDataFeed132 getConnectionDetails() {
        return connectionDetails;
    }

    /** 
     * Set the 'connectionDetails' element value. Routing conenction info.
     * 
     * @param connectionDetails
     */
    public void setConnectionDetails(
            ConnectionDetails109781CCUSPNRDataFeed132 connectionDetails) {
        this.connectionDetails = connectionDetails;
    }
}
