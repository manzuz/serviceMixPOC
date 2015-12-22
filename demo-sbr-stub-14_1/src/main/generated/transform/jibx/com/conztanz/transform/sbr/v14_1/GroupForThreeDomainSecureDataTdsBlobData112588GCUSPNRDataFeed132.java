
package com.conztanz.transform.sbr.v14_1;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GroupForThreeDomainSecureData_tdsBlobData_112588_G_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ReferenceInformation_94524_S_CUS_PNRDataFeed_132" name="tdsBlbIdentifier"/>
 *     &lt;xs:element type="BinaryData_94523_S_CUS_PNRDataFeed_132" name="tdsBlbData"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GroupForThreeDomainSecureDataTdsBlobData112588GCUSPNRDataFeed132
{
    private ReferenceInformation94524SCUSPNRDataFeed132 tdsBlbIdentifier;
    private BinaryData94523SCUSPNRDataFeed132 tdsBlbData;

    /** 
     * Get the 'tdsBlbIdentifier' element value. will identify the content of the BLB that follows
     * 
     * @return value
     */
    public ReferenceInformation94524SCUSPNRDataFeed132 getTdsBlbIdentifier() {
        return tdsBlbIdentifier;
    }

    /** 
     * Set the 'tdsBlbIdentifier' element value. will identify the content of the BLB that follows
     * 
     * @param tdsBlbIdentifier
     */
    public void setTdsBlbIdentifier(
            ReferenceInformation94524SCUSPNRDataFeed132 tdsBlbIdentifier) {
        this.tdsBlbIdentifier = tdsBlbIdentifier;
    }

    /** 
     * Get the 'tdsBlbData' element value.
     * 
     * @return value
     */
    public BinaryData94523SCUSPNRDataFeed132 getTdsBlbData() {
        return tdsBlbData;
    }

    /** 
     * Set the 'tdsBlbData' element value.
     * 
     * @param tdsBlbData
     */
    public void setTdsBlbData(BinaryData94523SCUSPNRDataFeed132 tdsBlbData) {
        this.tdsBlbData = tdsBlbData;
    }
}
