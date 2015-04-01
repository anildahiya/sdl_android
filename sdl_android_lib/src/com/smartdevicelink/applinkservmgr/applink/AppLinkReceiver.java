package com.smartdevicelink.applinkservmgr.applink;

import com.smartdevicelink.service.sdlConnection.MessengerService;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AppLinkReceiver  extends BroadcastReceiver {		
	public void onReceive(Context context, Intent intent) {
		final BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE);
		
		// if SDL connected to phone via bluetooth, start service (which starts proxy)
		if (intent.getAction().compareTo(BluetoothDevice.ACTION_ACL_CONNECTED) == 0) {
			if (bluetoothDevice.getName() != null) {
				if (bluetoothDevice.getName().contains("SDL")) {
					AppLinkService serviceInstance = AppLinkService.getInstance();
					if (serviceInstance == null) {
						Intent startIntent = new Intent(context, MessengerService.class);  
						startIntent.putExtras(intent);
						context.startService(startIntent);
					}
				}
			}
		}
		else if (intent.getAction().equals(android.media.AudioManager.ACTION_AUDIO_BECOMING_NOISY)) {
			// signal your service to stop playback
		}
	}
}