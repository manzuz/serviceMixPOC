
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a place or a location and/or related locations.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PlaceLocationIdentification_83065_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RelatedLocationOneIdentification_126890_C_CUS_PNRDataFeed_132" name="firstLocationDetails"/>
 *     &lt;xs:element type="RelatedLocationTwoIdentification_126891_C_CUS_PNRDataFeed_132" name="secondLocationDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PlaceLocationIdentification83065SCUSPNRDataFeed132
{
    private RelatedLocationOneIdentification126890CCUSPNRDataFeed132 firstLocationDetails;
    private RelatedLocationTwoIdentification126891CCUSPNRDataFeed132 secondLocationDetails;

    /** 
     * Get the 'firstLocationDetails' element value. Details of the embarkation port.
     * 
     * @return value
     */
    public RelatedLocationOneIdentification126890CCUSPNRDataFeed132 getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /** 
     * Set the 'firstLocationDetails' element value. Details of the embarkation port.
     * 
     * @param firstLocationDetails
     */
    public void setFirstLocationDetails(
            RelatedLocationOneIdentification126890CCUSPNRDataFeed132 firstLocationDetails) {
        this.firstLocationDetails = firstLocationDetails;
    }

    /** 
     * Get the 'secondLocationDetails' element value. Details of the disembarkation port.
     * 
     * @return value
     */
    public RelatedLocationTwoIdentification126891CCUSPNRDataFeed132 getSecondLocationDetails() {
        return secondLocationDetails;
    }

    /** 
     * Set the 'secondLocationDetails' element value. Details of the disembarkation port.
     * 
     * @param secondLocationDetails
     */
    public void setSecondLocationDetails(
            RelatedLocationTwoIdentification126891CCUSPNRDataFeed132 secondLocationDetails) {
        this.secondLocationDetails = secondLocationDetails;
    }
}
