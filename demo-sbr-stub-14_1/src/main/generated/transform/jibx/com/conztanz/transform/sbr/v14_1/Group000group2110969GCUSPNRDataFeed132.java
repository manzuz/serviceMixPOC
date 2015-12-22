
package com.conztanz.transform.sbr.v14_1;

/** 
 * to convey the pnr point of sell
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Group000group2_110969_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="UserIdentification_92943_S_CUS_PNRDataFeed_132" name="sbrUserIdentification"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Group000group2110969GCUSPNRDataFeed132
{
    private UserIdentification92943SCUSPNRDataFeed132 sbrUserIdentification;

    /** 
     * Get the 'sbrUserIdentification' element value. - Office ID owner of the SBR. - IATA Code - Agent type
     * 
     * @return value
     */
    public UserIdentification92943SCUSPNRDataFeed132 getSbrUserIdentification() {
        return sbrUserIdentification;
    }

    /** 
     * Set the 'sbrUserIdentification' element value. - Office ID owner of the SBR. - IATA Code - Agent type
     * 
     * @param sbrUserIdentification
     */
    public void setSbrUserIdentification(
            UserIdentification92943SCUSPNRDataFeed132 sbrUserIdentification) {
        this.sbrUserIdentification = sbrUserIdentification;
    }
}
