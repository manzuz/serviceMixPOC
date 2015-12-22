
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify consumer reference information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConsumerReferenceInformation_87599_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ConsumerReferenceIdentification_132907_C_CUS_PNRDataFeed_132" name="customerReferences" maxOccurs="3"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConsumerReferenceInformation87599SCUSPNRDataFeed132
{
    private List<ConsumerReferenceIdentification132907CCUSPNRDataFeed132> customerReferenceList = new ArrayList<ConsumerReferenceIdentification132907CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'customerReferences' element items. Consumer reference information
     * 
     * @return list
     */
    public List<ConsumerReferenceIdentification132907CCUSPNRDataFeed132> getCustomerReferenceList() {
        return customerReferenceList;
    }

    /** 
     * Set the list of 'customerReferences' element items. Consumer reference information
     * 
     * @param list
     */
    public void setCustomerReferenceList(
            List<ConsumerReferenceIdentification132907CCUSPNRDataFeed132> list) {
        customerReferenceList = list;
    }
}
