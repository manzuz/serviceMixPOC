
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey informations regarding service charge
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ServiceChargeInformation_70496_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ServiceChargeDetails_109777_C_CUS_PNRDataFeed_132" name="serviceChargeDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ServiceChargeInformation70496SCUSPNRDataFeed132
{
    private ServiceChargeDetails109777CCUSPNRDataFeed132 serviceChargeDetails;

    /** 
     * Get the 'serviceChargeDetails' element value. Service charge details
     * 
     * @return value
     */
    public ServiceChargeDetails109777CCUSPNRDataFeed132 getServiceChargeDetails() {
        return serviceChargeDetails;
    }

    /** 
     * Set the 'serviceChargeDetails' element value. Service charge details
     * 
     * @param serviceChargeDetails
     */
    public void setServiceChargeDetails(
            ServiceChargeDetails109777CCUSPNRDataFeed132 serviceChargeDetails) {
        this.serviceChargeDetails = serviceChargeDetails;
    }
}
