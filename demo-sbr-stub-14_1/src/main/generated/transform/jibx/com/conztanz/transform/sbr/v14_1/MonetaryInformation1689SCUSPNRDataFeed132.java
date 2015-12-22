
package com.conztanz.transform.sbr.v14_1;

/** 
 * MONETARY INFORMATION
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_1689_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_4220_C_CUS_PNRDataFeed_132" name="information" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation1689SCUSPNRDataFeed132
{
    private MonetaryInformation4220CCUSPNRDataFeed132 information;

    /** 
     * Get the 'information' element value. To specify monetary information
     * 
     * @return value
     */
    public MonetaryInformation4220CCUSPNRDataFeed132 getInformation() {
        return information;
    }

    /** 
     * Set the 'information' element value. To specify monetary information
     * 
     * @param information
     */
    public void setInformation(
            MonetaryInformation4220CCUSPNRDataFeed132 information) {
        this.information = information;
    }
}
