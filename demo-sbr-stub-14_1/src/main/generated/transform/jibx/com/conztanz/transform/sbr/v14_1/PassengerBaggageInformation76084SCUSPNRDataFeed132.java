
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information relating to a passenger's baggage.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PassengerBaggageInformation_76084_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CheckedBaggageDetails_117840_C_CUS_PNRDataFeed_132" name="checkedBaggageDetails" minOccurs="0"/>
 *     &lt;xs:element type="HandBaggageDetails_117841_C_CUS_PNRDataFeed_132" name="handBaggageDetails" minOccurs="0"/>
 *     &lt;xs:element type="BaggageReferenceDetails_117843_C_CUS_PNRDataFeed_132" name="baggageRefDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PassengerBaggageInformation76084SCUSPNRDataFeed132
{
    private CheckedBaggageDetails117840CCUSPNRDataFeed132 checkedBaggageDetails;
    private HandBaggageDetails117841CCUSPNRDataFeed132 handBaggageDetails;
    private BaggageReferenceDetails117843CCUSPNRDataFeed132 baggageRefDetails;

    /** 
     * Get the 'checkedBaggageDetails' element value. Details on checked baggages
     * 
     * @return value
     */
    public CheckedBaggageDetails117840CCUSPNRDataFeed132 getCheckedBaggageDetails() {
        return checkedBaggageDetails;
    }

    /** 
     * Set the 'checkedBaggageDetails' element value. Details on checked baggages
     * 
     * @param checkedBaggageDetails
     */
    public void setCheckedBaggageDetails(
            CheckedBaggageDetails117840CCUSPNRDataFeed132 checkedBaggageDetails) {
        this.checkedBaggageDetails = checkedBaggageDetails;
    }

    /** 
     * Get the 'handBaggageDetails' element value. Details on hand baggages
     * 
     * @return value
     */
    public HandBaggageDetails117841CCUSPNRDataFeed132 getHandBaggageDetails() {
        return handBaggageDetails;
    }

    /** 
     * Set the 'handBaggageDetails' element value. Details on hand baggages
     * 
     * @param handBaggageDetails
     */
    public void setHandBaggageDetails(
            HandBaggageDetails117841CCUSPNRDataFeed132 handBaggageDetails) {
        this.handBaggageDetails = handBaggageDetails;
    }

    /** 
     * Get the 'baggageRefDetails' element value. To specify details on the processing of the baggages
     * 
     * @return value
     */
    public BaggageReferenceDetails117843CCUSPNRDataFeed132 getBaggageRefDetails() {
        return baggageRefDetails;
    }

    /** 
     * Set the 'baggageRefDetails' element value. To specify details on the processing of the baggages
     * 
     * @param baggageRefDetails
     */
    public void setBaggageRefDetails(
            BaggageReferenceDetails117843CCUSPNRDataFeed132 baggageRefDetails) {
        this.baggageRefDetails = baggageRefDetails;
    }
}
