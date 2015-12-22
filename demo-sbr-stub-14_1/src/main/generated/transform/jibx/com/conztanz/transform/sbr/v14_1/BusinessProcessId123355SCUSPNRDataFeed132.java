
package com.conztanz.transform.sbr.v14_1;

/** 
 * To convey a process ID
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BusinessProcessId_123355_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="processIdentifier" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="actionStatus" minOccurs="0"/>
 *     &lt;xs:element type="ApplicationIdentification_180251_C_CUS_PNRDataFeed_132" name="applicationIdentifier" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BusinessProcessId123355SCUSPNRDataFeed132
{
    private String processIdentifier;
    private String actionStatus;
    private ApplicationIdentification180251CCUSPNRDataFeed132 applicationIdentifier;

    /** 
     * Get the 'processIdentifier' element value. A unique reference to identify the process/business
     * 
     * @return value
     */
    public String getProcessIdentifier() {
        return processIdentifier;
    }

    /** 
     * Set the 'processIdentifier' element value. A unique reference to identify the process/business
     * 
     * @param processIdentifier
     */
    public void setProcessIdentifier(String processIdentifier) {
        this.processIdentifier = processIdentifier;
    }

    /** 
     * Get the 'actionStatus' element value. To give information about current transaction status (start, end,..)
     * 
     * @return value
     */
    public String getActionStatus() {
        return actionStatus;
    }

    /** 
     * Set the 'actionStatus' element value. To give information about current transaction status (start, end,..)
     * 
     * @param actionStatus
     */
    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    /** 
     * Get the 'applicationIdentifier' element value. To identify the application
     * 
     * @return value
     */
    public ApplicationIdentification180251CCUSPNRDataFeed132 getApplicationIdentifier() {
        return applicationIdentifier;
    }

    /** 
     * Set the 'applicationIdentifier' element value. To identify the application
     * 
     * @param applicationIdentifier
     */
    public void setApplicationIdentifier(
            ApplicationIdentification180251CCUSPNRDataFeed132 applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }
}
