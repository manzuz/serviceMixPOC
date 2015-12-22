
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_surchargePeriods_106548_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RangeDetails_87622_S_CUS_PNRDataFeed_132" name="period"/>
 *     &lt;xs:element type="TariffInformation_87623_S_CUS_PNRDataFeed_132" name="surchargePeriodTariff"/>
 *     &lt;xs:element type="Measurements_87621_S_CUS_PNRDataFeed_132" name="maximumUnitQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupSurchargePeriods106548GCUSPNRDataFeed1323
{
    private RangeDetails87622SCUSPNRDataFeed132 period;
    private TariffInformation87623SCUSPNRDataFeed132 surchargePeriodTariff;
    private Measurements87621SCUSPNRDataFeed132 maximumUnitQualifier;

    /** 
     * Get the 'period' element value. tariff period/distance validity in number of days, weeks, months, km, miles.
     * 
     * @return value
     */
    public RangeDetails87622SCUSPNRDataFeed132 getPeriod() {
        return period;
    }

    /** 
     * Set the 'period' element value. tariff period/distance validity in number of days, weeks, months, km, miles.
     * 
     * @param period
     */
    public void setPeriod(RangeDetails87622SCUSPNRDataFeed132 period) {
        this.period = period;
    }

    /** 
     * Get the 'surchargePeriodTariff' element value. This segment is used to convey Tax, Coverage, Coupon, Surcharge or Delivery and collection information
     * 
     * @return value
     */
    public TariffInformation87623SCUSPNRDataFeed132 getSurchargePeriodTariff() {
        return surchargePeriodTariff;
    }

    /** 
     * Set the 'surchargePeriodTariff' element value. This segment is used to convey Tax, Coverage, Coupon, Surcharge or Delivery and collection information
     * 
     * @param surchargePeriodTariff
     */
    public void setSurchargePeriodTariff(
            TariffInformation87623SCUSPNRDataFeed132 surchargePeriodTariff) {
        this.surchargePeriodTariff = surchargePeriodTariff;
    }

    /** 
     * Get the 'maximumUnitQualifier' element value. This segment conveys the Unit Qualifier for maximum range of associated RNG.
     * 
     * @return value
     */
    public Measurements87621SCUSPNRDataFeed132 getMaximumUnitQualifier() {
        return maximumUnitQualifier;
    }

    /** 
     * Set the 'maximumUnitQualifier' element value. This segment conveys the Unit Qualifier for maximum range of associated RNG.
     * 
     * @param maximumUnitQualifier
     */
    public void setMaximumUnitQualifier(
            Measurements87621SCUSPNRDataFeed132 maximumUnitQualifier) {
        this.maximumUnitQualifier = maximumUnitQualifier;
    }
}
