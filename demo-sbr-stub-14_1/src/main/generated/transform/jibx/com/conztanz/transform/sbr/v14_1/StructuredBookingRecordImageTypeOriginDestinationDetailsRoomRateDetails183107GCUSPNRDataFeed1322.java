
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_roomRateDetails_183107_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelRoom_160734_S_CUS_PNRDataFeed_132" name="roomInformation"/>
 *     &lt;xs:element type="TariffInformation_36744_S_CUS_PNRDataFeed_132" name="tariffDetails" maxOccurs="2"/>
 *     &lt;xs:element type="RuleInformation_36743_S_CUS_PNRDataFeed_132" name="rateCodeIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsRoomRateDetails183107GCUSPNRDataFeed1322
{
    private HotelRoom160734SCUSPNRDataFeed132 roomInformation;
    private List<TariffInformation36744SCUSPNRDataFeed132> tariffDetailList = new ArrayList<TariffInformation36744SCUSPNRDataFeed132>();
    private RuleInformation36743SCUSPNRDataFeed132 rateCodeIndicator;

    /** 
     * Get the 'roomInformation' element value. This segment is used to convey the room information.
     * 
     * @return value
     */
    public HotelRoom160734SCUSPNRDataFeed132 getRoomInformation() {
        return roomInformation;
    }

    /** 
     * Set the 'roomInformation' element value. This segment is used to convey the room information.
     * 
     * @param roomInformation
     */
    public void setRoomInformation(
            HotelRoom160734SCUSPNRDataFeed132 roomInformation) {
        this.roomInformation = roomInformation;
    }

    /** 
     * Get the list of 'tariffDetails' element items. This segment is used to convey the tariff/rate details.
     * 
     * @return list
     */
    public List<TariffInformation36744SCUSPNRDataFeed132> getTariffDetailList() {
        return tariffDetailList;
    }

    /** 
     * Set the list of 'tariffDetails' element items. This segment is used to convey the tariff/rate details.
     * 
     * @param list
     */
    public void setTariffDetailList(
            List<TariffInformation36744SCUSPNRDataFeed132> list) {
        tariffDetailList = list;
    }

    /** 
     * Get the 'rateCodeIndicator' element value. This segment is used to convey the rate code indicator.
     * 
     * @return value
     */
    public RuleInformation36743SCUSPNRDataFeed132 getRateCodeIndicator() {
        return rateCodeIndicator;
    }

    /** 
     * Set the 'rateCodeIndicator' element value. This segment is used to convey the rate code indicator.
     * 
     * @param rateCodeIndicator
     */
    public void setRateCodeIndicator(
            RuleInformation36743SCUSPNRDataFeed132 rateCodeIndicator) {
        this.rateCodeIndicator = rateCodeIndicator;
    }
}
