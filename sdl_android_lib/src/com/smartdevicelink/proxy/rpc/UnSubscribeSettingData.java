package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCRequest;

import java.util.Hashtable;

public class UnSubscribeSettingData extends RPCRequest {
	public static final String KEY_DISPLAY_MODE = "displayMode";
	public static final String KEY_DISTANCE_UNIT = "distanceUnit";
	public static final String KEY_TEMPERATURE_UNIT = "temperatureUnit";

    public UnSubscribeSettingData() {
        super(FunctionID.UNSUBSCRIBE_SETTING_DATA.toString());
    }

    public UnSubscribeSettingData(Hashtable<String, Object> hash) {
        super(hash);
    }

	public Boolean getDisplayMode() {
		return (Boolean) parameters.get(KEY_DISPLAY_MODE);
	}

    public void setDisplayMode(Boolean displayMode) {
        if (displayMode != null) {
            parameters.put(KEY_DISPLAY_MODE, displayMode);
        } else {
        	parameters.remove(KEY_DISPLAY_MODE);
        }
    }

	public Boolean getDistanceUnit() {
		return (Boolean) parameters.get(KEY_DISTANCE_UNIT);
	}

	public void setDistanceUnit(Boolean distanceUnit) {
		if (distanceUnit != null) {
			parameters.put(KEY_DISTANCE_UNIT, distanceUnit);
		} else {
			parameters.remove(KEY_DISTANCE_UNIT);
		}
	}

	public Boolean getTemperatureUnit() {
		return (Boolean) parameters.get(KEY_TEMPERATURE_UNIT);
	}

	public void setTemperatureUnit(Boolean temperatureUnit) {
		if (temperatureUnit != null) {
			parameters.put(KEY_TEMPERATURE_UNIT, temperatureUnit);
		} else {
			parameters.remove(KEY_TEMPERATURE_UNIT);
		}
	}
}
