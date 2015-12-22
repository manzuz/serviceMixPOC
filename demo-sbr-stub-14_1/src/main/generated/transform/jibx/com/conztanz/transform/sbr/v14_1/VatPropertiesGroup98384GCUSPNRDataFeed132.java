
package com.conztanz.transform.sbr.v14_1;

/** 
 * contains the VAT computing info
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="VatPropertiesGroup_98384_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_53012_S_CUS_PNRDataFeed_132" name="vatRateAndAmount"/>
 *     &lt;xs:element type="SelectionDetails_53013_S_CUS_PNRDataFeed_132" name="fareFiling"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class VatPropertiesGroup98384GCUSPNRDataFeed132
{
    private MonetaryInformation53012SCUSPNRDataFeed132 vatRateAndAmount;
    private SelectionDetails53013SCUSPNRDataFeed132 fareFiling;

    /** 
     * Get the 'vatRateAndAmount' element value. Convey the VAT rate and the VAT amount
     * 
     * @return value
     */
    public MonetaryInformation53012SCUSPNRDataFeed132 getVatRateAndAmount() {
        return vatRateAndAmount;
    }

    /** 
     * Set the 'vatRateAndAmount' element value. Convey the VAT rate and the VAT amount
     * 
     * @param vatRateAndAmount
     */
    public void setVatRateAndAmount(
            MonetaryInformation53012SCUSPNRDataFeed132 vatRateAndAmount) {
        this.vatRateAndAmount = vatRateAndAmount;
    }

    /** 
     * Get the 'fareFiling' element value. Contains the fare filing indicator : - VIN = VAT Inclusif - VEX = VAT Exclusif
     * 
     * @return value
     */
    public SelectionDetails53013SCUSPNRDataFeed132 getFareFiling() {
        return fareFiling;
    }

    /** 
     * Set the 'fareFiling' element value. Contains the fare filing indicator : - VIN = VAT Inclusif - VEX = VAT Exclusif
     * 
     * @param fareFiling
     */
    public void setFareFiling(SelectionDetails53013SCUSPNRDataFeed132 fareFiling) {
        this.fareFiling = fareFiling;
    }
}
