
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="StructuredBookingRecordImageType_offerGroup_codeSharePartnerInfo_191450_G_CUS_PNRDataFeed_1323">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravelProductInformation_25889_S_CUS_PNRDataFeed_132" name="codeSharePartner"/>
 *     &lt;xs:element type="CodeShareDetails_33014_S_CUS_PNRDataFeed_132" name="codeShareDetails" minOccurs="0"/>
 *     &lt;xs:element type="InventoryData_60369_G_CUS_PNRDataFeed_132" name="codeSharePartnerInventoryData" minOccurs="0"/>
 *     &lt;xs:element type="OndGroup_181045_G_CUS_PNRDataFeed_132" name="codeSharePartnerYieldData" minOccurs="0"/>
 *     &lt;xs:element type="RevenueManagementData_33010_S_CUS_PNRDataFeed_132" name="codeSharePartnerOverbookingData" minOccurs="0"/>
 *     &lt;xs:element type="StatusDetails_52346_S_CUS_PNRDataFeed_132" name="codeShareCtdReplacementFlags" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class StructuredBookingRecordImageTypeOfferGroupCodeSharePartnerInfo191450GCUSPNRDataFeed1323
{
    private TravelProductInformation25889SCUSPNRDataFeed132 codeSharePartner;
    private CodeShareDetails33014SCUSPNRDataFeed132 codeShareDetails;
    private InventoryData60369GCUSPNRDataFeed132 codeSharePartnerInventoryData;
    private OndGroup181045GCUSPNRDataFeed132 codeSharePartnerYieldData;
    private RevenueManagementData33010SCUSPNRDataFeed132 codeSharePartnerOverbookingData;
    private StatusDetails52346SCUSPNRDataFeed132 codeShareCtdReplacementFlags;

    /** 
     * Get the 'codeSharePartner' element value. Flight information of the code share partner.
     * 
     * @return value
     */
    public TravelProductInformation25889SCUSPNRDataFeed132 getCodeSharePartner() {
        return codeSharePartner;
    }

    /** 
     * Set the 'codeSharePartner' element value. Flight information of the code share partner.
     * 
     * @param codeSharePartner
     */
    public void setCodeSharePartner(
            TravelProductInformation25889SCUSPNRDataFeed132 codeSharePartner) {
        this.codeSharePartner = codeSharePartner;
    }

    /** 
     * Get the 'codeShareDetails' element value. Code share agreement and code share role.
     * 
     * @return value
     */
    public CodeShareDetails33014SCUSPNRDataFeed132 getCodeShareDetails() {
        return codeShareDetails;
    }

    /** 
     * Set the 'codeShareDetails' element value. Code share agreement and code share role.
     * 
     * @param codeShareDetails
     */
    public void setCodeShareDetails(
            CodeShareDetails33014SCUSPNRDataFeed132 codeShareDetails) {
        this.codeShareDetails = codeShareDetails;
    }

    /** 
     * Get the 'codeSharePartnerInventoryData' element value. - Cabin Code - Sub Class number - POS (Country Code/System Code)
     * 
     * @return value
     */
    public InventoryData60369GCUSPNRDataFeed132 getCodeSharePartnerInventoryData() {
        return codeSharePartnerInventoryData;
    }

    /** 
     * Set the 'codeSharePartnerInventoryData' element value. - Cabin Code - Sub Class number - POS (Country Code/System Code)
     * 
     * @param codeSharePartnerInventoryData
     */
    public void setCodeSharePartnerInventoryData(
            InventoryData60369GCUSPNRDataFeed132 codeSharePartnerInventoryData) {
        this.codeSharePartnerInventoryData = codeSharePartnerInventoryData;
    }

    /** 
     * Get the 'codeSharePartnerYieldData' element value. contains yield information for the code share partner
     * 
     * @return value
     */
    public OndGroup181045GCUSPNRDataFeed132 getCodeSharePartnerYieldData() {
        return codeSharePartnerYieldData;
    }

    /** 
     * Set the 'codeSharePartnerYieldData' element value. contains yield information for the code share partner
     * 
     * @param codeSharePartnerYieldData
     */
    public void setCodeSharePartnerYieldData(
            OndGroup181045GCUSPNRDataFeed132 codeSharePartnerYieldData) {
        this.codeSharePartnerYieldData = codeSharePartnerYieldData;
    }

    /** 
     * Get the 'codeSharePartnerOverbookingData' element value. - Overbooking or Oversale - + reason
     * 
     * @return value
     */
    public RevenueManagementData33010SCUSPNRDataFeed132 getCodeSharePartnerOverbookingData() {
        return codeSharePartnerOverbookingData;
    }

    /** 
     * Set the 'codeSharePartnerOverbookingData' element value. - Overbooking or Oversale - + reason
     * 
     * @param codeSharePartnerOverbookingData
     */
    public void setCodeSharePartnerOverbookingData(
            RevenueManagementData33010SCUSPNRDataFeed132 codeSharePartnerOverbookingData) {
        this.codeSharePartnerOverbookingData = codeSharePartnerOverbookingData;
    }

    /** 
     * Get the 'codeShareCtdReplacementFlags' element value. contains CTD indicator of the Codeshare partner segment -Cascading indicator (Y/N)
     * 
     * @return value
     */
    public StatusDetails52346SCUSPNRDataFeed132 getCodeShareCtdReplacementFlags() {
        return codeShareCtdReplacementFlags;
    }

    /** 
     * Set the 'codeShareCtdReplacementFlags' element value. contains CTD indicator of the Codeshare partner segment -Cascading indicator (Y/N)
     * 
     * @param codeShareCtdReplacementFlags
     */
    public void setCodeShareCtdReplacementFlags(
            StatusDetails52346SCUSPNRDataFeed132 codeShareCtdReplacementFlags) {
        this.codeShareCtdReplacementFlags = codeShareCtdReplacementFlags;
    }
}
