
package com.conztanz.transform.sbr.v14_1;

/** 
 * To provide free form or coded long text information
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="LongFreeText_128687_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="FreeTextQualification_187488_C_CUS_PNRDataFeed_132" name="freetextDetail" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="longFreetext" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class LongFreeText128687SCUSPNRDataFeed132
{
    private FreeTextQualification187488CCUSPNRDataFeed132 freetextDetail;
    private String longFreetext;

    /** 
     * Get the 'freetextDetail' element value. To specify the type of freetext
     * 
     * @return value
     */
    public FreeTextQualification187488CCUSPNRDataFeed132 getFreetextDetail() {
        return freetextDetail;
    }

    /** 
     * Set the 'freetextDetail' element value. To specify the type of freetext
     * 
     * @param freetextDetail
     */
    public void setFreetextDetail(
            FreeTextQualification187488CCUSPNRDataFeed132 freetextDetail) {
        this.freetextDetail = freetextDetail;
    }

    /** 
     * Get the 'longFreetext' element value. Long free text information.
     * 
     * @return value
     */
    public String getLongFreetext() {
        return longFreetext;
    }

    /** 
     * Set the 'longFreetext' element value. Long free text information.
     * 
     * @param longFreetext
     */
    public void setLongFreetext(String longFreetext) {
        this.longFreetext = longFreetext;
    }
}
