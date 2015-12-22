
package com.conztanz.transform.sbr.v14_1;

/** 
 * This segment give the class configuration for a train
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ClassConfigurationDetails_20530_S_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ClassDetails_36634_C_CUS_PNRDataFeed_132" name="classDetails"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ClassConfigurationDetails20530SCUSPNRDataFeed132
{
    private ClassDetails36634CCUSPNRDataFeed132 classDetails;

    /** 
     * Get the 'classDetails' element value. Class Details -Class Group -Sub Class -number of seats
     * 
     * @return value
     */
    public ClassDetails36634CCUSPNRDataFeed132 getClassDetails() {
        return classDetails;
    }

    /** 
     * Set the 'classDetails' element value. Class Details -Class Group -Sub Class -number of seats
     * 
     * @param classDetails
     */
    public void setClassDetails(ClassDetails36634CCUSPNRDataFeed132 classDetails) {
        this.classDetails = classDetails;
    }
}
