
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_originDestinationDetails_productSection_145845_G_CUS_PNRDataFeed_1322">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceProductDetails_128666_S_CUS_PNRDataFeed_132" name="productCode"/>
 *     &lt;xs:element type="FreeTextInformation_128667_S_CUS_PNRDataFeed_132" name="informationLines" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOriginDestinationDetailsProductSection145845GCUSPNRDataFeed1322
{
    private InsuranceProductDetails128666SCUSPNRDataFeed132 productCode;
    private FreeTextInformation128667SCUSPNRDataFeed132 informationLines;

    /** 
     * Get the 'productCode' element value. To convey the products or the tariffcodes together with description and amounts.
     * 
     * @return value
     */
    public InsuranceProductDetails128666SCUSPNRDataFeed132 getProductCode() {
        return productCode;
    }

    /** 
     * Set the 'productCode' element value. To convey the products or the tariffcodes together with description and amounts.
     * 
     * @param productCode
     */
    public void setProductCode(
            InsuranceProductDetails128666SCUSPNRDataFeed132 productCode) {
        this.productCode = productCode;
    }

    /** 
     * Get the 'informationLines' element value. To convey the information the provider estimates important on a given product.
     * 
     * @return value
     */
    public FreeTextInformation128667SCUSPNRDataFeed132 getInformationLines() {
        return informationLines;
    }

    /** 
     * Set the 'informationLines' element value. To convey the information the provider estimates important on a given product.
     * 
     * @param informationLines
     */
    public void setInformationLines(
            FreeTextInformation128667SCUSPNRDataFeed132 informationLines) {
        this.informationLines = informationLines;
    }
}
