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
 * Contains information about a trailer check control module's capabilities.
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
 *      <td>userInputAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>preconditionStatusAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>testStatusAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 * </table>
 *
 * @since SmartDeviceLink 6.0.0
 */
public class TlcControlCapabilities extends RPCStruct {
    public static final String KEY_MODULE_NAME = "moduleName";
    public static final String KEY_USER_INPUT_AVAILABLE = "userInputAvailable";
    public static final String KEY_PRECONDITION_STATUS_AVAILABLE = "preconditionStatusAvailable";
    public static final String KEY_TEST_STATUS_AVAILABLE = "testStatusAvailable";

    /**
     * Constructs a new TlcControlCapabilities object
     */
    public TlcControlCapabilities() { }

    /**
     * Constructs a new TlcControlCapabilities object indicated by the Hashtable parameter
     *
     * @param hash The Hashtable to use
     */
    public TlcControlCapabilities(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new TlcControlCapabilities object
     *
     * @param moduleName
     */
    public TlcControlCapabilities(@NonNull String moduleName) {
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
     * Sets the userInputAvailable.
     *
     * @param userInputAvailable
     */
    public void setUserInputAvailable(Boolean userInputAvailable) {
        setValue(KEY_USER_INPUT_AVAILABLE, userInputAvailable);
    }

    /**
     * Gets the userInputAvailable.
     *
     * @return Boolean
     */
    public Boolean getUserInputAvailable() {
        return getBoolean(KEY_USER_INPUT_AVAILABLE);
    }

    /**
     * Sets the preconditionStatusAvailable.
     *
     * @param preconditionStatusAvailable
     */
    public void setPreconditionStatusAvailable(Boolean preconditionStatusAvailable) {
        setValue(KEY_PRECONDITION_STATUS_AVAILABLE, preconditionStatusAvailable);
    }

    /**
     * Gets the preconditionStatusAvailable.
     *
     * @return Boolean
     */
    public Boolean getPreconditionStatusAvailable() {
        return getBoolean(KEY_PRECONDITION_STATUS_AVAILABLE);
    }

    /**
     * Sets the testStatusAvailable.
     *
     * @param testStatusAvailable
     */
    public void setTestStatusAvailable(Boolean testStatusAvailable) {
        setValue(KEY_TEST_STATUS_AVAILABLE, testStatusAvailable);
    }

    /**
     * Gets the testStatusAvailable.
     *
     * @return Boolean
     */
    public Boolean getTestStatusAvailable() {
        return getBoolean(KEY_TEST_STATUS_AVAILABLE);
    }
}
