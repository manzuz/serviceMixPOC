
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConnectionsDetailsGroup_139587_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ItemDescription_79774_S_CUS_PNRDataFeed_132" name="connectionType"/>
 *     &lt;xs:element type="TravelProductInformation_79776_S_CUS_PNRDataFeed_132" name="segmentDetails"/>
 *     &lt;xs:element type="RelatedProductInformation_79775_S_CUS_PNRDataFeed_132" name="segmentStatus" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConnectionsDetailsGroup139587GCUSPNRDataFeed1321
{
    private ItemDescription79774SCUSPNRDataFeed132 connectionType;
    private TravelProductInformation79776SCUSPNRDataFeed132 segmentDetails;
    private RelatedProductInformation79775SCUSPNRDataFeed132 segmentStatus;

    /** 
     * Get the 'connectionType' element value. Indicates the type of connection :  INB for Inbound, OUT for Outbound
     * 
     * @return value
     */
    public ItemDescription79774SCUSPNRDataFeed132 getConnectionType() {
        return connectionType;
    }

    /** 
     * Set the 'connectionType' element value. Indicates the type of connection :  INB for Inbound, OUT for Outbound
     * 
     * @param connectionType
     */
    public void setConnectionType(
            ItemDescription79774SCUSPNRDataFeed132 connectionType) {
        this.connectionType = connectionType;
    }

    /** 
     * Get the 'segmentDetails' element value. Indicates the segment connection details concerning its route and timings.
     * 
     * @return value
     */
    public TravelProductInformation79776SCUSPNRDataFeed132 getSegmentDetails() {
        return segmentDetails;
    }

    /** 
     * Set the 'segmentDetails' element value. Indicates the segment connection details concerning its route and timings.
     * 
     * @param segmentDetails
     */
    public void setSegmentDetails(
            TravelProductInformation79776SCUSPNRDataFeed132 segmentDetails) {
        this.segmentDetails = segmentDetails;
    }

    /** 
     * Get the 'segmentStatus' element value. Booking status of the segment
     * 
     * @return value
     */
    public RelatedProductInformation79775SCUSPNRDataFeed132 getSegmentStatus() {
        return segmentStatus;
    }

    /** 
     * Set the 'segmentStatus' element value. Booking status of the segment
     * 
     * @param segmentStatus
     */
    public void setSegmentStatus(
            RelatedProductInformation79775SCUSPNRDataFeed132 segmentStatus) {
        this.segmentStatus = segmentStatus;
    }
}
