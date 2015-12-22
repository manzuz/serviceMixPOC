
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify information concerning the payment.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentInformation_95217_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PaymentDetails_142997_C_CUS_PNRDataFeed_132" name="paymentDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentInformation95217SCUSPNRDataFeed132
{
    private PaymentDetails142997CCUSPNRDataFeed132 paymentDetails;

    /** 
     * Get the 'paymentDetails' element value. This composite is used to convey the payment information
     * 
     * @return value
     */
    public PaymentDetails142997CCUSPNRDataFeed132 getPaymentDetails() {
        return paymentDetails;
    }

    /** 
     * Set the 'paymentDetails' element value. This composite is used to convey the payment information
     * 
     * @param paymentDetails
     */
    public void setPaymentDetails(
            PaymentDetails142997CCUSPNRDataFeed132 paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
}
