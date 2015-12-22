
package com.conztanz.transform.sbr.v14_1;

/** 
 * Provides information on the office and the agent who modified and filed the SBR
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TransactionOriginatorInformation_129405_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="officeId"/>
 *     &lt;xs:element type="xs:string" name="iataCode" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="agentCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TransactionOriginatorInformation129405CCUSPNRDataFeed132
{
    private String officeId;
    private String iataCode;
    private String agentCode;

    /** 
     * Get the 'officeId' element value. In-house identification
     * 
     * @return value
     */
    public String getOfficeId() {
        return officeId;
    }

    /** 
     * Set the 'officeId' element value. In-house identification
     * 
     * @param officeId
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    /** 
     * Get the 'iataCode' element value. ATA/IATA reference number : this field is provided if the transaction has been done by an Amadeus office, or if the TTY message provides the IATA number.
     * 
     * @return value
     */
    public String getIataCode() {
        return iataCode;
    }

    /** 
     * Set the 'iataCode' element value. ATA/IATA reference number : this field is provided if the transaction has been done by an Amadeus office, or if the TTY message provides the IATA number.
     * 
     * @param iataCode
     */
    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    /** 
     * Get the 'agentCode' element value. Numeric sign + agent initials + duty code of the originator of the transaction This field will only be transmitted in case of a manual end of transaction by an Amadeus office id.
     * 
     * @return value
     */
    public String getAgentCode() {
        return agentCode;
    }

    /** 
     * Set the 'agentCode' element value. Numeric sign + agent initials + duty code of the originator of the transaction This field will only be transmitted in case of a manual end of transaction by an Amadeus office id.
     * 
     * @param agentCode
     */
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }
}
