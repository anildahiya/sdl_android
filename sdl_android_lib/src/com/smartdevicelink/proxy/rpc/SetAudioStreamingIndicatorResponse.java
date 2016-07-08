package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;

import java.util.Hashtable;

public class SetAudioStreamingIndicatorResponse extends RPCResponse {

    public SetAudioStreamingIndicatorResponse() {
        super(FunctionID.SET_AUDIO_STREAMING_INDICATOR.toString());
    }

    public SetAudioStreamingIndicatorResponse(Hashtable<String, Object> hash) {
        super(hash);
    }
}