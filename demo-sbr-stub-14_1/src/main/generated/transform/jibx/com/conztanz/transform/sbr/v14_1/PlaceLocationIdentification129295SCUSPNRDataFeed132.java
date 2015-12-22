
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a place or a location and/or related locations.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PlaceLocationIdentification_129295_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="locationType"/>
 *     &lt;xs:element type="LocationIdentification_188360_C_CUS_PNRDataFeed_132" name="locationDescription" minOccurs="0"/>
 *     &lt;xs:element type="RelatedLocationOneIdentification_188361_C_CUS_PNRDataFeed_132" name="firstLocationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PlaceLocationIdentification129295SCUSPNRDataFeed132
{
    private String locationType;
    private LocationIdentification188360CCUSPNRDataFeed132 locationDescription;
    private RelatedLocationOneIdentification188361CCUSPNRDataFeed132 firstLocationDetails;

    /** 
     * Get the 'locationType' element value. Type of location
     * 
     * @return value
     */
    public String getLocationType() {
        return locationType;
    }

    /** 
     * Set the 'locationType' element value. Type of location
     * 
     * @param locationType
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /** 
     * Get the 'locationDescription' element value. Railway station location details.
     * 
     * @return value
     */
    public LocationIdentification188360CCUSPNRDataFeed132 getLocationDescription() {
        return locationDescription;
    }

    /** 
     * Set the 'locationDescription' element value. Railway station location details.
     * 
     * @param locationDescription
     */
    public void setLocationDescription(
            LocationIdentification188360CCUSPNRDataFeed132 locationDescription) {
        this.locationDescription = locationDescription;
    }

    /** 
     * Get the 'firstLocationDetails' element value. Railway station country details.
     * 
     * @return value
     */
    public RelatedLocationOneIdentification188361CCUSPNRDataFeed132 getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /** 
     * Set the 'firstLocationDetails' element value. Railway station country details.
     * 
     * @param firstLocationDetails
     */
    public void setFirstLocationDetails(
            RelatedLocationOneIdentification188361CCUSPNRDataFeed132 firstLocationDetails) {
        this.firstLocationDetails = firstLocationDetails;
    }
}
