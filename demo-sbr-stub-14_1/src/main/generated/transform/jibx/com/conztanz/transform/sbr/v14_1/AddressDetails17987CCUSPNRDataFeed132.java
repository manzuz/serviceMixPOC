
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the details of an address.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AddressDetails_17987_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="format"/>
 *     &lt;xs:element type="xs:string" name="line1"/>
 *     &lt;xs:element type="xs:string" name="line2" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="line4" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AddressDetails17987CCUSPNRDataFeed132
{
    private String format;
    private String line1;
    private String line2;
    private String line4;

    /** 
     * Get the 'format' element value. To specify what kind of address we have
     * 
     * @return value
     */
    public String getFormat() {
        return format;
    }

    /** 
     * Set the 'format' element value. To specify what kind of address we have
     * 
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /** 
     * Get the 'line1' element value. Address
     * 
     * @return value
     */
    public String getLine1() {
        return line1;
    }

    /** 
     * Set the 'line1' element value. Address
     * 
     * @param line1
     */
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /** 
     * Get the 'line2' element value. Address
     * 
     * @return value
     */
    public String getLine2() {
        return line2;
    }

    /** 
     * Set the 'line2' element value. Address
     * 
     * @param line2
     */
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /** 
     * Get the 'line4' element value. PO Box
     * 
     * @return value
     */
    public String getLine4() {
        return line4;
    }

    /** 
     * Set the 'line4' element value. PO Box
     * 
     * @param line4
     */
    public void setLine4(String line4) {
        this.line4 = line4;
    }
}
