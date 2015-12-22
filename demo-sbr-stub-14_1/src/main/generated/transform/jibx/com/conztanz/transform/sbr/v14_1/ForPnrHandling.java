
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * provide a full image of a PNR to feed an external system
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ForPnrHandling">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="CodedAttribute_14913_S_CUS_PNRDataFeed_132" name="publicationType" minOccurs="0"/>
 *       &lt;xs:element type="MessageActionDetails_22987_S_CUS_PNRDataFeed_132" name="messageAction"/>
 *       &lt;xs:element type="ErrorGroup_43903_G_CUS_PNRDataFeed_132" name="errorDetails" minOccurs="0"/>
 *       &lt;xs:element type="ForPnrHandling_eligibilityInfo_207236_G_CUS_PNRDataFeed_132" name="eligibilityInfo" minOccurs="0" maxOccurs="10"/>
 *       &lt;xs:element type="ActivityReport_107223_G_CUS_PNRDataFeed_132" name="activityReport" minOccurs="0" maxOccurs="999"/>
 *       &lt;xs:element type="StructuredBookingRecordImageType_206113_G_CUS_PNRDataFeed_132" name="activePNRimage"/>
 *       &lt;xs:element type="ActionIdentification_29391_S_CUS_PNRDataFeed_132" name="actMarker"/>
 *       &lt;xs:element type="StructuredBookingRecordImageType_206113_G_CUS_PNRDataFeed_132" name="deadPNRimage" minOccurs="0"/>
 *       &lt;xs:element type="FromToMappingGroup_141857_G_CUS_PNRDataFeed_132" name="fromToMapping" minOccurs="0"/>
 *     &lt;/xs:sequence>
 *     &lt;xs:attribute type="xs:string" fixed="SBRRES" name="type"/>
 *     &lt;xs:attribute type="xs:string" fixed="1A" name="agency"/>
 *     &lt;xs:attribute type="xs:string" fixed="14" name="version"/>
 *     &lt;xs:attribute type="xs:string" fixed="1" name="release"/>
 *     &lt;xs:attribute type="xs:string" fixed="1" name="revision"/>
 *     &lt;xs:attribute type="xs:string" fixed="PNR" name="domain"/>
 *     &lt;xs:attribute type="xs:short" name="sequence_num"/>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class ForPnrHandling
{
    private CodedAttribute14913SCUSPNRDataFeed132 publicationType;
    private MessageActionDetails22987SCUSPNRDataFeed132 messageAction;
    private ErrorGroup43903GCUSPNRDataFeed132 errorDetails;
    private List<ForPnrHandlingEligibilityInfo207236GCUSPNRDataFeed132> eligibilityInfoList = new ArrayList<ForPnrHandlingEligibilityInfo207236GCUSPNRDataFeed132>();
    private List<ActivityReport107223GCUSPNRDataFeed132> activityReportList = new ArrayList<ActivityReport107223GCUSPNRDataFeed132>();
    private StructuredBookingRecordImageType206113GCUSPNRDataFeed132 activePNRimage;
    private ActionIdentification29391SCUSPNRDataFeed132 actMarker;
    private StructuredBookingRecordImageType206113GCUSPNRDataFeed132 deadPNRimage;
    private FromToMappingGroup141857GCUSPNRDataFeed132 fromToMapping;
    private String type;
    private String agency;
    private String version;
    private String release;
    private String revision;
    private String domain;
    private Short sequenceNum;

    /** 
     * Get the 'publicationType' element value. This segment is used to convey the Publication ID (handled on Amadeus Publisher side) for internal feeds only.
     * 
     * @return value
     */
    public CodedAttribute14913SCUSPNRDataFeed132 getPublicationType() {
        return publicationType;
    }

    /** 
     * Set the 'publicationType' element value. This segment is used to convey the Publication ID (handled on Amadeus Publisher side) for internal feeds only.
     * 
     * @param publicationType
     */
    public void setPublicationType(
            CodedAttribute14913SCUSPNRDataFeed132 publicationType) {
        this.publicationType = publicationType;
    }

    /** 
     * Get the 'messageAction' element value. Message action details
     * 
     * @return value
     */
    public MessageActionDetails22987SCUSPNRDataFeed132 getMessageAction() {
        return messageAction;
    }

    /** 
     * Set the 'messageAction' element value. Message action details
     * 
     * @param messageAction
     */
    public void setMessageAction(
            MessageActionDetails22987SCUSPNRDataFeed132 messageAction) {
        this.messageAction = messageAction;
    }

    /** 
     * Get the 'errorDetails' element value. Encoded when there is a missing env in the sequencing of messages sent in the publisher for a given PNR/client. This can happen because of desynchronous processes. The mising image will be sent later on. When encoded,  ERC with error 269 (Indicates that Additional Data for this Message Reference Number follows) is sent.
     * 
     * @return value
     */
    public ErrorGroup43903GCUSPNRDataFeed132 getErrorDetails() {
        return errorDetails;
    }

    /** 
     * Set the 'errorDetails' element value. Encoded when there is a missing env in the sequencing of messages sent in the publisher for a given PNR/client. This can happen because of desynchronous processes. The mising image will be sent later on. When encoded,  ERC with error 269 (Indicates that Additional Data for this Message Reference Number follows) is sent.
     * 
     * @param errorDetails
     */
    public void setErrorDetails(ErrorGroup43903GCUSPNRDataFeed132 errorDetails) {
        this.errorDetails = errorDetails;
    }

    /** 
     * Get the list of 'eligibilityInfo' element items. information of the eligible flight (for the Check-in Notification Feed only)
     * 
     * @return list
     */
    public List<ForPnrHandlingEligibilityInfo207236GCUSPNRDataFeed132> getEligibilityInfoList() {
        return eligibilityInfoList;
    }

    /** 
     * Set the list of 'eligibilityInfo' element items. information of the eligible flight (for the Check-in Notification Feed only)
     * 
     * @param list
     */
    public void setEligibilityInfoList(
            List<ForPnrHandlingEligibilityInfo207236GCUSPNRDataFeed132> list) {
        eligibilityInfoList = list;
    }

    /** 
     * Get the list of 'activityReport' element items. Actions taken on this PNR during this transaction
     * 
     * @return list
     */
    public List<ActivityReport107223GCUSPNRDataFeed132> getActivityReportList() {
        return activityReportList;
    }

    /** 
     * Set the list of 'activityReport' element items. Actions taken on this PNR during this transaction
     * 
     * @param list
     */
    public void setActivityReportList(
            List<ActivityReport107223GCUSPNRDataFeed132> list) {
        activityReportList = list;
    }

    /** 
     * Get the 'activePNRimage' element value. conveys the active, current image of the PNR.
     * 
     * @return value
     */
    public StructuredBookingRecordImageType206113GCUSPNRDataFeed132 getActivePNRimage() {
        return activePNRimage;
    }

    /** 
     * Set the 'activePNRimage' element value. conveys the active, current image of the PNR.
     * 
     * @param activePNRimage
     */
    public void setActivePNRimage(
            StructuredBookingRecordImageType206113GCUSPNRDataFeed132 activePNRimage) {
        this.activePNRimage = activePNRimage;
    }

    /** 
     * Get the 'actMarker' element value. Used to remove the ambiguity between the active PNR image and the dead PNR image.
     * 
     * @return value
     */
    public ActionIdentification29391SCUSPNRDataFeed132 getActMarker() {
        return actMarker;
    }

    /** 
     * Set the 'actMarker' element value. Used to remove the ambiguity between the active PNR image and the dead PNR image.
     * 
     * @param actMarker
     */
    public void setActMarker(
            ActionIdentification29391SCUSPNRDataFeed132 actMarker) {
        this.actMarker = actMarker;
    }

    /** 
     * Get the 'deadPNRimage' element value. conveys the dead image of the PNR.
     * 
     * @return value
     */
    public StructuredBookingRecordImageType206113GCUSPNRDataFeed132 getDeadPNRimage() {
        return deadPNRimage;
    }

    /** 
     * Set the 'deadPNRimage' element value. conveys the dead image of the PNR.
     * 
     * @param deadPNRimage
     */
    public void setDeadPNRimage(
            StructuredBookingRecordImageType206113GCUSPNRDataFeed132 deadPNRimage) {
        this.deadPNRimage = deadPNRimage;
    }

    /** 
     * Get the 'fromToMapping' element value. This group contains the origin and target flight segments, for each passenger, in case of disruption (Reaccomodation, Customer transfer...)
     * 
     * @return value
     */
    public FromToMappingGroup141857GCUSPNRDataFeed132 getFromToMapping() {
        return fromToMapping;
    }

    /** 
     * Set the 'fromToMapping' element value. This group contains the origin and target flight segments, for each passenger, in case of disruption (Reaccomodation, Customer transfer...)
     * 
     * @param fromToMapping
     */
    public void setFromToMapping(
            FromToMappingGroup141857GCUSPNRDataFeed132 fromToMapping) {
        this.fromToMapping = fromToMapping;
    }

    /** 
     * Get the 'type' attribute value.
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' attribute value.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'agency' attribute value.
     * 
     * @return value
     */
    public String getAgency() {
        return agency;
    }

    /** 
     * Set the 'agency' attribute value.
     * 
     * @param agency
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /** 
     * Get the 'version' attribute value.
     * 
     * @return value
     */
    public String getVersion() {
        return version;
    }

    /** 
     * Set the 'version' attribute value.
     * 
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /** 
     * Get the 'release' attribute value.
     * 
     * @return value
     */
    public String getRelease() {
        return release;
    }

    /** 
     * Set the 'release' attribute value.
     * 
     * @param release
     */
    public void setRelease(String release) {
        this.release = release;
    }

    /** 
     * Get the 'revision' attribute value.
     * 
     * @return value
     */
    public String getRevision() {
        return revision;
    }

    /** 
     * Set the 'revision' attribute value.
     * 
     * @param revision
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /** 
     * Get the 'domain' attribute value.
     * 
     * @return value
     */
    public String getDomain() {
        return domain;
    }

    /** 
     * Set the 'domain' attribute value.
     * 
     * @param domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /** 
     * Get the 'sequence_num' attribute value.
     * 
     * @return value
     */
    public Short getSequenceNum() {
        return sequenceNum;
    }

    /** 
     * Set the 'sequence_num' attribute value.
     * 
     * @param sequenceNum
     */
    public void setSequenceNum(Short sequenceNum) {
        this.sequenceNum = sequenceNum;
    }
}
