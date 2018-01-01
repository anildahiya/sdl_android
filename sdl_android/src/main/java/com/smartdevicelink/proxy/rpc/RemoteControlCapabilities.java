package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.proxy.RPCStruct;
import java.util.Hashtable;
import java.util.List;

public class RemoteControlCapabilities extends RPCStruct{
    public static final String KEY_CLIMATE_CONTROL_CAPABILITIES= "climateControlCapabilities";
    public static final String KEY_RADIO_CONTROL_CAPABILITIES = "radioControlCapabilities";
    public static final String KEY_BUTTON_CAPABILITIES = "buttonCapabilities";
    public static final String KEY_AUDIO_CONTROL_CAPABILITIES = "audioControlCapabilities";
    public static final String KEY_HMI_SETTINGS_CONTROL_CAPABILITIES = "hmiSettingsControlCapabilities";
    public static final String KEY_LIGHT_CONTROL_CAPABILITIES = "lightControlCapabilities";

    public RemoteControlCapabilities() {
    }

    public RemoteControlCapabilities(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Sets the climateControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @param climateControlCapabilities
     * If included, the platform supports RC climate controls.
     * For this baseline version, maxsize=1. i.e. only one climate control module is supported.
     */
    public void setClimateControlCapabilities(List<ClimateControlCapabilities> climateControlCapabilities) {
        setValue(KEY_CLIMATE_CONTROL_CAPABILITIES, climateControlCapabilities);
    }

    /**
     * Gets the climateControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @return List<ClimateControlCapabilities>
     * If included, the platform supports RC climate controls.
     * For this baseline version, maxsize=1. i.e. only one climate control module is supported.
     */
    public List<ClimateControlCapabilities> getClimateControlCapabilities() {
        return (List<ClimateControlCapabilities>) getObject(ClimateControlCapabilities.class, KEY_CLIMATE_CONTROL_CAPABILITIES);
    }

    /**
     * Sets the radioControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @param radioControlCapabilities
     * If included, the platform supports RC climate controls.
     * For this baseline version, maxsize=1. i.e. only one radio control module is supported.
     */
    public void setRadioControlCapabilities(List<RadioControlCapabilities> radioControlCapabilities) {
        setValue(KEY_RADIO_CONTROL_CAPABILITIES, radioControlCapabilities);
    }

    /**
     * Gets the radioControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @return List<RadioControlCapabilities>
     * If included, the platform supports RC climate controls.
     * For this baseline version, maxsize=1. i.e. only one radio control module is supported.
     */
    public List<RadioControlCapabilities> getRadioControlCapabilities() {
        return (List<RadioControlCapabilities>) getObject(RadioControlCapabilities.class, KEY_RADIO_CONTROL_CAPABILITIES);
    }

    /**
     * Sets the buttonCapabilities portion of the RemoteControlCapabilities class
     *
     * @param buttonCapabilities
     * If included, the platform supports RC button controls with the included button names.
     */
    public void setButtonCapabilities(List<ButtonCapabilities> buttonCapabilities) {
        setValue(KEY_BUTTON_CAPABILITIES, buttonCapabilities);
    }

    /**
     * Gets the buttonCapabilities portion of the RemoteControlCapabilities class
     *
     * @return List<ButtonCapabilities>
     * If included, the platform supports RC button controls with the included button names.
     */
    public List<ButtonCapabilities> getButtonCapabilities() {
        return (List<ButtonCapabilities>) getObject(ButtonCapabilities.class, KEY_BUTTON_CAPABILITIES);
    }

    /**
     * Sets the audioControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @param audioControlCapabilities
     * If included, the platform supports audio controls.
     */
    public void setAudioControlCapabilities(List<AudioControlCapabilities> audioControlCapabilities) {
        setValue(KEY_AUDIO_CONTROL_CAPABILITIES, audioControlCapabilities);
    }

    /**
     * Gets the audioControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @return List<AudioControlCapabilities>
     * If included, the platform supports audio controls.
     */
    public List<AudioControlCapabilities> getAudioControlCapabilities() {
        return (List<AudioControlCapabilities>) getObject(AudioControlCapabilities.class, KEY_AUDIO_CONTROL_CAPABILITIES);
    }

    /**
     * Sets the hmiSettingsControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @param hmiSettingsControlCapabilities
     * If included, the platform supports hmi setting controls.
     */
    public void setHmiSettingsControlCapabilities(HMISettingsControlCapabilities hmiSettingsControlCapabilities) {
        setValue(KEY_HMI_SETTINGS_CONTROL_CAPABILITIES, hmiSettingsControlCapabilities);
    }

    /**
     * Gets the hmiSettingsControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @return HMISettingsControlCapabilities - If included, the platform supports hmi setting controls.
     */
    public HMISettingsControlCapabilities getHmiSettingsControlCapabilities() {
        return (HMISettingsControlCapabilities) getObject(HMISettingsControlCapabilities.class, KEY_HMI_SETTINGS_CONTROL_CAPABILITIES);
    }

    /**
     * Sets the lightControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @param lightControlCapabilities
     * If included, the platform supports light controls.
     */
    public void setLightControlCapabilities(LightControlCapabilities lightControlCapabilities) {
        setValue(KEY_LIGHT_CONTROL_CAPABILITIES, lightControlCapabilities);
    }

    /**
     * Gets the lightControlCapabilities portion of the RemoteControlCapabilities class
     *
     * @return LightControlCapabilities - If included, the platform supports light controls.
     */
    public LightControlCapabilities getLightControlCapabilities() {
        return (LightControlCapabilities) getObject(LightControlCapabilities.class, KEY_LIGHT_CONTROL_CAPABILITIES);
    }
}
