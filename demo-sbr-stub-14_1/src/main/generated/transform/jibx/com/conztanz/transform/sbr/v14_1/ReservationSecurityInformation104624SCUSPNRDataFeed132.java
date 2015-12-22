
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the Amadeus PNR Record Locator Security Information for RR, SP elements and PNR Header or RP line
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReservationSecurityInformation_104624_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SecondRpLineInformation_97314_C_CUS_PNRDataFeed_132" name="secondRpInformation" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReservationSecurityInformation104624SCUSPNRDataFeed132
{
    private SecondRpLineInformation97314CCUSPNRDataFeed132 secondRpInformation;

    /** 
     * Get the 'secondRpInformation' element value. Second RP line information
     * 
     * @return value
     */
    public SecondRpLineInformation97314CCUSPNRDataFeed132 getSecondRpInformation() {
        return secondRpInformation;
    }

    /** 
     * Set the 'secondRpInformation' element value. Second RP line information
     * 
     * @param secondRpInformation
     */
    public void setSecondRpInformation(
            SecondRpLineInformation97314CCUSPNRDataFeed132 secondRpInformation) {
        this.secondRpInformation = secondRpInformation;
    }
}
