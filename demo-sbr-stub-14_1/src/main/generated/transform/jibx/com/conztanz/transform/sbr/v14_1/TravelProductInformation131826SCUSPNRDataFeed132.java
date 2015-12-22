
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify details related to a product.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravelProductInformation_131826_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ProductDateTime_191423_C_CUS_PNRDataFeed_132" name="flightDate"/>
 *     &lt;xs:element type="Location_191425_C_CUS_PNRDataFeed_132" name="boardPointDetails"/>
 *     &lt;xs:element type="Location_191425_C_CUS_PNRDataFeed_132" name="offpointDetails"/>
 *     &lt;xs:element type="CompanyIdentification_191420_C_CUS_PNRDataFeed_132" name="companyDetails" minOccurs="0"/>
 *     &lt;xs:element type="ProductIdentificationDetails_191421_C_CUS_PNRDataFeed_132" name="flightIdentification" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="itemNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravelProductInformation131826SCUSPNRDataFeed132
{
    private ProductDateTime191423CCUSPNRDataFeed132 flightDate;
    private Location191425CCUSPNRDataFeed132 boardPointDetails;
    private Location191425CCUSPNRDataFeed132 offpointDetails;
    private CompanyIdentification191420CCUSPNRDataFeed132 companyDetails;
    private ProductIdentificationDetails191421CCUSPNRDataFeed132 flightIdentification;
    private BigDecimal itemNumber;

    /** 
     * Get the 'flightDate' element value.
     * 
     * @return value
     */
    public ProductDateTime191423CCUSPNRDataFeed132 getFlightDate() {
        return flightDate;
    }

    /** 
     * Set the 'flightDate' element value.
     * 
     * @param flightDate
     */
    public void setFlightDate(ProductDateTime191423CCUSPNRDataFeed132 flightDate) {
        this.flightDate = flightDate;
    }

    /** 
     * Get the 'boardPointDetails' element value.
     * 
     * @return value
     */
    public Location191425CCUSPNRDataFeed132 getBoardPointDetails() {
        return boardPointDetails;
    }

    /** 
     * Set the 'boardPointDetails' element value.
     * 
     * @param boardPointDetails
     */
    public void setBoardPointDetails(
            Location191425CCUSPNRDataFeed132 boardPointDetails) {
        this.boardPointDetails = boardPointDetails;
    }

    /** 
     * Get the 'offpointDetails' element value.
     * 
     * @return value
     */
    public Location191425CCUSPNRDataFeed132 getOffpointDetails() {
        return offpointDetails;
    }

    /** 
     * Set the 'offpointDetails' element value.
     * 
     * @param offpointDetails
     */
    public void setOffpointDetails(
            Location191425CCUSPNRDataFeed132 offpointDetails) {
        this.offpointDetails = offpointDetails;
    }

    /** 
     * Get the 'companyDetails' element value.
     * 
     * @return value
     */
    public CompanyIdentification191420CCUSPNRDataFeed132 getCompanyDetails() {
        return companyDetails;
    }

    /** 
     * Set the 'companyDetails' element value.
     * 
     * @param companyDetails
     */
    public void setCompanyDetails(
            CompanyIdentification191420CCUSPNRDataFeed132 companyDetails) {
        this.companyDetails = companyDetails;
    }

    /** 
     * Get the 'flightIdentification' element value.
     * 
     * @return value
     */
    public ProductIdentificationDetails191421CCUSPNRDataFeed132 getFlightIdentification() {
        return flightIdentification;
    }

    /** 
     * Set the 'flightIdentification' element value.
     * 
     * @param flightIdentification
     */
    public void setFlightIdentification(
            ProductIdentificationDetails191421CCUSPNRDataFeed132 flightIdentification) {
        this.flightIdentification = flightIdentification;
    }

    /** 
     * Get the 'itemNumber' element value.
     * 
     * @return value
     */
    public BigDecimal getItemNumber() {
        return itemNumber;
    }

    /** 
     * Set the 'itemNumber' element value.
     * 
     * @param itemNumber
     */
    public void setItemNumber(BigDecimal itemNumber) {
        this.itemNumber = itemNumber;
    }
}
