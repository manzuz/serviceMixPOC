
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey details describing the form of payment.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FormOfPayment_95223_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FormOfPaymentDetails_143006_C_CUS_PNRDataFeed_132" name="formOfPayment" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FormOfPayment95223SCUSPNRDataFeed132
{
    private List<FormOfPaymentDetails143006CCUSPNRDataFeed132> formOfPaymentList = new ArrayList<FormOfPaymentDetails143006CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'formOfPayment' element items. FOP details
     * 
     * @return list
     */
    public List<FormOfPaymentDetails143006CCUSPNRDataFeed132> getFormOfPaymentList() {
        return formOfPaymentList;
    }

    /** 
     * Set the list of 'formOfPayment' element items. FOP details
     * 
     * @param list
     */
    public void setFormOfPaymentList(
            List<FormOfPaymentDetails143006CCUSPNRDataFeed132> list) {
        formOfPaymentList = list;
    }
}
