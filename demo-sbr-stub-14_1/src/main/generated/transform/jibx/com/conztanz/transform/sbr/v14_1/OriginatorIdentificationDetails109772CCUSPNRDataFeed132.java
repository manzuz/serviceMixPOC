
package com.conztanz.transform.sbr.v14_1;

/** 
 * To identify the originator of the travel request.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="OriginatorIdentificationDetails_109772_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="officeName" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="agentId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class OriginatorIdentificationDetails109772CCUSPNRDataFeed132
{
    private String officeName;
    private String agentId;

    /** 
     * Get the 'officeName' element value. Office name
     * 
     * @return value
     */
    public String getOfficeName() {
        return officeName;
    }

    /** 
     * Set the 'officeName' element value. Office name
     * 
     * @param officeName
     */
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    /** 
     * Get the 'agentId' element value. Agent Id
     * 
     * @return value
     */
    public String getAgentId() {
        return agentId;
    }

    /** 
     * Set the 'agentId' element value. Agent Id
     * 
     * @param agentId
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }
}
