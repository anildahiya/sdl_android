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

import com.smartdevicelink.proxy.RPCStruct;
import com.smartdevicelink.proxy.rpc.enums.PttbEngOnMsg;
import com.smartdevicelink.proxy.rpc.enums.PttbFaltMsg;
import com.smartdevicelink.proxy.rpc.enums.PttbHwConfig;
import com.smartdevicelink.proxy.rpc.enums.PttbPowerState;
import com.smartdevicelink.proxy.rpc.enums.PttbPowerStatus;

import java.util.Hashtable;

/**
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
 *      <td>state</td>
 *      <td>PttbPowerState</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>reset</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>faltMsg</td>
 *      <td>PttbFaltMsg</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>engOnMsg</td>
 *      <td>PttbEngOnMsg</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>loFuelMsg</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>powerStatus</td>
 *      <td>PttbPowerStatus</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>outletA</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>outletB</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>pwMax</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>hwConfig</td>
 *      <td>PttbHwConfig</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>pwConsumption</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 * </table>
 * @since SmartDeviceLink 5.0.0
 */
public class PttbControlData extends RPCStruct {
    public static final String KEY_STATE = "state";
    public static final String KEY_RESET = "reset";
    public static final String KEY_FALT_MSG = "faltMsg";
    public static final String KEY_ENG_ON_MSG = "engOnMsg";
    public static final String KEY_LO_FUEL_MSG = "loFuelMsg";
    public static final String KEY_POWER_STATUS = "powerStatus";
    public static final String KEY_OUTLET_A = "outletA";
    public static final String KEY_OUTLET_B = "outletB";
    public static final String KEY_PW_MAX = "pwMax";
    public static final String KEY_HW_CONFIG = "hwConfig";
    public static final String KEY_PW_CONSUMPTION = "pwConsumption";

    /**
     * Constructs a new PttbControlData object
     */
    public PttbControlData() { }

    /**
     * Constructs a new PttbControlData object indicated by the Hashtable parameter
     *
     * @param hash The Hashtable to use
     */
    public PttbControlData(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Sets the state.
     *
     * @param state
     */
    public void setState(PttbPowerState state) {
        setValue(KEY_STATE, state);
    }

    /**
     * Gets the state.
     *
     * @return PttbPowerState
     */
    public PttbPowerState getState() {
        return (PttbPowerState) getObject(PttbPowerState.class, KEY_STATE);
    }

    /**
     * Sets the reset.
     *
     * @param reset
     */
    public void setReset(Boolean reset) {
        setValue(KEY_RESET, reset);
    }

    /**
     * Gets the reset.
     *
     * @return Boolean
     */
    public Boolean getReset() {
        return getBoolean(KEY_RESET);
    }

    /**
     * Sets the faltMsg.
     *
     * @param faltMsg
     */
    public void setFaltMsg(PttbFaltMsg faltMsg) {
        setValue(KEY_FALT_MSG, faltMsg);
    }

    /**
     * Gets the faltMsg.
     *
     * @return PttbFaltMsg
     */
    public PttbFaltMsg getFaltMsg() {
        return (PttbFaltMsg) getObject(PttbFaltMsg.class, KEY_FALT_MSG);
    }

    /**
     * Sets the engOnMsg.
     *
     * @param engOnMsg
     */
    public void setEngOnMsg(PttbEngOnMsg engOnMsg) {
        setValue(KEY_ENG_ON_MSG, engOnMsg);
    }

    /**
     * Gets the engOnMsg.
     *
     * @return PttbEngOnMsg
     */
    public PttbEngOnMsg getEngOnMsg() {
        return (PttbEngOnMsg) getObject(PttbEngOnMsg.class, KEY_ENG_ON_MSG);
    }

    /**
     * Sets the loFuelMsg.
     *
     * @param loFuelMsg
     */
    public void setLoFuelMsg(Integer loFuelMsg) {
        setValue(KEY_LO_FUEL_MSG, loFuelMsg);
    }

    /**
     * Gets the loFuelMsg.
     *
     * @return Integer
     */
    public Integer getLoFuelMsg() {
        return getInteger(KEY_LO_FUEL_MSG);
    }

    /**
     * Sets the powerStatus.
     *
     * @param powerStatus
     */
    public void setPowerStatus(PttbPowerStatus powerStatus) {
        setValue(KEY_POWER_STATUS, powerStatus);
    }

    /**
     * Gets the powerStatus.
     *
     * @return PttbPowerStatus
     */
    public PttbPowerStatus getPowerStatus() {
        return (PttbPowerStatus) getObject(PttbPowerStatus.class, KEY_POWER_STATUS);
    }

    /**
     * Sets the outletA.
     *
     * @param outletA
     */
    public void setOutletA(Integer outletA) {
        setValue(KEY_OUTLET_A, outletA);
    }

    /**
     * Gets the outletA.
     *
     * @return Integer
     */
    public Integer getOutletA() {
        return getInteger(KEY_OUTLET_A);
    }

    /**
     * Sets the outletB.
     *
     * @param outletB
     */
    public void setOutletB(Integer outletB) {
        setValue(KEY_OUTLET_B, outletB);
    }

    /**
     * Gets the outletB.
     *
     * @return Integer
     */
    public Integer getOutletB() {
        return getInteger(KEY_OUTLET_B);
    }

    /**
     * Sets the pwMax.
     *
     * @param pwMax
     */
    public void setPwMax(Integer pwMax) {
        setValue(KEY_PW_MAX, pwMax);
    }

    /**
     * Gets the pwMax.
     *
     * @return Integer
     */
    public Integer getPwMax() {
        return getInteger(KEY_PW_MAX);
    }

    /**
     * Sets the hwConfig.
     *
     * @param hwConfig
     */
    public void setHwConfig(PttbHwConfig hwConfig) {
        setValue(KEY_HW_CONFIG, hwConfig);
    }

    /**
     * Gets the hwConfig.
     *
     * @return PttbHwConfig
     */
    public PttbHwConfig getHwConfig() {
        return (PttbHwConfig) getObject(PttbHwConfig.class, KEY_HW_CONFIG);
    }

    /**
     * Sets the pwConsumption.
     *
     * @param pwConsumption
     */
    public void setPwConsumption(Integer pwConsumption) {
        setValue(KEY_PW_CONSUMPTION, pwConsumption);
    }

    /**
     * Gets the pwConsumption.
     *
     * @return Integer
     */
    public Integer getPwConsumption() {
        return getInteger(KEY_PW_CONSUMPTION);
    }
}
