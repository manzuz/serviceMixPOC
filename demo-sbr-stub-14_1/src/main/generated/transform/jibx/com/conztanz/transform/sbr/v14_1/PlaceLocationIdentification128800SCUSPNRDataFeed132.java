
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a place or a location and/or related locations.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PlaceLocationIdentification_128800_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="locationType"/>
 *     &lt;xs:element type="LocationIdentification_187661_C_CUS_PNRDataFeed_132" name="locationDescription" minOccurs="0"/>
 *     &lt;xs:element type="RelatedLocationOneIdentification_187662_C_CUS_PNRDataFeed_132" name="firstLocationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PlaceLocationIdentification128800SCUSPNRDataFeed132
{
    private String locationType;
    private LocationIdentification187661CCUSPNRDataFeed132 locationDescription;
    private RelatedLocationOneIdentification187662CCUSPNRDataFeed132 firstLocationDetails;

    /** 
     * Get the 'locationType' element value. Indicates the kind of location for which information is given: - 176 Pick-up - DOL Drop-off - 117 Collection - 7   Delivery
     * 
     * @return value
     */
    public String getLocationType() {
        return locationType;
    }

    /** 
     * Set the 'locationType' element value. Indicates the kind of location for which information is given: - 176 Pick-up - DOL Drop-off - 117 Collection - 7   Delivery
     * 
     * @param locationType
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /** 
     * Get the 'locationDescription' element value. Details on the location (location code and possibly part of the address).
     * 
     * @return value
     */
    public LocationIdentification187661CCUSPNRDataFeed132 getLocationDescription() {
        return locationDescription;
    }

    /** 
     * Set the 'locationDescription' element value. Details on the location (location code and possibly part of the address).
     * 
     * @param locationDescription
     */
    public void setLocationDescription(
            LocationIdentification187661CCUSPNRDataFeed132 locationDescription) {
        this.locationDescription = locationDescription;
    }

    /** 
     * Get the 'firstLocationDetails' element value. Associated airport/City code. Present if the pickup location is not an airport/city code.
     * 
     * @return value
     */
    public RelatedLocationOneIdentification187662CCUSPNRDataFeed132 getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /** 
     * Set the 'firstLocationDetails' element value. Associated airport/City code. Present if the pickup location is not an airport/city code.
     * 
     * @param firstLocationDetails
     */
    public void setFirstLocationDetails(
            RelatedLocationOneIdentification187662CCUSPNRDataFeed132 firstLocationDetails) {
        this.firstLocationDetails = firstLocationDetails;
    }
}
