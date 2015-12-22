
package com.conztanz.transform.sbr.v14_1;

/** 
 * To describe the usage of an address
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AddressUsage_132931_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="purpose"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AddressUsage132931CCUSPNRDataFeed132
{
    private String purpose;

    /** 
     * Get the 'purpose' element value. Address Type: - DEL for Delivery - COL for Collection
     * 
     * @return value
     */
    public String getPurpose() {
        return purpose;
    }

    /** 
     * Set the 'purpose' element value. Address Type: - DEL for Delivery - COL for Collection
     * 
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
