
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To identify the countries
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Countrydescription_187466_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="geographicalZone" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="countryCode" minOccurs="0" maxOccurs="198"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Countrydescription187466CCUSPNRDataFeed132
{
    private String geographicalZone;
    private List<String> countryCodeList = new ArrayList<String>();

    /** 
     * Get the 'geographicalZone' element value. To specify the destination zone.
     * 
     * @return value
     */
    public String getGeographicalZone() {
        return geographicalZone;
    }

    /** 
     * Set the 'geographicalZone' element value. To specify the destination zone.
     * 
     * @param geographicalZone
     */
    public void setGeographicalZone(String geographicalZone) {
        this.geographicalZone = geographicalZone;
    }

    /** 
     * Get the list of 'countryCode' element items. To specify the countries but in a coded way. up to 198 repetitions as we can have 99 segments in the PNR
     * 
     * @return list
     */
    public List<String> getCountryCodeList() {
        return countryCodeList;
    }

    /** 
     * Set the list of 'countryCode' element items. To specify the countries but in a coded way. up to 198 repetitions as we can have 99 segments in the PNR
     * 
     * @param list
     */
    public void setCountryCodeList(List<String> list) {
        countryCodeList = list;
    }
}
