
package com.conztanz.transform.sbr.v14_1;

/** 
 * will convey the FOP table data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="PnrSupplementaryData_112604_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Attribute_94576_S_CUS_PNRDataFeed_132" name="dataAndSwitchMap"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class PnrSupplementaryData112604GCUSPNRDataFeed132
{
    private Attribute94576SCUSPNRDataFeed132 dataAndSwitchMap;

    /** 
     * Get the 'dataAndSwitchMap' element value. will convey the values of the FOP data and switch maps
     * 
     * @return value
     */
    public Attribute94576SCUSPNRDataFeed132 getDataAndSwitchMap() {
        return dataAndSwitchMap;
    }

    /** 
     * Set the 'dataAndSwitchMap' element value. will convey the values of the FOP data and switch maps
     * 
     * @param dataAndSwitchMap
     */
    public void setDataAndSwitchMap(
            Attribute94576SCUSPNRDataFeed132 dataAndSwitchMap) {
        this.dataAndSwitchMap = dataAndSwitchMap;
    }
}
