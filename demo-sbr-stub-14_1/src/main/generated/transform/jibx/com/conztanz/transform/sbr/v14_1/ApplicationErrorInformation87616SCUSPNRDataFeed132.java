
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the type of application error within a message.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ApplicationErrorInformation_87616_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ApplicationErrorDetail_132934_C_CUS_PNRDataFeed_132" name="errorDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ApplicationErrorInformation87616SCUSPNRDataFeed132
{
    private ApplicationErrorDetail132934CCUSPNRDataFeed132 errorDetails;

    /** 
     * Get the 'errorDetails' element value. Application error details.
     * 
     * @return value
     */
    public ApplicationErrorDetail132934CCUSPNRDataFeed132 getErrorDetails() {
        return errorDetails;
    }

    /** 
     * Set the 'errorDetails' element value. Application error details.
     * 
     * @param errorDetails
     */
    public void setErrorDetails(
            ApplicationErrorDetail132934CCUSPNRDataFeed132 errorDetails) {
        this.errorDetails = errorDetails;
    }
}
