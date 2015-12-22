
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="SecurityInformation_2762_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="creationDate"/>
 *     &lt;xs:element type="xs:string" name="agentCode"/>
 *     &lt;xs:element type="xs:string" name="officeId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class SecurityInformation2762CCUSPNRDataFeed132
{
    private String creationDate;
    private String agentCode;
    private String officeId;

    /** 
     * Get the 'creationDate' element value. Date of creation
     * 
     * @return value
     */
    public String getCreationDate() {
        return creationDate;
    }

    /** 
     * Set the 'creationDate' element value. Date of creation
     * 
     * @param creationDate
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /** 
     * Get the 'agentCode' element value. Agent initials and duty code as in Originator informations  (eg: AASU)
     * 
     * @return value
     */
    public String getAgentCode() {
        return agentCode;
    }

    /** 
     * Set the 'agentCode' element value. Agent initials and duty code as in Originator informations  (eg: AASU)
     * 
     * @param agentCode
     */
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    /** 
     * Get the 'officeId' element value. Office Id of creation/update
     * 
     * @return value
     */
    public String getOfficeId() {
        return officeId;
    }

    /** 
     * Set the 'officeId' element value. Office Id of creation/update
     * 
     * @param officeId
     */
    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }
}
