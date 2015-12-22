
package com.conztanz.transform.sbr.v14_1;

/** 
 * CABIN CLASS DESIGNATION
 * 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:xs="http://www.w3.org/2001/XMLSchema" name="CabinClassDesignation_15507_C_CUS_PNRDataFeed_132">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="classDesignator"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class CabinClassDesignation15507CCUSPNRDataFeed132
{
    private String classDesignator;

    /** 
     * Get the 'classDesignator' element value. Designates the class of service on the means of transport  in which the passenger will travel
     * 
     * @return value
     */
    public String getClassDesignator() {
        return classDesignator;
    }

    /** 
     * Set the 'classDesignator' element value. Designates the class of service on the means of transport  in which the passenger will travel
     * 
     * @param classDesignator
     */
    public void setClassDesignator(String classDesignator) {
        this.classDesignator = classDesignator;
    }
}
