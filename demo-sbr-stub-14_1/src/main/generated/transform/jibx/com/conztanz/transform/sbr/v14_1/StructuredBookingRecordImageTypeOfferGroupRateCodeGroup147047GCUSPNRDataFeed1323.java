
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_rateCodeGroup_147047_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FareQualifierDetails_128802_S_CUS_PNRDataFeed_132" name="rateCodeInfo"/>
 *     &lt;xs:element type="FreeTextInformation_128791_S_CUS_PNRDataFeed_132" name="additionalInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupRateCodeGroup147047GCUSPNRDataFeed1323
{
    private FareQualifierDetails128802SCUSPNRDataFeed132 rateCodeInfo;
    private FreeTextInformation128791SCUSPNRDataFeed132 additionalInfo;

    /** 
     * Get the 'rateCodeInfo' element value. Rate Code.
     * 
     * @return value
     */
    public FareQualifierDetails128802SCUSPNRDataFeed132 getRateCodeInfo() {
        return rateCodeInfo;
    }

    /** 
     * Set the 'rateCodeInfo' element value. Rate Code.
     * 
     * @param rateCodeInfo
     */
    public void setRateCodeInfo(
            FareQualifierDetails128802SCUSPNRDataFeed132 rateCodeInfo) {
        this.rateCodeInfo = rateCodeInfo;
    }

    /** 
     * Get the 'additionalInfo' element value. Additional Rate Code information.
     * 
     * @return value
     */
    public FreeTextInformation128791SCUSPNRDataFeed132 getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'additionalInfo' element value. Additional Rate Code information.
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(
            FreeTextInformation128791SCUSPNRDataFeed132 additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
