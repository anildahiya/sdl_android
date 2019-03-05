package com.smartdevicelink.proxy.rpc.enums;

/**
 * Enumeration listing possible app service types.
 */
public enum AppServiceType {

	MEDIA,

	WEATHER,

	NAVIGATION,

	;

	/**
	 * Convert String to AppServiceType
	 * @param value String
	 * @return AppServiceType
	 */
	public static AppServiceType valueForString(String value) {
		try{
			return valueOf(value);
		}catch(Exception e){
			return null;
		}
	}
}