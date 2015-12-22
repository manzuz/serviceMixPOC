
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AcceptanceChannel_95655_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="UserIdentification_76082_S_CUS_PNRDataFeed_132" name="acceptanceOrigin"/>
 *     &lt;xs:element type="Application_76081_S_CUS_PNRDataFeed_132" name="applicationType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AcceptanceChannel95655GCUSPNRDataFeed1321
{
    private UserIdentification76082SCUSPNRDataFeed132 acceptanceOrigin;
    private Application76081SCUSPNRDataFeed132 applicationType;

    /** 
     * Get the 'acceptanceOrigin' element value. Qualifies originator of the acceptance actions: - A for Check-in Agent - D for Direct consumer  - S for automated Devices - E for internet/web based application
     * 
     * @return value
     */
    public UserIdentification76082SCUSPNRDataFeed132 getAcceptanceOrigin() {
        return acceptanceOrigin;
    }

    /** 
     * Set the 'acceptanceOrigin' element value. Qualifies originator of the acceptance actions: - A for Check-in Agent - D for Direct consumer  - S for automated Devices - E for internet/web based application
     * 
     * @param acceptanceOrigin
     */
    public void setAcceptanceOrigin(
            UserIdentification76082SCUSPNRDataFeed132 acceptanceOrigin) {
        this.acceptanceOrigin = acceptanceOrigin;
    }

    /** 
     * Get the 'applicationType' element value. contains the application used to perform check-in operations: - cryptic application - Java front End application - SMS application - Telephone - web application - External departure control application
     * 
     * @return value
     */
    public Application76081SCUSPNRDataFeed132 getApplicationType() {
        return applicationType;
    }

    /** 
     * Set the 'applicationType' element value. contains the application used to perform check-in operations: - cryptic application - Java front End application - SMS application - Telephone - web application - External departure control application
     * 
     * @param applicationType
     */
    public void setApplicationType(
            Application76081SCUSPNRDataFeed132 applicationType) {
        this.applicationType = applicationType;
    }
}
