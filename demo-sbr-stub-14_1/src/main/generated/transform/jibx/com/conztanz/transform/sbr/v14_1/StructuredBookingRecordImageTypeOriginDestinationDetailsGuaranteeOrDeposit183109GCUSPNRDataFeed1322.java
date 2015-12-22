
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_guaranteeOrDeposit_183109_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PaymentInformation_95217_S_CUS_PNRDataFeed_132" name="paymentInfo"/>
 *     &lt;xs:element type="FormOfPayment_95223_S_CUS_PNRDataFeed_132" name="creditCardInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsGuaranteeOrDeposit183109GCUSPNRDataFeed1322
{
    private PaymentInformation95217SCUSPNRDataFeed132 paymentInfo;
    private FormOfPayment95223SCUSPNRDataFeed132 creditCardInfo;

    /** 
     * Get the 'paymentInfo' element value. This segment is used to convey the guarantee or deposit information
     * 
     * @return value
     */
    public PaymentInformation95217SCUSPNRDataFeed132 getPaymentInfo() {
        return paymentInfo;
    }

    /** 
     * Set the 'paymentInfo' element value. This segment is used to convey the guarantee or deposit information
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(
            PaymentInformation95217SCUSPNRDataFeed132 paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    /** 
     * Get the 'creditCardInfo' element value. This segment is used to convey the credit card information.
     * 
     * @return value
     */
    public FormOfPayment95223SCUSPNRDataFeed132 getCreditCardInfo() {
        return creditCardInfo;
    }

    /** 
     * Set the 'creditCardInfo' element value. This segment is used to convey the credit card information.
     * 
     * @param creditCardInfo
     */
    public void setCreditCardInfo(
            FormOfPayment95223SCUSPNRDataFeed132 creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }
}
