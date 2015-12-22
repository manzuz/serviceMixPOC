
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Product Details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InsuranceProductDetails_20774_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0"/>
 *     &lt;xs:element type="ProviderInformation_36770_C_CUS_PNRDataFeed_132" name="productDetails" minOccurs="0"/>
 *     &lt;xs:element type="ProviderInformation_36770_C_CUS_PNRDataFeed_132" name="extensionIdentification" minOccurs="0" maxOccurs="7"/>
 *     &lt;xs:element type="Tariffcode_36948_C_CUS_PNRDataFeed_132" name="tariffCodeDetails" minOccurs="0" maxOccurs="48"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InsuranceProductDetails20774SCUSPNRDataFeed132
{
    private String companyCode;
    private String countryCode;
    private ProviderInformation36770CCUSPNRDataFeed132 productDetails;
    private List<ProviderInformation36770CCUSPNRDataFeed132> extensionIdentificationList = new ArrayList<ProviderInformation36770CCUSPNRDataFeed132>();
    private List<Tariffcode36948CCUSPNRDataFeed132> tariffCodeDetailList = new ArrayList<Tariffcode36948CCUSPNRDataFeed132>();

    /** 
     * Get the 'companyCode' element value. This data element is used to convey the company code of a non-air company
     * 
     * @return value
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /** 
     * Set the 'companyCode' element value. This data element is used to convey the company code of a non-air company
     * 
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    /** 
     * Get the 'countryCode' element value. To identify the countrycode from the provider.
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value. To identify the countrycode from the provider.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'productDetails' element value. This composite contains the code of the insurance elements.
     * 
     * @return value
     */
    public ProviderInformation36770CCUSPNRDataFeed132 getProductDetails() {
        return productDetails;
    }

    /** 
     * Set the 'productDetails' element value. This composite contains the code of the insurance elements.
     * 
     * @param productDetails
     */
    public void setProductDetails(
            ProviderInformation36770CCUSPNRDataFeed132 productDetails) {
        this.productDetails = productDetails;
    }

    /** 
     * Get the list of 'extensionIdentification' element items. contains the extensions for the main insurance product
     * 
     * @return list
     */
    public List<ProviderInformation36770CCUSPNRDataFeed132> getExtensionIdentificationList() {
        return extensionIdentificationList;
    }

    /** 
     * Set the list of 'extensionIdentification' element items. contains the extensions for the main insurance product
     * 
     * @param list
     */
    public void setExtensionIdentificationList(
            List<ProviderInformation36770CCUSPNRDataFeed132> list) {
        extensionIdentificationList = list;
    }

    /** 
     * Get the list of 'tariffCodeDetails' element items. tariff code info. tariff code and tariff familly code.
     * 
     * @return list
     */
    public List<Tariffcode36948CCUSPNRDataFeed132> getTariffCodeDetailList() {
        return tariffCodeDetailList;
    }

    /** 
     * Set the list of 'tariffCodeDetails' element items. tariff code info. tariff code and tariff familly code.
     * 
     * @param list
     */
    public void setTariffCodeDetailList(
            List<Tariffcode36948CCUSPNRDataFeed132> list) {
        tariffCodeDetailList = list;
    }
}
