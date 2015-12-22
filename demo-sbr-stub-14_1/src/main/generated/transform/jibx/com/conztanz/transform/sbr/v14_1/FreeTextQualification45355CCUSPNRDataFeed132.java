
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextQualification_45355_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="subjectQualifier"/>
 *     &lt;xs:element type="xs:string" name="type" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="status" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="companyId" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextQualification45355CCUSPNRDataFeed132
{
    private String subjectQualifier;
    private String type;
    private String status;
    private String companyId;

    /** 
     * Get the 'subjectQualifier' element value. Identifies whether the free text is coded or not coded :  3 for Literal text
     * 
     * @return value
     */
    public String getSubjectQualifier() {
        return subjectQualifier;
    }

    /** 
     * Set the 'subjectQualifier' element value. Identifies whether the free text is coded or not coded :  3 for Literal text
     * 
     * @param subjectQualifier
     */
    public void setSubjectQualifier(String subjectQualifier) {
        this.subjectQualifier = subjectQualifier;
    }

    /** 
     * Get the 'type' element value. Information type, coded. see code list
     * 
     * @return value
     */
    public String getType() {
        return type;
    }

    /** 
     * Set the 'type' element value. Information type, coded. see code list
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /** 
     * Get the 'status' element value. Transmittable/non-transmittable indicator (S or X).
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. Transmittable/non-transmittable indicator (S or X).
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'companyId' element value. Airline or system code.
     * 
     * @return value
     */
    public String getCompanyId() {
        return companyId;
    }

    /** 
     * Set the 'companyId' element value. Airline or system code.
     * 
     * @param companyId
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
