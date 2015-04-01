package com.smartdevicelink.applinkservmgr.applink;

import android.content.Intent;

import com.smartdevicelink.applinkservmgr.activity.LockScreenActivity;
import com.smartdevicelink.service.proxy.rpc.enums.DriverDistractionState;
import com.smartdevicelink.service.proxy.rpc.enums.HMILevel;

/**
 * This class manages the lockscreen for the app.
 * With AppLink SDK versions <= 2.2, this is required.
 * In later versions, a callback from the proxy will
 * notify the app when a lockscreen should be displayed.
 */
public class LockScreenManager {
	// Variable that keeps track of whether SDL is sending driver distractions
	// (older versions of SDL will not send this notification)
	private static Boolean driverDistrationStatus = null;
	private static HMILevel currentHMILevel = null;
	private static boolean userSelected = false;
	// variable to contain the current state of the lockscreen
	private static boolean lockScreenUp = false;
	private static boolean showInOptional = false;
	
	public static synchronized void setHMILevelState(HMILevel state) {
		currentHMILevel = state;
	}

	public static synchronized void setDriverDistractionState(DriverDistractionState state) {
		if (state == DriverDistractionState.DD_OFF) {
			driverDistrationStatus = false;
		} else {
			driverDistrationStatus = true;
		}
	}
	
	private static synchronized LockScreenStatus checkLockScreen() {
		// Default to HIDDEN
		LockScreenStatus displayLockScreen = LockScreenStatus.OFF;
		
		// Abort if we don't know the hmi level
		if (currentHMILevel == null) {
			return displayLockScreen;
		}
		
		// Check if the user has selected the app in mobile apps menu
		if (currentHMILevel.equals(HMILevel.HMI_FULL) || currentHMILevel.equals(HMILevel.HMI_LIMITED)) {
			userSelected = true;
		}
		else if (currentHMILevel.equals(HMILevel.HMI_NONE)) {
			userSelected = false;
		}
		
		// Determine the lockscreen state
		if (currentHMILevel.equals(HMILevel.HMI_BACKGROUND) && userSelected) {			
			if (driverDistrationStatus == null || driverDistrationStatus) {
				displayLockScreen = LockScreenStatus.REQUIRED;
			}
			else {
				displayLockScreen = LockScreenStatus.OPTIONAL;
			}
		}
		else if (currentHMILevel.equals(HMILevel.HMI_FULL) || currentHMILevel.equals(HMILevel.HMI_LIMITED)) {
			if (driverDistrationStatus == null || driverDistrationStatus) {
				displayLockScreen = LockScreenStatus.REQUIRED;
			}
			else {
				displayLockScreen = LockScreenStatus.OPTIONAL;
			}
		}

		return displayLockScreen;
	}
	
	public static synchronized void showLockScreen() {
		// only throw up lockscreen if main activity is currently on top
		// else, wait until onResume() to throw lockscreen so it doesn't 
		// pop-up while a user is using another app on the phone
		if (AppLinkApplication.getCurrentActivity() != null) {
			if (((AppLinkActivity) AppLinkApplication.getCurrentActivity()).isActivityonTop() == true) {
				Intent i = new Intent(AppLinkApplication.getInstance(), LockScreenActivity.class);
				i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
				i.addFlags(Intent.FLAG_ACTIVITY_NO_USER_ACTION);
				AppLinkApplication.getInstance().startActivity(i);
			}
		}
		lockScreenUp = true;		
	}

	public static synchronized void clearLockScreen() {
		if (LockScreenActivity.getInstance() != null) {  
			LockScreenActivity.getInstance().exit();
		}
		lockScreenUp = false;
	}
	
	public static synchronized boolean getLockScreenStatus() {
		return lockScreenUp;
	}
	
	public static synchronized void setShowLockscreenInOptional(boolean show) {
		showInOptional = show;
	}

	public static synchronized void updateLockScreen() {
		LockScreenStatus displayLockScreen = checkLockScreen();
		// Show lockscreen in both REQUIRED and OPTIONAL (hard-coded)
		//if (displayLockScreen == LockScreenStatus.REQUIRED || displayLockScreen == LockScreenStatus.OPTIONAL) {
		//Show lockscreen in only REQUIRED(hard-coded)
		//if (displayLockScreen == LockScreenStatus.REQUIRED) {
		
		// Use settings to toggle whether lockscreen is shown in OPTIONAL status or not
		if (displayLockScreen == LockScreenStatus.REQUIRED || (showInOptional && displayLockScreen == LockScreenStatus.OPTIONAL)) {
			showLockScreen();
		}
		else {
			clearLockScreen();
		}
	}
}
