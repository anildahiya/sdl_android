package com.smartdevicelink.proxy.rpc.enums;
/** The type of the display.
 * <p>
 * 
 * @since SmartDevcieLink 1.0 
 *
 */

public enum DisplayType {
	/**
	* Center Information Display.<br>
	*This display type provides a 2-line x 20 character "dot matrix" display.
	*<p>
	*/

    CID("CID"),
    /** TYPE II display.
    1 line older radio head unit. */

    TYPE2("TYPE2"),
    /**
    * TYPE V display
    Old radio head unit.

    */

    TYPE5("TYPE5"),
    /**
     * Next Generation Navigation display.    
     */

    NGN("NGN"),
    /**
     * GEN-2, 8 inch display.
     */

    GEN2_8_DMA("GEN2_8_DMA"),
    /**
     * GEN-2, 6 inch display.
     */

    GEN2_6_DMA("GEN2_6_DMA"),
    /**
     * 3 inch GEN1.1 display.    
     */

    MFD3("MFD3"),
    /**
     * 4 inch GEN1.1 display    
     */

    MFD4("MFD4"),
    /**
     * 5 inch GEN1.1 display.    
     */

    MFD5("MFD5"),
    /**
     * GEN-3, 8 inch display.    
     */

    GEN3_8_INCH("GEN3_8-INCH");

    private final String INTERNAL_NAME;

    private DisplayType(String internalName) {
        this.INTERNAL_NAME = internalName;
    }

    public static DisplayType valueForString(String value) {
        if(value == null){
            return null;
        }
        
        for (DisplayType type : DisplayType.values()) {
            if (type.toString().equals(value)) {
                return type;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return INTERNAL_NAME;
    }
}
