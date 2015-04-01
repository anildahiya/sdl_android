package com.smartdevicelink.transport;

import android.content.Context;
import android.hardware.usb.UsbAccessory;
import java.io.Serializable;

public class USBTransportConfig extends BaseTransportConfig implements Serializable {
	
	private static final long serialVersionUID = 2282896770695546657L;
	private transient Context mainActivity = null;
	private transient UsbAccessory usbAccessory = null;
	
	public USBTransportConfig (Context mainActivity) {
		this.mainActivity = mainActivity;
	}
	
	public USBTransportConfig (Context mainActivity, UsbAccessory usbAccessory) {
		this.mainActivity = mainActivity;
		this.usbAccessory = usbAccessory;
	}
	
	public void setUSBContext (Context val) {
		mainActivity = val;
	}
	
	public Context getUSBContext () {
		return mainActivity;
	}
	
	public UsbAccessory getUsbAccessory () {
		return usbAccessory;
	}
	
	public TransportType getTransportType() {
		return TransportType.USB;
	}
}