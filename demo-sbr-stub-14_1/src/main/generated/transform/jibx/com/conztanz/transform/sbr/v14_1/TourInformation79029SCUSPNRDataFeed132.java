
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey information concerning a tour.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TourInformation_79029_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TourDetails_121381_C_CUS_PNRDataFeed_132" name="tourInformationDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TourInformation79029SCUSPNRDataFeed132
{
    private TourDetails121381CCUSPNRDataFeed132 tourInformationDetails;

    /** 
     * Get the 'tourInformationDetails' element value. TST Nego: Tour Code
     * 
     * @return value
     */
    public TourDetails121381CCUSPNRDataFeed132 getTourInformationDetails() {
        return tourInformationDetails;
    }

    /** 
     * Set the 'tourInformationDetails' element value. TST Nego: Tour Code
     * 
     * @param tourInformationDetails
     */
    public void setTourInformationDetails(
            TourDetails121381CCUSPNRDataFeed132 tourInformationDetails) {
        this.tourInformationDetails = tourInformationDetails;
    }
}
