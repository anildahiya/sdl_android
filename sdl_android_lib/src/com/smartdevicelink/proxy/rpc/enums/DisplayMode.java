package com.smartdevicelink.proxy.rpc.enums;

public enum DisplayMode {
    DAY,
    NIGHT;

    public static DisplayMode valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
