
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * To specify special requests or service s information relating to a traveller
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SpecialRequirementsDetails_122100_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="SpecialRequirementsTypeDetails_178674_C_CUS_PNRDataFeed_132" name="specialRequirementsInfo" minOccurs="0"/>
 *     &lt;xs:element type="SpecialRequirementsDataDetails_178673_C_CUS_PNRDataFeed_132" name="seatDetails" minOccurs="0" maxOccurs="999"/>
 *     &lt;xs:element type="QuotaRelatedInformation_178675_C_CUS_PNRDataFeed_132" name="quotaInfo" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SpecialRequirementsDetails122100SCUSPNRDataFeed132
{
    private SpecialRequirementsTypeDetails178674CCUSPNRDataFeed132 specialRequirementsInfo;
    private List<SpecialRequirementsDataDetails178673CCUSPNRDataFeed132> seatDetailList = new ArrayList<SpecialRequirementsDataDetails178673CCUSPNRDataFeed132>();
    private QuotaRelatedInformation178675CCUSPNRDataFeed132 quotaInfo;

    /** 
     * Get the 'specialRequirementsInfo' element value. To specify the Service Requirement of the customer.
     * 
     * @return value
     */
    public SpecialRequirementsTypeDetails178674CCUSPNRDataFeed132 getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /** 
     * Set the 'specialRequirementsInfo' element value. To specify the Service Requirement of the customer.
     * 
     * @param specialRequirementsInfo
     */
    public void setSpecialRequirementsInfo(
            SpecialRequirementsTypeDetails178674CCUSPNRDataFeed132 specialRequirementsInfo) {
        this.specialRequirementsInfo = specialRequirementsInfo;
    }

    /** 
     * Get the list of 'seatDetails' element items. To specify the Seat Number.
     * 
     * @return list
     */
    public List<SpecialRequirementsDataDetails178673CCUSPNRDataFeed132> getSeatDetailList() {
        return seatDetailList;
    }

    /** 
     * Set the list of 'seatDetails' element items. To specify the Seat Number.
     * 
     * @param list
     */
    public void setSeatDetailList(
            List<SpecialRequirementsDataDetails178673CCUSPNRDataFeed132> list) {
        seatDetailList = list;
    }

    /** 
     * Get the 'quotaInfo' element value. This composite enables user to convey quota-related information.
     * 
     * @return value
     */
    public QuotaRelatedInformation178675CCUSPNRDataFeed132 getQuotaInfo() {
        return quotaInfo;
    }

    /** 
     * Set the 'quotaInfo' element value. This composite enables user to convey quota-related information.
     * 
     * @param quotaInfo
     */
    public void setQuotaInfo(
            QuotaRelatedInformation178675CCUSPNRDataFeed132 quotaInfo) {
        this.quotaInfo = quotaInfo;
    }
}
