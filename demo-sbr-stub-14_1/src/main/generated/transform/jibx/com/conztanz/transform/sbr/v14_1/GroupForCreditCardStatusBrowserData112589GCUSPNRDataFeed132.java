
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupForCreditCardStatus_browserData_112589_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="BrowserInformation_94525_S_CUS_PNRDataFeed_132" name="browserProperties"/>
 *     &lt;xs:element type="FreeTextInformation_94526_S_CUS_PNRDataFeed_132" name="freeFlowBrowserData" minOccurs="0" maxOccurs="2"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupForCreditCardStatusBrowserData112589GCUSPNRDataFeed132
{
    private BrowserInformation94525SCUSPNRDataFeed132 browserProperties;
    private List<FreeTextInformation94526SCUSPNRDataFeed132> freeFlowBrowserDataList = new ArrayList<FreeTextInformation94526SCUSPNRDataFeed132>();

    /** 
     * Get the 'browserProperties' element value. This segment contains data about the customer's browser :  0 PC (HTML) 1 Mobile Internet Device (WML)
     * 
     * @return value
     */
    public BrowserInformation94525SCUSPNRDataFeed132 getBrowserProperties() {
        return browserProperties;
    }

    /** 
     * Set the 'browserProperties' element value. This segment contains data about the customer's browser :  0 PC (HTML) 1 Mobile Internet Device (WML)
     * 
     * @param browserProperties
     */
    public void setBrowserProperties(
            BrowserInformation94525SCUSPNRDataFeed132 browserProperties) {
        this.browserProperties = browserProperties;
    }

    /** 
     * Get the list of 'freeFlowBrowserData' element items. Contains in freeflow format data about the customer's browser. - userAgent - acceptHeaders This entities are independantly optional.
     * 
     * @return list
     */
    public List<FreeTextInformation94526SCUSPNRDataFeed132> getFreeFlowBrowserDataList() {
        return freeFlowBrowserDataList;
    }

    /** 
     * Set the list of 'freeFlowBrowserData' element items. Contains in freeflow format data about the customer's browser. - userAgent - acceptHeaders This entities are independantly optional.
     * 
     * @param list
     */
    public void setFreeFlowBrowserDataList(
            List<FreeTextInformation94526SCUSPNRDataFeed132> list) {
        freeFlowBrowserDataList = list;
    }
}
