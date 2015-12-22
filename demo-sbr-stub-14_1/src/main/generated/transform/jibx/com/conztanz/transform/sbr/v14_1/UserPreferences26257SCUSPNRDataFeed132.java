
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify country, currency and language
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="UserPreferences_26257_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="OriginatorDetails_47607_C_CUS_PNRDataFeed_132" name="userPreferences"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class UserPreferences26257SCUSPNRDataFeed132
{
    private OriginatorDetails47607CCUSPNRDataFeed132 userPreferences;

    /** 
     * Get the 'userPreferences' element value. This composite contains details on user preferences : _ Country code _ Language code _ Currency code
     * 
     * @return value
     */
    public OriginatorDetails47607CCUSPNRDataFeed132 getUserPreferences() {
        return userPreferences;
    }

    /** 
     * Set the 'userPreferences' element value. This composite contains details on user preferences : _ Country code _ Language code _ Currency code
     * 
     * @param userPreferences
     */
    public void setUserPreferences(
            OriginatorDetails47607CCUSPNRDataFeed132 userPreferences) {
        this.userPreferences = userPreferences;
    }
}
