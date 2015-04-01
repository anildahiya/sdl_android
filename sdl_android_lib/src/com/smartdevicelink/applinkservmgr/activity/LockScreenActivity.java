package com.smartdevicelink.applinkservmgr.activity;

import com.smartdevicelink.applinkservmgr.R;
import com.smartdevicelink.applinkservmgr.applink.AppLinkService;
import com.smartdevicelink.service.proxy.SdlProxyService;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LockScreenActivity extends Activity {
	private static LockScreenActivity instance;
	
	static {
		LockScreenActivity.instance = null;
	}
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lockscreen);
		LockScreenActivity.instance = this;
		
		final Button resetSDLButton = (Button) findViewById(R.id.lockreset);
		resetSDLButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Reset proxy; do not shut down service
				AppLinkService serviceInstance = AppLinkService.getInstance();
				if (serviceInstance != null) {
					SdlProxyService proxyInstance = serviceInstance.getProxy();
					if (proxyInstance != null) {
						//serviceInstance.reset();
					} else {
						serviceInstance.startProxyService();
					}
				}
			}
		});
    }
    
    // Disable back button on lockscreen
    @Override
    public void onBackPressed() {
    }
    
    @Override
    public void onDestroy() {
		LockScreenActivity.instance = null;
		super.onDestroy();
    }
    
    public void exit() {
    	super.finish();
    }
    
    public static LockScreenActivity getInstance() {
    	return instance;
    }
}