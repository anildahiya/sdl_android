package com.smartdevicelink.applinkservmgr.applink;

import com.smartdevicelink.applinkservmgr.applink.AppLinkApplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AppLinkActivity extends Activity {
	private boolean activityOnTop;
	
	@Override
	protected void onResume() {
		super.onResume();
		AppLinkApplication.setCurrentActivity(this);
		activityOnTop = true;
		LockScreenManager.updateLockScreen();
	}
	
	@Override
	protected void onPause() {
		activityOnTop = false;
		super.onPause();
	}
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
	
    @Override
	protected void onDestroy() {
    	AppLinkApplication.setCurrentActivity(null);
    	activityOnTop = false;
    	super.onDestroy();
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
    
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
    	return true;	            
	}
    
	public boolean isActivityonTop(){
		return activityOnTop;
	}
}
