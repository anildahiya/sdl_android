package com.smartdevicelink.proxy.rpc.enums;

/**
 * Enumeration that describes possible states of video streaming.
 */
public enum VideoStreamingState {

	STREAMABLE,
	NOT_STREAMABLE,
    ;

	/**
     * Convert String to VideoStreamingState
     * @param value String
     * @return VideoStreamingState
     */ 

    public static VideoStreamingState valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
