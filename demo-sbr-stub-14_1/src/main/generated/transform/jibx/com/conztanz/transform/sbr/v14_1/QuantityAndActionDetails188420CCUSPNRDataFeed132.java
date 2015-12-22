
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify quantity and action required for a              product or service
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="QuantityAndActionDetails_188420_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="statusCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class QuantityAndActionDetails188420CCUSPNRDataFeed132
{
    private String statusCode;

    /** 
     * Get the 'statusCode' element value. accommodation reservation mandatoty, optionnal, advised, not possible
     * 
     * @return value
     */
    public String getStatusCode() {
        return statusCode;
    }

    /** 
     * Set the 'statusCode' element value. accommodation reservation mandatoty, optionnal, advised, not possible
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
