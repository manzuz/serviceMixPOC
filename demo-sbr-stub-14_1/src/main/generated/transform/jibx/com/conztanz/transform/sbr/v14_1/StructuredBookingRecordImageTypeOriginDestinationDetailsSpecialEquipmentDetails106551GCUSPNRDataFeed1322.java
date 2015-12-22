
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_specialEquipmentDetails_106551_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DummySegment_87618_S_CUS_PNRDataFeed_132" name="dummy2"/>
 *     &lt;xs:element type="StructuredBookingRecordImageType_originDestinationDetails_rangePeriod_106552_G_CUS_PNRDataFeed_1322" name="rangePeriod" minOccurs="0" maxOccurs="5"/>
 *     &lt;xs:element type="FreeTextInformation_87629_S_CUS_PNRDataFeed_132" name="additionalInfo" minOccurs="0"/>
 *     &lt;xs:element type="TariffInformation_87620_S_CUS_PNRDataFeed_132" name="specialEquipmentTariff" maxOccurs="6"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsSpecialEquipmentDetails106551GCUSPNRDataFeed1322
{
    private DummySegment87618SCUSPNRDataFeed132 dummy2;
    private List<StructuredBookingRecordImageTypeOriginDestinationDetailsRangePeriod106552GCUSPNRDataFeed1322> rangePeriodList = new ArrayList<StructuredBookingRecordImageTypeOriginDestinationDetailsRangePeriod106552GCUSPNRDataFeed1322>();
    private FreeTextInformation87629SCUSPNRDataFeed132 additionalInfo;
    private List<TariffInformation87620SCUSPNRDataFeed132> specialEquipmentTariffList = new ArrayList<TariffInformation87620SCUSPNRDataFeed132>();

    /** 
     * Get the 'dummy2' element value. DUM used to remove ambiguity between TFFs
     * 
     * @return value
     */
    public DummySegment87618SCUSPNRDataFeed132 getDummy2() {
        return dummy2;
    }

    /** 
     * Set the 'dummy2' element value. DUM used to remove ambiguity between TFFs
     * 
     * @param dummy2
     */
    public void setDummy2(DummySegment87618SCUSPNRDataFeed132 dummy2) {
        this.dummy2 = dummy2;
    }

    /** 
     * Get the list of 'rangePeriod' element items. This group allow to associate 5 period range to tariff information (TFF_2 =) TFF_6).  The first TFF can not be associated to a period range, as it describes general information.
     * 
     * @return list
     */
    public List<StructuredBookingRecordImageTypeOriginDestinationDetailsRangePeriod106552GCUSPNRDataFeed1322> getRangePeriodList() {
        return rangePeriodList;
    }

    /** 
     * Set the list of 'rangePeriod' element items. This group allow to associate 5 period range to tariff information (TFF_2 =) TFF_6).  The first TFF can not be associated to a period range, as it describes general information.
     * 
     * @param list
     */
    public void setRangePeriodList(
            List<StructuredBookingRecordImageTypeOriginDestinationDetailsRangePeriod106552GCUSPNRDataFeed1322> list) {
        rangePeriodList = list;
    }

    /** 
     * Get the 'additionalInfo' element value. Additional special equipment information
     * 
     * @return value
     */
    public FreeTextInformation87629SCUSPNRDataFeed132 getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'additionalInfo' element value. Additional special equipment information
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(
            FreeTextInformation87629SCUSPNRDataFeed132 additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    /** 
     * Get the list of 'specialEquipmentTariff' element items. First TFF occurence convey main data: - 013 spec. equipment code - Qualifier (Included / Optional) - Spec. equipment name  Up to 5 next occurences convey tarrif periods. - 013 spec. equipment code - converted indicator - amount/currency - period (/day, /weekend, /week, /month, /rental) - max amount / currency
     * 
     * @return list
     */
    public List<TariffInformation87620SCUSPNRDataFeed132> getSpecialEquipmentTariffList() {
        return specialEquipmentTariffList;
    }

    /** 
     * Set the list of 'specialEquipmentTariff' element items. First TFF occurence convey main data: - 013 spec. equipment code - Qualifier (Included / Optional) - Spec. equipment name  Up to 5 next occurences convey tarrif periods. - 013 spec. equipment code - converted indicator - amount/currency - period (/day, /weekend, /week, /month, /rental) - max amount / currency
     * 
     * @param list
     */
    public void setSpecialEquipmentTariffList(
            List<TariffInformation87620SCUSPNRDataFeed132> list) {
        specialEquipmentTariffList = list;
    }
}
