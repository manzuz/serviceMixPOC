
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ActivityReport_107223_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ItemReferencesAndVersions_29382_S_CUS_PNRDataFeed_132" name="activityId"/>
 *     &lt;xs:element type="ActionIdentification_29381_S_CUS_PNRDataFeed_132" name="action" minOccurs="0"/>
 *     &lt;xs:element type="ElementManagementSegment_29383_S_CUS_PNRDataFeed_132" name="activityReference" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ActivityReport107223GCUSPNRDataFeed132
{
    private ItemReferencesAndVersions29382SCUSPNRDataFeed132 activityId;
    private ActionIdentification29381SCUSPNRDataFeed132 action;
    private ElementManagementSegment29383SCUSPNRDataFeed132 activityReference;

    /** 
     * Get the 'activityId' element value. Unique ID of this action. PUP --) Process update EUP --) Element update
     * 
     * @return value
     */
    public ItemReferencesAndVersions29382SCUSPNRDataFeed132 getActivityId() {
        return activityId;
    }

    /** 
     * Set the 'activityId' element value. Unique ID of this action. PUP --) Process update EUP --) Element update
     * 
     * @param activityId
     */
    public void setActivityId(
            ItemReferencesAndVersions29382SCUSPNRDataFeed132 activityId) {
        this.activityId = activityId;
    }

    /** 
     * Get the 'action' element value. Action done on the element referenced by the EMS
     * 
     * @return value
     */
    public ActionIdentification29381SCUSPNRDataFeed132 getAction() {
        return action;
    }

    /** 
     * Set the 'action' element value. Action done on the element referenced by the EMS
     * 
     * @param action
     */
    public void setAction(ActionIdentification29381SCUSPNRDataFeed132 action) {
        this.action = action;
    }

    /** 
     * Get the 'activityReference' element value. Element on which there is an activity.
     * 
     * @return value
     */
    public ElementManagementSegment29383SCUSPNRDataFeed132 getActivityReference() {
        return activityReference;
    }

    /** 
     * Set the 'activityReference' element value. Element on which there is an activity.
     * 
     * @param activityReference
     */
    public void setActivityReference(
            ElementManagementSegment29383SCUSPNRDataFeed132 activityReference) {
        this.activityReference = activityReference;
    }
}
