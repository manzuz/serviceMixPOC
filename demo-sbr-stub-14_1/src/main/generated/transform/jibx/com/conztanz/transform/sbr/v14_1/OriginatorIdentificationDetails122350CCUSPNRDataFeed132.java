
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_122350_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="originatorId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification1" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="inHouseIdentification2" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails122350CCUSPNRDataFeed132
{
    private String originatorId;
    private String inHouseIdentification1;
    private String inHouseIdentification2;

    /** 
     * Get the 'originatorId' element value. Contains the sign-in details of the agent that created the booking: - numeric sign: 4 digits - agent initials: 2 chars - duty ode: 2 chars Ex: 0001AASU
     * 
     * @return value
     */
    public String getOriginatorId() {
        return originatorId;
    }

    /** 
     * Set the 'originatorId' element value. Contains the sign-in details of the agent that created the booking: - numeric sign: 4 digits - agent initials: 2 chars - duty ode: 2 chars Ex: 0001AASU
     * 
     * @param originatorId
     */
    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
    }

    /** 
     * Get the 'inHouseIdentification1' element value. Office ID creator of the segment
     * 
     * @return value
     */
    public String getInHouseIdentification1() {
        return inHouseIdentification1;
    }

    /** 
     * Set the 'inHouseIdentification1' element value. Office ID creator of the segment
     * 
     * @param inHouseIdentification1
     */
    public void setInHouseIdentification1(String inHouseIdentification1) {
        this.inHouseIdentification1 = inHouseIdentification1;
    }

    /** 
     * Get the 'inHouseIdentification2' element value. Office Responsible of PNR at Segment Creation Time
     * 
     * @return value
     */
    public String getInHouseIdentification2() {
        return inHouseIdentification2;
    }

    /** 
     * Set the 'inHouseIdentification2' element value. Office Responsible of PNR at Segment Creation Time
     * 
     * @param inHouseIdentification2
     */
    public void setInHouseIdentification2(String inHouseIdentification2) {
        this.inHouseIdentification2 = inHouseIdentification2;
    }
}
