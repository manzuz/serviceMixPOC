
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify a party identification. To specify a party identification. To specify a party identification. To specify a party identification
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PartyIdentification_180264_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="partyCodeQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PartyIdentification180264CCUSPNRDataFeed132
{
    private String partyCodeQualifier;

    /** 
     * Get the 'partyCodeQualifier' element value. This code indicates the type of PNR Point of Sale: OWN - PNR owner CRE - PNR creator UPD - PNR last updator
     * 
     * @return value
     */
    public String getPartyCodeQualifier() {
        return partyCodeQualifier;
    }

    /** 
     * Set the 'partyCodeQualifier' element value. This code indicates the type of PNR Point of Sale: OWN - PNR owner CRE - PNR creator UPD - PNR last updator
     * 
     * @param partyCodeQualifier
     */
    public void setPartyCodeQualifier(String partyCodeQualifier) {
        this.partyCodeQualifier = partyCodeQualifier;
    }
}
