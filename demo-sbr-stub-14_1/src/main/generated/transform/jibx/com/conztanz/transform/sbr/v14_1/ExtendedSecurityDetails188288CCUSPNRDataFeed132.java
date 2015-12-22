
package com.conztanz.transform.sbr.v14_1;

/** 
 * This composite contains details on agreement and access mode between two entities
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ExtendedSecurityDetails_188288_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="typeOfEntity" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="accessMode"/>
 *     &lt;xs:element type="xs:string" name="inhouseIdentification"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ExtendedSecurityDetails188288CCUSPNRDataFeed132
{
    private String typeOfEntity;
    private String accessMode;
    private String inhouseIdentification;

    /** 
     * Get the 'typeOfEntity' element value. Used to specify which kind of entities is specified. F - for family
     * 
     * @return value
     */
    public String getTypeOfEntity() {
        return typeOfEntity;
    }

    /** 
     * Set the 'typeOfEntity' element value. Used to specify which kind of entities is specified. F - for family
     * 
     * @param typeOfEntity
     */
    public void setTypeOfEntity(String typeOfEntity) {
        this.typeOfEntity = typeOfEntity;
    }

    /** 
     * Get the 'accessMode' element value. Used to specify the access mode regarding agreement and entities
     * 
     * @return value
     */
    public String getAccessMode() {
        return accessMode;
    }

    /** 
     * Set the 'accessMode' element value. Used to specify the access mode regarding agreement and entities
     * 
     * @param accessMode
     */
    public void setAccessMode(String accessMode) {
        this.accessMode = accessMode;
    }

    /** 
     * Get the 'inhouseIdentification' element value. Used to specify entity on which the detailed security applied. Mask is specified useing *, for instance, corporate 1A0 is specified as follows : ***1A0***.
     * 
     * @return value
     */
    public String getInhouseIdentification() {
        return inhouseIdentification;
    }

    /** 
     * Set the 'inhouseIdentification' element value. Used to specify entity on which the detailed security applied. Mask is specified useing *, for instance, corporate 1A0 is specified as follows : ***1A0***.
     * 
     * @param inhouseIdentification
     */
    public void setInhouseIdentification(String inhouseIdentification) {
        this.inhouseIdentification = inhouseIdentification;
    }
}
