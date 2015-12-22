
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_productSection_137776_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="InsuranceProductDetails_20774_S_CUS_PNRDataFeed_132" name="productCode"/>
 *     &lt;xs:element type="FreeTextInformation_6235_S_CUS_PNRDataFeed_132" name="informationLines" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupProductSection137776GCUSPNRDataFeed1323
{
    private InsuranceProductDetails20774SCUSPNRDataFeed132 productCode;
    private FreeTextInformation6235SCUSPNRDataFeed132 informationLines;

    /** 
     * Get the 'productCode' element value. To convey the products or the tariffcodes together with description and amounts.
     * 
     * @return value
     */
    public InsuranceProductDetails20774SCUSPNRDataFeed132 getProductCode() {
        return productCode;
    }

    /** 
     * Set the 'productCode' element value. To convey the products or the tariffcodes together with description and amounts.
     * 
     * @param productCode
     */
    public void setProductCode(
            InsuranceProductDetails20774SCUSPNRDataFeed132 productCode) {
        this.productCode = productCode;
    }

    /** 
     * Get the 'informationLines' element value. To convey the information the provider estimates important on a given product.
     * 
     * @return value
     */
    public FreeTextInformation6235SCUSPNRDataFeed132 getInformationLines() {
        return informationLines;
    }

    /** 
     * Set the 'informationLines' element value. To convey the information the provider estimates important on a given product.
     * 
     * @param informationLines
     */
    public void setInformationLines(
            FreeTextInformation6235SCUSPNRDataFeed132 informationLines) {
        this.informationLines = informationLines;
    }
}
