
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information concerning excess baggage charges and the associated baggage details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExcessBaggageDetails_70497_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="BagtagDetails_109778_C_CUS_PNRDataFeed_132" name="bagTagDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExcessBaggageDetails70497SCUSPNRDataFeed132
{
    private BagtagDetails109778CCUSPNRDataFeed132 bagTagDetails;

    /** 
     * Get the 'bagTagDetails' element value. XSB details.
     * 
     * @return value
     */
    public BagtagDetails109778CCUSPNRDataFeed132 getBagTagDetails() {
        return bagTagDetails;
    }

    /** 
     * Set the 'bagTagDetails' element value. XSB details.
     * 
     * @param bagTagDetails
     */
    public void setBagTagDetails(
            BagtagDetails109778CCUSPNRDataFeed132 bagTagDetails) {
        this.bagTagDetails = bagTagDetails;
    }
}
