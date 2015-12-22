
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ApplicationErrorDetail_53137_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="errorCode"/>
 *     &lt;xs:element type="xs:string" name="errorCategory" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ApplicationErrorDetail53137CCUSPNRDataFeed132
{
    private String errorCode;
    private String errorCategory;

    /** 
     * Get the 'errorCode' element value. Code identifying the data validation error condition.
     * 
     * @return value
     */
    public String getErrorCode() {
        return errorCode;
    }

    /** 
     * Set the 'errorCode' element value. Code identifying the data validation error condition.
     * 
     * @param errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /** 
     * Get the 'errorCategory' element value. Identification of a code list.
     * 
     * @return value
     */
    public String getErrorCategory() {
        return errorCategory;
    }

    /** 
     * Set the 'errorCategory' element value. Identification of a code list.
     * 
     * @param errorCategory
     */
    public void setErrorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
    }
}
