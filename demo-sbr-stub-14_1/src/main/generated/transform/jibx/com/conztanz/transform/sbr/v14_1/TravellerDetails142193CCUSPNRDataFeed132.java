
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerDetails_142193_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="givenName" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerDetails142193CCUSPNRDataFeed132
{
    private String givenName;

    /** 
     * Get the 'givenName' element value. passenger first name
     * 
     * @return value
     */
    public String getGivenName() {
        return givenName;
    }

    /** 
     * Set the 'givenName' element value. passenger first name
     * 
     * @param givenName
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
