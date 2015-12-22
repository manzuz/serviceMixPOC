
package com.conztanz.transform.sbr.v14_1;

import java.util.ArrayList;
import java.util.List;

/** 
 * Map TST ATC Data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Atcdata_98381_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="MonetaryInformation_79028_S_CUS_PNRDataFeed_132" name="atcTotalAdditionalCollection"/>
 *     &lt;xs:element type="MonetaryInformation_79028_S_CUS_PNRDataFeed_132" name="otherAtcFares" minOccurs="0" maxOccurs="30"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Atcdata98381GCUSPNRDataFeed132
{
    private MonetaryInformation79028SCUSPNRDataFeed132 atcTotalAdditionalCollection;
    private List<MonetaryInformation79028SCUSPNRDataFeed132> otherAtcFareList = new ArrayList<MonetaryInformation79028SCUSPNRDataFeed132>();

    /** 
     * Get the 'atcTotalAdditionalCollection' element value. ATC Total Additional Collection (TAC)
     * 
     * @return value
     */
    public MonetaryInformation79028SCUSPNRDataFeed132 getAtcTotalAdditionalCollection() {
        return atcTotalAdditionalCollection;
    }

    /** 
     * Set the 'atcTotalAdditionalCollection' element value. ATC Total Additional Collection (TAC)
     * 
     * @param atcTotalAdditionalCollection
     */
    public void setAtcTotalAdditionalCollection(
            MonetaryInformation79028SCUSPNRDataFeed132 atcTotalAdditionalCollection) {
        this.atcTotalAdditionalCollection = atcTotalAdditionalCollection;
    }

    /** 
     * Get the list of 'otherAtcFares' element items. Other ATC Fares:  - Base Fare Balance (BEQ) - New Base Fare (BNF) - Old Base Fare (IBA) - Penalty (DPI) - Grand Total (GT) - Residual Value (RES) - TST Additional Collection (TST) - Tax Balance (BTA) - Ticket Difference (BTO)
     * 
     * @return list
     */
    public List<MonetaryInformation79028SCUSPNRDataFeed132> getOtherAtcFareList() {
        return otherAtcFareList;
    }

    /** 
     * Set the list of 'otherAtcFares' element items. Other ATC Fares:  - Base Fare Balance (BEQ) - New Base Fare (BNF) - Old Base Fare (IBA) - Penalty (DPI) - Grand Total (GT) - Residual Value (RES) - TST Additional Collection (TST) - Tax Balance (BTA) - Ticket Difference (BTO)
     * 
     * @param list
     */
    public void setOtherAtcFareList(
            List<MonetaryInformation79028SCUSPNRDataFeed132> list) {
        otherAtcFareList = list;
    }
}
