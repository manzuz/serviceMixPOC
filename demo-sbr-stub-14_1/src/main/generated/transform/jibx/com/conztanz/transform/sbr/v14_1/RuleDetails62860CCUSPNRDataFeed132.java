
package com.conztanz.transform.sbr.v14_1;

/** 
 * To indicate the coded rule, a number and it's              relation to the rule, a start day of service, a              monetary amount associated to the rule, and              additional information associated with the rule
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="RuleDetails_62860_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:string" name="quantity"/>
 *     &lt;xs:element type="xs:string" name="quantityUnit"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class RuleDetails62860CCUSPNRDataFeed132
{
    private String type;
    private String quantity;
    private String quantityUnit;

    /** 
     * Get the 'type' element value. This data element is used to identify the type of rule (see data mapping).
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. This data element is used to identify the type of rule (see data mapping).
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'quantity' element value. This data element is used to convey the afternoon time which is the maximum time to check-in. ex. if equal to 1, it means that the room is kept until 1PM.
     * 
     * @return value
     */
    public String getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value. This data element is used to convey the afternoon time which is the maximum time to check-in. ex. if equal to 1, it means that the room is kept until 1PM.
     * 
     * @param quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'quantityUnit' element value. This data element is used to specify that the Maximim check-in time is given in hours.
     * 
     * @return value
     */
    public String getQuantityUnit() {
        return quantityUnit;
    }

    /** 
     * Set the 'quantityUnit' element value. This data element is used to specify that the Maximim check-in time is given in hours.
     * 
     * @param quantityUnit
     */
    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }
}
