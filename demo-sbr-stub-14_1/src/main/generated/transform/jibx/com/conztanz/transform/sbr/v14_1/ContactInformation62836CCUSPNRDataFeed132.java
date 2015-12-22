
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify communication number, type of number, to whom the number belongs and a related reference number.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ContactInformation_62836_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="partyQualifier"/>
 *     &lt;xs:element type="xs:string" name="comAddress"/>
 *     &lt;xs:element type="xs:string" name="comChannelQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ContactInformation62836CCUSPNRDataFeed132
{
    private String partyQualifier;
    private String comAddress;
    private String comChannelQualifier;

    /** 
     * Get the 'partyQualifier' element value. W for party to receive Written confirmation
     * 
     * @return value
     */
    public String getPartyQualifier() {
        return partyQualifier;
    }

    /** 
     * Set the 'partyQualifier' element value. W for party to receive Written confirmation
     * 
     * @param partyQualifier
     */
    public void setPartyQualifier(String partyQualifier) {
        this.partyQualifier = partyQualifier;
    }

    /** 
     * Get the 'comAddress' element value. FAX number or E-Mail address
     * 
     * @return value
     */
    public String getComAddress() {
        return comAddress;
    }

    /** 
     * Set the 'comAddress' element value. FAX number or E-Mail address
     * 
     * @param comAddress
     */
    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    /** 
     * Get the 'comChannelQualifier' element value. type of medium
     * 
     * @return value
     */
    public String getComChannelQualifier() {
        return comChannelQualifier;
    }

    /** 
     * Set the 'comChannelQualifier' element value. type of medium
     * 
     * @param comChannelQualifier
     */
    public void setComChannelQualifier(String comChannelQualifier) {
        this.comChannelQualifier = comChannelQualifier;
    }
}
