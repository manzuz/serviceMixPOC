
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_coverageInfo_145850_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceCoverage_128678_S_CUS_PNRDataFeed_132" name="coverage"/>
 *     &lt;xs:element type="MonetaryInformation_128661_S_CUS_PNRDataFeed_132" name="coverageValues" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupCoverageInfo145850GCUSPNRDataFeed1323
{
    private InsuranceCoverage128678SCUSPNRDataFeed132 coverage;
    private MonetaryInformation128661SCUSPNRDataFeed132 coverageValues;

    /** 
     * Get the 'coverage' element value. For codelist 415Z, only values CP, CV, CM may apply here
     * 
     * @return value
     */
    public InsuranceCoverage128678SCUSPNRDataFeed132 getCoverage() {
        return coverage;
    }

    /** 
     * Set the 'coverage' element value. For codelist 415Z, only values CP, CV, CM may apply here
     * 
     * @param coverage
     */
    public void setCoverage(InsuranceCoverage128678SCUSPNRDataFeed132 coverage) {
        this.coverage = coverage;
    }

    /** 
     * Get the 'coverageValues' element value. Values and currency of the different coverages amounts.
     * 
     * @return value
     */
    public MonetaryInformation128661SCUSPNRDataFeed132 getCoverageValues() {
        return coverageValues;
    }

    /** 
     * Set the 'coverageValues' element value. Values and currency of the different coverages amounts.
     * 
     * @param coverageValues
     */
    public void setCoverageValues(
            MonetaryInformation128661SCUSPNRDataFeed132 coverageValues) {
        this.coverageValues = coverageValues;
    }
}
