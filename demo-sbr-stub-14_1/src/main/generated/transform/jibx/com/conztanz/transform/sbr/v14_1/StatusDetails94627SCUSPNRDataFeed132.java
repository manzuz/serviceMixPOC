
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To advise the requester system the status of the reply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_94627_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_142269_C_CUS_PNRDataFeed_132" name="statusInformation" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails94627SCUSPNRDataFeed132
{
    private List<StatusDetails142269CCUSPNRDataFeed132> statusInformationList = new ArrayList<StatusDetails142269CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'statusInformation' element items. STATUS DETAILS
     * 
     * @return list
     */
    public List<StatusDetails142269CCUSPNRDataFeed132> getStatusInformationList() {
        return statusInformationList;
    }

    /** 
     * Set the list of 'statusInformation' element items. STATUS DETAILS
     * 
     * @param list
     */
    public void setStatusInformationList(
            List<StatusDetails142269CCUSPNRDataFeed132> list) {
        statusInformationList = list;
    }
}
