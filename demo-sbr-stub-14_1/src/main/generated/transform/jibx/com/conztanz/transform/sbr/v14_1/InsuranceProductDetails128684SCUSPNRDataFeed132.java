
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Product Details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="InsuranceProductDetails_128684_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="Tariffcode_187458_C_CUS_PNRDataFeed_132" name="tariffCodeDetails" minOccurs="0" maxOccurs="48"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class InsuranceProductDetails128684SCUSPNRDataFeed132
{
    private List<Tariffcode187458CCUSPNRDataFeed132> tariffCodeDetailList = new ArrayList<Tariffcode187458CCUSPNRDataFeed132>();

    /** 
     * Get the list of 'tariffCodeDetails' element items. tariff code info. tariff code and tariff familly code.
     * 
     * @return list
     */
    public List<Tariffcode187458CCUSPNRDataFeed132> getTariffCodeDetailList() {
        return tariffCodeDetailList;
    }

    /** 
     * Set the list of 'tariffCodeDetails' element items. tariff code info. tariff code and tariff familly code.
     * 
     * @param list
     */
    public void setTariffCodeDetailList(
            List<Tariffcode187458CCUSPNRDataFeed132> list) {
        tariffCodeDetailList = list;
    }
}
