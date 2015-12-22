
package com.conztanz.transform.sbr.v14_1;

/** 
 * Measurement value and relevant minimum and maximum values of the measurement range.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ValueRange_132943_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="measureUnitQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ValueRange132943CCUSPNRDataFeed132
{
    private String measureUnitQualifier;

    /** 
     * Get the 'measureUnitQualifier' element value. Unit Qualifier for maximum range gives in previous RNG:  DAY: Duration in days G:   Kilometers M:   Mileage MTH: Durarion in Months WE:  Duration in weeks
     * 
     * @return value
     */
    public String getMeasureUnitQualifier() {
        return measureUnitQualifier;
    }

    /** 
     * Set the 'measureUnitQualifier' element value. Unit Qualifier for maximum range gives in previous RNG:  DAY: Duration in days G:   Kilometers M:   Mileage MTH: Durarion in Months WE:  Duration in weeks
     * 
     * @param measureUnitQualifier
     */
    public void setMeasureUnitQualifier(String measureUnitQualifier) {
        this.measureUnitQualifier = measureUnitQualifier;
    }
}
