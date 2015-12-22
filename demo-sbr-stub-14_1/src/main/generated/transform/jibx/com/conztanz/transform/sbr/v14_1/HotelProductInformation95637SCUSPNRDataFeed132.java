
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the details for a hotel transaction.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelProductInformation_95637_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelFacility_143536_C_CUS_PNRDataFeed_132" name="preferredAmenities"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelProductInformation95637SCUSPNRDataFeed132
{
    private HotelFacility143536CCUSPNRDataFeed132 preferredAmenities;

    /** 
     * Get the 'preferredAmenities' element value. PAP preferred amenities codes.
     * 
     * @return value
     */
    public HotelFacility143536CCUSPNRDataFeed132 getPreferredAmenities() {
        return preferredAmenities;
    }

    /** 
     * Set the 'preferredAmenities' element value. PAP preferred amenities codes.
     * 
     * @param preferredAmenities
     */
    public void setPreferredAmenities(
            HotelFacility143536CCUSPNRDataFeed132 preferredAmenities) {
        this.preferredAmenities = preferredAmenities;
    }
}
