
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify consumer reference information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsumerReferenceInformation_128775_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ConsumerReferenceIdentification_187627_C_CUS_PNRDataFeed_132" name="customerReferences" maxOccurs="20"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConsumerReferenceInformation128775SCUSPNRDataFeed132
{
    private List<ConsumerReferenceIdentification187627CCUSPNRDataFeed132> customerReferenceList = new ArrayList<ConsumerReferenceIdentification187627CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'customerReferences' element items. Customer references
     * 
     * @return list
     */
    public List<ConsumerReferenceIdentification187627CCUSPNRDataFeed132> getCustomerReferenceList() {
        return customerReferenceList;
    }

    /** 
     * Set the list of 'customerReferences' element items. Customer references
     * 
     * @param list
     */
    public void setCustomerReferenceList(
            List<ConsumerReferenceIdentification187627CCUSPNRDataFeed132> list) {
        customerReferenceList = list;
    }
}
