package com.smartdevicelink.proxy.rpc.enums;

public enum SettingDataType {
    SETTING_DATA_DISPLAY_MODE,
    SETTING_DATA_DISTANCE_UNIT,
    SETTING_DATA_TEMPERATURE_UNIT;

    public static SettingDataType valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
