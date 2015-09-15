package com.ssawweather.app.receiver;


import com.ssawweather.app.service.AutoUpdateService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub

		Intent i=new Intent(context, AutoUpdateService.class);
		context.startService(i);
		
	}

}
