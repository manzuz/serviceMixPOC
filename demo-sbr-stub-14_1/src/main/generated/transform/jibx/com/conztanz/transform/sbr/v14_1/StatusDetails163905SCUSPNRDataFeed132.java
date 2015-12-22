
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To advise the requester system the status of the reply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StatusDetails_163905_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="StatusDetails_232056_C_CUS_PNRDataFeed_132" name="statusInformation" maxOccurs="99"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StatusDetails163905SCUSPNRDataFeed132
{
    private List<StatusDetails232056CCUSPNRDataFeed132> statusInformationList = new ArrayList<StatusDetails232056CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'statusInformation' element items. Contains subparts of Commission Control Code: - commission prefix code - ATO/CTO commission indicator if applicable. - Commission Re-use indicator if applicable.
     * 
     * @return list
     */
    public List<StatusDetails232056CCUSPNRDataFeed132> getStatusInformationList() {
        return statusInformationList;
    }

    /** 
     * Set the list of 'statusInformation' element items. Contains subparts of Commission Control Code: - commission prefix code - ATO/CTO commission indicator if applicable. - Commission Re-use indicator if applicable.
     * 
     * @param list
     */
    public void setStatusInformationList(
            List<StatusDetails232056CCUSPNRDataFeed132> list) {
        statusInformationList = list;
    }
}
