
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AdditionalProductDetails_48594_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="equipment" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="numOfStops" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="weekDay" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AdditionalProductDetails48594CCUSPNRDataFeed132
{
    private String equipment;
    private BigDecimal numOfStops;
    private String weekDay;

    /** 
     * Get the 'equipment' element value. 1. Air segment: Equipment code
     * 
     * @return value
     */
    public String getEquipment() {
        return equipment;
    }

    /** 
     * Set the 'equipment' element value. 1. Air segment: Equipment code
     * 
     * @param equipment
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    /** 
     * Get the 'numOfStops' element value. 1. Air segment: Number of stops
     * 
     * @return value
     */
    public BigDecimal getNumOfStops() {
        return numOfStops;
    }

    /** 
     * Set the 'numOfStops' element value. 1. Air segment: Number of stops
     * 
     * @param numOfStops
     */
    public void setNumOfStops(BigDecimal numOfStops) {
        this.numOfStops = numOfStops;
    }

    /** 
     * Get the 'weekDay' element value. 1. Air segment: 2. TRN Amtrack segment:train 3. TRN SNCF segment:train Day of the week =  1 (Monday) to 7
     * 
     * @return value
     */
    public String getWeekDay() {
        return weekDay;
    }

    /** 
     * Set the 'weekDay' element value. 1. Air segment: 2. TRN Amtrack segment:train 3. TRN SNCF segment:train Day of the week =  1 (Monday) to 7
     * 
     * @param weekDay
     */
    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }
}
