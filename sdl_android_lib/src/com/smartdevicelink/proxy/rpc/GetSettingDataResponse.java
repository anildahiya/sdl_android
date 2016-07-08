package com.smartdevicelink.proxy.rpc;


import com.smartdevicelink.protocol.enums.FunctionID;
import com.smartdevicelink.proxy.RPCResponse;
import com.smartdevicelink.proxy.rpc.enums.DisplayMode;
import com.smartdevicelink.proxy.rpc.enums.DistanceUnit;
import com.smartdevicelink.proxy.rpc.enums.TemperatureUnit;
import com.smartdevicelink.util.DebugTool;

import java.util.Hashtable;

public class GetSettingDataResponse extends RPCResponse {
	public static final String KEY_DISPLAY_MODE = "displayMode";
    public static final String KEY_DISTANCE_UNIT = "distanceUnit";
    public static final String KEY_TEMPERATURE_UNIT = "temperatureUnit";

    public GetSettingDataResponse() {
        super(FunctionID.GET_SETTING_DATA.toString());
    }
    public GetSettingDataResponse(Hashtable<String, Object> hash) {
        super(hash);
    }

    public DisplayMode getDisplayMode() {
        Object obj = parameters.get(KEY_DISPLAY_MODE);
        if (obj instanceof DisplayMode) {
            return (DisplayMode) obj;
        } else if (obj instanceof String) {
            DisplayMode displayMode = null;
            try {
                displayMode = DisplayMode.valueForString((String) obj);
            } catch (Exception e) {
                DebugTool.logError("Failed to parse " + getClass().getSimpleName() + "." + KEY_DISPLAY_MODE, e);
            }
            return displayMode;
        }
        return null;
    }

    public void setDisplayMode(DisplayMode displayMode) {
    	if (displayMode != null) {
    		parameters.put(KEY_DISPLAY_MODE, displayMode);
    	} else {
    		parameters.remove(KEY_DISPLAY_MODE);
    	}
    }

    public DistanceUnit getDistanceUnit() {
        Object obj = parameters.get(KEY_DISTANCE_UNIT);
        if (obj instanceof DistanceUnit) {
            return (DistanceUnit) obj;
        } else if (obj instanceof String) {
            DistanceUnit distanceUnit = null;
            try {
                distanceUnit = DistanceUnit.valueForString((String) obj);
            } catch (Exception e) {
                DebugTool.logError("Failed to parse " + getClass().getSimpleName() + "." + KEY_DISTANCE_UNIT, e);
            }
            return distanceUnit;
        }
        return null;
    }

    public void setDistanceUnit(DistanceUnit distanceUnit) {
        if (distanceUnit != null) {
            parameters.put(KEY_DISTANCE_UNIT, distanceUnit);
        } else {
            parameters.remove(KEY_DISTANCE_UNIT);
        }
    }

    public TemperatureUnit getTemperatureUnit() {
        Object obj = parameters.get(KEY_TEMPERATURE_UNIT);
        if (obj instanceof TemperatureUnit) {
            return (TemperatureUnit) obj;
        } else if (obj instanceof String) {
            TemperatureUnit temperatureUnit = null;
            try {
                temperatureUnit = TemperatureUnit.valueForString((String) obj);
            } catch (Exception e) {
                DebugTool.logError("Failed to parse " + getClass().getSimpleName() + "." + KEY_TEMPERATURE_UNIT, e);
            }
            return temperatureUnit;
        }
        return null;
    }

    public void setTemperatureUnit(TemperatureUnit temperatureUnit) {
        if (temperatureUnit != null) {
            parameters.put(KEY_TEMPERATURE_UNIT, temperatureUnit);
        } else {
            parameters.remove(KEY_TEMPERATURE_UNIT);
        }
    }
}
