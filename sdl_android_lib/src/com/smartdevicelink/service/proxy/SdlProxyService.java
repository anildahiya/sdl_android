package com.smartdevicelink.service.proxy;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;

import com.smartdevicelink.exception.SdlException;
import com.smartdevicelink.service.proxy.interfaces.IProxyServiceListener;
import com.smartdevicelink.transport.SiphonServer;

public class SdlProxyService<proxyServiceListenerType extends IProxyServiceListener> {
	
	Messenger mService = null;
    boolean mBound;
	public static String TAG = "SdlProxy";

	
	public SdlProxyService(Service appService, proxyServiceListenerType listener)
	{
		try {
			performBaseCommon(appService, listener);
		} catch (SdlException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void performBaseCommon(Service appService, proxyServiceListenerType listener) throws SdlException
	{
		
		Service myService = null;		
		if (listener != null && listener instanceof Service)
		{
			myService = (Service) listener;				
		}
		else if (appService != null)
		{
			myService = appService;
		}
		else
		{
			return;
		}		
				
		Intent intent = new Intent("com.smartdevicelink.service.sdlConnection.MessengerService");		 
		@SuppressWarnings("unused")
		boolean bBound = myService.getApplicationContext().bindService(intent, mConnection, Context.BIND_AUTO_CREATE);		
		
		//MessengerService._sdlProxyBase = this;		
	}
	
    private ServiceConnection mConnection = new ServiceConnection() {

        public void onServiceDisconnected(ComponentName className) {
            // This is called when the connection with the service has been
            // unexpectedly disconnected -- that is, its process crashed.
            mService = null;
            mBound = false;
        }

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
	         mService = new Messenger(service);
	         mBound = true;

		        if (!mBound) return;	         
		}
    };
		
	/**
	 *  Public method to enable the siphon transport
	 */
	public static void enableSiphonDebug() {
		SiphonServer.enableSiphonServer();
	}
	
	/**
	 *  Public method to disable the Siphon Trace Server
	 */
	public static void disableSiphonDebug() {
		SiphonServer.disableSiphonServer();
	}	
	
	/**
	 *  Public method to enable the Debug Tool
	 */
	public static void enableDebugTool() {
//		DebugTool.enableDebugTool();
	}
	
	/**
	 *  Public method to disable the Debug Tool
	 */
	public static void disableDebugTool() {
//		DebugTool.disableDebugTool();
	}	

	/**
	* Public method to determine Debug Tool enabled
	*/
//	public static boolean isDebugEnabled() {
//		return DebugTool.isDebugEnabled();
//	}	
			
} // end-class
