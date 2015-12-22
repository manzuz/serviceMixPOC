
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To convey travel agent and system identification.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketingAgentInformation_122281_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyIdNumber" minOccurs="0"/>
 *     &lt;xs:element type="InternalIdentificationDetails_178880_C_CUS_PNRDataFeed_132" name="internalIdDetails" minOccurs="0" maxOccurs="5"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketingAgentInformation122281SCUSPNRDataFeed132
{
    private String companyIdNumber;
    private List<InternalIdentificationDetails178880CCUSPNRDataFeed132> internalIdDetailList = new ArrayList<InternalIdentificationDetails178880CCUSPNRDataFeed132>();

    /** 
     * Get the 'companyIdNumber' element value. Organisation
     * 
     * @return value
     */
    public String getCompanyIdNumber() {
        return companyIdNumber;
    }

    /** 
     * Set the 'companyIdNumber' element value. Organisation
     * 
     * @param companyIdNumber
     */
    public void setCompanyIdNumber(String companyIdNumber) {
        this.companyIdNumber = companyIdNumber;
    }

    /** 
     * Get the list of 'internalIdDetails' element items. Conveys the agent's details.
     * 
     * @return list
     */
    public List<InternalIdentificationDetails178880CCUSPNRDataFeed132> getInternalIdDetailList() {
        return internalIdDetailList;
    }

    /** 
     * Set the list of 'internalIdDetails' element items. Conveys the agent's details.
     * 
     * @param list
     */
    public void setInternalIdDetailList(
            List<InternalIdentificationDetails178880CCUSPNRDataFeed132> list) {
        internalIdDetailList = list;
    }
}
