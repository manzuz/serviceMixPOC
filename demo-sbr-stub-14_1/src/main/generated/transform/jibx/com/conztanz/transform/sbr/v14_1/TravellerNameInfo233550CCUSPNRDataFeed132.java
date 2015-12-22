
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify traveler and personal details relating to one traveler having rich name and/or multiple names
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerNameInfo_233550_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerNameInfo233550CCUSPNRDataFeed132
{
    private String qualifier;

    /** 
     * Get the 'qualifier' element value. PAX = PAX IN = Infant
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. PAX = PAX IN = Infant
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }
}
