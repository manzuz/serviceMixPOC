
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * will convey various 3DS data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupForThreeDomainSecureData_112587_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CreditCardSecurity_94521_S_CUS_PNRDataFeed_132" name="authenticationData"/>
 *     &lt;xs:element type="CommunicationContact_94522_S_CUS_PNRDataFeed_132" name="acsURL" minOccurs="0"/>
 *     &lt;xs:element type="GroupForThreeDomainSecureData_tdsBlobData_112588_G_CUS_PNRDataFeed_132" name="tdsBlobData" minOccurs="0" maxOccurs="4"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupForThreeDomainSecureData112587GCUSPNRDataFeed132
{
    private CreditCardSecurity94521SCUSPNRDataFeed132 authenticationData;
    private CommunicationContact94522SCUSPNRDataFeed132 acsURL;
    private List<GroupForThreeDomainSecureDataTdsBlobData112588GCUSPNRDataFeed132> tdsBlobDataList = new ArrayList<GroupForThreeDomainSecureDataTdsBlobData112588GCUSPNRDataFeed132>();

    /** 
     * Get the 'authenticationData' element value. This segment conveys a set of data resulting from the 3DS authentication process
     * 
     * @return value
     */
    public CreditCardSecurity94521SCUSPNRDataFeed132 getAuthenticationData() {
        return authenticationData;
    }

    /** 
     * Set the 'authenticationData' element value. This segment conveys a set of data resulting from the 3DS authentication process
     * 
     * @param authenticationData
     */
    public void setAuthenticationData(
            CreditCardSecurity94521SCUSPNRDataFeed132 authenticationData) {
        this.authenticationData = authenticationData;
    }

    /** 
     * Get the 'acsURL' element value. Access Control Server's URL (up to 2048 characters).
     * 
     * @return value
     */
    public CommunicationContact94522SCUSPNRDataFeed132 getAcsURL() {
        return acsURL;
    }

    /** 
     * Set the 'acsURL' element value. Access Control Server's URL (up to 2048 characters).
     * 
     * @param acsURL
     */
    public void setAcsURL(CommunicationContact94522SCUSPNRDataFeed132 acsURL) {
        this.acsURL = acsURL;
    }

    /** 
     * Get the list of 'tdsBlobData' element items. will convey the various messages/encrypted data used during the 3DS authentication processes
     * 
     * @return list
     */
    public List<GroupForThreeDomainSecureDataTdsBlobData112588GCUSPNRDataFeed132> getTdsBlobDataList() {
        return tdsBlobDataList;
    }

    /** 
     * Set the list of 'tdsBlobData' element items. will convey the various messages/encrypted data used during the 3DS authentication processes
     * 
     * @param list
     */
    public void setTdsBlobDataList(
            List<GroupForThreeDomainSecureDataTdsBlobData112588GCUSPNRDataFeed132> list) {
        tdsBlobDataList = list;
    }
}
