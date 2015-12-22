
package com.conztanz.transform.sbr.v14_1;

/** 
 * Specify in which time zone, the information is provided
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TimeZoneInformation_187638_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="countryCode"/>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="suffix" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TimeZoneInformation187638CCUSPNRDataFeed132
{
    private String countryCode;
    private String code;
    private String suffix;

    /** 
     * Get the 'countryCode' element value. ISO country Code See SSIM appendix F
     * 
     * @return value
     */
    public String getCountryCode() {
        return countryCode;
    }

    /** 
     * Set the 'countryCode' element value. ISO country Code See SSIM appendix F
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /** 
     * Get the 'code' element value. Time zone code. See SSIM appendix F.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Time zone code. See SSIM appendix F.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'suffix' element value. Time zone suffix to complete the time zone code when necessary. See SSIM appendix F.
     * 
     * @return value
     */
    public String getSuffix() {
        return suffix;
    }

    /** 
     * Set the 'suffix' element value. Time zone suffix to complete the time zone code when necessary. See SSIM appendix F.
     * 
     * @param suffix
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
