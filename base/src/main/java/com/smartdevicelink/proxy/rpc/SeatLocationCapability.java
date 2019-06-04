/*
 * Copyright (c) 2017 - 2019, SmartDeviceLink Consortium, Inc.
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
 * Neither the name of the SmartDeviceLink Consortium, Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from this
 * software without specific prior written permission.
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
import java.util.Hashtable;
import java.util.List;

public class SeatLocationCapability extends RPCStruct {
    public static final String KEY_ROWS = "rows";
    public static final String KEY_COLUMNS = "columns";
    public static final String KEY_LEVELS = "levels";
    public static final String KEY_SEATS = "seats";

    public SeatLocationCapability() {
    }

    public SeatLocationCapability(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Sets the rows portion of the SeatLocationCapability class
     *
     * @param rows
     */
    public void setRows(Integer rows) {
        setValue(KEY_ROWS, rows);
    }

    /**
     * Gets the rows portion of the SeatLocationCapability class
     *
     * @return Integer
     */
    public Integer getRows() {
        return getInteger(KEY_ROWS);
    }

    /**
     * Sets the columns portion of the SeatLocationCapability class
     *
     * @param columns
     */
    public void setColumns(Integer columns) {
        setValue(KEY_COLUMNS, columns);
    }

    /**
     * Gets the columns portion of the SeatLocationCapability class
     *
     * @return Integer
     */
    public Integer getColumns() {
        return getInteger(KEY_COLUMNS);
    }

    /**
     * Sets the levels portion of the SeatLocationCapability class
     *
     * @param levels
     */
    public void setLevels(Integer levels) {
        setValue(KEY_LEVELS, levels);
    }

    /**
     * Gets the levels portion of the SeatLocationCapability class
     *
     * @return Integer
     */
    public Integer getLevels() {
        return getInteger(KEY_LEVELS);
    }

    /**
     * Sets the seats portion of the SeatLocationCapability class
     *
     * @param seats Contains a list of SeatLocation in the vehicle, the first element is the driver's seat.
     */
    public void setSeats(List<SeatLocation> seats) {
        setValue(KEY_SEATS, seats);
    }

    /**
     * Gets the seats portion of the SeatLocationCapability class
     *
     * @return List<SeatLocation>
     * Contains a list of SeatLocation in the vehicle, the first element is the driver's seat.
     */
    @SuppressWarnings("unchecked")
    public List<SeatLocation> getSeats() {
        return (List<SeatLocation>) getObject(SeatLocation.class, KEY_SEATS);
    }
}
