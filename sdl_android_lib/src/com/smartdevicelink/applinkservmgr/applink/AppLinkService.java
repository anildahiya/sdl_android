package com.smartdevicelink.applinkservmgr.applink;

import com.smartdevicelink.service.proxy.SdlProxyService;
import com.smartdevicelink.service.proxy.interfaces.IProxyServiceListener;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

public class AppLinkService extends Service implements IProxyServiceListener {
	// variable used to increment correlation ID for every request sent to SDL
	public int autoIncCorrId = 0;
	// variable to contain the current state of the service
	private static AppLinkService instance = null;
	// variable to access the BluetoothAdapter
	private BluetoothAdapter mBtAdapter;
	// variable to create and call functions of the SdlProxy
	private SdlProxyService proxy = null;
	
	@Override
	public void onCreate() {
		super.onCreate();
		instance = this;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
        if (intent != null) {
        	startProxyService();
		}
			
        return START_STICKY;
	}
	
	@Override
	public void onDestroy() {
		LockScreenManager.clearLockScreen();
		instance = null;
		super.onDestroy();
	}
	
	public static AppLinkService getInstance() {
		return instance;
	}
		
	public SdlProxyService getProxy() {
		return proxy;
	}

	public void startProxyService() {

		//public final Messenger mMessenger = new Messenger(new IncomingHandler());
		
		Intent intent = new Intent("com.smartdevicelink.service.sdlConnection.MessengerService");		 
		boolean bBound = getApplicationContext().bindService(intent, mConnection, Context.BIND_AUTO_CREATE);	
		
		

		
	
	}
	
	Messenger mService = null;
    boolean mBound;	
	
	
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

	         Message msg = Message.obtain(null, 0, 0, 0);
	         //msg.replyTo = mMessenger;
	         		        
	         		        
	         try {
	             mService.send(msg);
	         } catch (RemoteException e) {
	             e.printStackTrace();
	         }	
	 			         

	         msg = Message.obtain(null, 0, 1, 0);
	         //msg.replyTo = mMessenger;
	         		        
	         		        
	         try {
	             mService.send(msg);
	         } catch (RemoteException e) {
	             e.printStackTrace();
	         }	
	 				         
	         
	         
		     if (!mBound) return;	         
		}
    };

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}	
}
