
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the given/first name and the title of a traveller and the traveller type.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerDetails_234142_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerDetails234142CCUSPNRDataFeed132
{
    private String type;

    /** 
     * Get the 'type' element value. Passenger type (PTC):[IN or PAX]
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Passenger type (PTC):[IN or PAX]
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
