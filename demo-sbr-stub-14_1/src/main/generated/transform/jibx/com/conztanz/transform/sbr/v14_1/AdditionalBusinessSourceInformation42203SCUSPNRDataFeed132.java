
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify ownership and creator of a PNR
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalBusinessSourceInformation_42203_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SourceType_70620_C_CUS_PNRDataFeed_132" name="sourceType"/>
 *     &lt;xs:element type="xs:string" name="countryCode"/>
 *     &lt;xs:element type="xs:string" name="systemCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalBusinessSourceInformation42203SCUSPNRDataFeed132
{
    private SourceType70620CCUSPNRDataFeed132 sourceType;
    private String countryCode;
    private String systemCode;

    /** 
     * Get the 'sourceType' element value. SOURCE TYPE
     * 
     * @return value
     */
    public SourceType70620CCUSPNRDataFeed132 getSourceType() {
        return sourceType;
    }

    /** 
     * Set the 'sourceType' element value. SOURCE TYPE
     * 
     * @param sourceType
     */
    public void setSourceType(SourceType70620CCUSPNRDataFeed132 sourceType) {
        this.sourceType = sourceType;
    }

    /** 
     * Get the 'countryCode' element value. Country code of the system location
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value. Country code of the system location
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'systemCode' element value. Company identification
     * 
     * @return value
     */
    public String getSystemCode() {
        return systemCode;
    }

    /** 
     * Set the 'systemCode' element value. Company identification
     * 
     * @param systemCode
     */
    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }
}
