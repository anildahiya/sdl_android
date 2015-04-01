package com.smartdevicelink.applinkservmgr.applink;



import com.smartdevicelink.service.proxy.SdlProxyService;
import com.smartdevicelink.service.sdlConnection.MessengerService;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.util.Log;

public class AppLinkApplication extends Application {
	
	public static final String TAG = "AppLinkServiceManager";
	private static AppLinkApplication instance;
	private static Activity currentUIActivity;
	
	static {
		instance = null;
	}
	
	private static synchronized void setInstance(AppLinkApplication app) {
		instance = app;
	}
	
	public static synchronized AppLinkApplication getInstance() {
		return instance;
	}
	
	public static synchronized void setCurrentActivity(Activity act) {
		currentUIActivity = act;
	}
	
	public static synchronized Activity getCurrentActivity() {
		return currentUIActivity;
	}
	
	@Override
	public void onCreate() {
		super.onCreate();
		AppLinkApplication.setInstance(this);
		startSdlProxyService();
	}
	
	@Override
	public void onLowMemory() {
		super.onLowMemory();
	}
	
    public void startSdlProxyService() {
    	if (AppLinkService.getInstance() == null) {
    		Intent startIntent = new Intent(this, MessengerService.class);
		    startService(startIntent);
		} else {
		    // if the service is already running and proxy is up
		    AppLinkService serviceInstance = AppLinkService.getInstance();
		    SdlProxyService proxyInstance = serviceInstance.getProxy();
		    if(proxyInstance != null)
			{
		    	// do nothing
			}
		    else 
		    {
		    	Log.i(AppLinkApplication.TAG, "proxy is null");	
		        serviceInstance.startProxyService();
			}    		        		
		        Log.i(AppLinkApplication.TAG, " proxyAlive == true success");
		}
	}
}
