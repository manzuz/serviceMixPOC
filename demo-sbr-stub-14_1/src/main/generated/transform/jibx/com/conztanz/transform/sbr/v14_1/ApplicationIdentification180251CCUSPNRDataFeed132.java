
package com.conztanz.transform.sbr.v14_1;

/** 
 * Used to specify application details
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ApplicationIdentification_180251_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="internalId" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="versionNumber" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="label" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="isActivated" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ApplicationIdentification180251CCUSPNRDataFeed132
{
    private String internalId;
    private String versionNumber;
    private String label;
    private String description;
    private String isActivated;

    /** 
     * Get the 'internalId' element value. Unique identifier of the item.
     * 
     * @return value
     */
    public String getInternalId() {
        return internalId;
    }

    /** 
     * Set the 'internalId' element value. Unique identifier of the item.
     * 
     * @param internalId
     */
    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    /** 
     * Get the 'versionNumber' element value. Item Version Number
     * 
     * @return value
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /** 
     * Set the 'versionNumber' element value. Item Version Number
     * 
     * @param versionNumber
     */
    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    /** 
     * Get the 'label' element value. valid Application name  otherwise CM#6173 INVALID APPLICATION ID is returned.
     * 
     * @return value
     */
    public String getLabel() {
        return label;
    }

    /** 
     * Set the 'label' element value. valid Application name  otherwise CM#6173 INVALID APPLICATION ID is returned.
     * 
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /** 
     * Get the 'description' element value. Description of the entity
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. Description of the entity
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /** 
     * Get the 'isActivated' element value.
     * 
     * @return value
     */
    public String getIsActivated() {
        return isActivated;
    }

    /** 
     * Set the 'isActivated' element value.
     * 
     * @param isActivated
     */
    public void setIsActivated(String isActivated) {
        this.isActivated = isActivated;
    }
}
