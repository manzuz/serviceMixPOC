
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify miscellaneous data by first identifying the type of data to be sent and then the actual data.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificDataInformation_76528_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DataTypeInformation_118474_C_CUS_PNRDataFeed_132" name="dataTypeInformation"/>
 *     &lt;xs:element type="DataInformation_118475_C_CUS_PNRDataFeed_132" name="dataInformation"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificDataInformation76528SCUSPNRDataFeed132
{
    private DataTypeInformation118474CCUSPNRDataFeed132 dataTypeInformation;
    private DataInformation118475CCUSPNRDataFeed132 dataInformation;

    /** 
     * Get the 'dataTypeInformation' element value. Contains the type, i.e. APP approval code.
     * 
     * @return value
     */
    public DataTypeInformation118474CCUSPNRDataFeed132 getDataTypeInformation() {
        return dataTypeInformation;
    }

    /** 
     * Set the 'dataTypeInformation' element value. Contains the type, i.e. APP approval code.
     * 
     * @param dataTypeInformation
     */
    public void setDataTypeInformation(
            DataTypeInformation118474CCUSPNRDataFeed132 dataTypeInformation) {
        this.dataTypeInformation = dataTypeInformation;
    }

    /** 
     * Get the 'dataInformation' element value. Contain this actual code.
     * 
     * @return value
     */
    public DataInformation118475CCUSPNRDataFeed132 getDataInformation() {
        return dataInformation;
    }

    /** 
     * Set the 'dataInformation' element value. Contain this actual code.
     * 
     * @param dataInformation
     */
    public void setDataInformation(
            DataInformation118475CCUSPNRDataFeed132 dataInformation) {
        this.dataInformation = dataInformation;
    }
}
