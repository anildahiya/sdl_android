package com.smartdevicelink.proxy.rpc.enums;

public enum TurnSignal {
    OFF,
    LEFT,
    RIGHT,
    UNUSED;

    public static TurnSignal valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
