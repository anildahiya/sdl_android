package com.smartdevicelink.proxy.rpc.enums;

public enum DeliveryMode {
	PROMPT,
	NO_PROMPT_SET_AS_DESTINATION,
	NO_PROMPT_ADD_TO_QUEUE;

    public static DeliveryMode valueForString(String value) {
        try{
            return valueOf(value);
        }catch(Exception e){
            return null;
        }
    }
}
