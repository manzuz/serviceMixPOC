
package com.conztanz.transform.sbr.v14_1;

/** 
 * Conveys CC authentication data
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="AuthenticationData_142138_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="veres" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="pares" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="creditCardCompany"/>
 *     &lt;xs:element type="xs:string" name="authenticationIndicator" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="caavAlgorithm" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class AuthenticationData142138CCUSPNRDataFeed132
{
    private String veres;
    private String pares;
    private String creditCardCompany;
    private String authenticationIndicator;
    private String caavAlgorithm;

    /** 
     * Get the 'veres' element value. VERes status (enrollment) Values : Y : authentication available N : cardholder not participating U : Unable to authenticate E : error message
     * 
     * @return value
     */
    public String getVeres() {
        return veres;
    }

    /** 
     * Set the 'veres' element value. VERes status (enrollment) Values : Y : authentication available N : cardholder not participating U : Unable to authenticate E : error message
     * 
     * @param veres
     */
    public void setVeres(String veres) {
        this.veres = veres;
    }

    /** 
     * Get the 'pares' element value. PARes status (authentication). Values : Y : authentication successful N : authentication failed U : authentication could not be performed A : attempts processing performed
     * 
     * @return value
     */
    public String getPares() {
        return pares;
    }

    /** 
     * Set the 'pares' element value. PARes status (authentication). Values : Y : authentication successful N : authentication failed U : authentication could not be performed A : attempts processing performed
     * 
     * @param pares
     */
    public void setPares(String pares) {
        this.pares = pares;
    }

    /** 
     * Get the 'creditCardCompany' element value. CC Directory Server performing the enrollment process: VISA, MasterCard
     * 
     * @return value
     */
    public String getCreditCardCompany() {
        return creditCardCompany;
    }

    /** 
     * Set the 'creditCardCompany' element value. CC Directory Server performing the enrollment process: VISA, MasterCard
     * 
     * @param creditCardCompany
     */
    public void setCreditCardCompany(String creditCardCompany) {
        this.creditCardCompany = creditCardCompany;
    }

    /** 
     * Get the 'authenticationIndicator' element value. To indicate whether the transaction was successful, different indicators for Visa/MasterCard. - ECI for VISA - UCAF collection indicator for Matercard
     * 
     * @return value
     */
    public String getAuthenticationIndicator() {
        return authenticationIndicator;
    }

    /** 
     * Set the 'authenticationIndicator' element value. To indicate whether the transaction was successful, different indicators for Visa/MasterCard. - ECI for VISA - UCAF collection indicator for Matercard
     * 
     * @param authenticationIndicator
     */
    public void setAuthenticationIndicator(String authenticationIndicator) {
        this.authenticationIndicator = authenticationIndicator;
    }

    /** 
     * Get the 'caavAlgorithm' element value. Indicates the algorithm used to generate the Cardholder Authentication Verification Value (CAAV = authentication code)
     * 
     * @return value
     */
    public String getCaavAlgorithm() {
        return caavAlgorithm;
    }

    /** 
     * Set the 'caavAlgorithm' element value. Indicates the algorithm used to generate the Cardholder Authentication Verification Value (CAAV = authentication code)
     * 
     * @param caavAlgorithm
     */
    public void setCaavAlgorithm(String caavAlgorithm) {
        this.caavAlgorithm = caavAlgorithm;
    }
}
