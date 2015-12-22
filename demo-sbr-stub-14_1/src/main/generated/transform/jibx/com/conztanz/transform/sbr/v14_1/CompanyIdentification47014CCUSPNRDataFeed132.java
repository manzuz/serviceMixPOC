
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code or name to identify a company and any associated companies.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyIdentification_47014_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="carrierCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyIdentification47014CCUSPNRDataFeed132
{
    private String carrierCode;

    /** 
     * Get the 'carrierCode' element value.
     * 
     * @return value
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /** 
     * Set the 'carrierCode' element value.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }
}
