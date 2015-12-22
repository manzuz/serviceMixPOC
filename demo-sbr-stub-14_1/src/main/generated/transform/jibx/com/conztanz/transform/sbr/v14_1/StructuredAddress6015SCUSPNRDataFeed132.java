
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify the way data are mapped for structured AB, AM, AMH, AMD or AMM.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredAddress_6015_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="informationType" minOccurs="0"/>
 *     &lt;xs:element type="StructuredAddressInformation_10088_C_CUS_PNRDataFeed_132" name="address" minOccurs="0" maxOccurs="9"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredAddress6015SCUSPNRDataFeed132
{
    private String informationType;
    private List<StructuredAddressInformation10088CCUSPNRDataFeed132> addressList = new ArrayList<StructuredAddressInformation10088CCUSPNRDataFeed132>();

    /** 
     * Get the 'informationType' element value. Information type, coded  2  for billing address  P08  for general mailing address  P19  for miscellaneous mailing address  P24  for home mailing address  P25  for delivery mailing address
     * 
     * @return value
     */
    public String getInformationType() {
        return informationType;
    }

    /** 
     * Set the 'informationType' element value. Information type, coded  2  for billing address  P08  for general mailing address  P19  for miscellaneous mailing address  P24  for home mailing address  P25  for delivery mailing address
     * 
     * @param informationType
     */
    public void setInformationType(String informationType) {
        this.informationType = informationType;
    }

    /** 
     * Get the list of 'address' element items. Structured Address
     * 
     * @return list
     */
    public List<StructuredAddressInformation10088CCUSPNRDataFeed132> getAddressList() {
        return addressList;
    }

    /** 
     * Set the list of 'address' element items. Structured Address
     * 
     * @param list
     */
    public void setAddressList(
            List<StructuredAddressInformation10088CCUSPNRDataFeed132> list) {
        addressList = list;
    }
}
