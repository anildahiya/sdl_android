package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;
import com.smartdevicelink.util.DebugTool;

import java.util.Hashtable;

public class UnSubscribeSettingDataResponse extends RPCResponse {
	public static final String KEY_DISPLAY_MODE = "displayMode";
	public static final String KEY_DISTANCE_UNIT = "distanceUnit";
	public static final String KEY_TEMPERATURE_UNIT = "temperatureUnit";

    public UnSubscribeSettingDataResponse() {
        super(FunctionID.UNSUBSCRIBE_SETTING_DATA.toString());
    }

    public UnSubscribeSettingDataResponse(Hashtable<String, Object> hash) {
        super(hash);
    }

    @SuppressWarnings("unchecked")
    public SettingDataResult getDisplayMode() {
        Object obj = parameters.get(KEY_DISPLAY_MODE);
        if (obj instanceof SettingDataResult) {
            return (SettingDataResult) obj;
        } else if (obj instanceof Hashtable) {
            try {
                return new SettingDataResult((Hashtable<String, Object>) obj);
            } catch (Exception e) {
                DebugTool.logError("Failed to parse " + getClass().getSimpleName() + "." + KEY_DISPLAY_MODE, e);
            }
        }
        return null;
    }

    public void setDisplayMode(SettingDataResult displayMode) {
        if (displayMode != null) {
            parameters.put(KEY_DISPLAY_MODE, displayMode);
        } else {
            parameters.remove(KEY_DISPLAY_MODE);
        }
    }

    @SuppressWarnings("unchecked")
    public SettingDataResult getDistanceUnit() {
        Object obj = parameters.get(KEY_DISTANCE_UNIT);
        if (obj instanceof SettingDataResult) {
            return (SettingDataResult) obj;
        } else if (obj instanceof Hashtable) {
            try {
                return new SettingDataResult((Hashtable<String, Object>) obj);
            } catch (Exception e) {
                DebugTool.logError("Failed to parse " + getClass().getSimpleName() + "." + KEY_DISTANCE_UNIT, e);
            }
        }
        return null;
    }

    public void setDistanceUnit(SettingDataResult distanceUnit) {
        if (distanceUnit != null) {
            parameters.put(KEY_DISTANCE_UNIT, distanceUnit);
        } else {
            parameters.remove(KEY_DISTANCE_UNIT);
        }
    }

    @SuppressWarnings("unchecked")
    public SettingDataResult getTemperatureUnit() {
        Object obj = parameters.get(KEY_TEMPERATURE_UNIT);
        if (obj instanceof SettingDataResult) {
            return (SettingDataResult) obj;
        } else if (obj instanceof Hashtable) {
            try {
                return new SettingDataResult((Hashtable<String, Object>) obj);
            } catch (Exception e) {
                DebugTool.logError("Failed to parse " + getClass().getSimpleName() + "." + KEY_TEMPERATURE_UNIT, e);
            }
        }
        return null;
    }

    public void setTemperatureUnit(SettingDataResult temperatureUnit) {
        if (temperatureUnit != null) {
            parameters.put(KEY_TEMPERATURE_UNIT, temperatureUnit);
        } else {
            parameters.remove(KEY_TEMPERATURE_UNIT);
        }
    }
}
