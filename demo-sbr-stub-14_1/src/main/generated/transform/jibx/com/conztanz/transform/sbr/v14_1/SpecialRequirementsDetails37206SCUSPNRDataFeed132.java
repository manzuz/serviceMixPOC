
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify special requests or services information relating to a traveler.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDetails_37206_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecialRequirementsTypeDetails_46932_C_CUS_PNRDataFeed_132" name="specialRequirementsInfo"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDetails37206SCUSPNRDataFeed132
{
    private SpecialRequirementsTypeDetails46932CCUSPNRDataFeed132 specialRequirementsInfo;

    /** 
     * Get the 'specialRequirementsInfo' element value. Seat description.
     * 
     * @return value
     */
    public SpecialRequirementsTypeDetails46932CCUSPNRDataFeed132 getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /** 
     * Set the 'specialRequirementsInfo' element value. Seat description.
     * 
     * @param specialRequirementsInfo
     */
    public void setSpecialRequirementsInfo(
            SpecialRequirementsTypeDetails46932CCUSPNRDataFeed132 specialRequirementsInfo) {
        this.specialRequirementsInfo = specialRequirementsInfo;
    }
}
