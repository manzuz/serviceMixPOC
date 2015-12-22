
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the method, type, amount, currency and due date of payment.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PaymentDetails_142997_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="formOfPaymentCode"/>
 *     &lt;xs:element type="xs:string" name="paymentType"/>
 *     &lt;xs:element type="xs:string" name="serviceToPay"/>
 *     &lt;xs:element type="xs:string" name="referenceNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PaymentDetails142997CCUSPNRDataFeed132
{
    private String formOfPaymentCode;
    private String paymentType;
    private String serviceToPay;
    private String referenceNumber;

    /** 
     * Get the 'formOfPaymentCode' element value. To convey the guarantee /deposit form
     * 
     * @return value
     */
    public String getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    /** 
     * Set the 'formOfPaymentCode' element value. To convey the guarantee /deposit form
     * 
     * @param formOfPaymentCode
     */
    public void setFormOfPaymentCode(String formOfPaymentCode) {
        this.formOfPaymentCode = formOfPaymentCode;
    }

    /** 
     * Get the 'paymentType' element value. This data element is used to idicates if it is a guarantee or a deposit
     * 
     * @return value
     */
    public String getPaymentType() {
        return paymentType;
    }

    /** 
     * Set the 'paymentType' element value. This data element is used to idicates if it is a guarantee or a deposit
     * 
     * @param paymentType
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /** 
     * Get the 'serviceToPay' element value. This data element is used to identify the type of service to be paid, in our case it will always be 3 for hotel
     * 
     * @return value
     */
    public String getServiceToPay() {
        return serviceToPay;
    }

    /** 
     * Set the 'serviceToPay' element value. This data element is used to identify the type of service to be paid, in our case it will always be 3 for hotel
     * 
     * @param serviceToPay
     */
    public void setServiceToPay(String serviceToPay) {
        this.serviceToPay = serviceToPay;
    }

    /** 
     * Get the 'referenceNumber' element value. This data element is used to convey the guarantee or the deposit reference.
     * 
     * @return value
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /** 
     * Set the 'referenceNumber' element value. This data element is used to convey the guarantee or the deposit reference.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}
