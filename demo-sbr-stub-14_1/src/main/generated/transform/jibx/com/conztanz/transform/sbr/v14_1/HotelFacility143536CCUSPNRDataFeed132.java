
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * HOTEL FACILITY
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="HotelFacility_143536_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="facilityCode" minOccurs="0" maxOccurs="7"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class HotelFacility143536CCUSPNRDataFeed132
{
    private List<String> facilityCodeList = new ArrayList<String>();

    /** 
     * Get the list of 'facilityCode' element items. Hotel Facility code(s) (/FF- option)
     * 
     * @return list
     */
    public List<String> getFacilityCodeList() {
        return facilityCodeList;
    }

    /** 
     * Set the list of 'facilityCode' element items. Hotel Facility code(s) (/FF- option)
     * 
     * @param list
     */
    public void setFacilityCodeList(List<String> list) {
        facilityCodeList = list;
    }
}
