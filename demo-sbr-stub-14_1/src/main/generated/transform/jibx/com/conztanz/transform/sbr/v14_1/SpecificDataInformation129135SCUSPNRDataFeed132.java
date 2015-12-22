
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify miscellaneous data by first identifying the type of data to be sent and then the actual data.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificDataInformation_129135_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DataTypeInformation_188172_C_CUS_PNRDataFeed_132" name="dataTypeInformation"/>
 *     &lt;xs:element type="DataInformation_188173_C_CUS_PNRDataFeed_132" name="dataInformation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificDataInformation129135SCUSPNRDataFeed132
{
    private DataTypeInformation188172CCUSPNRDataFeed132 dataTypeInformation;
    private DataInformation188173CCUSPNRDataFeed132 dataInformation;

    /** 
     * Get the 'dataTypeInformation' element value.
     * 
     * @return value
     */
    public DataTypeInformation188172CCUSPNRDataFeed132 getDataTypeInformation() {
        return dataTypeInformation;
    }

    /** 
     * Set the 'dataTypeInformation' element value.
     * 
     * @param dataTypeInformation
     */
    public void setDataTypeInformation(
            DataTypeInformation188172CCUSPNRDataFeed132 dataTypeInformation) {
        this.dataTypeInformation = dataTypeInformation;
    }

    /** 
     * Get the 'dataInformation' element value.
     * 
     * @return value
     */
    public DataInformation188173CCUSPNRDataFeed132 getDataInformation() {
        return dataInformation;
    }

    /** 
     * Set the 'dataInformation' element value.
     * 
     * @param dataInformation
     */
    public void setDataInformation(
            DataInformation188173CCUSPNRDataFeed132 dataInformation) {
        this.dataInformation = dataInformation;
    }
}
