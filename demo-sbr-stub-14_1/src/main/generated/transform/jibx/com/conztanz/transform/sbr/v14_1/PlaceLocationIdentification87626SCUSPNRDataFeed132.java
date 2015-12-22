
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a place or a location and/or related locations.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PlaceLocationIdentification_87626_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="locationType"/>
 *     &lt;xs:element type="LocationIdentification_132952_C_CUS_PNRDataFeed_132" name="locationDescription" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PlaceLocationIdentification87626SCUSPNRDataFeed132
{
    private String locationType;
    private LocationIdentification132952CCUSPNRDataFeed132 locationDescription;

    /** 
     * Get the 'locationType' element value. Used to differenciate the pickup location (176) from the Dropoff location (DOL)
     * 
     * @return value
     */
    public String getLocationType() {
        return locationType;
    }

    /** 
     * Set the 'locationType' element value. Used to differenciate the pickup location (176) from the Dropoff location (DOL)
     * 
     * @param locationType
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /** 
     * Get the 'locationDescription' element value. Pickup or dropoff location details
     * 
     * @return value
     */
    public LocationIdentification132952CCUSPNRDataFeed132 getLocationDescription() {
        return locationDescription;
    }

    /** 
     * Set the 'locationDescription' element value. Pickup or dropoff location details
     * 
     * @param locationDescription
     */
    public void setLocationDescription(
            LocationIdentification132952CCUSPNRDataFeed132 locationDescription) {
        this.locationDescription = locationDescription;
    }
}
