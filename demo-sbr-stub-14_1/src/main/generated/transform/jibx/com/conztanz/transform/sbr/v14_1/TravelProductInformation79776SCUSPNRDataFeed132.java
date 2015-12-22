
package com.conztanz.transform.sbr.v14_1;

/** 
 * Describes Flight Data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_79776_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateTime_122341_C_CUS_PNRDataFeed_132" name="flightDate"/>
 *     &lt;xs:element type="Location_122343_C_CUS_PNRDataFeed_132" name="boardPointDetails" minOccurs="0"/>
 *     &lt;xs:element type="Location_122343_C_CUS_PNRDataFeed_132" name="offpointDetails" minOccurs="0"/>
 *     &lt;xs:element type="CompanyIdentification_122338_C_CUS_PNRDataFeed_132" name="companyDetails"/>
 *     &lt;xs:element type="ProductIdentificationDetails_122339_C_CUS_PNRDataFeed_132" name="flightIdentification"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation79776SCUSPNRDataFeed132
{
    private ProductDateTime122341CCUSPNRDataFeed132 flightDate;
    private Location122343CCUSPNRDataFeed132 boardPointDetails;
    private Location122343CCUSPNRDataFeed132 offpointDetails;
    private CompanyIdentification122338CCUSPNRDataFeed132 companyDetails;
    private ProductIdentificationDetails122339CCUSPNRDataFeed132 flightIdentification;

    /** 
     * Get the 'flightDate' element value. Contains the mandatory departure date with an optionnal arrival time
     * 
     * @return value
     */
    public ProductDateTime122341CCUSPNRDataFeed132 getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'flightDate' element value. Contains the mandatory departure date with an optionnal arrival time
     * 
     * @param flightDate
     */
    public void setFlightDate(ProductDateTime122341CCUSPNRDataFeed132 flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'boardPointDetails' element value. Board point
     * 
     * @return value
     */
    public Location122343CCUSPNRDataFeed132 getBoardPointDetails() {
        return boardPointDetails;
    }

    /** 
     * Set the 'boardPointDetails' element value. Board point
     * 
     * @param boardPointDetails
     */
    public void setBoardPointDetails(
            Location122343CCUSPNRDataFeed132 boardPointDetails) {
        this.boardPointDetails = boardPointDetails;
    }

    /** 
     * Get the 'offpointDetails' element value. Off point
     * 
     * @return value
     */
    public Location122343CCUSPNRDataFeed132 getOffpointDetails() {
        return offpointDetails;
    }

    /** 
     * Set the 'offpointDetails' element value. Off point
     * 
     * @param offpointDetails
     */
    public void setOffpointDetails(
            Location122343CCUSPNRDataFeed132 offpointDetails) {
        this.offpointDetails = offpointDetails;
    }

    /** 
     * Get the 'companyDetails' element value. Details of the company
     * 
     * @return value
     */
    public CompanyIdentification122338CCUSPNRDataFeed132 getCompanyDetails() {
        return companyDetails;
    }

    /** 
     * Set the 'companyDetails' element value. Details of the company
     * 
     * @param companyDetails
     */
    public void setCompanyDetails(
            CompanyIdentification122338CCUSPNRDataFeed132 companyDetails) {
        this.companyDetails = companyDetails;
    }

    /** 
     * Get the 'flightIdentification' element value. Flight identification by its number and booking class
     * 
     * @return value
     */
    public ProductIdentificationDetails122339CCUSPNRDataFeed132 getFlightIdentification() {
        return flightIdentification;
    }

    /** 
     * Set the 'flightIdentification' element value. Flight identification by its number and booking class
     * 
     * @param flightIdentification
     */
    public void setFlightIdentification(
            ProductIdentificationDetails122339CCUSPNRDataFeed132 flightIdentification) {
        this.flightIdentification = flightIdentification;
    }
}
