
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a place or a location and/or related locations.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PlaceLocationIdentification_87603_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="locationType"/>
 *     &lt;xs:element type="LocationIdentification_132911_C_CUS_PNRDataFeed_132" name="locationDescription"/>
 *     &lt;xs:element type="RelatedLocationOneIdentification_132912_C_CUS_PNRDataFeed_132" name="firstLocationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PlaceLocationIdentification87603SCUSPNRDataFeed132
{
    private String locationType;
    private LocationIdentification132911CCUSPNRDataFeed132 locationDescription;
    private RelatedLocationOneIdentification132912CCUSPNRDataFeed132 firstLocationDetails;

    /** 
     * Get the 'locationType' element value. location code qualifier
     * 
     * @return value
     */
    public String getLocationType() {
        return locationType;
    }

    /** 
     * Set the 'locationType' element value. location code qualifier
     * 
     * @param locationType
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /** 
     * Get the 'locationDescription' element value. location text
     * 
     * @return value
     */
    public LocationIdentification132911CCUSPNRDataFeed132 getLocationDescription() {
        return locationDescription;
    }

    /** 
     * Set the 'locationDescription' element value. location text
     * 
     * @param locationDescription
     */
    public void setLocationDescription(
            LocationIdentification132911CCUSPNRDataFeed132 locationDescription) {
        this.locationDescription = locationDescription;
    }

    /** 
     * Get the 'firstLocationDetails' element value. Associated airport/City code. Present if the pickup location is not an airport/city code.
     * 
     * @return value
     */
    public RelatedLocationOneIdentification132912CCUSPNRDataFeed132 getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /** 
     * Set the 'firstLocationDetails' element value. Associated airport/City code. Present if the pickup location is not an airport/city code.
     * 
     * @param firstLocationDetails
     */
    public void setFirstLocationDetails(
            RelatedLocationOneIdentification132912CCUSPNRDataFeed132 firstLocationDetails) {
        this.firstLocationDetails = firstLocationDetails;
    }
}
