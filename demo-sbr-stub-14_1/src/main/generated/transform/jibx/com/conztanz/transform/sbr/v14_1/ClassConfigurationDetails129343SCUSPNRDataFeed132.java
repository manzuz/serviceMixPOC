
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment give the class configuration for a train
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ClassConfigurationDetails_129343_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ClassDetails_188416_C_CUS_PNRDataFeed_132" name="classDetails" minOccurs="0"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ClassConfigurationDetails129343SCUSPNRDataFeed132
{
    private ClassDetails188416CCUSPNRDataFeed132 classDetails;

    /** 
     * Get the 'classDetails' element value. Class Details -Class Group -Sub Class -Posting
     * 
     * @return value
     */
    public ClassDetails188416CCUSPNRDataFeed132 getClassDetails() {
        return classDetails;
    }

    /** 
     * Set the 'classDetails' element value. Class Details -Class Group -Sub Class -Posting
     * 
     * @param classDetails
     */
    public void setClassDetails(
            ClassDetails188416CCUSPNRDataFeed132 classDetails) {
        this.classDetails = classDetails;
    }
}
