
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Seat group entity.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SeatEntity_112674_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecialRequirementsDetails_94613_S_CUS_PNRDataFeed_132" name="seatRequest"/>
 *     &lt;xs:element type="SeatSelectionDetails_25828_S_CUS_PNRDataFeed_132" name="seatInformation" minOccurs="0"/>
 *     &lt;xs:element type="SeatEntity_individualSeatGroup_112675_G_CUS_PNRDataFeed_132" name="individualSeatGroup" minOccurs="0" maxOccurs="99"/>
 *     &lt;xs:element type="DateAndTimeInformation_26783_S_CUS_PNRDataFeed_132" name="dateGaugeChange" minOccurs="0"/>
 *     &lt;xs:element type="FreeTextInformation_95820_S_CUS_PNRDataFeed_132" name="freeTextDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SeatEntity112674GCUSPNRDataFeed132
{
    private SpecialRequirementsDetails94613SCUSPNRDataFeed132 seatRequest;
    private SeatSelectionDetails25828SCUSPNRDataFeed132 seatInformation;
    private List<SeatEntityIndividualSeatGroup112675GCUSPNRDataFeed132> individualSeatGroupList = new ArrayList<SeatEntityIndividualSeatGroup112675GCUSPNRDataFeed132>();
    private DateAndTimeInformation26783SCUSPNRDataFeed132 dateGaugeChange;
    private FreeTextInformation95820SCUSPNRDataFeed132 freeTextDetails;

    /** 
     * Get the 'seatRequest' element value. This contains the seat request itself.
     * 
     * @return value
     */
    public SpecialRequirementsDetails94613SCUSPNRDataFeed132 getSeatRequest() {
        return seatRequest;
    }

    /** 
     * Set the 'seatRequest' element value. This contains the seat request itself.
     * 
     * @param seatRequest
     */
    public void setSeatRequest(
            SpecialRequirementsDetails94613SCUSPNRDataFeed132 seatRequest) {
        this.seatRequest = seatRequest;
    }

    /** 
     * Get the 'seatInformation' element value. This contains the seat request parameters.
     * 
     * @return value
     */
    public SeatSelectionDetails25828SCUSPNRDataFeed132 getSeatInformation() {
        return seatInformation;
    }

    /** 
     * Set the 'seatInformation' element value. This contains the seat request parameters.
     * 
     * @param seatInformation
     */
    public void setSeatInformation(
            SeatSelectionDetails25828SCUSPNRDataFeed132 seatInformation) {
        this.seatInformation = seatInformation;
    }

    /** 
     * Get the list of 'individualSeatGroup' element items. This group contains individual seat information
     * 
     * @return list
     */
    public List<SeatEntityIndividualSeatGroup112675GCUSPNRDataFeed132> getIndividualSeatGroupList() {
        return individualSeatGroupList;
    }

    /** 
     * Set the list of 'individualSeatGroup' element items. This group contains individual seat information
     * 
     * @param list
     */
    public void setIndividualSeatGroupList(
            List<SeatEntityIndividualSeatGroup112675GCUSPNRDataFeed132> list) {
        individualSeatGroupList = list;
    }

    /** 
     * Get the 'dateGaugeChange' element value. Date of a change of gauge.
     * 
     * @return value
     */
    public DateAndTimeInformation26783SCUSPNRDataFeed132 getDateGaugeChange() {
        return dateGaugeChange;
    }

    /** 
     * Set the 'dateGaugeChange' element value. Date of a change of gauge.
     * 
     * @param dateGaugeChange
     */
    public void setDateGaugeChange(
            DateAndTimeInformation26783SCUSPNRDataFeed132 dateGaugeChange) {
        this.dateGaugeChange = dateGaugeChange;
    }

    /** 
     * Get the 'freeTextDetails' element value.
     * 
     * @return value
     */
    public FreeTextInformation95820SCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value.
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation95820SCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }
}
