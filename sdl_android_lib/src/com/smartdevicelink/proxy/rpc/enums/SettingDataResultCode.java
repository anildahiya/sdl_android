package com.smartdevicelink.proxy.rpc.enums;

import java.util.EnumSet;

public enum SettingDataResultCode {
    SDRC_SUCCESS("SUCCESS"),
    SDRC_INVALID_ID("INVALID_ID"),
    SDRC_DATA_NOT_AVAILABLE("SETTING_DATA_NOT_AVAILABLE"),
    SDRC_DATA_ALREADY_SUBSCRIBED("DATA_ALREADY_SUBSCRIBED"),
    SDRC_DATA_NOT_SUBSCRIBED("DATA_NOT_SUBSCRIBED"),
    SDRC_IGNORED("IGNORED");

    private final String INTERNAL_NAME;

    private SettingDataResultCode(String internalName) {
        this.INTERNAL_NAME = internalName;
    }

    public String toString() {
        return this.INTERNAL_NAME;
    }
    
    public static SettingDataResultCode valueForString(String value) {
        if(value == null){
            return null;
        }
        
    	for (SettingDataResultCode anEnum : EnumSet.allOf(SettingDataResultCode.class)) {
            if (anEnum.toString().equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}
