package com.smartdevicelink.proxy.rpc;

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.rpc.enums.RadioBand;
import com.smartdevicelink.proxy.rpc.enums.RadioState;
import java.util.Hashtable;

public class RadioControlData extends RPCStruct{
    public static final String KEY_FREQUENCY_INTEGER= "frequencyInteger";
    public static final String KEY_FREQUENCY_FRACTION= "frequencyFraction";
    public static final String KEY_BAND= "band";
    public static final String KEY_RDS_DATA= "rdsData";
    public static final String KEY_AVAILABLE_HDS= "availableHDs";
    public static final String KEY_HD_CHANNEL= "hdChannel";
    public static final String KEY_SIGNAL_STRENGTH= "signalStrength";
    public static final String KEY_SIGNAL_CHANGE_THRESHOLD= "signalChangeThreshold";
    public static final String KEY_RADIO_ENABLE= "radioEnable";
    public static final String KEY_STATE= "state";

    public RadioControlData() {
    }

    public RadioControlData(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Sets the frequencyInteger portion of the RadioControlData class
     *
     * @param frequencyInteger
     * The integer part of the frequency i.e. for 101.7 this value should be 101
     */
    public void setFrequencyInteger(Integer frequencyInteger) {
        setValue(KEY_FREQUENCY_INTEGER, frequencyInteger);
    }

    /**
     * Gets the frequencyInteger portion of the RadioControlData class
     *
     * @return Integer - The integer part of the frequency i.e. for 101.7 this value should be 101.
     */
    public Integer getFrequencyInteger() {
        return getInteger(KEY_FREQUENCY_INTEGER);
    }

    /**
     * Sets the frequencyFraction portion of the RadioControlData class
     *
     * @param frequencyFraction
     * The fractional part of the frequency i.e. for 101.7 is 7.
     */
    public void setFrequencyFraction(Integer frequencyFraction) {
        setValue(KEY_FREQUENCY_FRACTION, frequencyFraction);
    }

    /**
     * Gets the frequencyFraction portion of the RadioControlData class
     *
     * @return Integer - The fractional part of the frequency i.e. for 101.7 is 7.
     */
    public Integer getFrequencyFraction() {
        return getInteger(KEY_FREQUENCY_FRACTION);
    }

    /**
     * Sets the band portion of the RadioControlData class
     *
     * @param band
     */
    public void setBand(RadioBand band) {
        setValue(KEY_BAND, band);
    }

    /**
     * Gets the band portion of the RadioControlData class
     *
     * @return RadioBand
     */
    public RadioBand getBand() {
        return (RadioBand) getObject(RadioBand.class, KEY_BAND);
    }

    /**
     * Sets the rdsData portion of the RadioControlData class
     *
     * @param rdsData
     */
    public void setRdsData(RdsData rdsData) {
        setValue(KEY_RDS_DATA, rdsData);
    }

    /**
     * Gets the rdsData portion of the RadioControlData class
     *
     * @return RdsData
     */
    public RdsData getRdsData() {
        return (RdsData) getObject(RdsData.class, KEY_RDS_DATA);
    }

    /**
     * Sets the availableHDs portion of the RadioControlData class
     *
     * @param availableHDs
     * Number of HD sub-channels if available.
     */
    public void setAvailableHDs(Integer availableHDs) {
        setValue(KEY_AVAILABLE_HDS, availableHDs);
    }

    /**
     * Gets the availableHDs portion of the RadioControlData class
     *
     * @return Integer - Number of HD sub-channels if available.
     */
    public Integer getAvailableHDs() {
        return getInteger(KEY_AVAILABLE_HDS);
    }

    /**
     * Sets the hdChannel portion of the RadioControlData class
     *
     * @param hdChannel
     * Current HD sub-channel if available.
     */
    public void setHdChannel(Integer hdChannel) {
        setValue(KEY_HD_CHANNEL, hdChannel);
    }

    /**
     * Gets the hdChannel portion of the RadioControlData class
     *
     * @return Integer - Current HD sub-channel if available.
     */
    public Integer getHdChannel() {
        return getInteger(KEY_HD_CHANNEL);
    }

    /**
     * Sets the signalStrength portion of the RadioControlData class
     *
     * @param signalStrength
     */
    public void setSignalStrength(Integer signalStrength) {
        setValue(KEY_SIGNAL_STRENGTH, signalStrength);
    }

    /**
     * Gets the signalStrength portion of the RadioControlData class
     *
     * @return Integer
     */
    public Integer getSignalStrength() {
        return getInteger(KEY_SIGNAL_STRENGTH);
    }

    /**
     * Sets the signalChangeThreshold portion of the RadioControlData class
     *
     * @param signalChangeThreshold
     * If the signal strength falls below the set value for this parameter, the radio will tune to an alternative frequency.
     */
    public void setSignalChangeThreshold(Integer signalChangeThreshold) {
        setValue(KEY_SIGNAL_CHANGE_THRESHOLD, signalChangeThreshold);
    }

    /**
     * Gets the signalChangeThreshold portion of the RadioControlData class
     *
     * @return Integer - If the signal strength falls below the set value for this parameter, the radio will tune to an alternative frequency.
     */
    public Integer getSignalChangeThreshold() {
        return getInteger(KEY_SIGNAL_CHANGE_THRESHOLD);
    }

    /**
     * Sets the radioEnable portion of the RadioControlData class
     *
     * @param radioEnable
     * True if the radio is on, false is the radio is off.
     */
    public void setRadioEnable(Boolean radioEnable) {
        setValue(KEY_RADIO_ENABLE, radioEnable);
    }

    /**
     * Gets the radioEnable portion of the RadioControlData class
     *
     * @return Boolean - True if the radio is on, false is the radio is off.
     */
    public Boolean getRadioEnable() {
        return getBoolean(KEY_RADIO_ENABLE);
    }

    /**
     * Sets the state portion of the RadioControlData class
     *
     * @param state
     */
    public void setState(RadioState state) {
        setValue(KEY_STATE, state);
    }

    /**
     * Gets the state portion of the RadioControlData class
     *
     * @return RadioState
     */
    public RadioState getState() {
        return (RadioState) getObject(RadioState.class, KEY_STATE);
    }
}
