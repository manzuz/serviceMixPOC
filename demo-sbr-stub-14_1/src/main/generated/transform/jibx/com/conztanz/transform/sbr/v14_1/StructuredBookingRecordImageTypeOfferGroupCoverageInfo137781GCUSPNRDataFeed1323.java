
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_coverageInfo_137781_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceCoverage_15875_S_CUS_PNRDataFeed_132" name="coverage"/>
 *     &lt;xs:element type="MonetaryInformation_10816_S_CUS_PNRDataFeed_132" name="coverageValues" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupCoverageInfo137781GCUSPNRDataFeed1323
{
    private InsuranceCoverage15875SCUSPNRDataFeed132 coverage;
    private MonetaryInformation10816SCUSPNRDataFeed132 coverageValues;

    /** 
     * Get the 'coverage' element value. For codelist 415Z, only values CP, CV, CM may apply here
     * 
     * @return value
     */
    public InsuranceCoverage15875SCUSPNRDataFeed132 getCoverage() {
        return coverage;
    }

    /** 
     * Set the 'coverage' element value. For codelist 415Z, only values CP, CV, CM may apply here
     * 
     * @param coverage
     */
    public void setCoverage(InsuranceCoverage15875SCUSPNRDataFeed132 coverage) {
        this.coverage = coverage;
    }

    /** 
     * Get the 'coverageValues' element value. Values and currency of the different coverages amounts.
     * 
     * @return value
     */
    public MonetaryInformation10816SCUSPNRDataFeed132 getCoverageValues() {
        return coverageValues;
    }

    /** 
     * Set the 'coverageValues' element value. Values and currency of the different coverages amounts.
     * 
     * @param coverageValues
     */
    public void setCoverageValues(
            MonetaryInformation10816SCUSPNRDataFeed132 coverageValues) {
        this.coverageValues = coverageValues;
    }
}
