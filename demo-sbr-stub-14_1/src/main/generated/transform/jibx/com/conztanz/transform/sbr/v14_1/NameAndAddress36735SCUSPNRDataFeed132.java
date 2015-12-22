
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the name/address and their related function, either by C082 only and/or unstructured by C058 or structured by C080 thru 3207.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NameAndAddress_36735_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="partyQualifier"/>
 *     &lt;xs:element type="NameAndAddress_62845_C_CUS_PNRDataFeed_132" name="addressDetails" minOccurs="0"/>
 *     &lt;xs:element type="PartyName_62847_C_CUS_PNRDataFeed_132" name="partyNameDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NameAndAddress36735SCUSPNRDataFeed132
{
    private String partyQualifier;
    private NameAndAddress62845CCUSPNRDataFeed132 addressDetails;
    private PartyName62847CCUSPNRDataFeed132 partyNameDetails;

    /** 
     * Get the 'partyQualifier' element value. W for party to revieve written confirmation
     * 
     * @return value
     */
    public String getPartyQualifier() {
        return partyQualifier;
    }

    /** 
     * Set the 'partyQualifier' element value. W for party to revieve written confirmation
     * 
     * @param partyQualifier
     */
    public void setPartyQualifier(String partyQualifier) {
        this.partyQualifier = partyQualifier;
    }

    /** 
     * Get the 'addressDetails' element value. This composite is used to convey the address
     * 
     * @return value
     */
    public NameAndAddress62845CCUSPNRDataFeed132 getAddressDetails() {
        return addressDetails;
    }

    /** 
     * Set the 'addressDetails' element value. This composite is used to convey the address
     * 
     * @param addressDetails
     */
    public void setAddressDetails(
            NameAndAddress62845CCUSPNRDataFeed132 addressDetails) {
        this.addressDetails = addressDetails;
    }

    /** 
     * Get the 'partyNameDetails' element value. This composite is used to convey the party name
     * 
     * @return value
     */
    public PartyName62847CCUSPNRDataFeed132 getPartyNameDetails() {
        return partyNameDetails;
    }

    /** 
     * Set the 'partyNameDetails' element value. This composite is used to convey the party name
     * 
     * @param partyNameDetails
     */
    public void setPartyNameDetails(
            PartyName62847CCUSPNRDataFeed132 partyNameDetails) {
        this.partyNameDetails = partyNameDetails;
    }
}
