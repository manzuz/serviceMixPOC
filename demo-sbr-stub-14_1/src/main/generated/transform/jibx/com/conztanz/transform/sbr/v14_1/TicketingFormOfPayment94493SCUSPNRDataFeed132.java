
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey details describing the form of payment and not found in the FOP segment
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketingFormOfPayment_94493_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FormOfPaymentInformation_142105_C_CUS_PNRDataFeed_132" name="fopDetails" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketingFormOfPayment94493SCUSPNRDataFeed132
{
    private List<FormOfPaymentInformation142105CCUSPNRDataFeed132> fopDetailList = new ArrayList<FormOfPaymentInformation142105CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'fopDetails' element items. Form of payment details
     * 
     * @return list
     */
    public List<FormOfPaymentInformation142105CCUSPNRDataFeed132> getFopDetailList() {
        return fopDetailList;
    }

    /** 
     * Set the list of 'fopDetails' element items. Form of payment details
     * 
     * @param list
     */
    public void setFopDetailList(
            List<FormOfPaymentInformation142105CCUSPNRDataFeed132> list) {
        fopDetailList = list;
    }
}
