
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a place or a location and/or related locations.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PlaceLocationIdentification_81180_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="locationType"/>
 *     &lt;xs:element type="LocationIdentification_124265_C_CUS_PNRDataFeed_132" name="locationDescription" minOccurs="0"/>
 *     &lt;xs:element type="RelatedLocationOneIdentification_124269_C_CUS_PNRDataFeed_132" name="firstLocationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PlaceLocationIdentification81180SCUSPNRDataFeed132
{
    private String locationType;
    private LocationIdentification124265CCUSPNRDataFeed132 locationDescription;
    private RelatedLocationOneIdentification124269CCUSPNRDataFeed132 firstLocationDetails;

    /** 
     * Get the 'locationType' element value. Location type: 174 Place of residence 180 Place of birth
     * 
     * @return value
     */
    public String getLocationType() {
        return locationType;
    }

    /** 
     * Set the 'locationType' element value. Location type: 174 Place of residence 180 Place of birth
     * 
     * @param locationType
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /** 
     * Get the 'locationDescription' element value. Country details
     * 
     * @return value
     */
    public LocationIdentification124265CCUSPNRDataFeed132 getLocationDescription() {
        return locationDescription;
    }

    /** 
     * Set the 'locationDescription' element value. Country details
     * 
     * @param locationDescription
     */
    public void setLocationDescription(
            LocationIdentification124265CCUSPNRDataFeed132 locationDescription) {
        this.locationDescription = locationDescription;
    }

    /** 
     * Get the 'firstLocationDetails' element value. City details
     * 
     * @return value
     */
    public RelatedLocationOneIdentification124269CCUSPNRDataFeed132 getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /** 
     * Set the 'firstLocationDetails' element value. City details
     * 
     * @param firstLocationDetails
     */
    public void setFirstLocationDetails(
            RelatedLocationOneIdentification124269CCUSPNRDataFeed132 firstLocationDetails) {
        this.firstLocationDetails = firstLocationDetails;
    }
}
