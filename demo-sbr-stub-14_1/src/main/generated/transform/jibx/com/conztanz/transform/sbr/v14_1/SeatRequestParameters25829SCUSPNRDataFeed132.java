
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the selection criteria for a seat map request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatRequestParameters_25829_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RangeOfRowsDetails_46938_C_CUS_PNRDataFeed_132" name="rangeOfRowsDetails"/>
 *     &lt;xs:element type="xs:string" name="referenceNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatRequestParameters25829SCUSPNRDataFeed132
{
    private RangeOfRowsDetails46938CCUSPNRDataFeed132 rangeOfRowsDetails;
    private String referenceNumber;
    private String description;

    /** 
     * Get the 'rangeOfRowsDetails' element value. This element contains the seat identification details.
     * 
     * @return value
     */
    public RangeOfRowsDetails46938CCUSPNRDataFeed132 getRangeOfRowsDetails() {
        return rangeOfRowsDetails;
    }

    /** 
     * Set the 'rangeOfRowsDetails' element value. This element contains the seat identification details.
     * 
     * @param rangeOfRowsDetails
     */
    public void setRangeOfRowsDetails(
            RangeOfRowsDetails46938CCUSPNRDataFeed132 rangeOfRowsDetails) {
        this.rangeOfRowsDetails = rangeOfRowsDetails;
    }

    /** 
     * Get the 'referenceNumber' element value. Reference ID to the passenger.
     * 
     * @return value
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /** 
     * Set the 'referenceNumber' element value. Reference ID to the passenger.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    /** 
     * Get the 'description' element value. Specific seat free text that contains the specific seat request for this particular passenger.
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. Specific seat free text that contains the specific seat request for this particular passenger.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
