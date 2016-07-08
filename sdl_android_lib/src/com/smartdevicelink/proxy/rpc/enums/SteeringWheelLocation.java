package com.smartdevicelink.proxy.rpc.enums;

public enum SteeringWheelLocation {
    LEFT,
    RIGHT,
    CENTER;

    public static SteeringWheelLocation valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
