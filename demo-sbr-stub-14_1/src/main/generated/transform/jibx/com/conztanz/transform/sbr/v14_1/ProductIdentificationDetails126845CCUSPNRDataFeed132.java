
package com.conztanz.transform.sbr.v14_1;

/** 
 * Code, number or name to identify a specific product or service and a code to identify the level or type of product or service.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentificationDetails_126845_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="number"/>
 *     &lt;xs:element type="xs:string" name="name"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentificationDetails126845CCUSPNRDataFeed132
{
    private String number;
    private String name;

    /** 
     * Get the 'number' element value. Product code
     * 
     * @return value
     */
    public String getNumber() {
        return number;
    }

    /** 
     * Set the 'number' element value. Product code
     * 
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /** 
     * Get the 'name' element value. Product Name
     * 
     * @return value
     */
    public String getName() {
        return name;
    }

    /** 
     * Set the 'name' element value. Product Name
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
