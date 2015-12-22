
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredTelephoneNumber_187460_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="internationalDialCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="localPrefixCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="areaCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="telephoneNumber"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredTelephoneNumber187460CCUSPNRDataFeed132
{
    private String internationalDialCode;
    private String localPrefixCode;
    private String areaCode;
    private String telephoneNumber;

    /** 
     * Get the 'internationalDialCode' element value. International dial code
     * 
     * @return value
     */
    public String getInternationalDialCode() {
        return internationalDialCode;
    }

    /** 
     * Set the 'internationalDialCode' element value. International dial code
     * 
     * @param internationalDialCode
     */
    public void setInternationalDialCode(String internationalDialCode) {
        this.internationalDialCode = internationalDialCode;
    }

    /** 
     * Get the 'localPrefixCode' element value. Local prefix code
     * 
     * @return value
     */
    public String getLocalPrefixCode() {
        return localPrefixCode;
    }

    /** 
     * Set the 'localPrefixCode' element value. Local prefix code
     * 
     * @param localPrefixCode
     */
    public void setLocalPrefixCode(String localPrefixCode) {
        this.localPrefixCode = localPrefixCode;
    }

    /** 
     * Get the 'areaCode' element value. Area code
     * 
     * @return value
     */
    public String getAreaCode() {
        return areaCode;
    }

    /** 
     * Set the 'areaCode' element value. Area code
     * 
     * @param areaCode
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /** 
     * Get the 'telephoneNumber' element value. Telephone number
     * 
     * @return value
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /** 
     * Set the 'telephoneNumber' element value. Telephone number
     * 
     * @param telephoneNumber
     */
    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
}
