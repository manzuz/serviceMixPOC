
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductTypeDetails_48265_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="detail" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductTypeDetails48265CCUSPNRDataFeed132
{
    private List<String> detailList = new ArrayList<String>();

    /** 
     * Get the list of 'detail' element items. AIR segment :  - Electronic ticketing indicator    ET for Electronic ticket candidate - Flight Type   D for Domestic   I for International   LH for Long Haul   SH for Short Haul - Codeshare type   M for Marketing Flight   O for Operating Flight
     * 
     * @return list
     */
    public List<String> getDetailList() {
        return detailList;
    }

    /** 
     * Set the list of 'detail' element items. AIR segment :  - Electronic ticketing indicator    ET for Electronic ticket candidate - Flight Type   D for Domestic   I for International   LH for Long Haul   SH for Short Haul - Codeshare type   M for Marketing Flight   O for Operating Flight
     * 
     * @param list
     */
    public void setDetailList(List<String> list) {
        detailList = list;
    }
}
