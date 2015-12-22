
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details related to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_25889_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateTime_47017_C_CUS_PNRDataFeed_132" name="flightDate" minOccurs="0"/>
 *     &lt;xs:element type="Location_47019_C_CUS_PNRDataFeed_132" name="boardPointDetails" minOccurs="0"/>
 *     &lt;xs:element type="Location_47019_C_CUS_PNRDataFeed_132" name="offpointDetails" minOccurs="0"/>
 *     &lt;xs:element type="CompanyIdentification_47014_C_CUS_PNRDataFeed_132" name="companyDetails"/>
 *     &lt;xs:element type="ProductIdentificationDetails_47015_C_CUS_PNRDataFeed_132" name="flightIdentification"/>
 *     &lt;xs:element type="ProductTypeDetails_47016_C_CUS_PNRDataFeed_132" name="flightTypeDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation25889SCUSPNRDataFeed132
{
    private ProductDateTime47017CCUSPNRDataFeed132 flightDate;
    private Location47019CCUSPNRDataFeed132 boardPointDetails;
    private Location47019CCUSPNRDataFeed132 offpointDetails;
    private CompanyIdentification47014CCUSPNRDataFeed132 companyDetails;
    private ProductIdentificationDetails47015CCUSPNRDataFeed132 flightIdentification;
    private ProductTypeDetails47016CCUSPNRDataFeed132 flightTypeDetails;

    /** 
     * Get the 'flightDate' element value.
     * 
     * @return value
     */
    public ProductDateTime47017CCUSPNRDataFeed132 getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'flightDate' element value.
     * 
     * @param flightDate
     */
    public void setFlightDate(ProductDateTime47017CCUSPNRDataFeed132 flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'boardPointDetails' element value.
     * 
     * @return value
     */
    public Location47019CCUSPNRDataFeed132 getBoardPointDetails() {
        return boardPointDetails;
    }

    /** 
     * Set the 'boardPointDetails' element value.
     * 
     * @param boardPointDetails
     */
    public void setBoardPointDetails(
            Location47019CCUSPNRDataFeed132 boardPointDetails) {
        this.boardPointDetails = boardPointDetails;
    }

    /** 
     * Get the 'offpointDetails' element value.
     * 
     * @return value
     */
    public Location47019CCUSPNRDataFeed132 getOffpointDetails() {
        return offpointDetails;
    }

    /** 
     * Set the 'offpointDetails' element value.
     * 
     * @param offpointDetails
     */
    public void setOffpointDetails(
            Location47019CCUSPNRDataFeed132 offpointDetails) {
        this.offpointDetails = offpointDetails;
    }

    /** 
     * Get the 'companyDetails' element value.
     * 
     * @return value
     */
    public CompanyIdentification47014CCUSPNRDataFeed132 getCompanyDetails() {
        return companyDetails;
    }

    /** 
     * Set the 'companyDetails' element value.
     * 
     * @param companyDetails
     */
    public void setCompanyDetails(
            CompanyIdentification47014CCUSPNRDataFeed132 companyDetails) {
        this.companyDetails = companyDetails;
    }

    /** 
     * Get the 'flightIdentification' element value.
     * 
     * @return value
     */
    public ProductIdentificationDetails47015CCUSPNRDataFeed132 getFlightIdentification() {
        return flightIdentification;
    }

    /** 
     * Set the 'flightIdentification' element value.
     * 
     * @param flightIdentification
     */
    public void setFlightIdentification(
            ProductIdentificationDetails47015CCUSPNRDataFeed132 flightIdentification) {
        this.flightIdentification = flightIdentification;
    }

    /** 
     * Get the 'flightTypeDetails' element value.
     * 
     * @return value
     */
    public ProductTypeDetails47016CCUSPNRDataFeed132 getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /** 
     * Set the 'flightTypeDetails' element value.
     * 
     * @param flightTypeDetails
     */
    public void setFlightTypeDetails(
            ProductTypeDetails47016CCUSPNRDataFeed132 flightTypeDetails) {
        this.flightTypeDetails = flightTypeDetails;
    }
}
