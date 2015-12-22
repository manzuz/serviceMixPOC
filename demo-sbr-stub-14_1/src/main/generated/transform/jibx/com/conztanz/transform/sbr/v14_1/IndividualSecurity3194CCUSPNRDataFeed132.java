
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="IndividualSecurity_3194_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="identification"/>
 *     &lt;xs:element type="xs:string" name="accessMode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class IndividualSecurity3194CCUSPNRDataFeed132
{
    private String identification;
    private String accessMode;

    /** 
     * Get the 'identification' element value. Type of receiver  G: Amadeus Global Core Office Id with possible wild card chars '*' to mask some part(s) of it// I:IATA nb or '*' for all, no wild card char //P:Pseudo-Office Id or '*' for all, no wild card char.
     * 
     * @return value
     */
    public String getIdentification() {
        return identification;
    }

    /** 
     * Set the 'identification' element value. Type of receiver  G: Amadeus Global Core Office Id with possible wild card chars '*' to mask some part(s) of it// I:IATA nb or '*' for all, no wild card char //P:Pseudo-Office Id or '*' for all, no wild card char.
     * 
     * @param identification
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /** 
     * Get the 'accessMode' element value. R for Read  B for Both read and write  N for None
     * 
     * @return value
     */
    public String getAccessMode() {
        return accessMode;
    }

    /** 
     * Set the 'accessMode' element value. R for Read  B for Both read and write  N for None
     * 
     * @param accessMode
     */
    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }
}
