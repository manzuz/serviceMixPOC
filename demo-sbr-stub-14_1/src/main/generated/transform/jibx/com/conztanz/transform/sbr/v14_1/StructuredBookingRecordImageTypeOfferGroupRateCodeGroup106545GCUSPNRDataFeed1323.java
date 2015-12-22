
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_rateCodeGroup_106545_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FareQualifierDetails_87617_S_CUS_PNRDataFeed_132" name="rateCodeInfo"/>
 *     &lt;xs:element type="FreeTextInformation_87612_S_CUS_PNRDataFeed_132" name="additionalInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupRateCodeGroup106545GCUSPNRDataFeed1323
{
    private FareQualifierDetails87617SCUSPNRDataFeed132 rateCodeInfo;
    private FreeTextInformation87612SCUSPNRDataFeed132 additionalInfo;

    /** 
     * Get the 'rateCodeInfo' element value. Rate code
     * 
     * @return value
     */
    public FareQualifierDetails87617SCUSPNRDataFeed132 getRateCodeInfo() {
        return rateCodeInfo;
    }

    /** 
     * Set the 'rateCodeInfo' element value. Rate code
     * 
     * @param rateCodeInfo
     */
    public void setRateCodeInfo(
            FareQualifierDetails87617SCUSPNRDataFeed132 rateCodeInfo) {
        this.rateCodeInfo = rateCodeInfo;
    }

    /** 
     * Get the 'additionalInfo' element value. Additional Rate Code Information
     * 
     * @return value
     */
    public FreeTextInformation87612SCUSPNRDataFeed132 getAdditionalInfo() {
        return additionalInfo;
    }

    /** 
     * Set the 'additionalInfo' element value. Additional Rate Code Information
     * 
     * @param additionalInfo
     */
    public void setAdditionalInfo(
            FreeTextInformation87612SCUSPNRDataFeed132 additionalInfo) {
        this.additionalInfo = additionalInfo;
    }
}
