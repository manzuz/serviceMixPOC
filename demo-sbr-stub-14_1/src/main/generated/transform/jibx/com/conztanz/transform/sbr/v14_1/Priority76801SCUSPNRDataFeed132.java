
package com.conztanz.transform.sbr.v14_1;

/** 
 * The segment is used to communicate priority and ranking information.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Priority_76801_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="priorityQualifier"/>
 *     &lt;xs:element type="PriorityDetails_118780_C_CUS_PNRDataFeed_132" name="priorityDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Priority76801SCUSPNRDataFeed132
{
    private String priorityQualifier;
    private PriorityDetails118780CCUSPNRDataFeed132 priorityDetails;

    /** 
     * Get the 'priorityQualifier' element value. Concession priority qualifier
     * 
     * @return value
     */
    public String getPriorityQualifier() {
        return priorityQualifier;
    }

    /** 
     * Set the 'priorityQualifier' element value. Concession priority qualifier
     * 
     * @param priorityQualifier
     */
    public void setPriorityQualifier(String priorityQualifier) {
        this.priorityQualifier = priorityQualifier;
    }

    /** 
     * Get the 'priorityDetails' element value. To convey details of the priority
     * 
     * @return value
     */
    public PriorityDetails118780CCUSPNRDataFeed132 getPriorityDetails() {
        return priorityDetails;
    }

    /** 
     * Set the 'priorityDetails' element value. To convey details of the priority
     * 
     * @param priorityDetails
     */
    public void setPriorityDetails(
            PriorityDetails118780CCUSPNRDataFeed132 priorityDetails) {
        this.priorityDetails = priorityDetails;
    }
}
