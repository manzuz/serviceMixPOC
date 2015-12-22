
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the selection criteria for a seat map request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatRequestParameters_75321_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="GenericDetails_116886_C_CUS_PNRDataFeed_132" name="genericDetails" minOccurs="0"/>
 *     &lt;xs:element type="RangeOfRowsDetails_116885_C_CUS_PNRDataFeed_132" name="rangeOfRowsDetails"/>
 *     &lt;xs:element type="xs:string" name="referenceNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatRequestParameters75321SCUSPNRDataFeed132
{
    private GenericDetails116886CCUSPNRDataFeed132 genericDetails;
    private RangeOfRowsDetails116885CCUSPNRDataFeed132 rangeOfRowsDetails;
    private String referenceNumber;
    private String description;

    /** 
     * Get the 'genericDetails' element value. This element contains the individual seat characteristics
     * 
     * @return value
     */
    public GenericDetails116886CCUSPNRDataFeed132 getGenericDetails() {
        return genericDetails;
    }

    /** 
     * Set the 'genericDetails' element value. This element contains the individual seat characteristics
     * 
     * @param genericDetails
     */
    public void setGenericDetails(
            GenericDetails116886CCUSPNRDataFeed132 genericDetails) {
        this.genericDetails = genericDetails;
    }

    /** 
     * Get the 'rangeOfRowsDetails' element value. This element contains the seat identification details
     * 
     * @return value
     */
    public RangeOfRowsDetails116885CCUSPNRDataFeed132 getRangeOfRowsDetails() {
        return rangeOfRowsDetails;
    }

    /** 
     * Set the 'rangeOfRowsDetails' element value. This element contains the seat identification details
     * 
     * @param rangeOfRowsDetails
     */
    public void setRangeOfRowsDetails(
            RangeOfRowsDetails116885CCUSPNRDataFeed132 rangeOfRowsDetails) {
        this.rangeOfRowsDetails = rangeOfRowsDetails;
    }

    /** 
     * Get the 'referenceNumber' element value. Passenger tattoo reference
     * 
     * @return value
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /** 
     * Set the 'referenceNumber' element value. Passenger tattoo reference
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    /** 
     * Get the 'description' element value. Seat free text containing the specific request (cryptic entry) for this individual seat
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. Seat free text containing the specific request (cryptic entry) for this individual seat
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
