
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify physical measurements, including dimension tolerances, weights and counts.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Measurements_87621_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="measurementQualifier"/>
 *     &lt;xs:element type="ValueRange_132943_C_CUS_PNRDataFeed_132" name="valueRange"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Measurements87621SCUSPNRDataFeed132
{
    private String measurementQualifier;
    private ValueRange132943CCUSPNRDataFeed132 valueRange;

    /** 
     * Get the 'measurementQualifier' element value. Measurement qualifier (maximum unit qualifier).
     * 
     * @return value
     */
    public String getMeasurementQualifier() {
        return measurementQualifier;
    }

    /** 
     * Set the 'measurementQualifier' element value. Measurement qualifier (maximum unit qualifier).
     * 
     * @param measurementQualifier
     */
    public void setMeasurementQualifier(String measurementQualifier) {
        this.measurementQualifier = measurementQualifier;
    }

    /** 
     * Get the 'valueRange' element value. Unit Qualifer for the range value.
     * 
     * @return value
     */
    public ValueRange132943CCUSPNRDataFeed132 getValueRange() {
        return valueRange;
    }

    /** 
     * Set the 'valueRange' element value. Unit Qualifer for the range value.
     * 
     * @param valueRange
     */
    public void setValueRange(ValueRange132943CCUSPNRDataFeed132 valueRange) {
        this.valueRange = valueRange;
    }
}
