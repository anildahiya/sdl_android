package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCNotification;

import java.util.Hashtable;

/**
 * OnSeekMediaClockTimer notifies the application of progress bar seek event on the mediaclock timer.
 * System will automatically update the media clock timer position based on the seek notification location.
 *
 */
public class OnSeekMediaClockTimer extends RPCNotification {
	public static final String KEY_SEEK_TIME = "seekTime";

	/**
	 * Constructs a new OnSeekMediaClockTimer object
	 */
	public OnSeekMediaClockTimer() {
		super(FunctionID.ON_SEEK_MEDIA_CLOCK_TIMER.toString());
	}

	/**
	 * <p>
	 * Constructs a new OnSeekMediaClockTimer object indicated by the Hashtable
	 * parameter
	 * </p>
	 *
	 * @param hash
	 *            The Hashtable to use
	 */
	public OnSeekMediaClockTimer(Hashtable<String, Object> hash) {
		super(hash);
	}

	/**
	 * Constructs a new OnSeekMediaClockTimer object
	 */
	public OnSeekMediaClockTimer(@NonNull StartTime seekTime) {
		this();
		setSeekTime(seekTime);
	}

	@SuppressWarnings("unchecked")
	public StartTime getSeekTime() {
		return (StartTime) getObject(StartTime.class, KEY_SEEK_TIME);
	}

	public void setSeekTime(StartTime seekTime) {
		setParameters(KEY_SEEK_TIME, seekTime);
	}
}
