package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;
import com.smartdevicelink.proxy.rpc.enums.AudioStreamingIndicator;
import java.util.Hashtable;

public class SetAudioStreamingIndicator extends RPCRequest {
	public static final String KEY_AUDIO_STREAMING_INDICATOR = "audioStreamingIndicator";

    public SetAudioStreamingIndicator() {
        super(FunctionID.SET_AUDIO_STREAMING_INDICATOR.toString());
    }

    public SetAudioStreamingIndicator(Hashtable<String, Object> hash) {
        super(hash);
    }

    public AudioStreamingIndicator getAudioStreamingIndicator() {
        Object obj = parameters.get(KEY_AUDIO_STREAMING_INDICATOR);
        if (obj instanceof AudioStreamingIndicator) {
            return (AudioStreamingIndicator) obj;
        } else if (obj instanceof String) {
            return AudioStreamingIndicator.valueForString((String) obj);
        }
        return null;
    }

    public void setAudioStreamingIndicator(AudioStreamingIndicator audioStreamingIndicator) {
        if (audioStreamingIndicator != null) {
            parameters.put(KEY_AUDIO_STREAMING_INDICATOR, audioStreamingIndicator);
        } else {
            parameters.remove(KEY_AUDIO_STREAMING_INDICATOR);
        }
    }
}
