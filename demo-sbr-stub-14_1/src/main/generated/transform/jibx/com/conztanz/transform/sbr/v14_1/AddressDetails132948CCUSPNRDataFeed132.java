
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the details of an address.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AddressDetails_132948_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="format"/>
 *     &lt;xs:element type="xs:string" name="line1"/>
 *     &lt;xs:element type="xs:string" name="line2" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AddressDetails132948CCUSPNRDataFeed132
{
    private String format;
    private String line1;
    private String line2;

    /** 
     * Get the 'format' element value. - 5 for unstructured address
     * 
     * @return value
     */
    public String getFormat() {
        return format;
    }

    /** 
     * Set the 'format' element value. - 5 for unstructured address
     * 
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /** 
     * Get the 'line1' element value. address line 1
     * 
     * @return value
     */
    public String getLine1() {
        return line1;
    }

    /** 
     * Set the 'line1' element value. address line 1
     * 
     * @param line1
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /** 
     * Get the 'line2' element value. address line 2
     * 
     * @return value
     */
    public String getLine2() {
        return line2;
    }

    /** 
     * Set the 'line2' element value. address line 2
     * 
     * @param line2
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }
}
