
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify by code or name and location the system that originates or delivers the message for a third party.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SystemDetails_122347_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="companyId"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SystemDetails122347CCUSPNRDataFeed132
{
    private String companyId;

    /** 
     * Get the 'companyId' element value. Distribution Channel data, on 12 chars: - "DCD" identifier - channel/product/sub-product on 3 digits each Ex: DCD002013000
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. Distribution Channel data, on 12 chars: - "DCD" identifier - channel/product/sub-product on 3 digits each Ex: DCD002013000
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
