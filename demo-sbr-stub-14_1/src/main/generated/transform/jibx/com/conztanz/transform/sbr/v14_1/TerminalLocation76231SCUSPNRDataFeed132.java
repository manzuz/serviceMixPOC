
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey informations about functional and physical locations in a terminal
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TerminalLocation_76231_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FacilityInformation_124271_C_CUS_PNRDataFeed_132" name="facilityDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TerminalLocation76231SCUSPNRDataFeed132
{
    private FacilityInformation124271CCUSPNRDataFeed132 facilityDetails;

    /** 
     * Get the 'facilityDetails' element value. To convey information related to a specific Facility.
     * 
     * @return value
     */
    public FacilityInformation124271CCUSPNRDataFeed132 getFacilityDetails() {
        return facilityDetails;
    }

    /** 
     * Set the 'facilityDetails' element value. To convey information related to a specific Facility.
     * 
     * @param facilityDetails
     */
    public void setFacilityDetails(
            FacilityInformation124271CCUSPNRDataFeed132 facilityDetails) {
        this.facilityDetails = facilityDetails;
    }
}
