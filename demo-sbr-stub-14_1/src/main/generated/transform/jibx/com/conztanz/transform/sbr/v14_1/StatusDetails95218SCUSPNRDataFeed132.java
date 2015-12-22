
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To advise the requester system the status of the reply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_95218_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_142998_C_CUS_PNRDataFeed_132" name="statusDetails" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails95218SCUSPNRDataFeed132
{
    private List<StatusDetails142998CCUSPNRDataFeed132> statusDetailList = new ArrayList<StatusDetails142998CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'statusDetails' element items. The Security Status.  This may contain the allowed Permission to View a data field.
     * 
     * @return list
     */
    public List<StatusDetails142998CCUSPNRDataFeed132> getStatusDetailList() {
        return statusDetailList;
    }

    /** 
     * Set the list of 'statusDetails' element items. The Security Status.  This may contain the allowed Permission to View a data field.
     * 
     * @param list
     */
    public void setStatusDetailList(
            List<StatusDetails142998CCUSPNRDataFeed132> list) {
        statusDetailList = list;
    }
}
