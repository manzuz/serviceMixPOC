
package com.conztanz.transform.sbr.v14_1;

/** 
 * Communication number of a department or employee in a specified channel.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CommunicationContact_142139_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="urlAddress"/>
 *     &lt;xs:element type="xs:string" name="urlType"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CommunicationContact142139CCUSPNRDataFeed132
{
    private String urlAddress;
    private String urlType;

    /** 
     * Get the 'urlAddress' element value. The communication address: an Url.
     * 
     * @return value
     */
    public String getUrlAddress() {
        return urlAddress;
    }

    /** 
     * Set the 'urlAddress' element value. The communication address: an Url.
     * 
     * @param urlAddress
     */
    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress;
    }

    /** 
     * Get the 'urlType' element value. will be AH for World Wide Web
     * 
     * @return value
     */
    public String getUrlType() {
        return urlType;
    }

    /** 
     * Set the 'urlType' element value. will be AH for World Wide Web
     * 
     * @param urlType
     */
    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }
}
