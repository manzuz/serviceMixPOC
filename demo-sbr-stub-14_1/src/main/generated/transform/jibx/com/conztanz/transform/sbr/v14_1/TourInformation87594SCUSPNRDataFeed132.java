
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey information concerning a tour.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TourInformation_87594_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TourDetails_132902_C_CUS_PNRDataFeed_132" name="tourInformationDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TourInformation87594SCUSPNRDataFeed132
{
    private TourDetails132902CCUSPNRDataFeed132 tourInformationDetails;

    /** 
     * Get the 'tourInformationDetails' element value. Tour code
     * 
     * @return value
     */
    public TourDetails132902CCUSPNRDataFeed132 getTourInformationDetails() {
        return tourInformationDetails;
    }

    /** 
     * Set the 'tourInformationDetails' element value. Tour code
     * 
     * @param tourInformationDetails
     */
    public void setTourInformationDetails(
            TourDetails132902CCUSPNRDataFeed132 tourInformationDetails) {
        this.tourInformationDetails = tourInformationDetails;
    }
}
