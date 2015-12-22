
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey details describing the form of payment.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormOfPayment_94499_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FormOfPaymentDetails_142110_C_CUS_PNRDataFeed_132" name="formOfPayment"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FormOfPayment94499SCUSPNRDataFeed132
{
    private FormOfPaymentDetails142110CCUSPNRDataFeed132 formOfPayment;

    /** 
     * Get the 'formOfPayment' element value. Generic status(new/old) and type(cash, cheque, card...) of the MOP
     * 
     * @return value
     */
    public FormOfPaymentDetails142110CCUSPNRDataFeed132 getFormOfPayment() {
        return formOfPayment;
    }

    /** 
     * Set the 'formOfPayment' element value. Generic status(new/old) and type(cash, cheque, card...) of the MOP
     * 
     * @param formOfPayment
     */
    public void setFormOfPayment(
            FormOfPaymentDetails142110CCUSPNRDataFeed132 formOfPayment) {
        this.formOfPayment = formOfPayment;
    }
}
