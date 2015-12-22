
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment is designed to convey date/time in a structured way.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredDateTimeInformation_32362_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="businessSemantic" minOccurs="0"/>
 *     &lt;xs:element type="StructuredDateTimeInformation_56472_C_CUS_PNRDataFeed_132" name="dateTime"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredDateTimeInformation32362SCUSPNRDataFeed132
{
    private String businessSemantic;
    private StructuredDateTimeInformation56472CCUSPNRDataFeed132 dateTime;

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
     * Get the 'dateTime' element value. Departure or arrival date and time.
     * 
     * @return value
     */
    public StructuredDateTimeInformation56472CCUSPNRDataFeed132 getDateTime() {
        return dateTime;
    }

    /** 
     * Set the 'dateTime' element value. Departure or arrival date and time.
     * 
     * @param dateTime
     */
    public void setDateTime(
            StructuredDateTimeInformation56472CCUSPNRDataFeed132 dateTime) {
        this.dateTime = dateTime;
    }
}
