
package com.conztanz.transform.sbr.v14_1;

/** 
 * to convey the pnr point of sell
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Group000group2_138356_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="PointOfSaleInformation_123378_S_CUS_PNRDataFeed_132" name="pointOfSaleInformationType"/>
 *     &lt;xs:element type="UserIdentification_85800_S_CUS_PNRDataFeed_132" name="sbrUserIdentification"/>
 *     &lt;xs:element type="SystemDetailsInfo_122303_S_CUS_PNRDataFeed_132" name="sbrSystemDetails" minOccurs="0"/>
 *     &lt;xs:element type="UserPreferences_26257_S_CUS_PNRDataFeed_132" name="sbrPreferences" minOccurs="0"/>
 *     &lt;xs:element type="TicketingAgentInformation_122281_S_CUS_PNRDataFeed_132" name="agentId" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_122293_S_CUS_PNRDataFeed_132" name="pointOfSaleDate" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Group000group2138356GCUSPNRDataFeed132
{
    private PointOfSaleInformation123378SCUSPNRDataFeed132 pointOfSaleInformationType;
    private UserIdentification85800SCUSPNRDataFeed132 sbrUserIdentification;
    private SystemDetailsInfo122303SCUSPNRDataFeed132 sbrSystemDetails;
    private UserPreferences26257SCUSPNRDataFeed132 sbrPreferences;
    private TicketingAgentInformation122281SCUSPNRDataFeed132 agentId;
    private StructuredDateTimeInformation122293SCUSPNRDataFeed132 pointOfSaleDate;

    /** 
     * Get the 'pointOfSaleInformationType' element value. This segment indicates the type of PNR Point of Sale
     * 
     * @return value
     */
    public PointOfSaleInformation123378SCUSPNRDataFeed132 getPointOfSaleInformationType() {
        return pointOfSaleInformationType;
    }

    /** 
     * Set the 'pointOfSaleInformationType' element value. This segment indicates the type of PNR Point of Sale
     * 
     * @param pointOfSaleInformationType
     */
    public void setPointOfSaleInformationType(
            PointOfSaleInformation123378SCUSPNRDataFeed132 pointOfSaleInformationType) {
        this.pointOfSaleInformationType = pointOfSaleInformationType;
    }

    /** 
     * Get the 'sbrUserIdentification' element value. - Office ID owner of the SBR. - IATA Code - Agent type
     * 
     * @return value
     */
    public UserIdentification85800SCUSPNRDataFeed132 getSbrUserIdentification() {
        return sbrUserIdentification;
    }

    /** 
     * Set the 'sbrUserIdentification' element value. - Office ID owner of the SBR. - IATA Code - Agent type
     * 
     * @param sbrUserIdentification
     */
    public void setSbrUserIdentification(
            UserIdentification85800SCUSPNRDataFeed132 sbrUserIdentification) {
        this.sbrUserIdentification = sbrUserIdentification;
    }

    /** 
     * Get the 'sbrSystemDetails' element value. - Workstation ID (if applicable) - Corporate Code - City Code
     * 
     * @return value
     */
    public SystemDetailsInfo122303SCUSPNRDataFeed132 getSbrSystemDetails() {
        return sbrSystemDetails;
    }

    /** 
     * Set the 'sbrSystemDetails' element value. - Workstation ID (if applicable) - Corporate Code - City Code
     * 
     * @param sbrSystemDetails
     */
    public void setSbrSystemDetails(
            SystemDetailsInfo122303SCUSPNRDataFeed132 sbrSystemDetails) {
        this.sbrSystemDetails = sbrSystemDetails;
    }

    /** 
     * Get the 'sbrPreferences' element value. Preferences - Country - Language - Currency
     * 
     * @return value
     */
    public UserPreferences26257SCUSPNRDataFeed132 getSbrPreferences() {
        return sbrPreferences;
    }

    /** 
     * Set the 'sbrPreferences' element value. Preferences - Country - Language - Currency
     * 
     * @param sbrPreferences
     */
    public void setSbrPreferences(
            UserPreferences26257SCUSPNRDataFeed132 sbrPreferences) {
        this.sbrPreferences = sbrPreferences;
    }

    /** 
     * Get the 'agentId' element value. Convey the LSS user identification or/and the agent sign
     * 
     * @return value
     */
    public TicketingAgentInformation122281SCUSPNRDataFeed132 getAgentId() {
        return agentId;
    }

    /** 
     * Set the 'agentId' element value. Convey the LSS user identification or/and the agent sign
     * 
     * @param agentId
     */
    public void setAgentId(
            TicketingAgentInformation122281SCUSPNRDataFeed132 agentId) {
        this.agentId = agentId;
    }

    /** 
     * Get the 'pointOfSaleDate' element value.
     * 
     * @return value
     */
    public StructuredDateTimeInformation122293SCUSPNRDataFeed132 getPointOfSaleDate() {
        return pointOfSaleDate;
    }

    /** 
     * Set the 'pointOfSaleDate' element value.
     * 
     * @param pointOfSaleDate
     */
    public void setPointOfSaleDate(
            StructuredDateTimeInformation122293SCUSPNRDataFeed132 pointOfSaleDate) {
        this.pointOfSaleDate = pointOfSaleDate;
    }
}
