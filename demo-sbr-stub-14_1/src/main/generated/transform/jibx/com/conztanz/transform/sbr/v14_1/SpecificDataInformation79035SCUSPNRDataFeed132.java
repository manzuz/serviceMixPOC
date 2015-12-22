
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify miscellaneous data by first identifying the type of data to be sent and then the actual data.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecificDataInformation_79035_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="DataTypeInformation_121391_C_CUS_PNRDataFeed_132" name="dataTypeInformation"/>
 *     &lt;xs:element type="DataInformation_121392_C_CUS_PNRDataFeed_132" name="dataInformation" minOccurs="0" maxOccurs="10"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecificDataInformation79035SCUSPNRDataFeed132
{
    private DataTypeInformation121391CCUSPNRDataFeed132 dataTypeInformation;
    private List<DataInformation121392CCUSPNRDataFeed132> dataInformationList = new ArrayList<DataInformation121392CCUSPNRDataFeed132>();

    /** 
     * Get the 'dataTypeInformation' element value.
     * 
     * @return value
     */
    public DataTypeInformation121391CCUSPNRDataFeed132 getDataTypeInformation() {
        return dataTypeInformation;
    }

    /** 
     * Set the 'dataTypeInformation' element value.
     * 
     * @param dataTypeInformation
     */
    public void setDataTypeInformation(
            DataTypeInformation121391CCUSPNRDataFeed132 dataTypeInformation) {
        this.dataTypeInformation = dataTypeInformation;
    }

    /** 
     * Get the list of 'dataInformation' element items.
     * 
     * @return list
     */
    public List<DataInformation121392CCUSPNRDataFeed132> getDataInformationList() {
        return dataInformationList;
    }

    /** 
     * Set the list of 'dataInformation' element items.
     * 
     * @param list
     */
    public void setDataInformationList(
            List<DataInformation121392CCUSPNRDataFeed132> list) {
        dataInformationList = list;
    }
}
