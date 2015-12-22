
package com.conztanz.transform.sbr.v14_1;

/** 
 * Goods item identification number.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IdentificationNumber_142185_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="address"/>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IdentificationNumber142185CCUSPNRDataFeed132
{
    private String address;
    private String qualifier;

    /** 
     * Get the 'address' element value. will contain the IP adress of the shopper
     * 
     * @return value
     */
    public String getAddress() {
        return address;
    }

    /** 
     * Set the 'address' element value. will contain the IP adress of the shopper
     * 
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /** 
     * Get the 'qualifier' element value. will contain IP for IP adress
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. will contain IP for IP adress
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
}
