
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_bag_139959_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="BaggageInformation_76086_S_CUS_PNRDataFeed_132" name="bagInfo"/>
 *     &lt;xs:element type="StatusDetails_76091_S_CUS_PNRDataFeed_132" name="acceptanceStatus"/>
 *     &lt;xs:element type="OriginAndDestinationDetails_76088_S_CUS_PNRDataFeed_132" name="bagJourney" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterBag139959GCUSPNRDataFeed1321
{
    private BaggageInformation76086SCUSPNRDataFeed132 bagInfo;
    private StatusDetails76091SCUSPNRDataFeed132 acceptanceStatus;
    private OriginAndDestinationDetails76088SCUSPNRDataFeed132 bagJourney;

    /** 
     * Get the 'bagInfo' element value. Conveys bag info
     * 
     * @return value
     */
    public BaggageInformation76086SCUSPNRDataFeed132 getBagInfo() {
        return bagInfo;
    }

    /** 
     * Set the 'bagInfo' element value. Conveys bag info
     * 
     * @param bagInfo
     */
    public void setBagInfo(BaggageInformation76086SCUSPNRDataFeed132 bagInfo) {
        this.bagInfo = bagInfo;
    }

    /** 
     * Get the 'acceptanceStatus' element value. Contains the bag acceptance status, 'statusIndicator' containing BAS, 'action' containing: "BFA" for fully accepted "BPA" for provisionally accepted "BNA" for not accepted
     * 
     * @return value
     */
    public StatusDetails76091SCUSPNRDataFeed132 getAcceptanceStatus() {
        return acceptanceStatus;
    }

    /** 
     * Set the 'acceptanceStatus' element value. Contains the bag acceptance status, 'statusIndicator' containing BAS, 'action' containing: "BFA" for fully accepted "BPA" for provisionally accepted "BNA" for not accepted
     * 
     * @param acceptanceStatus
     */
    public void setAcceptanceStatus(
            StatusDetails76091SCUSPNRDataFeed132 acceptanceStatus) {
        this.acceptanceStatus = acceptanceStatus;
    }

    /** 
     * Get the 'bagJourney' element value. Conveys information on bag boardpoint and arrival point
     * 
     * @return value
     */
    public OriginAndDestinationDetails76088SCUSPNRDataFeed132 getBagJourney() {
        return bagJourney;
    }

    /** 
     * Set the 'bagJourney' element value. Conveys information on bag boardpoint and arrival point
     * 
     * @param bagJourney
     */
    public void setBagJourney(
            OriginAndDestinationDetails76088SCUSPNRDataFeed132 bagJourney) {
        this.bagJourney = bagJourney;
    }
}
