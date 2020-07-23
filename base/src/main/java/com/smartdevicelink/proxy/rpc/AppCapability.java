/*
 * Copyright (c) 2019 Livio, Inc.
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
 * Neither the name of the Livio Inc. nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
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
import com.smartdevicelink.proxy.rpc.enums.AppCapabilityType;
import java.util.Hashtable;

public class AppCapability extends RPCStruct {

	public static final String KEY_APP_CAPABILITY_TYPE = "appCapabilityType";
	public static final String KEY_VIDEO_STREAMING_CAPABILITY = "videoStreamingCapability";

	// Constructors

	public AppCapability(){}

	/**
	 * @param hash of parameters
	 */
	public AppCapability(Hashtable<String, Object> hash) {
		super(hash);
	}


	/**
	 * @param appCapabilityType
	 */
	public AppCapability(@NonNull AppCapabilityType appCapabilityType){
		this();
		setAppCapabilityType(appCapabilityType);
	}

	// Setters and Getters

	/**
	 * Used as a descriptor of what data to expect in this struct. The corresponding param to this enum should be included and the only other param included.
	 * @param appCapabilityType
	 */
	public void setAppCapabilityType(AppCapabilityType appCapabilityType){
		setValue(KEY_APP_CAPABILITY_TYPE, appCapabilityType);
	}

	/**
	 * Used as a descriptor of what data to expect in this struct. The corresponding param to this enum should be included and the only other param included.
	 * @return appCapabilityType
	 */
	public AppCapabilityType getAppCapabilityType(){
		return (AppCapabilityType) getObject(AppCapabilityType.class, KEY_APP_CAPABILITY_TYPE);
	}

	/**
	 * Describes supported capabilities for video streaming.
	 * @param videoStreamingCapability
	 */
	public void setVideoStreamingCapability(VideoStreamingCapability videoStreamingCapability){
		setValue(KEY_VIDEO_STREAMING_CAPABILITY, videoStreamingCapability);
	}

	/**
	 * Describes supported capabilities for video streaming.
	 * @return videoStreamingCapability
	 */
	public VideoStreamingCapability getVideoStreamingCapability(){
		return (VideoStreamingCapability) getObject(VideoStreamingCapability.class, KEY_VIDEO_STREAMING_CAPABILITY);
	}
}
