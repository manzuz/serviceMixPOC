
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the Amadeus PNR Individual Security element
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IndividualPnrSecurityInformation_2053_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="IndividualSecurity_3194_C_CUS_PNRDataFeed_132" name="security" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="SecurityInformation_2762_C_CUS_PNRDataFeed_132" name="securityInfo" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="indicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IndividualPnrSecurityInformation2053SCUSPNRDataFeed132
{
    private List<IndividualSecurity3194CCUSPNRDataFeed132> securityList = new ArrayList<IndividualSecurity3194CCUSPNRDataFeed132>();
    private SecurityInformation2762CCUSPNRDataFeed132 securityInfo;
    private String indicator;

    /** 
     * Get the list of 'security' element items. Returned before End of transaction when retrieving a PNR security element
     * 
     * @return list
     */
    public List<IndividualSecurity3194CCUSPNRDataFeed132> getSecurityList() {
        return securityList;
    }

    /** 
     * Set the list of 'security' element items. Returned before End of transaction when retrieving a PNR security element
     * 
     * @param list
     */
    public void setSecurityList(
            List<IndividualSecurity3194CCUSPNRDataFeed132> list) {
        securityList = list;
    }

    /** 
     * Get the 'securityInfo' element value. Returned when retrieving a PNR
     * 
     * @return value
     */
    public SecurityInformation2762CCUSPNRDataFeed132 getSecurityInfo() {
        return securityInfo;
    }

    /** 
     * Set the 'securityInfo' element value. Returned when retrieving a PNR
     * 
     * @param securityInfo
     */
    public void setSecurityInfo(
            SecurityInformation2762CCUSPNRDataFeed132 securityInfo) {
        this.securityInfo = securityInfo;
    }

    /** 
     * Get the 'indicator' element value. Code as in the display:  G for Amadeus Global Core Office Identification  I for IATA number  P for Pseudo-Office Identification Default is G.
     * 
     * @return value
     */
    public String getIndicator() {
        return indicator;
    }

    /** 
     * Set the 'indicator' element value. Code as in the display:  G for Amadeus Global Core Office Identification  I for IATA number  P for Pseudo-Office Identification Default is G.
     * 
     * @param indicator
     */
    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }
}
