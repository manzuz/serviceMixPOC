
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ApplicationErrorDetail_157763_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="errorCode"/>
 *     &lt;xs:element type="xs:string" name="errorCategory" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="errorCodeOwner" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ApplicationErrorDetail157763CCUSPNRDataFeed132
{
    private String errorCode;
    private String errorCategory;
    private String errorCodeOwner;

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

    /** 
     * Get the 'errorCodeOwner' element value. Code identifying the agency responsible for a code list.
     * 
     * @return value
     */
    public String getErrorCodeOwner() {
        return errorCodeOwner;
    }

    /** 
     * Set the 'errorCodeOwner' element value. Code identifying the agency responsible for a code list.
     * 
     * @param errorCodeOwner
     */
    public void setErrorCodeOwner(String errorCodeOwner) {
        this.errorCodeOwner = errorCodeOwner;
    }
}
