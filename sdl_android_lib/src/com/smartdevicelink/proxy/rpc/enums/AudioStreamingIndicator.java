package com.smartdevicelink.proxy.rpc.enums;

public enum AudioStreamingIndicator {
    PLAY_PAUSE,
    PLAY,
    PAUSE;

    public static AudioStreamingIndicator valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
