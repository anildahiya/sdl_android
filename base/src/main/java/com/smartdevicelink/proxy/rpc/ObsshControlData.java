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
import com.smartdevicelink.proxy.rpc.enums.FrontAxleLoadRestoration;
import com.smartdevicelink.proxy.rpc.enums.FrontAxleLoadRestorationStatus;
import com.smartdevicelink.proxy.rpc.enums.ObsshDisplayUnit;
import com.smartdevicelink.proxy.rpc.enums.ScreenMode;
import com.smartdevicelink.proxy.rpc.enums.ScreenModeStatus;
import com.smartdevicelink.proxy.rpc.enums.TailLightMode;
import com.smartdevicelink.proxy.rpc.enums.TailLightModeStatus;
import com.smartdevicelink.proxy.rpc.enums.TareStatus;

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
 *      <td>checkGear</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>checkSteeringWheel</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>checkFlatSurface</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>checkTirePressure</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>payload</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>payloadPercent</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>taredPayload</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>trailerTongueLoad</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>trailerTongueLoadPercent</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>frontAxleLoadRestorationPercent</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>factoryCurbWeight</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>grossVehicleWeightRating</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>grossCombinedWeightRating</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>frontGrossAxleWeightRating</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>rearGrossAxleWeightRating</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>maxHitchTrailerWeight</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>maxBedTrailerWeight</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>screenModeStatus</td>
 *      <td>ScreenModeStatus</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>tareStatus</td>
 *      <td>TareStatus</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>tailLightModeStatus</td>
 *      <td>TailLightModeStatus</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>trailerWeightStatus</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>frontAxleLoadRestorationStatus</td>
 *      <td>FrontAxleLoadRestorationStatus</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>screenMode</td>
 *      <td>ScreenMode</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>tare</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>tailLightMode</td>
 *      <td>TailLightMode</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>trailerWeight</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>frontAxleLoadRestoration</td>
 *      <td>FrontAxleLoadRestoration</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>displayUnit</td>
 *      <td>ObsshDisplayUnit</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>passengerWeight</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>screenStep</td>
 *      <td>Integer</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 * </table>
 * @since SmartDeviceLink 5.0.0
 */
public class ObsshControlData extends RPCStruct {
    public static final String KEY_CHECK_GEAR = "checkGear";
    public static final String KEY_CHECK_STEERING_WHEEL = "checkSteeringWheel";
    public static final String KEY_CHECK_FLAT_SURFACE = "checkFlatSurface";
    public static final String KEY_CHECK_TIRE_PRESSURE = "checkTirePressure";
    public static final String KEY_PAYLOAD = "payload";
    public static final String KEY_PAYLOAD_PERCENT = "payloadPercent";
    public static final String KEY_TARED_PAYLOAD = "taredPayload";
    public static final String KEY_TRAILER_TONGUE_LOAD = "trailerTongueLoad";
    public static final String KEY_TRAILER_TONGUE_LOAD_PERCENT = "trailerTongueLoadPercent";
    public static final String KEY_FRONT_AXLE_LOAD_RESTORATION_PERCENT = "frontAxleLoadRestorationPercent";
    public static final String KEY_FACTORY_CURB_WEIGHT = "factoryCurbWeight";
    public static final String KEY_GROSS_VEHICLE_WEIGHT_RATING = "grossVehicleWeightRating";
    public static final String KEY_GROSS_COMBINED_WEIGHT_RATING = "grossCombinedWeightRating";
    public static final String KEY_FRONT_GROSS_AXLE_WEIGHT_RATING = "frontGrossAxleWeightRating";
    public static final String KEY_REAR_GROSS_AXLE_WEIGHT_RATING = "rearGrossAxleWeightRating";
    public static final String KEY_MAX_HITCH_TRAILER_WEIGHT = "maxHitchTrailerWeight";
    public static final String KEY_MAX_BED_TRAILER_WEIGHT = "maxBedTrailerWeight";
    public static final String KEY_SCREEN_MODE_STATUS = "screenModeStatus";
    public static final String KEY_TARE_STATUS = "tareStatus";
    public static final String KEY_TAIL_LIGHT_MODE_STATUS = "tailLightModeStatus";
    public static final String KEY_TRAILER_WEIGHT_STATUS = "trailerWeightStatus";
    public static final String KEY_FRONT_AXLE_LOAD_RESTORATION_STATUS = "frontAxleLoadRestorationStatus";
    public static final String KEY_SCREEN_MODE = "screenMode";
    public static final String KEY_TARE = "tare";
    public static final String KEY_TAIL_LIGHT_MODE = "tailLightMode";
    public static final String KEY_TRAILER_WEIGHT = "trailerWeight";
    public static final String KEY_FRONT_AXLE_LOAD_RESTORATION = "frontAxleLoadRestoration";
    public static final String KEY_DISPLAY_UNIT = "displayUnit";
    public static final String KEY_PASSENGER_WEIGHT = "passengerWeight";
    public static final String KEY_SCREEN_STEP = "screenStep";

    /**
     * Constructs a new ObsshControlData object
     */
    public ObsshControlData() { }

    /**
     * Constructs a new ObsshControlData object indicated by the Hashtable parameter
     *
     * @param hash The Hashtable to use
     */
    public ObsshControlData(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Sets the checkGear.
     *
     * @param checkGear
     */
    public void setCheckGear(Boolean checkGear) {
        setValue(KEY_CHECK_GEAR, checkGear);
    }

    /**
     * Gets the checkGear.
     *
     * @return Boolean
     */
    public Boolean getCheckGear() {
        return getBoolean(KEY_CHECK_GEAR);
    }

    /**
     * Sets the checkSteeringWheel.
     *
     * @param checkSteeringWheel
     */
    public void setCheckSteeringWheel(Boolean checkSteeringWheel) {
        setValue(KEY_CHECK_STEERING_WHEEL, checkSteeringWheel);
    }

    /**
     * Gets the checkSteeringWheel.
     *
     * @return Boolean
     */
    public Boolean getCheckSteeringWheel() {
        return getBoolean(KEY_CHECK_STEERING_WHEEL);
    }

    /**
     * Sets the checkFlatSurface.
     *
     * @param checkFlatSurface
     */
    public void setCheckFlatSurface(Boolean checkFlatSurface) {
        setValue(KEY_CHECK_FLAT_SURFACE, checkFlatSurface);
    }

    /**
     * Gets the checkFlatSurface.
     *
     * @return Boolean
     */
    public Boolean getCheckFlatSurface() {
        return getBoolean(KEY_CHECK_FLAT_SURFACE);
    }

    /**
     * Sets the checkTirePressure.
     *
     * @param checkTirePressure
     */
    public void setCheckTirePressure(Boolean checkTirePressure) {
        setValue(KEY_CHECK_TIRE_PRESSURE, checkTirePressure);
    }

    /**
     * Gets the checkTirePressure.
     *
     * @return Boolean
     */
    public Boolean getCheckTirePressure() {
        return getBoolean(KEY_CHECK_TIRE_PRESSURE);
    }

    /**
     * Sets the payload.
     *
     * @param payload
     */
    public void setPayload(Integer payload) {
        setValue(KEY_PAYLOAD, payload);
    }

    /**
     * Gets the payload.
     *
     * @return Integer
     */
    public Integer getPayload() {
        return getInteger(KEY_PAYLOAD);
    }

    /**
     * Sets the payloadPercent.
     *
     * @param payloadPercent
     */
    public void setPayloadPercent(Integer payloadPercent) {
        setValue(KEY_PAYLOAD_PERCENT, payloadPercent);
    }

    /**
     * Gets the payloadPercent.
     *
     * @return Integer
     */
    public Integer getPayloadPercent() {
        return getInteger(KEY_PAYLOAD_PERCENT);
    }

    /**
     * Sets the taredPayload.
     *
     * @param taredPayload
     */
    public void setTaredPayload(Integer taredPayload) {
        setValue(KEY_TARED_PAYLOAD, taredPayload);
    }

    /**
     * Gets the taredPayload.
     *
     * @return Integer
     */
    public Integer getTaredPayload() {
        return getInteger(KEY_TARED_PAYLOAD);
    }

    /**
     * Sets the trailerTongueLoad.
     *
     * @param trailerTongueLoad
     */
    public void setTrailerTongueLoad(Integer trailerTongueLoad) {
        setValue(KEY_TRAILER_TONGUE_LOAD, trailerTongueLoad);
    }

    /**
     * Gets the trailerTongueLoad.
     *
     * @return Integer
     */
    public Integer getTrailerTongueLoad() {
        return getInteger(KEY_TRAILER_TONGUE_LOAD);
    }

    /**
     * Sets the trailerTongueLoadPercent.
     *
     * @param trailerTongueLoadPercent
     */
    public void setTrailerTongueLoadPercent(Integer trailerTongueLoadPercent) {
        setValue(KEY_TRAILER_TONGUE_LOAD_PERCENT, trailerTongueLoadPercent);
    }

    /**
     * Gets the trailerTongueLoadPercent.
     *
     * @return Integer
     */
    public Integer getTrailerTongueLoadPercent() {
        return getInteger(KEY_TRAILER_TONGUE_LOAD_PERCENT);
    }

    /**
     * Sets the frontAxleLoadRestorationPercent.
     *
     * @param frontAxleLoadRestorationPercent
     */
    public void setFrontAxleLoadRestorationPercent(Integer frontAxleLoadRestorationPercent) {
        setValue(KEY_FRONT_AXLE_LOAD_RESTORATION_PERCENT, frontAxleLoadRestorationPercent);
    }

    /**
     * Gets the frontAxleLoadRestorationPercent.
     *
     * @return Integer
     */
    public Integer getFrontAxleLoadRestorationPercent() {
        return getInteger(KEY_FRONT_AXLE_LOAD_RESTORATION_PERCENT);
    }

    /**
     * Sets the factoryCurbWeight.
     *
     * @param factoryCurbWeight
     */
    public void setFactoryCurbWeight(Integer factoryCurbWeight) {
        setValue(KEY_FACTORY_CURB_WEIGHT, factoryCurbWeight);
    }

    /**
     * Gets the factoryCurbWeight.
     *
     * @return Integer
     */
    public Integer getFactoryCurbWeight() {
        return getInteger(KEY_FACTORY_CURB_WEIGHT);
    }

    /**
     * Sets the grossVehicleWeightRating.
     *
     * @param grossVehicleWeightRating
     */
    public void setGrossVehicleWeightRating(Integer grossVehicleWeightRating) {
        setValue(KEY_GROSS_VEHICLE_WEIGHT_RATING, grossVehicleWeightRating);
    }

    /**
     * Gets the grossVehicleWeightRating.
     *
     * @return Integer
     */
    public Integer getGrossVehicleWeightRating() {
        return getInteger(KEY_GROSS_VEHICLE_WEIGHT_RATING);
    }

    /**
     * Sets the grossCombinedWeightRating.
     *
     * @param grossCombinedWeightRating
     */
    public void setGrossCombinedWeightRating(Integer grossCombinedWeightRating) {
        setValue(KEY_GROSS_COMBINED_WEIGHT_RATING, grossCombinedWeightRating);
    }

    /**
     * Gets the grossCombinedWeightRating.
     *
     * @return Integer
     */
    public Integer getGrossCombinedWeightRating() {
        return getInteger(KEY_GROSS_COMBINED_WEIGHT_RATING);
    }

    /**
     * Sets the frontGrossAxleWeightRating.
     *
     * @param frontGrossAxleWeightRating
     */
    public void setFrontGrossAxleWeightRating(Integer frontGrossAxleWeightRating) {
        setValue(KEY_FRONT_GROSS_AXLE_WEIGHT_RATING, frontGrossAxleWeightRating);
    }

    /**
     * Gets the frontGrossAxleWeightRating.
     *
     * @return Integer
     */
    public Integer getFrontGrossAxleWeightRating() {
        return getInteger(KEY_FRONT_GROSS_AXLE_WEIGHT_RATING);
    }

    /**
     * Sets the rearGrossAxleWeightRating.
     *
     * @param rearGrossAxleWeightRating
     */
    public void setRearGrossAxleWeightRating(Integer rearGrossAxleWeightRating) {
        setValue(KEY_REAR_GROSS_AXLE_WEIGHT_RATING, rearGrossAxleWeightRating);
    }

    /**
     * Gets the rearGrossAxleWeightRating.
     *
     * @return Integer
     */
    public Integer getRearGrossAxleWeightRating() {
        return getInteger(KEY_REAR_GROSS_AXLE_WEIGHT_RATING);
    }

    /**
     * Sets the maxHitchTrailerWeight.
     *
     * @param maxHitchTrailerWeight
     */
    public void setMaxHitchTrailerWeight(Integer maxHitchTrailerWeight) {
        setValue(KEY_MAX_HITCH_TRAILER_WEIGHT, maxHitchTrailerWeight);
    }

    /**
     * Gets the maxHitchTrailerWeight.
     *
     * @return Integer
     */
    public Integer getMaxHitchTrailerWeight() {
        return getInteger(KEY_MAX_HITCH_TRAILER_WEIGHT);
    }

    /**
     * Sets the maxBedTrailerWeight.
     *
     * @param maxBedTrailerWeight
     */
    public void setMaxBedTrailerWeight(Integer maxBedTrailerWeight) {
        setValue(KEY_MAX_BED_TRAILER_WEIGHT, maxBedTrailerWeight);
    }

    /**
     * Gets the maxBedTrailerWeight.
     *
     * @return Integer
     */
    public Integer getMaxBedTrailerWeight() {
        return getInteger(KEY_MAX_BED_TRAILER_WEIGHT);
    }

    /**
     * Sets the screenModeStatus.
     *
     * @param screenModeStatus
     */
    public void setScreenModeStatus(ScreenModeStatus screenModeStatus) {
        setValue(KEY_SCREEN_MODE_STATUS, screenModeStatus);
    }

    /**
     * Gets the screenModeStatus.
     *
     * @return ScreenModeStatus
     */
    public ScreenModeStatus getScreenModeStatus() {
        return (ScreenModeStatus) getObject(ScreenModeStatus.class, KEY_SCREEN_MODE_STATUS);
    }

    /**
     * Sets the tareStatus.
     *
     * @param tareStatus
     */
    public void setTareStatus(TareStatus tareStatus) {
        setValue(KEY_TARE_STATUS, tareStatus);
    }

    /**
     * Gets the tareStatus.
     *
     * @return TareStatus
     */
    public TareStatus getTareStatus() {
        return (TareStatus) getObject(TareStatus.class, KEY_TARE_STATUS);
    }

    /**
     * Sets the tailLightModeStatus.
     *
     * @param tailLightModeStatus
     */
    public void setTailLightModeStatus(TailLightModeStatus tailLightModeStatus) {
        setValue(KEY_TAIL_LIGHT_MODE_STATUS, tailLightModeStatus);
    }

    /**
     * Gets the tailLightModeStatus.
     *
     * @return TailLightModeStatus
     */
    public TailLightModeStatus getTailLightModeStatus() {
        return (TailLightModeStatus) getObject(TailLightModeStatus.class, KEY_TAIL_LIGHT_MODE_STATUS);
    }

    /**
     * Sets the trailerWeightStatus.
     *
     * @param trailerWeightStatus
     */
    public void setTrailerWeightStatus(Integer trailerWeightStatus) {
        setValue(KEY_TRAILER_WEIGHT_STATUS, trailerWeightStatus);
    }

    /**
     * Gets the trailerWeightStatus.
     *
     * @return Integer
     */
    public Integer getTrailerWeightStatus() {
        return getInteger(KEY_TRAILER_WEIGHT_STATUS);
    }

    /**
     * Sets the frontAxleLoadRestorationStatus.
     *
     * @param frontAxleLoadRestorationStatus
     */
    public void setFrontAxleLoadRestorationStatus(FrontAxleLoadRestorationStatus frontAxleLoadRestorationStatus) {
        setValue(KEY_FRONT_AXLE_LOAD_RESTORATION_STATUS, frontAxleLoadRestorationStatus);
    }

    /**
     * Gets the frontAxleLoadRestorationStatus.
     *
     * @return FrontAxleLoadRestorationStatus
     */
    public FrontAxleLoadRestorationStatus getFrontAxleLoadRestorationStatus() {
        return (FrontAxleLoadRestorationStatus) getObject(FrontAxleLoadRestorationStatus.class, KEY_FRONT_AXLE_LOAD_RESTORATION_STATUS);
    }

    /**
     * Sets the screenMode.
     *
     * @param screenMode
     */
    public void setScreenMode(ScreenMode screenMode) {
        setValue(KEY_SCREEN_MODE, screenMode);
    }

    /**
     * Gets the screenMode.
     *
     * @return ScreenMode
     */
    public ScreenMode getScreenMode() {
        return (ScreenMode) getObject(ScreenMode.class, KEY_SCREEN_MODE);
    }

    /**
     * Sets the tare.
     *
     * @param tare
     */
    public void setTare(Boolean tare) {
        setValue(KEY_TARE, tare);
    }

    /**
     * Gets the tare.
     *
     * @return Boolean
     */
    public Boolean getTare() {
        return getBoolean(KEY_TARE);
    }

    /**
     * Sets the tailLightMode.
     *
     * @param tailLightMode
     */
    public void setTailLightMode(TailLightMode tailLightMode) {
        setValue(KEY_TAIL_LIGHT_MODE, tailLightMode);
    }

    /**
     * Gets the tailLightMode.
     *
     * @return TailLightMode
     */
    public TailLightMode getTailLightMode() {
        return (TailLightMode) getObject(TailLightMode.class, KEY_TAIL_LIGHT_MODE);
    }

    /**
     * Sets the trailerWeight.
     *
     * @param trailerWeight
     */
    public void setTrailerWeight(Integer trailerWeight) {
        setValue(KEY_TRAILER_WEIGHT, trailerWeight);
    }

    /**
     * Gets the trailerWeight.
     *
     * @return Integer
     */
    public Integer getTrailerWeight() {
        return getInteger(KEY_TRAILER_WEIGHT);
    }

    /**
     * Sets the frontAxleLoadRestoration.
     *
     * @param frontAxleLoadRestoration
     */
    public void setFrontAxleLoadRestoration(FrontAxleLoadRestoration frontAxleLoadRestoration) {
        setValue(KEY_FRONT_AXLE_LOAD_RESTORATION, frontAxleLoadRestoration);
    }

    /**
     * Gets the frontAxleLoadRestoration.
     *
     * @return FrontAxleLoadRestoration
     */
    public FrontAxleLoadRestoration getFrontAxleLoadRestoration() {
        return (FrontAxleLoadRestoration) getObject(FrontAxleLoadRestoration.class, KEY_FRONT_AXLE_LOAD_RESTORATION);
    }

    /**
     * Sets the displayUnit.
     *
     * @param displayUnit
     */
    public void setDisplayUnit(ObsshDisplayUnit displayUnit) {
        setValue(KEY_DISPLAY_UNIT, displayUnit);
    }

    /**
     * Gets the displayUnit.
     *
     * @return ObsshDisplayUnit
     */
    public ObsshDisplayUnit getDisplayUnit() {
        return (ObsshDisplayUnit) getObject(ObsshDisplayUnit.class, KEY_DISPLAY_UNIT);
    }

    /**
     * Sets the passengerWeight.
     *
     * @param passengerWeight
     */
    public void setPassengerWeight(Integer passengerWeight) {
        setValue(KEY_PASSENGER_WEIGHT, passengerWeight);
    }

    /**
     * Gets the passengerWeight.
     *
     * @return Integer
     */
    public Integer getPassengerWeight() {
        return getInteger(KEY_PASSENGER_WEIGHT);
    }

    /**
     * Sets the screenStep.
     *
     * @param screenStep
     */
    public void setScreenStep(Integer screenStep) {
        setValue(KEY_SCREEN_STEP, screenStep);
    }

    /**
     * Gets the screenStep.
     *
     * @return Integer
     */
    public Integer getScreenStep() {
        return getInteger(KEY_SCREEN_STEP);
    }
}
