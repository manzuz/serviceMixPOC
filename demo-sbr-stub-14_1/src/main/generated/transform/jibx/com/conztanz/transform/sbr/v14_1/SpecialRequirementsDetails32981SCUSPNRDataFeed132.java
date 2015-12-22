
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify special requests or services information relating to a traveler.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDetails_32981_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecialRequirementsTypeDetails_57438_C_CUS_PNRDataFeed_132" name="specialRequirementsInfo"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDetails32981SCUSPNRDataFeed132
{
    private SpecialRequirementsTypeDetails57438CCUSPNRDataFeed132 specialRequirementsInfo;

    /** 
     * Get the 'specialRequirementsInfo' element value. Seat description.
     * 
     * @return value
     */
    public SpecialRequirementsTypeDetails57438CCUSPNRDataFeed132 getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /** 
     * Set the 'specialRequirementsInfo' element value. Seat description.
     * 
     * @param specialRequirementsInfo
     */
    public void setSpecialRequirementsInfo(
            SpecialRequirementsTypeDetails57438CCUSPNRDataFeed132 specialRequirementsInfo) {
        this.specialRequirementsInfo = specialRequirementsInfo;
    }
}
