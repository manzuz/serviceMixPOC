
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ShipIdentification_188158_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="code" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="name" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cruiseLineCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ShipIdentification188158CCUSPNRDataFeed132
{
    private String code;
    private String name;
    private String cruiseLineCode;

    /** 
     * Get the 'code' element value. Used to convey the ship code as in the Cruise specific database ship's table.
     * 
     * @return value
     */
    public String getCode() {
        return code;
    }

    /** 
     * Set the 'code' element value. Used to convey the ship code as in the Cruise specific database ship's table.
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /** 
     * Get the 'name' element value. Used to convey the ship name as in the Cruise specific database ship's table.
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Used to convey the ship name as in the Cruise specific database ship's table.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /** 
     * Get the 'cruiseLineCode' element value. Used to convey the cruise line provider code for the sailing ship.
     * 
     * @return value
     */
    public String getCruiseLineCode() {
        return cruiseLineCode;
    }

    /** 
     * Set the 'cruiseLineCode' element value. Used to convey the cruise line provider code for the sailing ship.
     * 
     * @param cruiseLineCode
     */
    public void setCruiseLineCode(String cruiseLineCode) {
        this.cruiseLineCode = cruiseLineCode;
    }
}
