
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide details of action required or taken, the flights to which this action refers, and reasons for action taken.
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ActionIdentification_29391_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="actionRequestCode"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ActionIdentification29391SCUSPNRDataFeed132
{
    private String actionRequestCode;

    /** 
     * Get the 'actionRequestCode' element value. - 0 for No, there are no dead items - 1 for Yes, there are dead items
     * 
     * @return value
     */
    public String getActionRequestCode() {
        return actionRequestCode;
    }

    /** 
     * Set the 'actionRequestCode' element value. - 0 for No, there are no dead items - 1 for Yes, there are dead items
     * 
     * @param actionRequestCode
     */
    public void setActionRequestCode(String actionRequestCode) {
        this.actionRequestCode = actionRequestCode;
    }
}
