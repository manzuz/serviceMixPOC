
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify application details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ApplicationIdentification_117837_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="internalId"/>
 *     &lt;xs:element type="xs:string" name="versionNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ApplicationIdentification117837CCUSPNRDataFeed132
{
    private String internalId;
    private String versionNumber;

    /** 
     * Get the 'internalId' element value. application internal identifier
     * 
     * @return value
     */
    public String getInternalId() {
        return internalId;
    }

    /** 
     * Set the 'internalId' element value. application internal identifier
     * 
     * @param internalId
     */
    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    /** 
     * Get the 'versionNumber' element value. Item Version Number
     * 
     * @return value
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /** 
     * Set the 'versionNumber' element value. Item Version Number
     * 
     * @param versionNumber
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }
}
