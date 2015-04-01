package com.smartdevicelink.applinkservmgr.activity;

import com.smartdevicelink.applinkservmgr.R;
import com.smartdevicelink.applinkservmgr.applink.AppLinkActivity;
import com.smartdevicelink.applinkservmgr.applink.AppLinkApplication;
import com.smartdevicelink.applinkservmgr.applink.LockScreenManager;

import android.os.Bundle;

import android.content.SharedPreferences;

import android.util.Log;

import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppLinkActivity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		SharedPreferences prefs = getSharedPreferences("AppLinkServiceManager", 0);
		boolean showAlways = prefs.getBoolean("AlwaysShowLockscreen", false);
		LockScreenManager.setShowLockscreenInOptional(showAlways);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	@Override
	protected void onDestroy() {
		Log.v(AppLinkApplication.TAG, "onDestroy main");
		super.onDestroy();
	}
	
}
