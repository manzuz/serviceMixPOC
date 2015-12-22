
package com.conztanz.transform.sbr.v14_1;

/** 
 * Identification of number of units and its purpose.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="NumberOfUnitDetails_62859_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="numberOfUnit"/>
 *     &lt;xs:element type="xs:string" name="unitQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class NumberOfUnitDetails62859CCUSPNRDataFeed132
{
    private String numberOfUnit;
    private String unitQualifier;

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
     * Get the 'unitQualifier' element value. This data element is used to indicate the occupancy is the number of Adults in the room.
     * 
     * @return value
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /** 
     * Set the 'unitQualifier' element value. This data element is used to indicate the occupancy is the number of Adults in the room.
     * 
     * @param unitQualifier
     */
    public void setUnitQualifier(String unitQualifier) {
        this.unitQualifier = unitQualifier;
    }
}
