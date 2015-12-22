
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_dataElementsStruct_206118_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ElementManagementSegment_129491_S_CUS_PNRDataFeed_132" name="elementManagementStructData"/>
 *     &lt;xs:element type="ReferenceInformation_24862_S_CUS_PNRDataFeed_132" name="referenceForStructDataElement" minOccurs="0"/>
 *     &lt;xs:element type="TravellerInformation_122780_S_CUS_PNRDataFeed_132" name="infantOrAdultAssociation" minOccurs="0"/>
 *     &lt;xs:element type="GroupForSbrIds_94968_G_CUS_PNRDataFeed_1321" name="idElements" minOccurs="0"/>
 *     &lt;xs:element type="SeatEntityType_206134_G_CUS_PNRDataFeed_132" name="seatData" minOccurs="0"/>
 *     &lt;xs:element type="RailSeatGroup_55846_G_CUS_PNRDataFeed_1321" name="railSeatData" minOccurs="0"/>
 *     &lt;xs:element type="TotalPrice_106783_G_CUS_PNRDataFeed_132" name="totalPriceInfo" minOccurs="0"/>
 *     &lt;xs:element type="TicketDocumentGroup_191475_G_CUS_PNRDataFeed_1321" name="ticketDocumentData" minOccurs="0"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_dataElementsMaster_dcsPaxSection_206119_G_CUS_PNRDataFeed_132" name="dcsPaxSection" minOccurs="0"/>
 *     &lt;xs:element type="GeneralFopRepresentation_112574_G_CUS_PNRDataFeed_132" name="fopGroup" minOccurs="0" maxOccurs="4"/>
 *     &lt;xs:element type="ExtendedRemark_129230_S_CUS_PNRDataFeed_132" name="extendedRemark" minOccurs="0"/>
 *     &lt;xs:element type="Group000group2_138356_G_CUS_PNRDataFeed_132" name="eltPosDetails" minOccurs="0"/>
 *     &lt;xs:element type="ExtendedOwnershipSecurityDetails_129228_S_CUS_PNRDataFeed_132" name="accessLevel" minOccurs="0" maxOccurs="4"/>
 *     &lt;xs:element type="StructuredCommissionElement_189732_G_CUS_PNRDataFeed_1321" name="structuredCommissionElement" minOccurs="0"/>
 *     &lt;xs:element type="FoGroup_190049_G_CUS_PNRDataFeed_1321" name="foGroup" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterDataElementsStruct206118GCUSPNRDataFeed132
{
    private ElementManagementSegment129491SCUSPNRDataFeed132 elementManagementStructData;
    private ReferenceInformation24862SCUSPNRDataFeed132 referenceForStructDataElement;
    private TravellerInformation122780SCUSPNRDataFeed132 infantOrAdultAssociation;
    private GroupForSbrIds94968GCUSPNRDataFeed1321 idElements;
    private SeatEntityType206134GCUSPNRDataFeed132 seatData;
    private RailSeatGroup55846GCUSPNRDataFeed1321 railSeatData;
    private TotalPrice106783GCUSPNRDataFeed132 totalPriceInfo;
    private TicketDocumentGroup191475GCUSPNRDataFeed1321 ticketDocumentData;
    private StructuredBookingRecordImageTypeDataElementsMasterDcsPaxSection206119GCUSPNRDataFeed132 dcsPaxSection;
    private List<GeneralFopRepresentation112574GCUSPNRDataFeed132> fopGroupList = new ArrayList<GeneralFopRepresentation112574GCUSPNRDataFeed132>();
    private ExtendedRemark129230SCUSPNRDataFeed132 extendedRemark;
    private Group000group2138356GCUSPNRDataFeed132 eltPosDetails;
    private List<ExtendedOwnershipSecurityDetails129228SCUSPNRDataFeed132> accessLevelList = new ArrayList<ExtendedOwnershipSecurityDetails129228SCUSPNRDataFeed132>();
    private StructuredCommissionElement189732GCUSPNRDataFeed1321 structuredCommissionElement;
    private FoGroup190049GCUSPNRDataFeed1321 foGroup;

    /** 
     * Get the 'elementManagementStructData' element value. Specify structured elements references
     * 
     * @return value
     */
    public ElementManagementSegment129491SCUSPNRDataFeed132 getElementManagementStructData() {
        return elementManagementStructData;
    }

    /** 
     * Set the 'elementManagementStructData' element value. Specify structured elements references
     * 
     * @param elementManagementStructData
     */
    public void setElementManagementStructData(
            ElementManagementSegment129491SCUSPNRDataFeed132 elementManagementStructData) {
        this.elementManagementStructData = elementManagementStructData;
    }

    /** 
     * Get the 'referenceForStructDataElement' element value. provide specific reference identification
     * 
     * @return value
     */
    public ReferenceInformation24862SCUSPNRDataFeed132 getReferenceForStructDataElement() {
        return referenceForStructDataElement;
    }

    /** 
     * Set the 'referenceForStructDataElement' element value. provide specific reference identification
     * 
     * @param referenceForStructDataElement
     */
    public void setReferenceForStructDataElement(
            ReferenceInformation24862SCUSPNRDataFeed132 referenceForStructDataElement) {
        this.referenceForStructDataElement = referenceForStructDataElement;
    }

    /** 
     * Get the 'infantOrAdultAssociation' element value. This segment is used to convey the INF or PAX tag for Structured Fare Elements.  It is empty if the association is generic.
     * 
     * @return value
     */
    public TravellerInformation122780SCUSPNRDataFeed132 getInfantOrAdultAssociation() {
        return infantOrAdultAssociation;
    }

    /** 
     * Set the 'infantOrAdultAssociation' element value. This segment is used to convey the INF or PAX tag for Structured Fare Elements.  It is empty if the association is generic.
     * 
     * @param infantOrAdultAssociation
     */
    public void setInfantOrAdultAssociation(
            TravellerInformation122780SCUSPNRDataFeed132 infantOrAdultAssociation) {
        this.infantOrAdultAssociation = infantOrAdultAssociation;
    }

    /** 
     * Get the 'idElements' element value.
     * 
     * @return value
     */
    public GroupForSbrIds94968GCUSPNRDataFeed1321 getIdElements() {
        return idElements;
    }

    /** 
     * Set the 'idElements' element value.
     * 
     * @param idElements
     */
    public void setIdElements(GroupForSbrIds94968GCUSPNRDataFeed1321 idElements) {
        this.idElements = idElements;
    }

    /** 
     * Get the 'seatData' element value. This group conveys the Seat request information
     * 
     * @return value
     */
    public SeatEntityType206134GCUSPNRDataFeed132 getSeatData() {
        return seatData;
    }

    /** 
     * Set the 'seatData' element value. This group conveys the Seat request information
     * 
     * @param seatData
     */
    public void setSeatData(SeatEntityType206134GCUSPNRDataFeed132 seatData) {
        this.seatData = seatData;
    }

    /** 
     * Get the 'railSeatData' element value. rail seat element
     * 
     * @return value
     */
    public RailSeatGroup55846GCUSPNRDataFeed1321 getRailSeatData() {
        return railSeatData;
    }

    /** 
     * Set the 'railSeatData' element value. rail seat element
     * 
     * @param railSeatData
     */
    public void setRailSeatData(
            RailSeatGroup55846GCUSPNRDataFeed1321 railSeatData) {
        this.railSeatData = railSeatData;
    }

    /** 
     * Get the 'totalPriceInfo' element value. The purpose of this group is to conveys TP (Total Price) information
     * 
     * @return value
     */
    public TotalPrice106783GCUSPNRDataFeed132 getTotalPriceInfo() {
        return totalPriceInfo;
    }

    /** 
     * Set the 'totalPriceInfo' element value. The purpose of this group is to conveys TP (Total Price) information
     * 
     * @param totalPriceInfo
     */
    public void setTotalPriceInfo(
            TotalPrice106783GCUSPNRDataFeed132 totalPriceInfo) {
        this.totalPriceInfo = totalPriceInfo;
    }

    /** 
     * Get the 'ticketDocumentData' element value. structured fate (FA/FH) element
     * 
     * @return value
     */
    public TicketDocumentGroup191475GCUSPNRDataFeed1321 getTicketDocumentData() {
        return ticketDocumentData;
    }

    /** 
     * Set the 'ticketDocumentData' element value. structured fate (FA/FH) element
     * 
     * @param ticketDocumentData
     */
    public void setTicketDocumentData(
            TicketDocumentGroup191475GCUSPNRDataFeed1321 ticketDocumentData) {
        this.ticketDocumentData = ticketDocumentData;
    }

    /** 
     * Get the 'dcsPaxSection' element value. Provides a view of the DCS data organised per passenger.  Could have up to 196218 repetitions
     * 
     * @return value
     */
    public StructuredBookingRecordImageTypeDataElementsMasterDcsPaxSection206119GCUSPNRDataFeed132 getDcsPaxSection() {
        return dcsPaxSection;
    }

    /** 
     * Set the 'dcsPaxSection' element value. Provides a view of the DCS data organised per passenger.  Could have up to 196218 repetitions
     * 
     * @param dcsPaxSection
     */
    public void setDcsPaxSection(
            StructuredBookingRecordImageTypeDataElementsMasterDcsPaxSection206119GCUSPNRDataFeed132 dcsPaxSection) {
        this.dcsPaxSection = dcsPaxSection;
    }

    /** 
     * Get the list of 'fopGroup' element items. This structured group is used to convey Form Of Payment and Payment Information.  Could have up to 4 repetitions because a PNR can contain 4 FOPs
     * 
     * @return list
     */
    public List<GeneralFopRepresentation112574GCUSPNRDataFeed132> getFopGroupList() {
        return fopGroupList;
    }

    /** 
     * Set the list of 'fopGroup' element items. This structured group is used to convey Form Of Payment and Payment Information.  Could have up to 4 repetitions because a PNR can contain 4 FOPs
     * 
     * @param list
     */
    public void setFopGroupList(
            List<GeneralFopRepresentation112574GCUSPNRDataFeed132> list) {
        fopGroupList = list;
    }

    /** 
     * Get the 'extendedRemark' element value. Extended Remark with Unicode content.
     * 
     * @return value
     */
    public ExtendedRemark129230SCUSPNRDataFeed132 getExtendedRemark() {
        return extendedRemark;
    }

    /** 
     * Set the 'extendedRemark' element value. Extended Remark with Unicode content.
     * 
     * @param extendedRemark
     */
    public void setExtendedRemark(
            ExtendedRemark129230SCUSPNRDataFeed132 extendedRemark) {
        this.extendedRemark = extendedRemark;
    }

    /** 
     * Get the 'eltPosDetails' element value. Conveys Point of Sale information (last Updator) at element level.  Used to convey the Timestsamp of Structured Remarks.
     * 
     * @return value
     */
    public Group000group2138356GCUSPNRDataFeed132 getEltPosDetails() {
        return eltPosDetails;
    }

    /** 
     * Set the 'eltPosDetails' element value. Conveys Point of Sale information (last Updator) at element level.  Used to convey the Timestsamp of Structured Remarks.
     * 
     * @param eltPosDetails
     */
    public void setEltPosDetails(
            Group000group2138356GCUSPNRDataFeed132 eltPosDetails) {
        this.eltPosDetails = eltPosDetails;
    }

    /** 
     * Get the list of 'accessLevel' element items. To specify access level of an entity (office) to the element.
     * 
     * @return list
     */
    public List<ExtendedOwnershipSecurityDetails129228SCUSPNRDataFeed132> getAccessLevelList() {
        return accessLevelList;
    }

    /** 
     * Set the list of 'accessLevel' element items. To specify access level of an entity (office) to the element.
     * 
     * @param list
     */
    public void setAccessLevelList(
            List<ExtendedOwnershipSecurityDetails129228SCUSPNRDataFeed132> list) {
        accessLevelList = list;
    }

    /** 
     * Get the 'structuredCommissionElement' element value.
     * 
     * @return value
     */
    public StructuredCommissionElement189732GCUSPNRDataFeed1321 getStructuredCommissionElement() {
        return structuredCommissionElement;
    }

    /** 
     * Set the 'structuredCommissionElement' element value.
     * 
     * @param structuredCommissionElement
     */
    public void setStructuredCommissionElement(
            StructuredCommissionElement189732GCUSPNRDataFeed1321 structuredCommissionElement) {
        this.structuredCommissionElement = structuredCommissionElement;
    }

    /** 
     * Get the 'foGroup' element value.
     * 
     * @return value
     */
    public FoGroup190049GCUSPNRDataFeed1321 getFoGroup() {
        return foGroup;
    }

    /** 
     * Set the 'foGroup' element value.
     * 
     * @param foGroup
     */
    public void setFoGroup(FoGroup190049GCUSPNRDataFeed1321 foGroup) {
        this.foGroup = foGroup;
    }
}
