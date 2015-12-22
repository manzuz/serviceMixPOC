
package com.conztanz.transform.sbr.v14_1;

import java.math.BigDecimal;

/** 
 * To specify the PNR segments/elements references and action to apply
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ElementManagementSegment_129487_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="status" minOccurs="0"/>
 *     &lt;xs:element type="ReferenceDetails_188618_C_CUS_PNRDataFeed_132" name="elementReference" minOccurs="0"/>
 *     &lt;xs:element type="xs:string" name="segmentName" minOccurs="0"/>
 *     &lt;xs:element type="xs:decimal" name="lineNumber" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ElementManagementSegment129487SCUSPNRDataFeed132
{
    private String status;
    private ReferenceDetails188618CCUSPNRDataFeed132 elementReference;
    private String segmentName;
    private BigDecimal lineNumber;

    /** 
     * Get the 'status' element value. Coded. X if the element is a cancelled one.
     * 
     * @return value
     */
    public String getStatus() {
        return status;
    }

    /** 
     * Set the 'status' element value. Coded. X if the element is a cancelled one.
     * 
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * Get the 'elementReference' element value. reference of the element
     * 
     * @return value
     */
    public ReferenceDetails188618CCUSPNRDataFeed132 getElementReference() {
        return elementReference;
    }

    /** 
     * Set the 'elementReference' element value. reference of the element
     * 
     * @param elementReference
     */
    public void setElementReference(
            ReferenceDetails188618CCUSPNRDataFeed132 elementReference) {
        this.elementReference = elementReference;
    }

    /** 
     * Get the 'segmentName' element value. PNR segment or element name
     * 
     * @return value
     */
    public String getSegmentName() {
        return segmentName;
    }

    /** 
     * Set the 'segmentName' element value. PNR segment or element name
     * 
     * @param segmentName
     */
    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /** 
     * Get the 'lineNumber' element value. PNR segment/element 'line' number.
     * 
     * @return value
     */
    public BigDecimal getLineNumber() {
        return lineNumber;
    }

    /** 
     * Set the 'lineNumber' element value. PNR segment/element 'line' number.
     * 
     * @param lineNumber
     */
    public void setLineNumber(BigDecimal lineNumber) {
        this.lineNumber = lineNumber;
    }
}
