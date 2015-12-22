
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * to carry binary data within an Edifact segment
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="BinaryData_94523_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:decimal" name="dataLength"/>
 *     &lt;xs:element type="xs:string" name="dataType" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="binaryData"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class BinaryData94523SCUSPNRDataFeed132
{
    private BigDecimal dataLength;
    private String dataType;
    private String binaryData;

    /** 
     * Get the 'dataLength' element value. Length of the BLB
     * 
     * @return value
     */
    public BigDecimal getDataLength() {
        return dataLength;
    }

    /** 
     * Set the 'dataLength' element value. Length of the BLB
     * 
     * @param dataLength
     */
    public void setDataLength(BigDecimal dataLength) {
        this.dataLength = dataLength;
    }

    /** 
     * Get the 'dataType' element value. type of the data
     * 
     * @return value
     */
    public String getDataType() {
        return dataType;
    }

    /** 
     * Set the 'dataType' element value. type of the data
     * 
     * @param dataType
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /** 
     * Get the 'binaryData' element value. used to store binary data
     * 
     * @return value
     */
    public String getBinaryData() {
        return binaryData;
    }

    /** 
     * Set the 'binaryData' element value. used to store binary data
     * 
     * @param binaryData
     */
    public void setBinaryData(String binaryData) {
        this.binaryData = binaryData;
    }
}
