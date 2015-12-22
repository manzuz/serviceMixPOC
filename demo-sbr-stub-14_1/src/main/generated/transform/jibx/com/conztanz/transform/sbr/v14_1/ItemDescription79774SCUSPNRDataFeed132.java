
package com.conztanz.transform.sbr.v14_1;

/** 
 * To describe an item in either an industry or free format.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemDescription_79774_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="characteristic"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemDescription79774SCUSPNRDataFeed132
{
    private String characteristic;

    /** 
     * Get the 'characteristic' element value. Characteristic of the item
     * 
     * @return value
     */
    public String getCharacteristic() {
        return characteristic;
    }

    /** 
     * Set the 'characteristic' element value. Characteristic of the item
     * 
     * @param characteristic
     */
    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }
}
