
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify consumer reference information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsumerReferenceInformation_36729_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ConsumerReferenceIdentification_62837_C_CUS_PNRDataFeed_132" name="customerReferences" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConsumerReferenceInformation36729SCUSPNRDataFeed132
{
    private List<ConsumerReferenceIdentification62837CCUSPNRDataFeed132> customerReferenceList = new ArrayList<ConsumerReferenceIdentification62837CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'customerReferences' element items. Consumer reference information
     * 
     * @return list
     */
    public List<ConsumerReferenceIdentification62837CCUSPNRDataFeed132> getCustomerReferenceList() {
        return customerReferenceList;
    }

    /** 
     * Set the list of 'customerReferences' element items. Consumer reference information
     * 
     * @param list
     */
    public void setCustomerReferenceList(
            List<ConsumerReferenceIdentification62837CCUSPNRDataFeed132> list) {
        customerReferenceList = list;
    }
}
