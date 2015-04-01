package com.smartdevicelink.transport;

import java.io.Serializable;

import android.content.Context;
import android.hardware.usb.UsbAccessory;

public class USBTransportConfig extends BaseTransportConfig  implements Serializable {
	private static final long serialVersionUID = 2282896770695546657L;
	private Context mainActivity = null;
	private UsbAccessory usbAccessory = null;
	
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