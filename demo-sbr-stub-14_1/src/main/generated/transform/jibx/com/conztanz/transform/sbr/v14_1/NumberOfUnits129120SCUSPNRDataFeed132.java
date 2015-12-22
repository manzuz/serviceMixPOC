
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the number of units required
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnits_129120_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NumberOfUnitDetails_188142_C_CUS_PNRDataFeed_132" name="quantityDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnits129120SCUSPNRDataFeed132
{
    private NumberOfUnitDetails188142CCUSPNRDataFeed132 quantityDetails;

    /** 
     * Get the 'quantityDetails' element value. Number of Unit Details
     * 
     * @return value
     */
    public NumberOfUnitDetails188142CCUSPNRDataFeed132 getQuantityDetails() {
        return quantityDetails;
    }

    /** 
     * Set the 'quantityDetails' element value. Number of Unit Details
     * 
     * @param quantityDetails
     */
    public void setQuantityDetails(
            NumberOfUnitDetails188142CCUSPNRDataFeed132 quantityDetails) {
        this.quantityDetails = quantityDetails;
    }
}
