
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Additional details describing a specific means of transport.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalProductDetails_187256_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="equipment" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="numberOfStops" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="weekDay" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalProductDetails187256CCUSPNRDataFeed132
{
    private String equipment;
    private BigDecimal numberOfStops;
    private String weekDay;

    /** 
     * Get the 'equipment' element value.
     * 
     * @return value
     */
    public String getEquipment() {
        return equipment;
    }

    /** 
     * Set the 'equipment' element value.
     * 
     * @param equipment
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    /** 
     * Get the 'numberOfStops' element value.
     * 
     * @return value
     */
    public BigDecimal getNumberOfStops() {
        return numberOfStops;
    }

    /** 
     * Set the 'numberOfStops' element value.
     * 
     * @param numberOfStops
     */
    public void setNumberOfStops(BigDecimal numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    /** 
     * Get the 'weekDay' element value. Day of the week = 1 (Monday) to 7
     * 
     * @return value
     */
    public String getWeekDay() {
        return weekDay;
    }

    /** 
     * Set the 'weekDay' element value. Day of the week = 1 (Monday) to 7
     * 
     * @param weekDay
     */
    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }
}
