
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is used to specify details on an application
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Application_76081_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ApplicationIdentification_117837_C_CUS_PNRDataFeed_132" name="applicationDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Application76081SCUSPNRDataFeed132
{
    private ApplicationIdentification117837CCUSPNRDataFeed132 applicationDetails;

    /** 
     * Get the 'applicationDetails' element value. provides information on application identification
     * 
     * @return value
     */
    public ApplicationIdentification117837CCUSPNRDataFeed132 getApplicationDetails() {
        return applicationDetails;
    }

    /** 
     * Set the 'applicationDetails' element value. provides information on application identification
     * 
     * @param applicationDetails
     */
    public void setApplicationDetails(
            ApplicationIdentification117837CCUSPNRDataFeed132 applicationDetails) {
        this.applicationDetails = applicationDetails;
    }
}
