
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify a status and related information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_76079_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_117835_C_CUS_PNRDataFeed_132" name="statusDetails" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails76079SCUSPNRDataFeed132
{
    private List<StatusDetails117835CCUSPNRDataFeed132> statusDetailList = new ArrayList<StatusDetails117835CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'statusDetails' element items. Provides a set of coded characteristics of the customer.
     * 
     * @return list
     */
    public List<StatusDetails117835CCUSPNRDataFeed132> getStatusDetailList() {
        return statusDetailList;
    }

    /** 
     * Set the list of 'statusDetails' element items. Provides a set of coded characteristics of the customer.
     * 
     * @param list
     */
    public void setStatusDetailList(
            List<StatusDetails117835CCUSPNRDataFeed132> list) {
        statusDetailList = list;
    }
}
