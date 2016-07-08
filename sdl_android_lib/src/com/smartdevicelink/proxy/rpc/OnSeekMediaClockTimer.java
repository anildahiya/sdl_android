package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCNotification;
import com.smartdevicelink.util.DebugTool;

import java.util.Hashtable;

public class OnSeekMediaClockTimer extends RPCNotification {
	public static final String KEY_SEEK_TIME = "seekTime";

	public OnSeekMediaClockTimer() {
		super(FunctionID.ON_SEEK_MEDIA_CLOCK_TIMER.toString());
	}

	public OnSeekMediaClockTimer(Hashtable<String, Object> hash) {
		super(hash);
	}

	@SuppressWarnings("unchecked")
	public StartTime getSeekTime() {
		Object obj = parameters.get(KEY_SEEK_TIME);
		if (obj instanceof StartTime) {
			return (StartTime) obj;
		} else if (obj instanceof Hashtable) {
			try {
				return new StartTime((Hashtable<String, Object>) obj);
			} catch (Exception e) {
				DebugTool.logError("Failed to parse " + getClass().getSimpleName() + "." + KEY_SEEK_TIME, e);
			}
		}
		return null;
	}

	public void setSeekTime(StartTime seekTime) {
		if (seekTime != null) {
			parameters.put(KEY_SEEK_TIME, seekTime);
		} else {
			parameters.remove(KEY_SEEK_TIME);
		}
	}
}
