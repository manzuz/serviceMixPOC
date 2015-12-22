
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TravellerSurnameInformation_117948_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="type"/>
 *     &lt;xs:element type="xs:decimal" name="quantity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="gender" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TravellerSurnameInformation117948CCUSPNRDataFeed132
{
    private String type;
    private BigDecimal quantity;
    private String gender;

    /** 
     * Get the 'type' element value. Customer type: A=adult C=child IN = infant
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Customer type: A=adult C=child IN = infant
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'quantity' element value. Customer age
     * 
     * @return value
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /** 
     * Set the 'quantity' element value. Customer age
     * 
     * @param quantity
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    /** 
     * Get the 'gender' element value. Gender of the pax: - M : male - F : female - U : unknown
     * 
     * @return value
     */
    public String getGender() {
        return gender;
    }

    /** 
     * Set the 'gender' element value. Gender of the pax: - M : male - F : female - U : unknown
     * 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
