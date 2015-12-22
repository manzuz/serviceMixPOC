
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To provide billable information for a claim or encounter.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BillableInformation_87596_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Diagnosis_132905_C_CUS_PNRDataFeed_132" name="billingInfo" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BillableInformation87596SCUSPNRDataFeed132
{
    private List<Diagnosis132905CCUSPNRDataFeed132> billingInfoList = new ArrayList<Diagnosis132905CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'billingInfo' element items. This composite is used to convey the billable information.
     * 
     * @return list
     */
    public List<Diagnosis132905CCUSPNRDataFeed132> getBillingInfoList() {
        return billingInfoList;
    }

    /** 
     * Set the list of 'billingInfo' element items. This composite is used to convey the billable information.
     * 
     * @param list
     */
    public void setBillingInfoList(List<Diagnosis132905CCUSPNRDataFeed132> list) {
        billingInfoList = list;
    }
}
