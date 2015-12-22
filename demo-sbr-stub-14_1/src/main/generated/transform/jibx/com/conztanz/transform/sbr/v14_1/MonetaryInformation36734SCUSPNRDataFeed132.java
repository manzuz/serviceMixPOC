
package com.conztanz.transform.sbr.v14_1;

/** 
 * MONETARY INFORMATION
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="MonetaryInformation_36734_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_62844_C_CUS_PNRDataFeed_132" name="information" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MonetaryInformation36734SCUSPNRDataFeed132
{
    private MonetaryInformation62844CCUSPNRDataFeed132 information;

    /** 
     * Get the 'information' element value. To specify monetary information
     * 
     * @return value
     */
    public MonetaryInformation62844CCUSPNRDataFeed132 getInformation() {
        return information;
    }

    /** 
     * Set the 'information' element value. To specify monetary information
     * 
     * @param information
     */
    public void setInformation(
            MonetaryInformation62844CCUSPNRDataFeed132 information) {
        this.information = information;
    }
}
