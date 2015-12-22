
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey details describing a compensation given to a Customer
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompensationDetails_79777_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CompensationDetails_122344_C_CUS_PNRDataFeed_132" name="compensationDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompensationDetails79777SCUSPNRDataFeed132
{
    private CompensationDetails122344CCUSPNRDataFeed132 compensationDetails;

    /** 
     * Get the 'compensationDetails' element value. Compensation details
     * 
     * @return value
     */
    public CompensationDetails122344CCUSPNRDataFeed132 getCompensationDetails() {
        return compensationDetails;
    }

    /** 
     * Set the 'compensationDetails' element value. Compensation details
     * 
     * @param compensationDetails
     */
    public void setCompensationDetails(
            CompensationDetails122344CCUSPNRDataFeed132 compensationDetails) {
        this.compensationDetails = compensationDetails;
    }
}
