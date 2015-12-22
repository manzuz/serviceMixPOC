
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Pdx_leg_group_139957_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravelItineraryInformation_76080_S_CUS_PNRDataFeed_132" name="legPosition"/>
 *     &lt;xs:element type="OriginAndDestinationDetails_76076_S_CUS_PNRDataFeed_132" name="leg"/>
 *     &lt;xs:element type="StatusDetails_76518_S_CUS_PNRDataFeed_132" name="legLevelIndicator" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="CodedAttribute_76798_S_CUS_PNRDataFeed_132" name="onloadStatus" minOccurs="0"/>
 *     &lt;xs:element type="UserIdentification_76803_S_CUS_PNRDataFeed_132" name="regradeAuthoriser" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceInformation_76071_S_CUS_PNRDataFeed_132" name="paxType"/>
 *     &lt;xs:element type="SpecialRequirementsDetails_76078_S_CUS_PNRDataFeed_132" name="seatDelivery" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_76079_S_CUS_PNRDataFeed_132" name="paxStatus" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_76232_S_CUS_PNRDataFeed_132" name="boardingTime" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_accregReason_139960_G_CUS_PNRDataFeed_1321" name="accregReason" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="SegmentCabinIdentification_80720_S_CUS_PNRDataFeed_132" name="regradeCabin" minOccurs="0"/>
 *     &lt;xs:element type="CabinDetails_279_S_CUS_PNRDataFeed_132" name="targetCabin" minOccurs="0"/>
 *     &lt;xs:element type="Priority_76801_S_CUS_PNRDataFeed_132" name="regradePriority" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_baggageInfo_139958_G_CUS_PNRDataFeed_1321" name="baggageInfo" minOccurs="0"/>
 *     &lt;xs:element type="DcsInformations_139583_G_CUS_PNRDataFeed_132" name="dcsSystemInfo" minOccurs="0"/>
 *     &lt;xs:element type="AcceptanceChannel_95655_G_CUS_PNRDataFeed_1321" name="acceptanceChannel" minOccurs="0"/>
 *     &lt;xs:element type="ItemNumber_76075_S_CUS_PNRDataFeed_132" name="otherIds" minOccurs="0"/>
 *     &lt;xs:element type="MiscellaneousRemarks_76804_S_CUS_PNRDataFeed_132" name="customerComments" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="ConnectionsDetailsGroup_139587_G_CUS_PNRDataFeed_1321" name="iOConnections" minOccurs="0" maxOccurs="10"/>
 *     &lt;xs:element type="CompensationDetails_79777_S_CUS_PNRDataFeed_132" name="compensationData" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PdxLegGroup139957GCUSPNRDataFeed1321
{
    private TravelItineraryInformation76080SCUSPNRDataFeed132 legPosition;
    private OriginAndDestinationDetails76076SCUSPNRDataFeed132 leg;
    private List<StatusDetails76518SCUSPNRDataFeed132> legLevelIndicatorList = new ArrayList<StatusDetails76518SCUSPNRDataFeed132>();
    private CodedAttribute76798SCUSPNRDataFeed132 onloadStatus;
    private UserIdentification76803SCUSPNRDataFeed132 regradeAuthoriser;
    private ReferenceInformation76071SCUSPNRDataFeed132 paxType;
    private SpecialRequirementsDetails76078SCUSPNRDataFeed132 seatDelivery;
    private StatusDetails76079SCUSPNRDataFeed132 paxStatus;
    private StructuredDateTimeInformation76232SCUSPNRDataFeed132 boardingTime;
    private List<StructuredBookingRecordImageTypeDataElementsMasterAccregReason139960GCUSPNRDataFeed1321> accregReasonList = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterAccregReason139960GCUSPNRDataFeed1321>();
    private SegmentCabinIdentification80720SCUSPNRDataFeed132 regradeCabin;
    private CabinDetails279SCUSPNRDataFeed132 targetCabin;
    private Priority76801SCUSPNRDataFeed132 regradePriority;
    private StructuredBookingRecordImageTypeDataElementsMasterBaggageInfo139958GCUSPNRDataFeed1321 baggageInfo;
    private DcsInformations139583GCUSPNRDataFeed132 dcsSystemInfo;
    private AcceptanceChannel95655GCUSPNRDataFeed1321 acceptanceChannel;
    private ItemNumber76075SCUSPNRDataFeed132 otherIds;
    private List<MiscellaneousRemarks76804SCUSPNRDataFeed132> customerCommentList = new ArrayList<MiscellaneousRemarks76804SCUSPNRDataFeed132>();
    private List<ConnectionsDetailsGroup139587GCUSPNRDataFeed1321> IOConnectionList = new ArrayList<ConnectionsDetailsGroup139587GCUSPNRDataFeed1321>();
    private CompensationDetails79777SCUSPNRDataFeed132 compensationData;

    /** 
     * Get the 'legPosition' element value. Contains the leg position inside the booking
     * 
     * @return value
     */
    public TravelItineraryInformation76080SCUSPNRDataFeed132 getLegPosition() {
        return legPosition;
    }

    /** 
     * Set the 'legPosition' element value. Contains the leg position inside the booking
     * 
     * @param legPosition
     */
    public void setLegPosition(
            TravelItineraryInformation76080SCUSPNRDataFeed132 legPosition) {
        this.legPosition = legPosition;
    }

    /** 
     * Get the 'leg' element value. Indenties uniquely a leg inside a multi-leg booking
     * 
     * @return value
     */
    public OriginAndDestinationDetails76076SCUSPNRDataFeed132 getLeg() {
        return leg;
    }

    /** 
     * Set the 'leg' element value. Indenties uniquely a leg inside a multi-leg booking
     * 
     * @param leg
     */
    public void setLeg(OriginAndDestinationDetails76076SCUSPNRDataFeed132 leg) {
        this.leg = leg;
    }

    /** 
     * Get the list of 'legLevelIndicator' element items. 1- Forced indicator indic=FOR action=0 or 1  2- Freeze indicator indic=FRE action=0 or 1  3- Boarding pass print status indic=PPT/NRP/NPT action=1  4- Head of Pool indic=HOP action=1(Yes)  5- Standby per destination indic=SPD action= -ACT = active -IAC = inactive -AUT = authorized
     * 
     * @return list
     */
    public List<StatusDetails76518SCUSPNRDataFeed132> getLegLevelIndicatorList() {
        return legLevelIndicatorList;
    }

    /** 
     * Set the list of 'legLevelIndicator' element items. 1- Forced indicator indic=FOR action=0 or 1  2- Freeze indicator indic=FRE action=0 or 1  3- Boarding pass print status indic=PPT/NRP/NPT action=1  4- Head of Pool indic=HOP action=1(Yes)  5- Standby per destination indic=SPD action= -ACT = active -IAC = inactive -AUT = authorized
     * 
     * @param list
     */
    public void setLegLevelIndicatorList(
            List<StatusDetails76518SCUSPNRDataFeed132> list) {
        legLevelIndicatorList = list;
    }

    /** 
     * Get the 'onloadStatus' element value. To convey the onload status: * attributeDetails/attributeType = - OLD : OK - NOL : NOK - OLR : OK Regrade - RGD : Regrade - OFL : Offload - NA : Not Aplicable  The NA value is used in case a PTY or CBD exists but there is no onload status.
     * 
     * @return value
     */
    public CodedAttribute76798SCUSPNRDataFeed132 getOnloadStatus() {
        return onloadStatus;
    }

    /** 
     * Set the 'onloadStatus' element value. To convey the onload status: * attributeDetails/attributeType = - OLD : OK - NOL : NOK - OLR : OK Regrade - RGD : Regrade - OFL : Offload - NA : Not Aplicable  The NA value is used in case a PTY or CBD exists but there is no onload status.
     * 
     * @param onloadStatus
     */
    public void setOnloadStatus(
            CodedAttribute76798SCUSPNRDataFeed132 onloadStatus) {
        this.onloadStatus = onloadStatus;
    }

    /** 
     * Get the 'regradeAuthoriser' element value. To convey the regrade authoriser (free text).
     * 
     * @return value
     */
    public UserIdentification76803SCUSPNRDataFeed132 getRegradeAuthoriser() {
        return regradeAuthoriser;
    }

    /** 
     * Set the 'regradeAuthoriser' element value. To convey the regrade authoriser (free text).
     * 
     * @param regradeAuthoriser
     */
    public void setRegradeAuthoriser(
            UserIdentification76803SCUSPNRDataFeed132 regradeAuthoriser) {
        this.regradeAuthoriser = regradeAuthoriser;
    }

    /** 
     * Get the 'paxType' element value. Determines if the DCS Data apply to the adult or to the infant (in case there is one). By default, it applies to the adult.
     * 
     * @return value
     */
    public ReferenceInformation76071SCUSPNRDataFeed132 getPaxType() {
        return paxType;
    }

    /** 
     * Set the 'paxType' element value. Determines if the DCS Data apply to the adult or to the infant (in case there is one). By default, it applies to the adult.
     * 
     * @param paxType
     */
    public void setPaxType(ReferenceInformation76071SCUSPNRDataFeed132 paxType) {
        this.paxType = paxType;
    }

    /** 
     * Get the 'seatDelivery' element value. Contains information on the seat delivered by the DCS
     * 
     * @return value
     */
    public SpecialRequirementsDetails76078SCUSPNRDataFeed132 getSeatDelivery() {
        return seatDelivery;
    }

    /** 
     * Set the 'seatDelivery' element value. Contains information on the seat delivered by the DCS
     * 
     * @param seatDelivery
     */
    public void setSeatDelivery(
            SpecialRequirementsDetails76078SCUSPNRDataFeed132 seatDelivery) {
        this.seatDelivery = seatDelivery;
    }

    /** 
     * Get the 'paxStatus' element value. Third data element provide the category of attribute: NOREC information, acceptance status... First data element contains the value of the attribute : the NOREC flag, the acceptance status, the boarding status and the cabin regrade type, Check Bags indicator, Waitlist status.
     * 
     * @return value
     */
    public StatusDetails76079SCUSPNRDataFeed132 getPaxStatus() {
        return paxStatus;
    }

    /** 
     * Set the 'paxStatus' element value. Third data element provide the category of attribute: NOREC information, acceptance status... First data element contains the value of the attribute : the NOREC flag, the acceptance status, the boarding status and the cabin regrade type, Check Bags indicator, Waitlist status.
     * 
     * @param paxStatus
     */
    public void setPaxStatus(StatusDetails76079SCUSPNRDataFeed132 paxStatus) {
        this.paxStatus = paxStatus;
    }

    /** 
     * Get the 'boardingTime' element value. Time of boarding (local time)
     * 
     * @return value
     */
    public StructuredDateTimeInformation76232SCUSPNRDataFeed132 getBoardingTime() {
        return boardingTime;
    }

    /** 
     * Set the 'boardingTime' element value. Time of boarding (local time)
     * 
     * @param boardingTime
     */
    public void setBoardingTime(
            StructuredDateTimeInformation76232SCUSPNRDataFeed132 boardingTime) {
        this.boardingTime = boardingTime;
    }

    /** 
     * Get the list of 'accregReason' element items. Contains the acceptance/regrade reason and reason code
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterAccregReason139960GCUSPNRDataFeed1321> getAccregReasonList() {
        return accregReasonList;
    }

    /** 
     * Set the list of 'accregReason' element items. Contains the acceptance/regrade reason and reason code
     * 
     * @param list
     */
    public void setAccregReasonList(
            List<StructuredBookingRecordImageTypeDataElementsMasterAccregReason139960GCUSPNRDataFeed1321> list) {
        accregReasonList = list;
    }

    /** 
     * Get the 'regradeCabin' element value. Regrade cabin code
     * 
     * @return value
     */
    public SegmentCabinIdentification80720SCUSPNRDataFeed132 getRegradeCabin() {
        return regradeCabin;
    }

    /** 
     * Set the 'regradeCabin' element value. Regrade cabin code
     * 
     * @param regradeCabin
     */
    public void setRegradeCabin(
            SegmentCabinIdentification80720SCUSPNRDataFeed132 regradeCabin) {
        this.regradeCabin = regradeCabin;
    }

    /** 
     * Get the 'targetCabin' element value. Target cabin code
     * 
     * @return value
     */
    public CabinDetails279SCUSPNRDataFeed132 getTargetCabin() {
        return targetCabin;
    }

    /** 
     * Set the 'targetCabin' element value. Target cabin code
     * 
     * @param targetCabin
     */
    public void setTargetCabin(CabinDetails279SCUSPNRDataFeed132 targetCabin) {
        this.targetCabin = targetCabin;
    }

    /** 
     * Get the 'regradePriority' element value. Conveys the regrade priority
     * 
     * @return value
     */
    public Priority76801SCUSPNRDataFeed132 getRegradePriority() {
        return regradePriority;
    }

    /** 
     * Set the 'regradePriority' element value. Conveys the regrade priority
     * 
     * @param regradePriority
     */
    public void setRegradePriority(
            Priority76801SCUSPNRDataFeed132 regradePriority) {
        this.regradePriority = regradePriority;
    }

    /** 
     * Get the 'baggageInfo' element value. Conveys baggage details
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeDataElementsMasterBaggageInfo139958GCUSPNRDataFeed1321 getBaggageInfo() {
        return baggageInfo;
    }

    /** 
     * Set the 'baggageInfo' element value. Conveys baggage details
     * 
     * @param baggageInfo
     */
    public void setBaggageInfo(
            StructuredBookingRecordImageTypeDataElementsMasterBaggageInfo139958GCUSPNRDataFeed1321 baggageInfo) {
        this.baggageInfo = baggageInfo;
    }

    /** 
     * Get the 'dcsSystemInfo' element value. contains specific DCS system information: - check-in company - Through check-in data: flight information, target DCS, target Airline, IATCI originator
     * 
     * @return value
     */
    public DcsInformations139583GCUSPNRDataFeed132 getDcsSystemInfo() {
        return dcsSystemInfo;
    }

    /** 
     * Set the 'dcsSystemInfo' element value. contains specific DCS system information: - check-in company - Through check-in data: flight information, target DCS, target Airline, IATCI originator
     * 
     * @param dcsSystemInfo
     */
    public void setDcsSystemInfo(
            DcsInformations139583GCUSPNRDataFeed132 dcsSystemInfo) {
        this.dcsSystemInfo = dcsSystemInfo;
    }

    /** 
     * Get the 'acceptanceChannel' element value. Group contains the acceptance channel information.
     * 
     * @return value
     */
    public AcceptanceChannel95655GCUSPNRDataFeed1321 getAcceptanceChannel() {
        return acceptanceChannel;
    }

    /** 
     * Set the 'acceptanceChannel' element value. Group contains the acceptance channel information.
     * 
     * @param acceptanceChannel
     */
    public void setAcceptanceChannel(
            AcceptanceChannel95655GCUSPNRDataFeed1321 acceptanceChannel) {
        this.acceptanceChannel = acceptanceChannel;
    }

    /** 
     * Get the 'otherIds' element value. Provides other references concerning the check in
     * 
     * @return value
     */
    public ItemNumber76075SCUSPNRDataFeed132 getOtherIds() {
        return otherIds;
    }

    /** 
     * Set the 'otherIds' element value. Provides other references concerning the check in
     * 
     * @param otherIds
     */
    public void setOtherIds(ItemNumber76075SCUSPNRDataFeed132 otherIds) {
        this.otherIds = otherIds;
    }

    /** 
     * Get the list of 'customerComments' element items. To convey the comment/remark. Type BGG - Baggage BPP - Boarding pass GTE - gate ACC - ACceptance NXT - Next SHL - Handling List BPT - Boarding Pass Printing ALL - All PDC - Cabin PDN - Normal  Text - comment text status - priority of the comment H - High N - Normal  otherStatus : delivery status CND - Not Delivered CDC - Delivery Completed
     * 
     * @return list
     */
    public List<MiscellaneousRemarks76804SCUSPNRDataFeed132> getCustomerCommentList() {
        return customerCommentList;
    }

    /** 
     * Set the list of 'customerComments' element items. To convey the comment/remark. Type BGG - Baggage BPP - Boarding pass GTE - gate ACC - ACceptance NXT - Next SHL - Handling List BPT - Boarding Pass Printing ALL - All PDC - Cabin PDN - Normal  Text - comment text status - priority of the comment H - High N - Normal  otherStatus : delivery status CND - Not Delivered CDC - Delivery Completed
     * 
     * @param list
     */
    public void setCustomerCommentList(
            List<MiscellaneousRemarks76804SCUSPNRDataFeed132> list) {
        customerCommentList = list;
    }

    /** 
     * Get the list of 'iOConnections' element items. manage inbound and outbound connections
     * 
     * @return list
     */
    public List<ConnectionsDetailsGroup139587GCUSPNRDataFeed1321> getIOConnectionList() {
        return IOConnectionList;
    }

    /** 
     * Set the list of 'iOConnections' element items. manage inbound and outbound connections
     * 
     * @param list
     */
    public void setIOConnectionList(
            List<ConnectionsDetailsGroup139587GCUSPNRDataFeed1321> list) {
        IOConnectionList = list;
    }

    /** 
     * Get the 'compensationData' element value. Provides information on the compensation offered to passengers with valid tickets, airline turned down at check-in/boarding. - coded form of payment (NGDCS only) - currency code (NGDCS only) - amount (NGDCS only) - compensation type (voluntary/involuntary) - free text (both valid for PFS clients and NGDCS)
     * 
     * @return value
     */
    public CompensationDetails79777SCUSPNRDataFeed132 getCompensationData() {
        return compensationData;
    }

    /** 
     * Set the 'compensationData' element value. Provides information on the compensation offered to passengers with valid tickets, airline turned down at check-in/boarding. - coded form of payment (NGDCS only) - currency code (NGDCS only) - amount (NGDCS only) - compensation type (voluntary/involuntary) - free text (both valid for PFS clients and NGDCS)
     * 
     * @param compensationData
     */
    public void setCompensationData(
            CompensationDetails79777SCUSPNRDataFeed132 compensationData) {
        this.compensationData = compensationData;
    }
}
