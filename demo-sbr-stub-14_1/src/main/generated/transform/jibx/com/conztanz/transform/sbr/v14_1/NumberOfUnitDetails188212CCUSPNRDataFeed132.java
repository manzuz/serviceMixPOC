
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of number of units and its purpose.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnitDetails_188212_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="numberOfUnit"/>
 *     &lt;xs:element type="xs:string" name="unitQUalifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnitDetails188212CCUSPNRDataFeed132
{
    private String numberOfUnit;
    private String unitQUalifier;

    /** 
     * Get the 'numberOfUnit' element value. This data element is used to convey the occupancy level of the room
     * 
     * @return value
     */
    public String getNumberOfUnit() {
        return numberOfUnit;
    }

    /** 
     * Set the 'numberOfUnit' element value. This data element is used to convey the occupancy level of the room
     * 
     * @param numberOfUnit
     */
    public void setNumberOfUnit(String numberOfUnit) {
        this.numberOfUnit = numberOfUnit;
    }

    /** 
     * Get the 'unitQUalifier' element value. This data element is used to indicate the occupancy is the number of Adults in the room.
     * 
     * @return value
     */
    public String getUnitQUalifier() {
        return unitQUalifier;
    }

    /** 
     * Set the 'unitQUalifier' element value. This data element is used to indicate the occupancy is the number of Adults in the room.
     * 
     * @param unitQUalifier
     */
    public void setUnitQUalifier(String unitQUalifier) {
        this.unitQUalifier = unitQUalifier;
    }
}
