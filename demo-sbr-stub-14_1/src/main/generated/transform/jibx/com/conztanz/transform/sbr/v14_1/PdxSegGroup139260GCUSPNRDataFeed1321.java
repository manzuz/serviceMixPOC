
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Pdx_seg_group_139260_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravelProductInformation_76069_S_CUS_PNRDataFeed_132" name="booking"/>
 *     &lt;xs:element type="ReferenceInformation_76071_S_CUS_PNRDataFeed_132" name="paxType"/>
 *     &lt;xs:element type="ReferenceInformation_76272_S_CUS_PNRDataFeed_132" name="segLinkId" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="PlaceLocationIdentification_81180_S_CUS_PNRDataFeed_132" name="countryInfo" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="StatusDetails_76518_S_CUS_PNRDataFeed_132" name="securityInfo" minOccurs="0" maxOccurs="8"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_appDetails_139261_G_CUS_PNRDataFeed_1321" name="appDetails" minOccurs="0" maxOccurs="9"/>
 *     &lt;xs:element type="Nationality_76759_S_CUS_PNRDataFeed_132" name="nationalty" minOccurs="0"/>
 *     &lt;xs:element type="CodedAttribute_76892_S_CUS_PNRDataFeed_132" name="typeOfCOP" minOccurs="0"/>
 *     &lt;xs:element type="Ticketsection_95653_G_CUS_PNRDataFeed_1321" name="ticketData" minOccurs="0" maxOccurs="30"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PdxSegGroup139260GCUSPNRDataFeed1321
{
    private TravelProductInformation76069SCUSPNRDataFeed132 booking;
    private ReferenceInformation76071SCUSPNRDataFeed132 paxType;
    private List<ReferenceInformation76272SCUSPNRDataFeed132> segLinkIdList = new ArrayList<ReferenceInformation76272SCUSPNRDataFeed132>();
    private List<PlaceLocationIdentification81180SCUSPNRDataFeed132> countryInfoList = new ArrayList<PlaceLocationIdentification81180SCUSPNRDataFeed132>();
    private List<StatusDetails76518SCUSPNRDataFeed132> securityInfoList = new ArrayList<StatusDetails76518SCUSPNRDataFeed132>();
    private List<StructuredBookingRecordImageTypeDataElementsMasterAppDetails139261GCUSPNRDataFeed1321> appDetailList = new ArrayList<StructuredBookingRecordImageTypeDataElementsMasterAppDetails139261GCUSPNRDataFeed1321>();
    private Nationality76759SCUSPNRDataFeed132 nationalty;
    private CodedAttribute76892SCUSPNRDataFeed132 typeOfCOP;
    private List<Ticketsection95653GCUSPNRDataFeed1321> ticketDataList = new ArrayList<Ticketsection95653GCUSPNRDataFeed1321>();

    /** 
     * Get the 'booking' element value. Booking information. This is not required by the process it self, but can be used to easily track problems. This segment is required also to solve ambiguity problems. It can be empty if there is not need to convey information (more meaningful than a DUM)
     * 
     * @return value
     */
    public TravelProductInformation76069SCUSPNRDataFeed132 getBooking() {
        return booking;
    }

    /** 
     * Set the 'booking' element value. Booking information. This is not required by the process it self, but can be used to easily track problems. This segment is required also to solve ambiguity problems. It can be empty if there is not need to convey information (more meaningful than a DUM)
     * 
     * @param booking
     */
    public void setBooking(
            TravelProductInformation76069SCUSPNRDataFeed132 booking) {
        this.booking = booking;
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
     * Get the list of 'segLinkId' element items. Convey the link or sub-link ID at seg level
     * 
     * @return list
     */
    public List<ReferenceInformation76272SCUSPNRDataFeed132> getSegLinkIdList() {
        return segLinkIdList;
    }

    /** 
     * Set the list of 'segLinkId' element items. Convey the link or sub-link ID at seg level
     * 
     * @param list
     */
    public void setSegLinkIdList(
            List<ReferenceInformation76272SCUSPNRDataFeed132> list) {
        segLinkIdList = list;
    }

    /** 
     * Get the list of 'countryInfo' element items. Convey either the place of residence or the place of birth
     * 
     * @return list
     */
    public List<PlaceLocationIdentification81180SCUSPNRDataFeed132> getCountryInfoList() {
        return countryInfoList;
    }

    /** 
     * Set the list of 'countryInfo' element items. Convey either the place of residence or the place of birth
     * 
     * @param list
     */
    public void setCountryInfoList(
            List<PlaceLocationIdentification81180SCUSPNRDataFeed132> list) {
        countryInfoList = list;
    }

    /** 
     * Get the list of 'securityInfo' element items. 1- Product level indicator for APP processing required. Specifies the value of the APP indicator. * statusDetails/indicator = "ARQ" * statusDetails/action = - R : APP Required - X : APP not required  2- APP result indicator of the product * statusDetails/indicator = "APR" * statusDetails/action = - X : Not needed - N : Failed - Y : Successful - B : Bypassed - R : Void  3- AQQ status * statusDetails/indicator = "AQQ" * statusDetails/action = - O : OK to board - I : Inhibited to board - S : Selectee - E : Data error - N : AQQ not performed - X : AQQ not required - B : ESTA Bypassed  4- Customer type check state * statusDetails/indicator = "TCS" * statusDetails/action = - CTB : Bypassed - CTD : Disrupted - CTF : Failed - CTI : Ignored - CTN : Not Required - CTO : Overridden - CTP : Passed - CTR : Required - CTU : Undefined - CTX : Non-Prime   5- ESTA status * statusDetails/indicator = "EST" * statusDetails/action = -Z _ ESTA not required -A _ Valid ESTA application on file -B _ ESTA application not present on file -C _ Additional US Travel Document required (ESTA  denied) -1 _ ESTA inhibited -X _ Insufficient Information -Y _ ESTA Bypassed (Internal Status)  6- ApiDataStatus indicator * statusDetails/indicator = "APS" * statusDetails/action = -Y Complete -N NotComplete -R AgentRevalidation -Q NotRequired -P NotPerformed  7-Indicator to state if there is a missing luggage : C565/1245 - MSL C565/1229 - Y  - Yes N  - No  8-Data indicator value = VDB Map action Tag 1 _vdbIndicator.True Tag 0 _vdbIndicator.False
     * 
     * @return list
     */
    public List<StatusDetails76518SCUSPNRDataFeed132> getSecurityInfoList() {
        return securityInfoList;
    }

    /** 
     * Set the list of 'securityInfo' element items. 1- Product level indicator for APP processing required. Specifies the value of the APP indicator. * statusDetails/indicator = "ARQ" * statusDetails/action = - R : APP Required - X : APP not required  2- APP result indicator of the product * statusDetails/indicator = "APR" * statusDetails/action = - X : Not needed - N : Failed - Y : Successful - B : Bypassed - R : Void  3- AQQ status * statusDetails/indicator = "AQQ" * statusDetails/action = - O : OK to board - I : Inhibited to board - S : Selectee - E : Data error - N : AQQ not performed - X : AQQ not required - B : ESTA Bypassed  4- Customer type check state * statusDetails/indicator = "TCS" * statusDetails/action = - CTB : Bypassed - CTD : Disrupted - CTF : Failed - CTI : Ignored - CTN : Not Required - CTO : Overridden - CTP : Passed - CTR : Required - CTU : Undefined - CTX : Non-Prime   5- ESTA status * statusDetails/indicator = "EST" * statusDetails/action = -Z _ ESTA not required -A _ Valid ESTA application on file -B _ ESTA application not present on file -C _ Additional US Travel Document required (ESTA  denied) -1 _ ESTA inhibited -X _ Insufficient Information -Y _ ESTA Bypassed (Internal Status)  6- ApiDataStatus indicator * statusDetails/indicator = "APS" * statusDetails/action = -Y Complete -N NotComplete -R AgentRevalidation -Q NotRequired -P NotPerformed  7-Indicator to state if there is a missing luggage : C565/1245 - MSL C565/1229 - Y  - Yes N  - No  8-Data indicator value = VDB Map action Tag 1 _vdbIndicator.True Tag 0 _vdbIndicator.False
     * 
     * @param list
     */
    public void setSecurityInfoList(
            List<StatusDetails76518SCUSPNRDataFeed132> list) {
        securityInfoList = list;
    }

    /** 
     * Get the list of 'appDetails' element items. data related to APP information
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeDataElementsMasterAppDetails139261GCUSPNRDataFeed1321> getAppDetailList() {
        return appDetailList;
    }

    /** 
     * Set the list of 'appDetails' element items. data related to APP information
     * 
     * @param list
     */
    public void setAppDetailList(
            List<StructuredBookingRecordImageTypeDataElementsMasterAppDetails139261GCUSPNRDataFeed1321> list) {
        appDetailList = list;
    }

    /** 
     * Get the 'nationalty' element value. To represent the product nationality of the passenger.  * codeQualifier = "2" (current Nationality) * nationalityDetails/nationalityCode = Nationality of the customer
     * 
     * @return value
     */
    public Nationality76759SCUSPNRDataFeed132 getNationalty() {
        return nationalty;
    }

    /** 
     * Set the 'nationalty' element value. To represent the product nationality of the passenger.  * codeQualifier = "2" (current Nationality) * nationalityDetails/nationalityCode = Nationality of the customer
     * 
     * @param nationalty
     */
    public void setNationalty(Nationality76759SCUSPNRDataFeed132 nationalty) {
        this.nationalty = nationalty;
    }

    /** 
     * Get the 'typeOfCOP' element value. Gives the compensation type. * attributeDetails/attributeType = - DBA - DBN - DBO - DBV - DBM - DBD - DBW
     * 
     * @return value
     */
    public CodedAttribute76892SCUSPNRDataFeed132 getTypeOfCOP() {
        return typeOfCOP;
    }

    /** 
     * Set the 'typeOfCOP' element value. Gives the compensation type. * attributeDetails/attributeType = - DBA - DBN - DBO - DBV - DBM - DBD - DBW
     * 
     * @param typeOfCOP
     */
    public void setTypeOfCOP(CodedAttribute76892SCUSPNRDataFeed132 typeOfCOP) {
        this.typeOfCOP = typeOfCOP;
    }

    /** 
     * Get the list of 'ticketData' element items. Ticket and coupon number
     * 
     * @return list
     */
    public List<Ticketsection95653GCUSPNRDataFeed1321> getTicketDataList() {
        return ticketDataList;
    }

    /** 
     * Set the list of 'ticketData' element items. Ticket and coupon number
     * 
     * @param list
     */
    public void setTicketDataList(
            List<Ticketsection95653GCUSPNRDataFeed1321> list) {
        ticketDataList = list;
    }
}
