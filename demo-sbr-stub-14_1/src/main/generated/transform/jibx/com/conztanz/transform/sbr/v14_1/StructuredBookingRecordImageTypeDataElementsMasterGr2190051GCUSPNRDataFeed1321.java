
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_dataElementsMaster_gr2_190051_G_CUS_PNRDataFeed_1321">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="CodedAttribute_165524_S_CUS_PNRDataFeed_132" name="atcLayoutForFF"/>
 *     &lt;xs:element type="FreeTextInformation_165821_S_CUS_PNRDataFeed_132" name="freeTextDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeDataElementsMasterGr2190051GCUSPNRDataFeed1321
{
    private CodedAttribute165524SCUSPNRDataFeed132 atcLayoutForFF;
    private FreeTextInformation165821SCUSPNRDataFeed132 freeTextDetails;

    /** 
     * Get the 'atcLayoutForFF' element value. describing the number of Layout
     * 
     * @return value
     */
    public CodedAttribute165524SCUSPNRDataFeed132 getAtcLayoutForFF() {
        return atcLayoutForFF;
    }

    /** 
     * Set the 'atcLayoutForFF' element value. describing the number of Layout
     * 
     * @param atcLayoutForFF
     */
    public void setAtcLayoutForFF(
            CodedAttribute165524SCUSPNRDataFeed132 atcLayoutForFF) {
        this.atcLayoutForFF = atcLayoutForFF;
    }

    /** 
     * Get the 'freeTextDetails' element value. freeTextDetails
     * 
     * @return value
     */
    public FreeTextInformation165821SCUSPNRDataFeed132 getFreeTextDetails() {
        return freeTextDetails;
    }

    /** 
     * Set the 'freeTextDetails' element value. freeTextDetails
     * 
     * @param freeTextDetails
     */
    public void setFreeTextDetails(
            FreeTextInformation165821SCUSPNRDataFeed132 freeTextDetails) {
        this.freeTextDetails = freeTextDetails;
    }
}
