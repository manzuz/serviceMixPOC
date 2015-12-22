
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify a range.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RangeDetails_87622_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="rangeQualifier"/>
 *     &lt;xs:element type="Range_132945_C_CUS_PNRDataFeed_132" name="rangeDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RangeDetails87622SCUSPNRDataFeed132
{
    private String rangeQualifier;
    private Range132945CCUSPNRDataFeed132 rangeDetails;

    /** 
     * Get the 'rangeQualifier' element value. 701 for range definition
     * 
     * @return value
     */
    public String getRangeQualifier() {
        return rangeQualifier;
    }

    /** 
     * Set the 'rangeQualifier' element value. 701 for range definition
     * 
     * @param rangeQualifier
     */
    public void setRangeQualifier(String rangeQualifier) {
        this.rangeQualifier = rangeQualifier;
    }

    /** 
     * Get the 'rangeDetails' element value. Range definition
     * 
     * @return value
     */
    public Range132945CCUSPNRDataFeed132 getRangeDetails() {
        return rangeDetails;
    }

    /** 
     * Set the 'rangeDetails' element value. Range definition
     * 
     * @param rangeDetails
     */
    public void setRangeDetails(Range132945CCUSPNRDataFeed132 rangeDetails) {
        this.rangeDetails = rangeDetails;
    }
}
