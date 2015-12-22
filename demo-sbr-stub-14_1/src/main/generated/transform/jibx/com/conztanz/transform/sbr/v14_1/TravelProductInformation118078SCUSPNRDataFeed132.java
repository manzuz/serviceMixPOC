
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details related to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_118078_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateTime_173492_C_CUS_PNRDataFeed_132" name="flightDate" minOccurs="0"/>
 *     &lt;xs:element type="Location_173494_C_CUS_PNRDataFeed_132" name="boardPointDetails" minOccurs="0"/>
 *     &lt;xs:element type="Location_173494_C_CUS_PNRDataFeed_132" name="offpointDetails" minOccurs="0"/>
 *     &lt;xs:element type="CompanyIdentification_173489_C_CUS_PNRDataFeed_132" name="companyDetails" minOccurs="0"/>
 *     &lt;xs:element type="ProductIdentificationDetails_173490_C_CUS_PNRDataFeed_132" name="flightIdentification" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="specialSegment" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation118078SCUSPNRDataFeed132
{
    private ProductDateTime173492CCUSPNRDataFeed132 flightDate;
    private Location173494CCUSPNRDataFeed132 boardPointDetails;
    private Location173494CCUSPNRDataFeed132 offpointDetails;
    private CompanyIdentification173489CCUSPNRDataFeed132 companyDetails;
    private ProductIdentificationDetails173490CCUSPNRDataFeed132 flightIdentification;
    private String specialSegment;

    /** 
     * Get the 'flightDate' element value.
     * 
     * @return value
     */
    public ProductDateTime173492CCUSPNRDataFeed132 getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'flightDate' element value.
     * 
     * @param flightDate
     */
    public void setFlightDate(ProductDateTime173492CCUSPNRDataFeed132 flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'boardPointDetails' element value.
     * 
     * @return value
     */
    public Location173494CCUSPNRDataFeed132 getBoardPointDetails() {
        return boardPointDetails;
    }

    /** 
     * Set the 'boardPointDetails' element value.
     * 
     * @param boardPointDetails
     */
    public void setBoardPointDetails(
            Location173494CCUSPNRDataFeed132 boardPointDetails) {
        this.boardPointDetails = boardPointDetails;
    }

    /** 
     * Get the 'offpointDetails' element value.
     * 
     * @return value
     */
    public Location173494CCUSPNRDataFeed132 getOffpointDetails() {
        return offpointDetails;
    }

    /** 
     * Set the 'offpointDetails' element value.
     * 
     * @param offpointDetails
     */
    public void setOffpointDetails(
            Location173494CCUSPNRDataFeed132 offpointDetails) {
        this.offpointDetails = offpointDetails;
    }

    /** 
     * Get the 'companyDetails' element value.
     * 
     * @return value
     */
    public CompanyIdentification173489CCUSPNRDataFeed132 getCompanyDetails() {
        return companyDetails;
    }

    /** 
     * Set the 'companyDetails' element value.
     * 
     * @param companyDetails
     */
    public void setCompanyDetails(
            CompanyIdentification173489CCUSPNRDataFeed132 companyDetails) {
        this.companyDetails = companyDetails;
    }

    /** 
     * Get the 'flightIdentification' element value.
     * 
     * @return value
     */
    public ProductIdentificationDetails173490CCUSPNRDataFeed132 getFlightIdentification() {
        return flightIdentification;
    }

    /** 
     * Set the 'flightIdentification' element value.
     * 
     * @param flightIdentification
     */
    public void setFlightIdentification(
            ProductIdentificationDetails173490CCUSPNRDataFeed132 flightIdentification) {
        this.flightIdentification = flightIdentification;
    }

    /** 
     * Get the 'specialSegment' element value. mandatory for FROm flight details; optional for TO flight details
     * 
     * @return value
     */
    public String getSpecialSegment() {
        return specialSegment;
    }

    /** 
     * Set the 'specialSegment' element value. mandatory for FROm flight details; optional for TO flight details
     * 
     * @param specialSegment
     */
    public void setSpecialSegment(String specialSegment) {
        this.specialSegment = specialSegment;
    }
}
