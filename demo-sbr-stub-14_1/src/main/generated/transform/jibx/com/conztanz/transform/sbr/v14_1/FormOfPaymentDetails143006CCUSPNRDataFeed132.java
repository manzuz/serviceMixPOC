
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the form of payment type, amounts, approval codes, and other related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormOfPaymentDetails_143006_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="indicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="vendorCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="creditCardNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="expiryDate" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="extendedPayment" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="fopFreeText" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FormOfPaymentDetails143006CCUSPNRDataFeed132
{
    private String type;
    private String indicator;
    private String vendorCode;
    private String creditCardNumber;
    private String expiryDate;
    private String extendedPayment;
    private String fopFreeText;

    /** 
     * Get the 'type' element value. Fop type (Cash, Credit card...)
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Fop type (Cash, Credit card...)
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'indicator' element value.
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value.
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    /** 
     * Get the 'vendorCode' element value. Credit card vendor code
     * 
     * @return value
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /** 
     * Set the 'vendorCode' element value. Credit card vendor code
     * 
     * @param vendorCode
     */
    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    /** 
     * Get the 'creditCardNumber' element value. Credit card number
     * 
     * @return value
     */
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    /** 
     * Set the 'creditCardNumber' element value. Credit card number
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    /** 
     * Get the 'expiryDate' element value. expiry date (MMYY)
     * 
     * @return value
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /** 
     * Set the 'expiryDate' element value. expiry date (MMYY)
     * 
     * @param expiryDate
     */
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    /** 
     * Get the 'extendedPayment' element value. FOP purpose
     * 
     * @return value
     */
    public String getExtendedPayment() {
        return extendedPayment;
    }

    /** 
     * Set the 'extendedPayment' element value. FOP purpose
     * 
     * @param extendedPayment
     */
    public void setExtendedPayment(String extendedPayment) {
        this.extendedPayment = extendedPayment;
    }

    /** 
     * Get the 'fopFreeText' element value. Unstructured fop layout (used for Voucher print purpose or guarantee details).
     * 
     * @return value
     */
    public String getFopFreeText() {
        return fopFreeText;
    }

    /** 
     * Set the 'fopFreeText' element value. Unstructured fop layout (used for Voucher print purpose or guarantee details).
     * 
     * @param fopFreeText
     */
    public void setFopFreeText(String fopFreeText) {
        this.fopFreeText = fopFreeText;
    }
}
