
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CompanyIdentification_62871_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="identification"/>
 *     &lt;xs:element type="xs:string" name="secondIdentification" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="sourceCode" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CompanyIdentification62871CCUSPNRDataFeed132
{
    private String identification;
    private String secondIdentification;
    private String sourceCode;

    /** 
     * Get the 'identification' element value. Company code
     * 
     * @return value
     */
    public String getIdentification() {
        return identification;
    }

    /** 
     * Set the 'identification' element value. Company code
     * 
     * @param identification
     */
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    /** 
     * Get the 'secondIdentification' element value. AIR segment : second airline code for joint flight number. Train Amtrack segment : system provider UIC code. Train SNCF segment : system provider UIC code. Tour segment : tour provider code.
     * 
     * @return value
     */
    public String getSecondIdentification() {
        return secondIdentification;
    }

    /** 
     * Set the 'secondIdentification' element value. AIR segment : second airline code for joint flight number. Train Amtrack segment : system provider UIC code. Train SNCF segment : system provider UIC code. Tour segment : tour provider code.
     * 
     * @param secondIdentification
     */
    public void setSecondIdentification(String secondIdentification) {
        this.secondIdentification = secondIdentification;
    }

    /** 
     * Get the 'sourceCode' element value. Tour segment : source code.
     * 
     * @return value
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /** 
     * Set the 'sourceCode' element value. Tour segment : source code.
     * 
     * @param sourceCode
     */
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }
}
