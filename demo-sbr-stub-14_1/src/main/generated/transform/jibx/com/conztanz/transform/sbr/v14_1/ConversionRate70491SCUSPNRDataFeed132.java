
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify details of a conversion rate related to an amount.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ConversionRate_70491_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ConversionRateDetails_109773_C_CUS_PNRDataFeed_132" name="conversionRateDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ConversionRate70491SCUSPNRDataFeed132
{
    private ConversionRateDetails109773CCUSPNRDataFeed132 conversionRateDetails;

    /** 
     * Get the 'conversionRateDetails' element value. Banker rate.
     * 
     * @return value
     */
    public ConversionRateDetails109773CCUSPNRDataFeed132 getConversionRateDetails() {
        return conversionRateDetails;
    }

    /** 
     * Set the 'conversionRateDetails' element value. Banker rate.
     * 
     * @param conversionRateDetails
     */
    public void setConversionRateDetails(
            ConversionRateDetails109773CCUSPNRDataFeed132 conversionRateDetails) {
        this.conversionRateDetails = conversionRateDetails;
    }
}
