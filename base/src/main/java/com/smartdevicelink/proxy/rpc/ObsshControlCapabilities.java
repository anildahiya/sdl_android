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
 * Contains information about a OBSSH control module's capabilities.
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
 *      <td>checkGearAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>checkSteeringWheelAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>checkFlatSurfaceAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>checkTirePressureAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>payloadAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>payloadPercentAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>taredPayloadAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>trailerTongueLoadAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>trailerTongueLoadPercentAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>frontAxleLoadRestorationPercentAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>factoryCurbWeightAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>grossVehicleWeightRatingAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>grossCombinedWeightRatingAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>frontGrossAxleWeightRatingAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>rearGrossAxleWeightRatingAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>maxHitchTrailerWeightAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>maxBedTrailerWeightAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>screenModeStatusAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>tareStatusAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>tailLightModeStatusAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>trailerWeightStatusAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>frontAxleLoadRestorationStatusAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>screenModeAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>tareAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>tailLightModeAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>trailerWeightAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>frontAxleLoadRestorationAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>displayUnitAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>passengerWeightAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 *  <tr>
 *      <td>screenStepAvailable</td>
 *      <td>Boolean</td>
 *      <td></td>
 *      <td>N</td>
 *      <td></td>
 *  </tr>
 * </table>
 *
 * @since SmartDeviceLink 5.0.0
 */
public class ObsshControlCapabilities extends RPCStruct {
    public static final String KEY_MODULE_NAME = "moduleName";
    public static final String KEY_CHECK_GEAR_AVAILABLE = "checkGearAvailable";
    public static final String KEY_CHECK_STEERING_WHEEL_AVAILABLE = "checkSteeringWheelAvailable";
    public static final String KEY_CHECK_FLAT_SURFACE_AVAILABLE = "checkFlatSurfaceAvailable";
    public static final String KEY_CHECK_TIRE_PRESSURE_AVAILABLE = "checkTirePressureAvailable";
    public static final String KEY_PAYLOAD_AVAILABLE = "payloadAvailable";
    public static final String KEY_PAYLOAD_PERCENT_AVAILABLE = "payloadPercentAvailable";
    public static final String KEY_TARED_PAYLOAD_AVAILABLE = "taredPayloadAvailable";
    public static final String KEY_TRAILER_TONGUE_LOAD_AVAILABLE = "trailerTongueLoadAvailable";
    public static final String KEY_TRAILER_TONGUE_LOAD_PERCENT_AVAILABLE = "trailerTongueLoadPercentAvailable";
    public static final String KEY_FRONT_AXLE_LOAD_RESTORATION_PERCENT_AVAILABLE = "frontAxleLoadRestorationPercentAvailable";
    public static final String KEY_FACTORY_CURB_WEIGHT_AVAILABLE = "factoryCurbWeightAvailable";
    public static final String KEY_GROSS_VEHICLE_WEIGHT_RATING_AVAILABLE = "grossVehicleWeightRatingAvailable";
    public static final String KEY_GROSS_COMBINED_WEIGHT_RATING_AVAILABLE = "grossCombinedWeightRatingAvailable";
    public static final String KEY_FRONT_GROSS_AXLE_WEIGHT_RATING_AVAILABLE = "frontGrossAxleWeightRatingAvailable";
    public static final String KEY_REAR_GROSS_AXLE_WEIGHT_RATING_AVAILABLE = "rearGrossAxleWeightRatingAvailable";
    public static final String KEY_MAX_HITCH_TRAILER_WEIGHT_AVAILABLE = "maxHitchTrailerWeightAvailable";
    public static final String KEY_MAX_BED_TRAILER_WEIGHT_AVAILABLE = "maxBedTrailerWeightAvailable";
    public static final String KEY_SCREEN_MODE_STATUS_AVAILABLE = "screenModeStatusAvailable";
    public static final String KEY_TARE_STATUS_AVAILABLE = "tareStatusAvailable";
    public static final String KEY_TAIL_LIGHT_MODE_STATUS_AVAILABLE = "tailLightModeStatusAvailable";
    public static final String KEY_TRAILER_WEIGHT_STATUS_AVAILABLE = "trailerWeightStatusAvailable";
    public static final String KEY_FRONT_AXLE_LOAD_RESTORATION_STATUS_AVAILABLE = "frontAxleLoadRestorationStatusAvailable";
    public static final String KEY_SCREEN_MODE_AVAILABLE = "screenModeAvailable";
    public static final String KEY_TARE_AVAILABLE = "tareAvailable";
    public static final String KEY_TAIL_LIGHT_MODE_AVAILABLE = "tailLightModeAvailable";
    public static final String KEY_TRAILER_WEIGHT_AVAILABLE = "trailerWeightAvailable";
    public static final String KEY_FRONT_AXLE_LOAD_RESTORATION_AVAILABLE = "frontAxleLoadRestorationAvailable";
    public static final String KEY_DISPLAY_UNIT_AVAILABLE = "displayUnitAvailable";
    public static final String KEY_PASSENGER_WEIGHT_AVAILABLE = "passengerWeightAvailable";
    public static final String KEY_SCREEN_STEP_AVAILABLE = "screenStepAvailable";

    /**
     * Constructs a new ObsshControlCapabilities object
     */
    public ObsshControlCapabilities() { }

    /**
     * Constructs a new ObsshControlCapabilities object indicated by the Hashtable parameter
     *
     * @param hash The Hashtable to use
     */
    public ObsshControlCapabilities(Hashtable<String, Object> hash) {
        super(hash);
    }

    /**
     * Constructs a new ObsshControlCapabilities object
     *
     * @param moduleName
     */
    public ObsshControlCapabilities(@NonNull String moduleName) {
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
     * Sets the checkGearAvailable.
     *
     * @param checkGearAvailable
     */
    public void setCheckGearAvailable(Boolean checkGearAvailable) {
        setValue(KEY_CHECK_GEAR_AVAILABLE, checkGearAvailable);
    }

    /**
     * Gets the checkGearAvailable.
     *
     * @return Boolean
     */
    public Boolean getCheckGearAvailable() {
        return getBoolean(KEY_CHECK_GEAR_AVAILABLE);
    }

    /**
     * Sets the checkSteeringWheelAvailable.
     *
     * @param checkSteeringWheelAvailable
     */
    public void setCheckSteeringWheelAvailable(Boolean checkSteeringWheelAvailable) {
        setValue(KEY_CHECK_STEERING_WHEEL_AVAILABLE, checkSteeringWheelAvailable);
    }

    /**
     * Gets the checkSteeringWheelAvailable.
     *
     * @return Boolean
     */
    public Boolean getCheckSteeringWheelAvailable() {
        return getBoolean(KEY_CHECK_STEERING_WHEEL_AVAILABLE);
    }

    /**
     * Sets the checkFlatSurfaceAvailable.
     *
     * @param checkFlatSurfaceAvailable
     */
    public void setCheckFlatSurfaceAvailable(Boolean checkFlatSurfaceAvailable) {
        setValue(KEY_CHECK_FLAT_SURFACE_AVAILABLE, checkFlatSurfaceAvailable);
    }

    /**
     * Gets the checkFlatSurfaceAvailable.
     *
     * @return Boolean
     */
    public Boolean getCheckFlatSurfaceAvailable() {
        return getBoolean(KEY_CHECK_FLAT_SURFACE_AVAILABLE);
    }

    /**
     * Sets the checkTirePressureAvailable.
     *
     * @param checkTirePressureAvailable
     */
    public void setCheckTirePressureAvailable(Boolean checkTirePressureAvailable) {
        setValue(KEY_CHECK_TIRE_PRESSURE_AVAILABLE, checkTirePressureAvailable);
    }

    /**
     * Gets the checkTirePressureAvailable.
     *
     * @return Boolean
     */
    public Boolean getCheckTirePressureAvailable() {
        return getBoolean(KEY_CHECK_TIRE_PRESSURE_AVAILABLE);
    }

    /**
     * Sets the payloadAvailable.
     *
     * @param payloadAvailable
     */
    public void setPayloadAvailable(Boolean payloadAvailable) {
        setValue(KEY_PAYLOAD_AVAILABLE, payloadAvailable);
    }

    /**
     * Gets the payloadAvailable.
     *
     * @return Boolean
     */
    public Boolean getPayloadAvailable() {
        return getBoolean(KEY_PAYLOAD_AVAILABLE);
    }

    /**
     * Sets the payloadPercentAvailable.
     *
     * @param payloadPercentAvailable
     */
    public void setPayloadPercentAvailable(Boolean payloadPercentAvailable) {
        setValue(KEY_PAYLOAD_PERCENT_AVAILABLE, payloadPercentAvailable);
    }

    /**
     * Gets the payloadPercentAvailable.
     *
     * @return Boolean
     */
    public Boolean getPayloadPercentAvailable() {
        return getBoolean(KEY_PAYLOAD_PERCENT_AVAILABLE);
    }

    /**
     * Sets the taredPayloadAvailable.
     *
     * @param taredPayloadAvailable
     */
    public void setTaredPayloadAvailable(Boolean taredPayloadAvailable) {
        setValue(KEY_TARED_PAYLOAD_AVAILABLE, taredPayloadAvailable);
    }

    /**
     * Gets the taredPayloadAvailable.
     *
     * @return Boolean
     */
    public Boolean getTaredPayloadAvailable() {
        return getBoolean(KEY_TARED_PAYLOAD_AVAILABLE);
    }

    /**
     * Sets the trailerTongueLoadAvailable.
     *
     * @param trailerTongueLoadAvailable
     */
    public void setTrailerTongueLoadAvailable(Boolean trailerTongueLoadAvailable) {
        setValue(KEY_TRAILER_TONGUE_LOAD_AVAILABLE, trailerTongueLoadAvailable);
    }

    /**
     * Gets the trailerTongueLoadAvailable.
     *
     * @return Boolean
     */
    public Boolean getTrailerTongueLoadAvailable() {
        return getBoolean(KEY_TRAILER_TONGUE_LOAD_AVAILABLE);
    }

    /**
     * Sets the trailerTongueLoadPercentAvailable.
     *
     * @param trailerTongueLoadPercentAvailable
     */
    public void setTrailerTongueLoadPercentAvailable(Boolean trailerTongueLoadPercentAvailable) {
        setValue(KEY_TRAILER_TONGUE_LOAD_PERCENT_AVAILABLE, trailerTongueLoadPercentAvailable);
    }

    /**
     * Gets the trailerTongueLoadPercentAvailable.
     *
     * @return Boolean
     */
    public Boolean getTrailerTongueLoadPercentAvailable() {
        return getBoolean(KEY_TRAILER_TONGUE_LOAD_PERCENT_AVAILABLE);
    }

    /**
     * Sets the frontAxleLoadRestorationPercentAvailable.
     *
     * @param frontAxleLoadRestorationPercentAvailable
     */
    public void setFrontAxleLoadRestorationPercentAvailable(Boolean frontAxleLoadRestorationPercentAvailable) {
        setValue(KEY_FRONT_AXLE_LOAD_RESTORATION_PERCENT_AVAILABLE, frontAxleLoadRestorationPercentAvailable);
    }

    /**
     * Gets the frontAxleLoadRestorationPercentAvailable.
     *
     * @return Boolean
     */
    public Boolean getFrontAxleLoadRestorationPercentAvailable() {
        return getBoolean(KEY_FRONT_AXLE_LOAD_RESTORATION_PERCENT_AVAILABLE);
    }

    /**
     * Sets the factoryCurbWeightAvailable.
     *
     * @param factoryCurbWeightAvailable
     */
    public void setFactoryCurbWeightAvailable(Boolean factoryCurbWeightAvailable) {
        setValue(KEY_FACTORY_CURB_WEIGHT_AVAILABLE, factoryCurbWeightAvailable);
    }

    /**
     * Gets the factoryCurbWeightAvailable.
     *
     * @return Boolean
     */
    public Boolean getFactoryCurbWeightAvailable() {
        return getBoolean(KEY_FACTORY_CURB_WEIGHT_AVAILABLE);
    }

    /**
     * Sets the grossVehicleWeightRatingAvailable.
     *
     * @param grossVehicleWeightRatingAvailable
     */
    public void setGrossVehicleWeightRatingAvailable(Boolean grossVehicleWeightRatingAvailable) {
        setValue(KEY_GROSS_VEHICLE_WEIGHT_RATING_AVAILABLE, grossVehicleWeightRatingAvailable);
    }

    /**
     * Gets the grossVehicleWeightRatingAvailable.
     *
     * @return Boolean
     */
    public Boolean getGrossVehicleWeightRatingAvailable() {
        return getBoolean(KEY_GROSS_VEHICLE_WEIGHT_RATING_AVAILABLE);
    }

    /**
     * Sets the grossCombinedWeightRatingAvailable.
     *
     * @param grossCombinedWeightRatingAvailable
     */
    public void setGrossCombinedWeightRatingAvailable(Boolean grossCombinedWeightRatingAvailable) {
        setValue(KEY_GROSS_COMBINED_WEIGHT_RATING_AVAILABLE, grossCombinedWeightRatingAvailable);
    }

    /**
     * Gets the grossCombinedWeightRatingAvailable.
     *
     * @return Boolean
     */
    public Boolean getGrossCombinedWeightRatingAvailable() {
        return getBoolean(KEY_GROSS_COMBINED_WEIGHT_RATING_AVAILABLE);
    }

    /**
     * Sets the frontGrossAxleWeightRatingAvailable.
     *
     * @param frontGrossAxleWeightRatingAvailable
     */
    public void setFrontGrossAxleWeightRatingAvailable(Boolean frontGrossAxleWeightRatingAvailable) {
        setValue(KEY_FRONT_GROSS_AXLE_WEIGHT_RATING_AVAILABLE, frontGrossAxleWeightRatingAvailable);
    }

    /**
     * Gets the frontGrossAxleWeightRatingAvailable.
     *
     * @return Boolean
     */
    public Boolean getFrontGrossAxleWeightRatingAvailable() {
        return getBoolean(KEY_FRONT_GROSS_AXLE_WEIGHT_RATING_AVAILABLE);
    }

    /**
     * Sets the rearGrossAxleWeightRatingAvailable.
     *
     * @param rearGrossAxleWeightRatingAvailable
     */
    public void setRearGrossAxleWeightRatingAvailable(Boolean rearGrossAxleWeightRatingAvailable) {
        setValue(KEY_REAR_GROSS_AXLE_WEIGHT_RATING_AVAILABLE, rearGrossAxleWeightRatingAvailable);
    }

    /**
     * Gets the rearGrossAxleWeightRatingAvailable.
     *
     * @return Boolean
     */
    public Boolean getRearGrossAxleWeightRatingAvailable() {
        return getBoolean(KEY_REAR_GROSS_AXLE_WEIGHT_RATING_AVAILABLE);
    }

    /**
     * Sets the maxHitchTrailerWeightAvailable.
     *
     * @param maxHitchTrailerWeightAvailable
     */
    public void setMaxHitchTrailerWeightAvailable(Boolean maxHitchTrailerWeightAvailable) {
        setValue(KEY_MAX_HITCH_TRAILER_WEIGHT_AVAILABLE, maxHitchTrailerWeightAvailable);
    }

    /**
     * Gets the maxHitchTrailerWeightAvailable.
     *
     * @return Boolean
     */
    public Boolean getMaxHitchTrailerWeightAvailable() {
        return getBoolean(KEY_MAX_HITCH_TRAILER_WEIGHT_AVAILABLE);
    }

    /**
     * Sets the maxBedTrailerWeightAvailable.
     *
     * @param maxBedTrailerWeightAvailable
     */
    public void setMaxBedTrailerWeightAvailable(Boolean maxBedTrailerWeightAvailable) {
        setValue(KEY_MAX_BED_TRAILER_WEIGHT_AVAILABLE, maxBedTrailerWeightAvailable);
    }

    /**
     * Gets the maxBedTrailerWeightAvailable.
     *
     * @return Boolean
     */
    public Boolean getMaxBedTrailerWeightAvailable() {
        return getBoolean(KEY_MAX_BED_TRAILER_WEIGHT_AVAILABLE);
    }

    /**
     * Sets the screenModeStatusAvailable.
     *
     * @param screenModeStatusAvailable
     */
    public void setScreenModeStatusAvailable(Boolean screenModeStatusAvailable) {
        setValue(KEY_SCREEN_MODE_STATUS_AVAILABLE, screenModeStatusAvailable);
    }

    /**
     * Gets the screenModeStatusAvailable.
     *
     * @return Boolean
     */
    public Boolean getScreenModeStatusAvailable() {
        return getBoolean(KEY_SCREEN_MODE_STATUS_AVAILABLE);
    }

    /**
     * Sets the tareStatusAvailable.
     *
     * @param tareStatusAvailable
     */
    public void setTareStatusAvailable(Boolean tareStatusAvailable) {
        setValue(KEY_TARE_STATUS_AVAILABLE, tareStatusAvailable);
    }

    /**
     * Gets the tareStatusAvailable.
     *
     * @return Boolean
     */
    public Boolean getTareStatusAvailable() {
        return getBoolean(KEY_TARE_STATUS_AVAILABLE);
    }

    /**
     * Sets the tailLightModeStatusAvailable.
     *
     * @param tailLightModeStatusAvailable
     */
    public void setTailLightModeStatusAvailable(Boolean tailLightModeStatusAvailable) {
        setValue(KEY_TAIL_LIGHT_MODE_STATUS_AVAILABLE, tailLightModeStatusAvailable);
    }

    /**
     * Gets the tailLightModeStatusAvailable.
     *
     * @return Boolean
     */
    public Boolean getTailLightModeStatusAvailable() {
        return getBoolean(KEY_TAIL_LIGHT_MODE_STATUS_AVAILABLE);
    }

    /**
     * Sets the trailerWeightStatusAvailable.
     *
     * @param trailerWeightStatusAvailable
     */
    public void setTrailerWeightStatusAvailable(Boolean trailerWeightStatusAvailable) {
        setValue(KEY_TRAILER_WEIGHT_STATUS_AVAILABLE, trailerWeightStatusAvailable);
    }

    /**
     * Gets the trailerWeightStatusAvailable.
     *
     * @return Boolean
     */
    public Boolean getTrailerWeightStatusAvailable() {
        return getBoolean(KEY_TRAILER_WEIGHT_STATUS_AVAILABLE);
    }

    /**
     * Sets the frontAxleLoadRestorationStatusAvailable.
     *
     * @param frontAxleLoadRestorationStatusAvailable
     */
    public void setFrontAxleLoadRestorationStatusAvailable(Boolean frontAxleLoadRestorationStatusAvailable) {
        setValue(KEY_FRONT_AXLE_LOAD_RESTORATION_STATUS_AVAILABLE, frontAxleLoadRestorationStatusAvailable);
    }

    /**
     * Gets the frontAxleLoadRestorationStatusAvailable.
     *
     * @return Boolean
     */
    public Boolean getFrontAxleLoadRestorationStatusAvailable() {
        return getBoolean(KEY_FRONT_AXLE_LOAD_RESTORATION_STATUS_AVAILABLE);
    }

    /**
     * Sets the screenModeAvailable.
     *
     * @param screenModeAvailable
     */
    public void setScreenModeAvailable(Boolean screenModeAvailable) {
        setValue(KEY_SCREEN_MODE_AVAILABLE, screenModeAvailable);
    }

    /**
     * Gets the screenModeAvailable.
     *
     * @return Boolean
     */
    public Boolean getScreenModeAvailable() {
        return getBoolean(KEY_SCREEN_MODE_AVAILABLE);
    }

    /**
     * Sets the tareAvailable.
     *
     * @param tareAvailable
     */
    public void setTareAvailable(Boolean tareAvailable) {
        setValue(KEY_TARE_AVAILABLE, tareAvailable);
    }

    /**
     * Gets the tareAvailable.
     *
     * @return Boolean
     */
    public Boolean getTareAvailable() {
        return getBoolean(KEY_TARE_AVAILABLE);
    }

    /**
     * Sets the tailLightModeAvailable.
     *
     * @param tailLightModeAvailable
     */
    public void setTailLightModeAvailable(Boolean tailLightModeAvailable) {
        setValue(KEY_TAIL_LIGHT_MODE_AVAILABLE, tailLightModeAvailable);
    }

    /**
     * Gets the tailLightModeAvailable.
     *
     * @return Boolean
     */
    public Boolean getTailLightModeAvailable() {
        return getBoolean(KEY_TAIL_LIGHT_MODE_AVAILABLE);
    }

    /**
     * Sets the trailerWeightAvailable.
     *
     * @param trailerWeightAvailable
     */
    public void setTrailerWeightAvailable(Boolean trailerWeightAvailable) {
        setValue(KEY_TRAILER_WEIGHT_AVAILABLE, trailerWeightAvailable);
    }

    /**
     * Gets the trailerWeightAvailable.
     *
     * @return Boolean
     */
    public Boolean getTrailerWeightAvailable() {
        return getBoolean(KEY_TRAILER_WEIGHT_AVAILABLE);
    }

    /**
     * Sets the frontAxleLoadRestorationAvailable.
     *
     * @param frontAxleLoadRestorationAvailable
     */
    public void setFrontAxleLoadRestorationAvailable(Boolean frontAxleLoadRestorationAvailable) {
        setValue(KEY_FRONT_AXLE_LOAD_RESTORATION_AVAILABLE, frontAxleLoadRestorationAvailable);
    }

    /**
     * Gets the frontAxleLoadRestorationAvailable.
     *
     * @return Boolean
     */
    public Boolean getFrontAxleLoadRestorationAvailable() {
        return getBoolean(KEY_FRONT_AXLE_LOAD_RESTORATION_AVAILABLE);
    }

    /**
     * Sets the displayUnitAvailable.
     *
     * @param displayUnitAvailable
     */
    public void setDisplayUnitAvailable(Boolean displayUnitAvailable) {
        setValue(KEY_DISPLAY_UNIT_AVAILABLE, displayUnitAvailable);
    }

    /**
     * Gets the displayUnitAvailable.
     *
     * @return Boolean
     */
    public Boolean getDisplayUnitAvailable() {
        return getBoolean(KEY_DISPLAY_UNIT_AVAILABLE);
    }

    /**
     * Sets the passengerWeightAvailable.
     *
     * @param passengerWeightAvailable
     */
    public void setPassengerWeightAvailable(Boolean passengerWeightAvailable) {
        setValue(KEY_PASSENGER_WEIGHT_AVAILABLE, passengerWeightAvailable);
    }

    /**
     * Gets the passengerWeightAvailable.
     *
     * @return Boolean
     */
    public Boolean getPassengerWeightAvailable() {
        return getBoolean(KEY_PASSENGER_WEIGHT_AVAILABLE);
    }

    /**
     * Sets the screenStepAvailable.
     *
     * @param screenStepAvailable
     */
    public void setScreenStepAvailable(Boolean screenStepAvailable) {
        setValue(KEY_SCREEN_STEP_AVAILABLE, screenStepAvailable);
    }

    /**
     * Gets the screenStepAvailable.
     *
     * @return Boolean
     */
    public Boolean getScreenStepAvailable() {
        return getBoolean(KEY_SCREEN_STEP_AVAILABLE);
    }
}
