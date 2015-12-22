
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the form of payment type, amounts, approval codes, and other related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormOfPaymentDetails_142110_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FormOfPaymentDetails142110CCUSPNRDataFeed132
{
    private String type;

    /** 
     * Get the 'type' element value. Generic type of the Mean of Payment used : CC credit Card CA cash CH cheque WW web payment... INV invoice
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Generic type of the Mean of Payment used : CC credit Card CA cash CH cheque WW web payment... INV invoice
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
