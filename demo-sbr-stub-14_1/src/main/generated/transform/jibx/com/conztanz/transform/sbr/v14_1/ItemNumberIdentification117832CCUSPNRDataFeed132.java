
package com.conztanz.transform.sbr.v14_1;

/** 
 * Goods identification for a specified source
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ItemNumberIdentification_117832_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="number"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ItemNumberIdentification117832CCUSPNRDataFeed132
{
    private String number;
    private String type;

    /** 
     * Get the 'number' element value. The check in security ID as sent by CM eg "LHR-001"
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. The check in security ID as sent by CM eg "LHR-001"
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'type' element value. "C" for customer number
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. "C" for customer number
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
