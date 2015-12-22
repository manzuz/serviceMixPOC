
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify cabin features
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinDescription_187623_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="positionInShip" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="cabinSide" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="categoryLocation" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="maxOccupancy" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CabinDescription187623CCUSPNRDataFeed132
{
    private String positionInShip;
    private String cabinSide;
    private String categoryLocation;
    private BigDecimal maxOccupancy;

    /** 
     * Get the 'positionInShip' element value.
     * 
     * @return value
     */
    public String getPositionInShip() {
        return positionInShip;
    }

    /** 
     * Set the 'positionInShip' element value.
     * 
     * @param positionInShip
     */
    public void setPositionInShip(String positionInShip) {
        this.positionInShip = positionInShip;
    }

    /** 
     * Get the 'cabinSide' element value.
     * 
     * @return value
     */
    public String getCabinSide() {
        return cabinSide;
    }

    /** 
     * Set the 'cabinSide' element value.
     * 
     * @param cabinSide
     */
    public void setCabinSide(String cabinSide) {
        this.cabinSide = cabinSide;
    }

    /** 
     * Get the 'categoryLocation' element value.
     * 
     * @return value
     */
    public String getCategoryLocation() {
        return categoryLocation;
    }

    /** 
     * Set the 'categoryLocation' element value.
     * 
     * @param categoryLocation
     */
    public void setCategoryLocation(String categoryLocation) {
        this.categoryLocation = categoryLocation;
    }

    /** 
     * Get the 'maxOccupancy' element value.
     * 
     * @return value
     */
    public BigDecimal getMaxOccupancy() {
        return maxOccupancy;
    }

    /** 
     * Set the 'maxOccupancy' element value.
     * 
     * @param maxOccupancy
     */
    public void setMaxOccupancy(BigDecimal maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }
}
