
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ReferenceDetails_116896_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="qualifier"/>
 *     &lt;xs:element type="xs:string" name="number"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ReferenceDetails116896CCUSPNRDataFeed132
{
    private String qualifier;
    private String number;

    /** 
     * Get the 'qualifier' element value. Amadeus codes are used here.  PT for Passenger Tattoo  ST for Segment Tattoo  OT for Other element Tattoo
     * 
     * @return value
     */
    public String getQualifier() {
        return qualifier;
    }

    /** 
     * Set the 'qualifier' element value. Amadeus codes are used here.  PT for Passenger Tattoo  ST for Segment Tattoo  OT for Other element Tattoo
     * 
     * @param qualifier
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /** 
     * Get the 'number' element value. reference number refers to a PNR segment/passenger that has this number in its related element reference segment in the same message (qualifier PT, ST, MCO).
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. reference number refers to a PNR segment/passenger that has this number in its related element reference segment in the same message (qualifier PT, ST, MCO).
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }
}
