
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a place or a location and/or related locations.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PlaceLocationIdentification_128824_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="locationType"/>
 *     &lt;xs:element type="RelatedLocationOneIdentification_187710_C_CUS_PNRDataFeed_132" name="firstLocationDetails" minOccurs="0"/>
 *     &lt;xs:element type="RelatedLocationTwoIdentification_187711_C_CUS_PNRDataFeed_132" name="secondLocationDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PlaceLocationIdentification128824SCUSPNRDataFeed132
{
    private String locationType;
    private RelatedLocationOneIdentification187710CCUSPNRDataFeed132 firstLocationDetails;
    private RelatedLocationTwoIdentification187711CCUSPNRDataFeed132 secondLocationDetails;

    /** 
     * Get the 'locationType' element value.
     * 
     * @return value
     */
    public String getLocationType() {
        return locationType;
    }

    /** 
     * Set the 'locationType' element value.
     * 
     * @param locationType
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /** 
     * Get the 'firstLocationDetails' element value.
     * 
     * @return value
     */
    public RelatedLocationOneIdentification187710CCUSPNRDataFeed132 getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /** 
     * Set the 'firstLocationDetails' element value.
     * 
     * @param firstLocationDetails
     */
    public void setFirstLocationDetails(
            RelatedLocationOneIdentification187710CCUSPNRDataFeed132 firstLocationDetails) {
        this.firstLocationDetails = firstLocationDetails;
    }

    /** 
     * Get the 'secondLocationDetails' element value.
     * 
     * @return value
     */
    public RelatedLocationTwoIdentification187711CCUSPNRDataFeed132 getSecondLocationDetails() {
        return secondLocationDetails;
    }

    /** 
     * Set the 'secondLocationDetails' element value.
     * 
     * @param secondLocationDetails
     */
    public void setSecondLocationDetails(
            RelatedLocationTwoIdentification187711CCUSPNRDataFeed132 secondLocationDetails) {
        this.secondLocationDetails = secondLocationDetails;
    }
}
