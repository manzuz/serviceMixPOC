
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the details of an address.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AddressDetails_132929_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="format"/>
 *     &lt;xs:element type="xs:string" name="line1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AddressDetails132929CCUSPNRDataFeed132
{
    private String format;
    private String line1;

    /** 
     * Get the 'format' element value. Address format
     * 
     * @return value
     */
    public String getFormat() {
        return format;
    }

    /** 
     * Set the 'format' element value. Address format
     * 
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /** 
     * Get the 'line1' element value. Address Field in free flow text
     * 
     * @return value
     */
    public String getLine1() {
        return line1;
    }

    /** 
     * Set the 'line1' element value. Address Field in free flow text
     * 
     * @param line1
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }
}
