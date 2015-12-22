
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide information concerning bagtag printers and bagtag details.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BaggageInformation_76086_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="BaggageStatusDetails_117845_C_CUS_PNRDataFeed_132" name="baggageDetails"/>
 *     &lt;xs:element type="BagtagDetails_117846_C_CUS_PNRDataFeed_132" name="bagTagDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BaggageInformation76086SCUSPNRDataFeed132
{
    private BaggageStatusDetails117845CCUSPNRDataFeed132 baggageDetails;
    private BagtagDetails117846CCUSPNRDataFeed132 bagTagDetails;

    /** 
     * Get the 'baggageDetails' element value. Contains details on an individual bag.
     * 
     * @return value
     */
    public BaggageStatusDetails117845CCUSPNRDataFeed132 getBaggageDetails() {
        return baggageDetails;
    }

    /** 
     * Set the 'baggageDetails' element value. Contains details on an individual bag.
     * 
     * @param baggageDetails
     */
    public void setBaggageDetails(
            BaggageStatusDetails117845CCUSPNRDataFeed132 baggageDetails) {
        this.baggageDetails = baggageDetails;
    }

    /** 
     * Get the 'bagTagDetails' element value. Bag Tag Details
     * 
     * @return value
     */
    public BagtagDetails117846CCUSPNRDataFeed132 getBagTagDetails() {
        return bagTagDetails;
    }

    /** 
     * Set the 'bagTagDetails' element value. Bag Tag Details
     * 
     * @param bagTagDetails
     */
    public void setBagTagDetails(
            BagtagDetails117846CCUSPNRDataFeed132 bagTagDetails) {
        this.bagTagDetails = bagTagDetails;
    }
}
