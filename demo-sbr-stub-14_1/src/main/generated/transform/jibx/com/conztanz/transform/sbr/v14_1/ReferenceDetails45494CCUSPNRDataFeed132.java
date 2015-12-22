
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceDetails_45494_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="marriageQualifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="tatooNum"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceDetails45494CCUSPNRDataFeed132
{
    private String marriageQualifier;
    private String tatooNum;

    /** 
     * Get the 'marriageQualifier' element value. Amadeus codes are used here.  D for Dominant segment in a marriage  N for Non dominant segment in a marriage
     * 
     * @return value
     */
    public String getMarriageQualifier() {
        return marriageQualifier;
    }

    /** 
     * Set the 'marriageQualifier' element value. Amadeus codes are used here.  D for Dominant segment in a marriage  N for Non dominant segment in a marriage
     * 
     * @param marriageQualifier
     */
    public void setMarriageQualifier(String marriageQualifier) {
        this.marriageQualifier = marriageQualifier;
    }

    /** 
     * Get the 'tatooNum' element value. Tatoo number of the segment
     * 
     * @return value
     */
    public String getTatooNum() {
        return tatooNum;
    }

    /** 
     * Set the 'tatooNum' element value. Tatoo number of the segment
     * 
     * @param tatooNum
     */
    public void setTatooNum(String tatooNum) {
        this.tatooNum = tatooNum;
    }
}
