/*
 * Copyright (c) 2017 - 2020, SmartDeviceLink Consortium, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following
 * disclaimer in the documentation and/or other materials provided with the
 * distribution.
 *
 * Neither the name of the SmartDeviceLink Consortium Inc. nor the names of
 * its contributors may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.smartdevicelink.proxy.rpc;

import android.support.annotation.NonNull;

import com.smartdevicelink.proxy.RPCStruct;

import java.util.Hashtable;

/**
 * Contains information about a pttb control module's capabilities.
 *
 * <p><b>Parameter List</b></p>
 *
 * <table border="1" rules="all">
 *  <tr>
 *      <th>Param Name</th>
 *      <th>Type</th>
 *      <th>Description</th>
 *      <th>Required</th>
 *      <th>Version Available</th>
 *  </tr>
 *  <tr>
 *      <td>moduleName</td>
 *      <td>String</td>
 *      <td></td>
 *      <td>Y</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>stateAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>resetAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>faltMsgAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>engOnMsgAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>loFuelMsgAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>powerStatusAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>outletAAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>outletBAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>pwMaxAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>hwConfigAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>pwConsumptionAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 * </table>
 *
 * @since SmartDeviceLink 5.0.0
 */
public class PttbControlCapabilities extends RPCStruct {
    public static final String KEY_MODULE_NAME = "moduleName";
    public static final String KEY_STATE_AVAILABLE = "stateAvailable";
    public static final String KEY_RESET_AVAILABLE = "resetAvailable";
    public static final String KEY_FALT_MSG_AVAILABLE = "faltMsgAvailable";
    public static final String KEY_ENG_ON_MSG_AVAILABLE = "engOnMsgAvailable";
    public static final String KEY_LO_FUEL_MSG_AVAILABLE = "loFuelMsgAvailable";
    public static final String KEY_POWER_STATUS_AVAILABLE = "powerStatusAvailable";
    public static final String KEY_OUTLET_AAVAILABLE = "outletAAvailable";
    public static final String KEY_OUTLET_BAVAILABLE = "outletBAvailable";
    public static final String KEY_PW_MAX_AVAILABLE = "pwMaxAvailable";
    public static final String KEY_HW_CONFIG_AVAILABLE = "hwConfigAvailable";
    public static final String KEY_PW_CONSUMPTION_AVAILABLE = "pwConsumptionAvailable";

    /**
     * Constructs a new PttbControlCapabilities object
     */
    public PttbControlCapabilities() { }

    /**
     * Constructs a new PttbControlCapabilities object indicated by the Hashtable parameter
     *
     * @param hash The Hashtable to use
     */
    public PttbControlCapabilities(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new PttbControlCapabilities object
     *
     * @param moduleName
     */
    public PttbControlCapabilities(@NonNull String moduleName) {
        this();
        setModuleName(moduleName);
    }

    /**
     * Sets the moduleName.
     *
     * @param moduleName
     */
    public void setModuleName(@NonNull String moduleName) {
        setValue(KEY_MODULE_NAME, moduleName);
    }

    /**
     * Gets the moduleName.
     *
     * @return String
     */
    public String getModuleName() {
        return getString(KEY_MODULE_NAME);
    }

    /**
     * Sets the stateAvailable.
     *
     * @param stateAvailable
     */
    public void setStateAvailable(Boolean stateAvailable) {
        setValue(KEY_STATE_AVAILABLE, stateAvailable);
    }

    /**
     * Gets the stateAvailable.
     *
     * @return Boolean
     */
    public Boolean getStateAvailable() {
        return getBoolean(KEY_STATE_AVAILABLE);
    }

    /**
     * Sets the resetAvailable.
     *
     * @param resetAvailable
     */
    public void setResetAvailable(Boolean resetAvailable) {
        setValue(KEY_RESET_AVAILABLE, resetAvailable);
    }

    /**
     * Gets the resetAvailable.
     *
     * @return Boolean
     */
    public Boolean getResetAvailable() {
        return getBoolean(KEY_RESET_AVAILABLE);
    }

    /**
     * Sets the faltMsgAvailable.
     *
     * @param faltMsgAvailable
     */
    public void setFaltMsgAvailable(Boolean faltMsgAvailable) {
        setValue(KEY_FALT_MSG_AVAILABLE, faltMsgAvailable);
    }

    /**
     * Gets the faltMsgAvailable.
     *
     * @return Boolean
     */
    public Boolean getFaltMsgAvailable() {
        return getBoolean(KEY_FALT_MSG_AVAILABLE);
    }

    /**
     * Sets the engOnMsgAvailable.
     *
     * @param engOnMsgAvailable
     */
    public void setEngOnMsgAvailable(Boolean engOnMsgAvailable) {
        setValue(KEY_ENG_ON_MSG_AVAILABLE, engOnMsgAvailable);
    }

    /**
     * Gets the engOnMsgAvailable.
     *
     * @return Boolean
     */
    public Boolean getEngOnMsgAvailable() {
        return getBoolean(KEY_ENG_ON_MSG_AVAILABLE);
    }

    /**
     * Sets the loFuelMsgAvailable.
     *
     * @param loFuelMsgAvailable
     */
    public void setLoFuelMsgAvailable(Boolean loFuelMsgAvailable) {
        setValue(KEY_LO_FUEL_MSG_AVAILABLE, loFuelMsgAvailable);
    }

    /**
     * Gets the loFuelMsgAvailable.
     *
     * @return Boolean
     */
    public Boolean getLoFuelMsgAvailable() {
        return getBoolean(KEY_LO_FUEL_MSG_AVAILABLE);
    }

    /**
     * Sets the powerStatusAvailable.
     *
     * @param powerStatusAvailable
     */
    public void setPowerStatusAvailable(Boolean powerStatusAvailable) {
        setValue(KEY_POWER_STATUS_AVAILABLE, powerStatusAvailable);
    }

    /**
     * Gets the powerStatusAvailable.
     *
     * @return Boolean
     */
    public Boolean getPowerStatusAvailable() {
        return getBoolean(KEY_POWER_STATUS_AVAILABLE);
    }

    /**
     * Sets the outletAAvailable.
     *
     * @param outletAAvailable
     */
    public void setOutletAAvailable(Boolean outletAAvailable) {
        setValue(KEY_OUTLET_AAVAILABLE, outletAAvailable);
    }

    /**
     * Gets the outletAAvailable.
     *
     * @return Boolean
     */
    public Boolean getOutletAAvailable() {
        return getBoolean(KEY_OUTLET_AAVAILABLE);
    }

    /**
     * Sets the outletBAvailable.
     *
     * @param outletBAvailable
     */
    public void setOutletBAvailable(Boolean outletBAvailable) {
        setValue(KEY_OUTLET_BAVAILABLE, outletBAvailable);
    }

    /**
     * Gets the outletBAvailable.
     *
     * @return Boolean
     */
    public Boolean getOutletBAvailable() {
        return getBoolean(KEY_OUTLET_BAVAILABLE);
    }

    /**
     * Sets the pwMaxAvailable.
     *
     * @param pwMaxAvailable
     */
    public void setPwMaxAvailable(Boolean pwMaxAvailable) {
        setValue(KEY_PW_MAX_AVAILABLE, pwMaxAvailable);
    }

    /**
     * Gets the pwMaxAvailable.
     *
     * @return Boolean
     */
    public Boolean getPwMaxAvailable() {
        return getBoolean(KEY_PW_MAX_AVAILABLE);
    }

    /**
     * Sets the hwConfigAvailable.
     *
     * @param hwConfigAvailable
     */
    public void setHwConfigAvailable(Boolean hwConfigAvailable) {
        setValue(KEY_HW_CONFIG_AVAILABLE, hwConfigAvailable);
    }

    /**
     * Gets the hwConfigAvailable.
     *
     * @return Boolean
     */
    public Boolean getHwConfigAvailable() {
        return getBoolean(KEY_HW_CONFIG_AVAILABLE);
    }

    /**
     * Sets the pwConsumptionAvailable.
     *
     * @param pwConsumptionAvailable
     */
    public void setPwConsumptionAvailable(Boolean pwConsumptionAvailable) {
        setValue(KEY_PW_CONSUMPTION_AVAILABLE, pwConsumptionAvailable);
    }

    /**
     * Gets the pwConsumptionAvailable.
     *
     * @return Boolean
     */
    public Boolean getPwConsumptionAvailable() {
        return getBoolean(KEY_PW_CONSUMPTION_AVAILABLE);
    }
}
