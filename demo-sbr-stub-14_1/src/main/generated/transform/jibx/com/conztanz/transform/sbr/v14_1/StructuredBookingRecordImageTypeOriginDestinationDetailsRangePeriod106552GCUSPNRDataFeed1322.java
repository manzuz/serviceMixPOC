
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_rangePeriod_106552_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="RangeDetails_87630_S_CUS_PNRDataFeed_132" name="agePeriod"/>
 *     &lt;xs:element type="Measurements_87621_S_CUS_PNRDataFeed_132" name="maximumUnitQualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsRangePeriod106552GCUSPNRDataFeed1322
{
    private RangeDetails87630SCUSPNRDataFeed132 agePeriod;
    private Measurements87621SCUSPNRDataFeed132 maximumUnitQualifier;

    /** 
     * Get the 'agePeriod' element value. define age period validity associted to the special equipment
     * 
     * @return value
     */
    public RangeDetails87630SCUSPNRDataFeed132 getAgePeriod() {
        return agePeriod;
    }

    /** 
     * Set the 'agePeriod' element value. define age period validity associted to the special equipment
     * 
     * @param agePeriod
     */
    public void setAgePeriod(RangeDetails87630SCUSPNRDataFeed132 agePeriod) {
        this.agePeriod = agePeriod;
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
