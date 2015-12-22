
package com.conztanz.transform.sbr.v14_1;

/** 
 * To specify the Amadeus PNR Original Issue/Issue in Exchange For element
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="FoOriginalIssue_165724_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="IssueInformation_234429_C_CUS_PNRDataFeed_132" name="issue"/>
 *     &lt;xs:element type="xs:string" name="layoutNr" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class FoOriginalIssue165724SCUSPNRDataFeed132
{
    private IssueInformation234429CCUSPNRDataFeed132 issue;
    private String layoutNr;

    /** 
     * Get the 'issue' element value. 1st occurrence for original issue 2 occurrences for issues in exchange
     * 
     * @return value
     */
    public IssueInformation234429CCUSPNRDataFeed132 getIssue() {
        return issue;
    }

    /** 
     * Set the 'issue' element value. 1st occurrence for original issue 2 occurrences for issues in exchange
     * 
     * @param issue
     */
    public void setIssue(IssueInformation234429CCUSPNRDataFeed132 issue) {
        this.issue = issue;
    }

    /** 
     * Get the 'layoutNr' element value. layoutNr
     * 
     * @return value
     */
    public String getLayoutNr() {
        return layoutNr;
    }

    /** 
     * Set the 'layoutNr' element value. layoutNr
     * 
     * @param layoutNr
     */
    public void setLayoutNr(String layoutNr) {
        this.layoutNr = layoutNr;
    }
}
