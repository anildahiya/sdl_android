package com.smartdevicelink.proxy.rpc.enums;

public enum ABS_STATE {
    INACTIVE,
    ACTIVE;

    public static ABS_STATE valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
