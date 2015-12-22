
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FreeTextQualification_187488_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="subjectQualifier"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FreeTextQualification187488CCUSPNRDataFeed132
{
    private String subjectQualifier;

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
}
