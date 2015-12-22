
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_roomRateDetails_145929_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="HotelRoom_129168_S_CUS_PNRDataFeed_132" name="roomInformation"/>
 *     &lt;xs:element type="TariffInformation_129170_S_CUS_PNRDataFeed_132" name="tariffDetails" minOccurs="0" maxOccurs="2"/>
 *     &lt;xs:element type="RuleInformation_36743_S_CUS_PNRDataFeed_132" name="rateCodeIndicator" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupRoomRateDetails145929GCUSPNRDataFeed1323
{
    private HotelRoom129168SCUSPNRDataFeed132 roomInformation;
    private List<TariffInformation129170SCUSPNRDataFeed132> tariffDetailList = new ArrayList<TariffInformation129170SCUSPNRDataFeed132>();
    private RuleInformation36743SCUSPNRDataFeed132 rateCodeIndicator;

    /** 
     * Get the 'roomInformation' element value. This segment is used to convey the room information.
     * 
     * @return value
     */
    public HotelRoom129168SCUSPNRDataFeed132 getRoomInformation() {
        return roomInformation;
    }

    /** 
     * Set the 'roomInformation' element value. This segment is used to convey the room information.
     * 
     * @param roomInformation
     */
    public void setRoomInformation(
            HotelRoom129168SCUSPNRDataFeed132 roomInformation) {
        this.roomInformation = roomInformation;
    }

    /** 
     * Get the list of 'tariffDetails' element items. This segment is used to convey the tariff/rate details.
     * 
     * @return list
     */
    public List<TariffInformation129170SCUSPNRDataFeed132> getTariffDetailList() {
        return tariffDetailList;
    }

    /** 
     * Set the list of 'tariffDetails' element items. This segment is used to convey the tariff/rate details.
     * 
     * @param list
     */
    public void setTariffDetailList(
            List<TariffInformation129170SCUSPNRDataFeed132> list) {
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
