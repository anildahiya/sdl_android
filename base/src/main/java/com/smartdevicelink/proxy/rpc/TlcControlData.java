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
import com.smartdevicelink.proxy.rpc.enums.PreconditionStatus;
import com.smartdevicelink.proxy.rpc.enums.TestStatus;
import com.smartdevicelink.proxy.rpc.enums.UserInput;

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
 *      <td>userInput</td>
 *      <td>UserInput</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>preconditionStatus</td>
 *      <td>PreconditionStatus</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>testStatus </td>
 *      <td>TestStatus</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 * </table>
 * @since SmartDeviceLink 6.0.0
 */
public class TlcControlData extends RPCStruct {
    public static final String KEY_USER_INPUT = "userInput";
    public static final String KEY_PRECONDITION_STATUS = "preconditionStatus";
    public static final String KEY_TEST_STATUS  = "testStatus ";

    /**
     * Constructs a new TlcControlData object
     */
    public TlcControlData() { }

    /**
     * Constructs a new TlcControlData object indicated by the Hashtable parameter
     *
     * @param hash The Hashtable to use
     */
    public TlcControlData(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Sets the userInput.
     *
     * @param userInput
     */
    public void setUserInput(UserInput userInput) {
        setValue(KEY_USER_INPUT, userInput);
    }

    /**
     * Gets the userInput.
     *
     * @return UserInput
     */
    public UserInput getUserInput() {
        return (UserInput) getObject(UserInput.class, KEY_USER_INPUT);
    }

    /**
     * Sets the preconditionStatus.
     *
     * @param preconditionStatus
     */
    public void setPreconditionStatus(PreconditionStatus preconditionStatus) {
        setValue(KEY_PRECONDITION_STATUS, preconditionStatus);
    }

    /**
     * Gets the preconditionStatus.
     *
     * @return PreconditionStatus
     */
    public PreconditionStatus getPreconditionStatus() {
        return (PreconditionStatus) getObject(PreconditionStatus.class, KEY_PRECONDITION_STATUS);
    }

    /**
     * Sets the testStatus .
     *
     * @param testStatus 
     */
    public void setTestStatus (TestStatus testStatus ) {
        setValue(KEY_TEST_STATUS , testStatus );
    }

    /**
     * Gets the testStatus .
     *
     * @return TestStatus
     */
    public TestStatus getTestStatus () {
        return (TestStatus) getObject(TestStatus.class, KEY_TEST_STATUS );
    }
}
