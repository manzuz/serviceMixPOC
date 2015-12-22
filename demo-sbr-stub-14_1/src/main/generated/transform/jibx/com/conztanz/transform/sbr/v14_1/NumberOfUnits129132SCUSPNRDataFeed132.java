
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the number of units required
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnits_129132_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="NumberOfUnitDetails_188165_C_CUS_PNRDataFeed_132" name="quantityDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnits129132SCUSPNRDataFeed132
{
    private NumberOfUnitDetails188165CCUSPNRDataFeed132 quantityDetails;

    /** 
     * Get the 'quantityDetails' element value. Number of Unit Details
     * 
     * @return value
     */
    public NumberOfUnitDetails188165CCUSPNRDataFeed132 getQuantityDetails() {
        return quantityDetails;
    }

    /** 
     * Set the 'quantityDetails' element value. Number of Unit Details
     * 
     * @param quantityDetails
     */
    public void setQuantityDetails(
            NumberOfUnitDetails188165CCUSPNRDataFeed132 quantityDetails) {
        this.quantityDetails = quantityDetails;
    }
}
