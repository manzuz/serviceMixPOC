
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="TicketInformation_70610_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="queueingOfficeId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="location" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class TicketInformation70610CCUSPNRDataFeed132
{
    private String queueingOfficeId;
    private String location;

    /** 
     * Get the 'queueingOfficeId' element value. 1. PNR Header: Amadeus Queuing Office Id
     * 
     * @return value
     */
    public String getQueueingOfficeId() {
        return queueingOfficeId;
    }

    /** 
     * Set the 'queueingOfficeId' element value. 1. PNR Header: Amadeus Queuing Office Id
     * 
     * @param queueingOfficeId
     */
    public void setQueueingOfficeId(String queueingOfficeId) {
        this.queueingOfficeId = queueingOfficeId;
    }

    /** 
     * Get the 'location' element value. 1. PNR Header: OA city code of  OA record locator information
     * 
     * @return value
     */
    public String getLocation() {
        return location;
    }

    /** 
     * Set the 'location' element value. 1. PNR Header: OA city code of  OA record locator information
     * 
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
