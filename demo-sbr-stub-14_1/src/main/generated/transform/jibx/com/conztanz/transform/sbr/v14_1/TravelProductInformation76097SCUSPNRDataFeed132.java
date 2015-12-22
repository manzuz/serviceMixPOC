
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details related to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_76097_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateTime_117863_C_CUS_PNRDataFeed_132" name="flightDate" minOccurs="0"/>
 *     &lt;xs:element type="CompanyIdentification_117860_C_CUS_PNRDataFeed_132" name="companyDetails"/>
 *     &lt;xs:element type="ProductIdentificationDetails_117861_C_CUS_PNRDataFeed_132" name="flightIdentification" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation76097SCUSPNRDataFeed132
{
    private ProductDateTime117863CCUSPNRDataFeed132 flightDate;
    private CompanyIdentification117860CCUSPNRDataFeed132 companyDetails;
    private ProductIdentificationDetails117861CCUSPNRDataFeed132 flightIdentification;

    /** 
     * Get the 'flightDate' element value. Date and time information on the flight.
     * 
     * @return value
     */
    public ProductDateTime117863CCUSPNRDataFeed132 getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'flightDate' element value. Date and time information on the flight.
     * 
     * @param flightDate
     */
    public void setFlightDate(ProductDateTime117863CCUSPNRDataFeed132 flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'companyDetails' element value. Airline company description
     * 
     * @return value
     */
    public CompanyIdentification117860CCUSPNRDataFeed132 getCompanyDetails() {
        return companyDetails;
    }

    /** 
     * Set the 'companyDetails' element value. Airline company description
     * 
     * @param companyDetails
     */
    public void setCompanyDetails(
            CompanyIdentification117860CCUSPNRDataFeed132 companyDetails) {
        this.companyDetails = companyDetails;
    }

    /** 
     * Get the 'flightIdentification' element value. Flight details
     * 
     * @return value
     */
    public ProductIdentificationDetails117861CCUSPNRDataFeed132 getFlightIdentification() {
        return flightIdentification;
    }

    /** 
     * Set the 'flightIdentification' element value. Flight details
     * 
     * @param flightIdentification
     */
    public void setFlightIdentification(
            ProductIdentificationDetails117861CCUSPNRDataFeed132 flightIdentification) {
        this.flightIdentification = flightIdentification;
    }
}
