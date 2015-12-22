
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_accregReason_139960_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CodedAttribute_76073_S_CUS_PNRDataFeed_132" name="reasons"/>
 *     &lt;xs:element type="InteractiveFreeText_76074_S_CUS_PNRDataFeed_132" name="deliveryInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterAccregReason139960GCUSPNRDataFeed1321
{
    private CodedAttribute76073SCUSPNRDataFeed132 reasons;
    private InteractiveFreeText76074SCUSPNRDataFeed132 deliveryInformation;

    /** 
     * Get the 'reasons' element value. Reason code for: - Acceptation/Cancellation - Regrade
     * 
     * @return value
     */
    public CodedAttribute76073SCUSPNRDataFeed132 getReasons() {
        return reasons;
    }

    /** 
     * Set the 'reasons' element value. Reason code for: - Acceptation/Cancellation - Regrade
     * 
     * @param reasons
     */
    public void setReasons(CodedAttribute76073SCUSPNRDataFeed132 reasons) {
        this.reasons = reasons;
    }

    /** 
     * Get the 'deliveryInformation' element value. Contains Acceptance Reason, Regrade Reason description.
     * 
     * @return value
     */
    public InteractiveFreeText76074SCUSPNRDataFeed132 getDeliveryInformation() {
        return deliveryInformation;
    }

    /** 
     * Set the 'deliveryInformation' element value. Contains Acceptance Reason, Regrade Reason description.
     * 
     * @param deliveryInformation
     */
    public void setDeliveryInformation(
            InteractiveFreeText76074SCUSPNRDataFeed132 deliveryInformation) {
        this.deliveryInformation = deliveryInformation;
    }
}
