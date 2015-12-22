
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ProductIdentificationDetails_2786_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="identification"/>
 *     &lt;xs:element type="xs:string" name="classOfService" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="subtype" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="description" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ProductIdentificationDetails2786CCUSPNRDataFeed132
{
    private String identification;
    private String classOfService;
    private String subtype;
    private String description;

    /** 
     * Get the 'identification' element value. Flight number or OPEN - ARNK, car type, transportation type  (refer to VGTVD transaction), train number, insurance provider
     * 
     * @return value
     */
    public String getIdentification() {
        return identification;
    }

    /** 
     * Set the 'identification' element value. Flight number or OPEN - ARNK, car type, transportation type  (refer to VGTVD transaction), train number, insurance provider
     * 
     * @param identification
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /** 
     * Get the 'classOfService' element value. AIR segment : class of service TRN Amtrack segment : class of service (1 or 2 chars long). TRN SNCF segment : class of service.
     * 
     * @return value
     */
    public String getClassOfService() {
        return classOfService;
    }

    /** 
     * Set the 'classOfService' element value. AIR segment : class of service TRN Amtrack segment : class of service (1 or 2 chars long). TRN SNCF segment : class of service.
     * 
     * @param classOfService
     */
    public void setClassOfService(String classOfService) {
        this.classOfService = classOfService;
    }

    /** 
     * Get the 'subtype' element value. AIR segment : flight number alpha suffix : A, B, C, D, E. SUR segment : departure code : A or D.
     * 
     * @return value
     */
    public String getSubtype() {
        return subtype;
    }

    /** 
     * Set the 'subtype' element value. AIR segment : flight number alpha suffix : A, B, C, D, E. SUR segment : departure code : A or D.
     * 
     * @param subtype
     */
    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /** 
     * Get the 'description' element value. AIR segment :  N for Night class
     * 
     * @return value
     */
    public String getDescription() {
        return description;
    }

    /** 
     * Set the 'description' element value. AIR segment :  N for Night class
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
