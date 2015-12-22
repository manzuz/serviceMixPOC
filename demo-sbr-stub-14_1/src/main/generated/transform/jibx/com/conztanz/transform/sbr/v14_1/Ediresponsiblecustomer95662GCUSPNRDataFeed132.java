
package com.conztanz.transform.sbr.v14_1;

/** 
 * EdiResponsibleCustomer
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Ediresponsiblecustomer_95662_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="TravellerInformation_76095_S_CUS_PNRDataFeed_132" name="responsibleCustDetails"/>
 *     &lt;xs:element type="ItemReferencesAndVersions_76083_S_CUS_PNRDataFeed_132" name="uniqueCustomerId"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Ediresponsiblecustomer95662GCUSPNRDataFeed132
{
    private TravellerInformation76095SCUSPNRDataFeed132 responsibleCustDetails;
    private ItemReferencesAndVersions76083SCUSPNRDataFeed132 uniqueCustomerId;

    /** 
     * Get the 'responsibleCustDetails' element value. This is used to specify the name of the responsible customer for this baggage group.
     * 
     * @return value
     */
    public TravellerInformation76095SCUSPNRDataFeed132 getResponsibleCustDetails() {
        return responsibleCustDetails;
    }

    /** 
     * Set the 'responsibleCustDetails' element value. This is used to specify the name of the responsible customer for this baggage group.
     * 
     * @param responsibleCustDetails
     */
    public void setResponsibleCustDetails(
            TravellerInformation76095SCUSPNRDataFeed132 responsibleCustDetails) {
        this.responsibleCustDetails = responsibleCustDetails;
    }

    /** 
     * Get the 'uniqueCustomerId' element value. Unique Customer identifier of the responsible customer. 'referenceQualifier' being set to "UCI"
     * 
     * @return value
     */
    public ItemReferencesAndVersions76083SCUSPNRDataFeed132 getUniqueCustomerId() {
        return uniqueCustomerId;
    }

    /** 
     * Set the 'uniqueCustomerId' element value. Unique Customer identifier of the responsible customer. 'referenceQualifier' being set to "UCI"
     * 
     * @param uniqueCustomerId
     */
    public void setUniqueCustomerId(
            ItemReferencesAndVersions76083SCUSPNRDataFeed132 uniqueCustomerId) {
        this.uniqueCustomerId = uniqueCustomerId;
    }
}
