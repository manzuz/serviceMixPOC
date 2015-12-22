
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details related to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_76069_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateTime_117824_C_CUS_PNRDataFeed_132" name="flightDate" minOccurs="0"/>
 *     &lt;xs:element type="Location_117826_C_CUS_PNRDataFeed_132" name="boardPointDetails" minOccurs="0"/>
 *     &lt;xs:element type="Location_117826_C_CUS_PNRDataFeed_132" name="offpointDetails" minOccurs="0"/>
 *     &lt;xs:element type="CompanyIdentification_117821_C_CUS_PNRDataFeed_132" name="companyDetails"/>
 *     &lt;xs:element type="ProductIdentificationDetails_117822_C_CUS_PNRDataFeed_132" name="flightIdentification" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="specialSegment" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation76069SCUSPNRDataFeed132
{
    private ProductDateTime117824CCUSPNRDataFeed132 flightDate;
    private Location117826CCUSPNRDataFeed132 boardPointDetails;
    private Location117826CCUSPNRDataFeed132 offpointDetails;
    private CompanyIdentification117821CCUSPNRDataFeed132 companyDetails;
    private ProductIdentificationDetails117822CCUSPNRDataFeed132 flightIdentification;
    private String specialSegment;

    /** 
     * Get the 'flightDate' element value. Date and time information on the booking
     * 
     * @return value
     */
    public ProductDateTime117824CCUSPNRDataFeed132 getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'flightDate' element value. Date and time information on the booking
     * 
     * @param flightDate
     */
    public void setFlightDate(ProductDateTime117824CCUSPNRDataFeed132 flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'boardPointDetails' element value. City code for the board point
     * 
     * @return value
     */
    public Location117826CCUSPNRDataFeed132 getBoardPointDetails() {
        return boardPointDetails;
    }

    /** 
     * Set the 'boardPointDetails' element value. City code for the board point
     * 
     * @param boardPointDetails
     */
    public void setBoardPointDetails(
            Location117826CCUSPNRDataFeed132 boardPointDetails) {
        this.boardPointDetails = boardPointDetails;
    }

    /** 
     * Get the 'offpointDetails' element value. Off point information
     * 
     * @return value
     */
    public Location117826CCUSPNRDataFeed132 getOffpointDetails() {
        return offpointDetails;
    }

    /** 
     * Set the 'offpointDetails' element value. Off point information
     * 
     * @param offpointDetails
     */
    public void setOffpointDetails(
            Location117826CCUSPNRDataFeed132 offpointDetails) {
        this.offpointDetails = offpointDetails;
    }

    /** 
     * Get the 'companyDetails' element value. Airline company description
     * 
     * @return value
     */
    public CompanyIdentification117821CCUSPNRDataFeed132 getCompanyDetails() {
        return companyDetails;
    }

    /** 
     * Set the 'companyDetails' element value. Airline company description
     * 
     * @param companyDetails
     */
    public void setCompanyDetails(
            CompanyIdentification117821CCUSPNRDataFeed132 companyDetails) {
        this.companyDetails = companyDetails;
    }

    /** 
     * Get the 'flightIdentification' element value. Flight details
     * 
     * @return value
     */
    public ProductIdentificationDetails117822CCUSPNRDataFeed132 getFlightIdentification() {
        return flightIdentification;
    }

    /** 
     * Set the 'flightIdentification' element value. Flight details
     * 
     * @param flightIdentification
     */
    public void setFlightIdentification(
            ProductIdentificationDetails117822CCUSPNRDataFeed132 flightIdentification) {
        this.flightIdentification = flightIdentification;
    }

    /** 
     * Get the 'specialSegment' element value. Flag special segments: - 'INF' for INFORMATIONAL - 'ARK' for ARUNK - 'OPN' for OPEN
     * 
     * @return value
     */
    public String getSpecialSegment() {
        return specialSegment;
    }

    /** 
     * Set the 'specialSegment' element value. Flag special segments: - 'INF' for INFORMATIONAL - 'ARK' for ARUNK - 'OPN' for OPEN
     * 
     * @param specialSegment
     */
    public void setSpecialSegment(String specialSegment) {
        this.specialSegment = specialSegment;
    }
}
