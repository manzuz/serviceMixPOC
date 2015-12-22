
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey date/time in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_79014_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="businessSemantic"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_121357_C_CUS_PNRDataFeed_132" name="dateTime"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation79014SCUSPNRDataFeed132
{
    private String businessSemantic;
    private StructuredDateTimeInformation121357CCUSPNRDataFeed132 dateTime;

    /** 
     * Get the 'businessSemantic' element value. This data element can be used to provide the semantic of the information provided. Examples : - Impacted period - Departure date - Estimated arrival date and time
     * 
     * @return value
     */
    public String getBusinessSemantic() {
        return businessSemantic;
    }

    /** 
     * Set the 'businessSemantic' element value. This data element can be used to provide the semantic of the information provided. Examples : - Impacted period - Departure date - Estimated arrival date and time
     * 
     * @param businessSemantic
     */
    public void setBusinessSemantic(String businessSemantic) {
        this.businessSemantic = businessSemantic;
    }

    /** 
     * Get the 'dateTime' element value. Convey date and/or time.
     * 
     * @return value
     */
    public StructuredDateTimeInformation121357CCUSPNRDataFeed132 getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'dateTime' element value. Convey date and/or time.
     * 
     * @param dateTime
     */
    public void setDateTime(
            StructuredDateTimeInformation121357CCUSPNRDataFeed132 dateTime) {
        this.dateTime = dateTime;
    }
}
