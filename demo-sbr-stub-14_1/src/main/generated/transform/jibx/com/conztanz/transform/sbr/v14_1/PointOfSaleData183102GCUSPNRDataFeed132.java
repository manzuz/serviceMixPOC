
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PointOfSaleData_183102_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="UserIdentification_160731_S_CUS_PNRDataFeed_132" name="userIdentification"/>
 *     &lt;xs:element type="SystemDetailsInfo_85819_S_CUS_PNRDataFeed_132" name="systemDetails"/>
 *     &lt;xs:element type="UserPreferences_85818_S_CUS_PNRDataFeed_132" name="preferences"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PointOfSaleData183102GCUSPNRDataFeed132
{
    private UserIdentification160731SCUSPNRDataFeed132 userIdentification;
    private SystemDetailsInfo85819SCUSPNRDataFeed132 systemDetails;
    private UserPreferences85818SCUSPNRDataFeed132 preferences;

    /** 
     * Get the 'userIdentification' element value.
     * 
     * @return value
     */
    public UserIdentification160731SCUSPNRDataFeed132 getUserIdentification() {
        return userIdentification;
    }

    /** 
     * Set the 'userIdentification' element value.
     * 
     * @param userIdentification
     */
    public void setUserIdentification(
            UserIdentification160731SCUSPNRDataFeed132 userIdentification) {
        this.userIdentification = userIdentification;
    }

    /** 
     * Get the 'systemDetails' element value. System details of the originator.
     * 
     * @return value
     */
    public SystemDetailsInfo85819SCUSPNRDataFeed132 getSystemDetails() {
        return systemDetails;
    }

    /** 
     * Set the 'systemDetails' element value. System details of the originator.
     * 
     * @param systemDetails
     */
    public void setSystemDetails(
            SystemDetailsInfo85819SCUSPNRDataFeed132 systemDetails) {
        this.systemDetails = systemDetails;
    }

    /** 
     * Get the 'preferences' element value. Preferences of the originator.
     * 
     * @return value
     */
    public UserPreferences85818SCUSPNRDataFeed132 getPreferences() {
        return preferences;
    }

    /** 
     * Set the 'preferences' element value. Preferences of the originator.
     * 
     * @param preferences
     */
    public void setPreferences(
            UserPreferences85818SCUSPNRDataFeed132 preferences) {
        this.preferences = preferences;
    }
}
